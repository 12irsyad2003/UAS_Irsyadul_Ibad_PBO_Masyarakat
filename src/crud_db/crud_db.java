/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud_db;

/**
 *
 * @author ACER
 */
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.JOptionPane;
import java.io.File;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;



public class crud_db {
    String jdbcURL = "jdbc:mysql://localhost/2210010646_masyarakat";
    private String username = "root";
    private String password = "admin";
    
    private DefaultTableModel Modelnya;
    private TableColumn Kolomnya;
    
    public crud_db(){}
    
    
    /**
     * Method untuk membuat koneksi ke database
     * @return Connection - Object koneksi database
     * @throws SQLException 
     */

    public Connection getKoneksiDB() throws SQLException {
        try {
            Driver mysqldriver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(mysqldriver);
            System.out.println("Koneksi Berhasil");
        } catch (Exception e) {
            System.out.println("Error Koneksi: " + e.toString());
        }
        return DriverManager.getConnection(jdbcURL, username, password);
    }

    public boolean DuplicateKey(String NamaTabel, String PrimaryKey, String isiData) {
        boolean hasil = false;
        int jumlah = 0;
        try {
            String SQL = "SELECT * FROM " + NamaTabel + " WHERE " + PrimaryKey + " ='" + isiData + "'";
            Statement perintah = getKoneksiDB().createStatement();
            ResultSet hasilData = perintah.executeQuery(SQL);
            while (hasilData.next()) {
                jumlah++;
            }
            hasil = jumlah == 1;
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return hasil;
    }

    public String getFieldTabel(String[] FieldTabelnya) {
        StringBuilder hasilnya = new StringBuilder();
        for (int i = 0; i < FieldTabelnya.length; i++) {
            hasilnya.append(FieldTabelnya[i]);
            if (i < FieldTabelnya.length - 1) {
                hasilnya.append(",");
            }
        }
        return "(" + hasilnya + ")";
    }

    public String getIsiTabel(String[] IsiTabelnya) {
        StringBuilder hasilnya = new StringBuilder();
        for (int i = 0; i < IsiTabelnya.length; i++) {
            hasilnya.append("'").append(IsiTabelnya[i]).append("'");
            if (i < IsiTabelnya.length - 1) {
                hasilnya.append(",");
            }
        }
        return "(" + hasilnya + ")";
    }

    public void SimpanDinamis(String NamaTabel, String[] Fieldnya, String[] Isinya) {
        try {
            String SQLSave = "INSERT INTO " + NamaTabel + " " + getFieldTabel(Fieldnya) + " VALUES " + getIsiTabel(Isinya);
            Statement perintah = getKoneksiDB().createStatement();
            perintah.executeUpdate(SQLSave);
            perintah.close();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public String getFieldValueEdit(String[] Field, String[] value) {
        StringBuilder hasil = new StringBuilder();
        for (int i = 0; i < Field.length; i++) {
            hasil.append(Field[i]).append(" ='").append(value[i]).append("'");
            if (i < Field.length - 1) {
                hasil.append(",");
            }
        }
        return hasil.toString();
    }

    public void UbahDinamis(String NamaTabel, String PrimaryKey, String IsiPrimary, String[] Field, String[] Value) {
        try {
            String SQLUbah = "UPDATE " + NamaTabel + " SET " + getFieldValueEdit(Field, Value) + " WHERE " + PrimaryKey + "='" + IsiPrimary + "'";
            Statement perintah = getKoneksiDB().createStatement();
            perintah.executeUpdate(SQLUbah);
            perintah.close();
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

    public void HapusDinamis(String NamaTabel, String PrimaryKey, String IsiPrimary) {
        try {
            String SQLHapus = "DELETE FROM " + NamaTabel + " WHERE " + PrimaryKey + "='" + IsiPrimary + "'";
            Statement perintah = getKoneksiDB().createStatement();
            perintah.executeUpdate(SQLHapus);
            perintah.close();
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

    public void settingLebarKolom(javax.swing.JTable tabel, int[] lebarKolom) {
        javax.swing.table.TableColumn column;
        tabel.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        for (int i = 0; i < lebarKolom.length; i++) {
            column = tabel.getColumnModel().getColumn(i);
            column.setPreferredWidth(lebarKolom[i]);
        }
    }

    public void settingJudulTabel(JTable Tabelnya, String[] JudulKolom) {
        Modelnya = new DefaultTableModel();
        Tabelnya.setModel(Modelnya);
        for (String judulKolom : JudulKolom) {
            Modelnya.addColumn(judulKolom);
        }
    }

    public Object[][] isiTabel(String SQL, int jumlah) {
        Object[][] data = null;
        try {
            Connection koneksi = getKoneksiDB();
            Statement perintah = koneksi.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet dataset = perintah.executeQuery(SQL);

            dataset.last();
            int baris = dataset.getRow();
            dataset.beforeFirst();

            data = new Object[baris][jumlah];
            int j = 0;
            while (dataset.next()) {
                for (int i = 0; i < jumlah; i++) {
                    data[j][i] = dataset.getObject(i + 1);
                }
                j++;
            }

            dataset.close();
            perintah.close();
            koneksi.close();
        } catch (SQLException e) {
            System.err.println("Error isiTabel: " + e.toString());
        }

        return data;
    }

    public void tampilTabel(javax.swing.JTable tabel, String SQL, String[] judulKolom) {
        try {
            Object[][] data = isiTabel(SQL, judulKolom.length);
            javax.swing.table.DefaultTableModel model = new javax.swing.table.DefaultTableModel(data, judulKolom);
            tabel.setModel(model);
        } catch (Exception e) {
            System.err.println("Error tampilTabel: " + e.toString());
        }
    }

    public void tampilLaporan(String laporanFile, String SQL) {
        try {
            File file = new File(laporanFile);
            JasperDesign jasDes = JRXmlLoader.load(file);

            JRDesignQuery sqlQuery = new JRDesignQuery();
            sqlQuery.setText(SQL);
            jasDes.setQuery(sqlQuery);

            JasperReport JR = JasperCompileManager.compileReport(jasDes);
            JasperPrint JP = JasperFillManager.fillReport(JR, null, getKoneksiDB());
            JasperViewer.viewReport(JP, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error Laporan: " + e.toString());
        }
    }
    
    public int jumlahRecord(String SQL) {
    int hasil = 0;
    int i = 0;
    try {
        // Menggunakan getKoneksiDB() untuk koneksi
        Statement st = getKoneksiDB().createStatement(); 
        ResultSet rs = st.executeQuery(SQL); // Memperbaiki sintaks executeQuery
        while (rs.next()) {
            i++;
        }
        hasil = i;
        rs.close(); // Menutup ResultSet
        st.close(); // Menutup Statement
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.toString()); // Memperbaiki parent component dan error handling
    }
    return hasil; // Memperbaiki pengembalian hasil
}
}