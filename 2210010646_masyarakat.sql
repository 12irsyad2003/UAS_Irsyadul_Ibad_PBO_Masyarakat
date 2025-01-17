-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Jan 17, 2025 at 04:01 PM
-- Server version: 8.0.30
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `2210010646_masyarakat`
--

-- --------------------------------------------------------

--
-- Table structure for table `ahli_waris`
--

CREATE TABLE `ahli_waris` (
  `id_ahli_waris` int NOT NULL,
  `keterangan` text NOT NULL,
  `saksi1` varchar(50) NOT NULL,
  `saksi2` varchar(50) NOT NULL,
  `file_ktp1` text NOT NULL,
  `file_ktp2` text NOT NULL,
  `status` varchar(50) NOT NULL,
  `alasan` varchar(50) NOT NULL,
  `tgl` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `ahli_waris`
--

INSERT INTO `ahli_waris` (`id_ahli_waris`, `keterangan`, `saksi1`, `saksi2`, `file_ktp1`, `file_ktp2`, `status`, `alasan`, `tgl`) VALUES
(2, 'Pembagian Ahli Waris', 'Indra', 'Pendi', '61001010', '61200000', 'Saudara Kandung', 'Membagi warisan Keluarga', '2023-01-01'),
(7, 'Pengajuan Pembagian warisan', 'Indra', 'Laras', '621001010', '621000000', 'Saudara Kandung', 'Membagi Warisan', '2025-01-01'),
(8, 'Pengajuan Ahli Waris', 'Kamarullah', 'Fajari', '6210010010', '6210100000', 'Saudara', 'Pembagian Warisan', '2025-01-01'),
(9, 'Pengajuan Ahli Waris', 'Dimas', 'Ibnu', '621001010', '621001011', 'Keluarga', 'Pembagian Ahli waris', '2025-01-01'),
(10, 'Pengajuan Ahli Waris', 'Irsyadul Ibad', 'Muhammad Kamarullah', '6210010100', '6210010100', 'Keluarga', 'Membagi Ahli Waris', '2024-01-01'),
(12, 'Pengajuan Ahli waris', 'Farizi', 'Ali', '621010000', '621000100', 'Saudara Kandung', 'Pembagian Warisan dikarenakan Meninggal dunia', '2025-01-01');

-- --------------------------------------------------------

--
-- Table structure for table `dispensasi_nikah`
--

CREATE TABLE `dispensasi_nikah` (
  `id_dispensasi_nikah` int NOT NULL,
  `id_suami` varchar(16) NOT NULL,
  `id_istri` varchar(16) NOT NULL,
  `no_desa` varchar(100) NOT NULL,
  `no_kua` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `dispensasi_nikah`
--

INSERT INTO `dispensasi_nikah` (`id_dispensasi_nikah`, `id_suami`, `id_istri`, `no_desa`, `no_kua`) VALUES
(1, '6210100111', '6210001010', 'SKN/001/001/2025', 'SKK/001/002/2025'),
(2, '621010010', '621010100', 'SKN/001/001/2025', 'SKK/001/002/2025'),
(3, '62300003', '621901909', 'SKN/001/0001/2025', 'SK/01/01/2025'),
(5, '621001010', '621001011', '01/NK/000-2025', '01/SKK/001-2025'),
(7, '624155515', '621910199', '01/SK-2025', '03/SKK/01-2025'),
(11, '621010100', '621001010', '01/SKK-2025', '02/SKK-2025');

-- --------------------------------------------------------

--
-- Table structure for table `penduduk`
--

CREATE TABLE `penduduk` (
  `id_penduduk` int NOT NULL,
  `nik` varchar(20) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `tempat_lahir` varchar(50) NOT NULL,
  `tanggal_lahir` date NOT NULL,
  `jenis_kelamin` varchar(50) NOT NULL,
  `agama` varchar(50) NOT NULL,
  `status_perkawinan` varchar(50) NOT NULL,
  `pekerjaan` varchar(50) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `no_kode` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `penduduk`
--

INSERT INTO `penduduk` (`id_penduduk`, `nik`, `nama`, `tempat_lahir`, `tanggal_lahir`, `jenis_kelamin`, `agama`, `status_perkawinan`, `pekerjaan`, `alamat`, `no_kode`) VALUES
(1, '632000004400001200', 'Irsyadul Ibad', 'Kotabaru', '2003-03-12', 'Laki - Laki', 'Islam', 'Belum Kawin', 'Mahasiswa', 'Jl. Pendidikan No 12', 9909),
(40011, '62101010000', 'Fajari', 'Marabatuan', '2000-01-01', 'Laki-laki', 'Islam', 'Belum Kawin', 'Mahasiswa', 'Jl. Cendana', 722100);

-- --------------------------------------------------------

--
-- Table structure for table `pengaduan`
--

CREATE TABLE `pengaduan` (
  `id_pengaduan` int NOT NULL,
  `pengaduan` text NOT NULL,
  `aksi` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `pengaduan`
--

INSERT INTO `pengaduan` (`id_pengaduan`, `pengaduan`, `aksi`) VALUES
(1, 'Jalan', 'proses'),
(3, 'Selesai', 'Proses Penanganan'),
(4, 'Jalan Rusak', 'Proses');

-- --------------------------------------------------------

--
-- Table structure for table `pengajuan`
--

CREATE TABLE `pengajuan` (
  `id_pengajuan` int NOT NULL,
  `layanan` text NOT NULL,
  `status_pengajuan` text NOT NULL,
  `kode_tracking` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `pengajuan`
--

INSERT INTO `pengajuan` (`id_pengajuan`, `layanan`, `status_pengajuan`, `kode_tracking`) VALUES
(1, 'Pembuatan Akta Kelahiran', 'Selesai', 987654),
(3, 'Legalisir', 'Proses', 989890),
(4, 'Pembuatan KTP', 'Batal', 989890),
(5, 'Pembuatan SKCK', 'Proses', 19919);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `ahli_waris`
--
ALTER TABLE `ahli_waris`
  ADD PRIMARY KEY (`id_ahli_waris`);

--
-- Indexes for table `dispensasi_nikah`
--
ALTER TABLE `dispensasi_nikah`
  ADD PRIMARY KEY (`id_dispensasi_nikah`);

--
-- Indexes for table `penduduk`
--
ALTER TABLE `penduduk`
  ADD PRIMARY KEY (`id_penduduk`);

--
-- Indexes for table `pengaduan`
--
ALTER TABLE `pengaduan`
  ADD PRIMARY KEY (`id_pengaduan`);

--
-- Indexes for table `pengajuan`
--
ALTER TABLE `pengajuan`
  ADD PRIMARY KEY (`id_pengajuan`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `ahli_waris`
--
ALTER TABLE `ahli_waris`
  MODIFY `id_ahli_waris` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=124;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
