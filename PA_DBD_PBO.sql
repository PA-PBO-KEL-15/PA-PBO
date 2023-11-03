-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 03, 2023 at 06:38 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mnbv`
--

-- --------------------------------------------------------

--
-- Table structure for table `4d`
--

CREATE TABLE `4d` (
  `Nomor` char(8) NOT NULL,
  `Nomor_Kacamata` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `4d`
--

INSERT INTO `4d` (`Nomor`, `Nomor_Kacamata`) VALUES
('Studio01', 'KCMT01');

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `Id_Admin` char(5) NOT NULL,
  `Username` varchar(20) NOT NULL,
  `Password` varchar(15) NOT NULL,
  `SuperAdmin_Id_SuperAdmin` char(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`Id_Admin`, `Username`, `Password`, `SuperAdmin_Id_SuperAdmin`) VALUES
('ADM01', 'Stephanie01', 'stephanie01', 'SADM1');

-- --------------------------------------------------------

--
-- Table structure for table `film`
--

CREATE TABLE `film` (
  `Id_Film` char(5) NOT NULL,
  `Judul` varchar(30) NOT NULL,
  `Durasi` varchar(15) NOT NULL,
  `Genre` varchar(30) NOT NULL,
  `SuperAdmin_Id_SuperAdmin` char(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `film`
--

INSERT INTO `film` (`Id_Film`, `Judul`, `Durasi`, `Genre`, `SuperAdmin_Id_SuperAdmin`) VALUES
('BB005', 'BoboiBoy', '1 Jam', 'Adventure', 'SADM1'),
('DN008', 'Death Note', '2 Jam', 'Thriller', 'SADM1'),
('DR001', 'Dora The Explorer', '1 jam 20 Menit', 'Drama', 'SADM1');

-- --------------------------------------------------------

--
-- Table structure for table `penayangan`
--

CREATE TABLE `penayangan` (
  `Id_Penayangan` char(5) NOT NULL,
  `Tanggal` datetime NOT NULL,
  `Waktu` varchar(10) NOT NULL,
  `Admin_Id_Admin` char(5) NOT NULL,
  `Film_Id_Film` char(5) NOT NULL,
  `Studio_Nomor` char(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `penayangan`
--

INSERT INTO `penayangan` (`Id_Penayangan`, `Tanggal`, `Waktu`, `Admin_Id_Admin`, `Film_Id_Film`, `Studio_Nomor`) VALUES
('RB009', '2023-11-03 18:36:59', '19:00', 'ADM01', 'DN008', 'Studio02');

-- --------------------------------------------------------

--
-- Table structure for table `studio`
--

CREATE TABLE `studio` (
  `Nomor` char(8) NOT NULL,
  `Kapasitas` varchar(10) NOT NULL,
  `Jenis_Layar` varchar(10) NOT NULL,
  `Jenis_Kursi` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `studio`
--

INSERT INTO `studio` (`Nomor`, `Kapasitas`, `Jenis_Layar`, `Jenis_Kursi`) VALUES
('Studio01', '50 kursi', '4D', 'Premium Sofa'),
('Studio02', '75 Kursi', 'IMAX', 'Sofa Bed');

-- --------------------------------------------------------

--
-- Table structure for table `superadmin`
--

CREATE TABLE `superadmin` (
  `Id_SuperAdmin` char(5) NOT NULL,
  `Username` varchar(20) NOT NULL,
  `Password` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `superadmin`
--

INSERT INTO `superadmin` (`Id_SuperAdmin`, `Username`, `Password`) VALUES
('SADM1', 'Bertha01', 'bertha01');

-- --------------------------------------------------------

--
-- Table structure for table `velvet`
--

CREATE TABLE `velvet` (
  `Nomor` char(8) NOT NULL,
  `Warna_Selimut` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `velvet`
--

INSERT INTO `velvet` (`Nomor`, `Warna_Selimut`) VALUES
('Studio02', 'Merah');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `4d`
--
ALTER TABLE `4d`
  ADD PRIMARY KEY (`Nomor`);

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`Id_Admin`),
  ADD UNIQUE KEY `Admin__IDX` (`SuperAdmin_Id_SuperAdmin`);

--
-- Indexes for table `film`
--
ALTER TABLE `film`
  ADD PRIMARY KEY (`Id_Film`),
  ADD KEY `Film_SuperAdmin_FK` (`SuperAdmin_Id_SuperAdmin`);

--
-- Indexes for table `penayangan`
--
ALTER TABLE `penayangan`
  ADD PRIMARY KEY (`Id_Penayangan`),
  ADD KEY `Penayangan_Admin_FK` (`Admin_Id_Admin`),
  ADD KEY `Penayangan_Film_FK` (`Film_Id_Film`),
  ADD KEY `Penayangan_Studio_FK` (`Studio_Nomor`);

--
-- Indexes for table `studio`
--
ALTER TABLE `studio`
  ADD PRIMARY KEY (`Nomor`);

--
-- Indexes for table `superadmin`
--
ALTER TABLE `superadmin`
  ADD PRIMARY KEY (`Id_SuperAdmin`);

--
-- Indexes for table `velvet`
--
ALTER TABLE `velvet`
  ADD PRIMARY KEY (`Nomor`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `4d`
--
ALTER TABLE `4d`
  ADD CONSTRAINT `4D_Studio_FK` FOREIGN KEY (`Nomor`) REFERENCES `studio` (`Nomor`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `admin`
--
ALTER TABLE `admin`
  ADD CONSTRAINT `Admin_SuperAdmin_FK` FOREIGN KEY (`SuperAdmin_Id_SuperAdmin`) REFERENCES `superadmin` (`Id_SuperAdmin`) ON DELETE CASCADE ON UPDATE NO ACTION;

--
-- Constraints for table `film`
--
ALTER TABLE `film`
  ADD CONSTRAINT `Film_SuperAdmin_FK` FOREIGN KEY (`SuperAdmin_Id_SuperAdmin`) REFERENCES `superadmin` (`Id_SuperAdmin`) ON DELETE CASCADE ON UPDATE NO ACTION;

--
-- Constraints for table `penayangan`
--
ALTER TABLE `penayangan`
  ADD CONSTRAINT `Penayangan_Admin_FK` FOREIGN KEY (`Admin_Id_Admin`) REFERENCES `admin` (`Id_Admin`) ON DELETE CASCADE ON UPDATE NO ACTION,
  ADD CONSTRAINT `Penayangan_Film_FK` FOREIGN KEY (`Film_Id_Film`) REFERENCES `film` (`Id_Film`) ON DELETE CASCADE ON UPDATE NO ACTION,
  ADD CONSTRAINT `Penayangan_Studio_FK` FOREIGN KEY (`Studio_Nomor`) REFERENCES `studio` (`Nomor`) ON DELETE CASCADE ON UPDATE NO ACTION;

--
-- Constraints for table `velvet`
--
ALTER TABLE `velvet`
  ADD CONSTRAINT `Velvet_Studio_FK` FOREIGN KEY (`Nomor`) REFERENCES `studio` (`Nomor`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
