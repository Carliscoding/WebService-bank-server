-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 14, 2024 at 06:44 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mybank`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbldrawmoneyhistory`
--

CREATE TABLE `tbldrawmoneyhistory` (
  `id` int(11) NOT NULL,
  `user_name` varchar(20) DEFAULT NULL,
  `total_draw` float DEFAULT NULL,
  `draw_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbldrawmoneyhistory`
--

INSERT INTO `tbldrawmoneyhistory` (`id`, `user_name`, `total_draw`, `draw_date`) VALUES
(1, 'huy', 200000, '2024-04-20'),
(2, 'test01', 100000, '2024-04-21'),
(3, 'test20', 50, '2024-04-21'),
(4, 'huy', 124, '2024-04-22'),
(5, 'huy', 50, '2024-04-22'),
(6, 'huy', 50, '2024-04-22'),
(7, 'huy', 100, '2024-04-22'),
(8, 'huy', 100, '2024-04-22'),
(9, 'huy', 150, '2024-04-22'),
(10, 'huy', 100, '2024-04-22'),
(11, 'huy10', 1000, '2024-04-22'),
(12, 'giahuy', 1000, '2024-05-11');

-- --------------------------------------------------------

--
-- Table structure for table `tbltransferhistory`
--

CREATE TABLE `tbltransferhistory` (
  `id` int(11) NOT NULL,
  `from_user_name` varchar(20) DEFAULT NULL,
  `to_user_name` varchar(20) DEFAULT NULL,
  `total_transfer` float DEFAULT NULL,
  `transfer_date` date DEFAULT NULL,
  `note` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbltransferhistory`
--

INSERT INTO `tbltransferhistory` (`id`, `from_user_name`, `to_user_name`, `total_transfer`, `transfer_date`, `note`) VALUES
(1, 'huy', 'test01', 50000, '2024-04-21', 'Tien an sang.'),
(3, 'huy', 'test01', 50000, '2024-04-21', 'Tien an sang.'),
(5, 'huy', 'test01', 50000, '2024-04-21', 'Tien an sang.'),
(6, 'huy', 'ty', 300000, '2024-04-21', 'for study fee'),
(7, 'huy', 'huy3', 1000000, '2024-04-21', 'Message'),
(8, 'huy', 'test20', 100000, '2024-04-21', 'Message'),
(9, 'test20', 'huy', 1000, '2024-04-21', 'Message'),
(10, 'huy', 'test20', 1000, '2024-04-21', 'Message'),
(11, 'huy', 'huy2', 2100, '2024-04-21', 'Message'),
(12, 'huy', 'huy2', 30000, '2024-04-22', 'Tien an sang - an pho :)'),
(13, 'huy', 'test01', 100, '2024-04-22', '100 cau chuc'),
(14, 'huy', 'huy2', 100, '2024-04-22', 'test2'),
(15, 'huy', 'huy2', 100, '2024-04-22', 'test03'),
(16, 'huy', 'huy2', 1000, '2024-04-22', 'sap toi gio bao cao r '),
(17, 'huy', 'test02', 10000, '2024-04-22', '22-4'),
(18, 'huy', 'test20', 50, '2024-04-22', 'note'),
(19, 'huy', 'test20', 1000, '2024-04-22', 'note'),
(20, 'huy', 'test20', 10000, '2024-04-22', 'note2'),
(21, 'huy', 'huy10', 1000000, '2024-04-22', 'tien mung sinh nhat'),
(22, 'huy', 'giahuy', 100000, '2024-05-11', 'an pho'),
(23, 'huy', 'ho gia huy', 100000, '2024-05-13', 'pho bat da');

-- --------------------------------------------------------

--
-- Table structure for table `tbluser`
--

CREATE TABLE `tbluser` (
  `user_name` varchar(20) NOT NULL,
  `full_name` varchar(50) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `total_money` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbluser`
--

INSERT INTO `tbluser` (`user_name`, `full_name`, `password`, `total_money`) VALUES
('giahuy', 'hua ho gia huy', 'user123', 99000),
('ho gia huy', 'hua ho gia huy', 'user123', 100000),
('huy', 'gia huy', 'user123', 97645000),
('huy10', 'gia huy', 'user123', 999000),
('huy2', 'Hua ho gia huy', 'user123', 33300),
('huy3', 'ho gia huy', 'user123', 1000000),
('test01', 'nhom7', 'user123', 70000100),
('test02', 'test02', 'user123', 10000),
('test20', 'test20', 'user123', 111000),
('ty', 'Thanh Ty', 'user123', 30000000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbldrawmoneyhistory`
--
ALTER TABLE `tbldrawmoneyhistory`
  ADD PRIMARY KEY (`id`),
  ADD KEY `user_name` (`user_name`);

--
-- Indexes for table `tbltransferhistory`
--
ALTER TABLE `tbltransferhistory`
  ADD PRIMARY KEY (`id`),
  ADD KEY `from_user_name` (`from_user_name`),
  ADD KEY `to_user_name` (`to_user_name`);

--
-- Indexes for table `tbluser`
--
ALTER TABLE `tbluser`
  ADD PRIMARY KEY (`user_name`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbldrawmoneyhistory`
--
ALTER TABLE `tbldrawmoneyhistory`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `tbltransferhistory`
--
ALTER TABLE `tbltransferhistory`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbldrawmoneyhistory`
--
ALTER TABLE `tbldrawmoneyhistory`
  ADD CONSTRAINT `tbldrawmoneyhistory_ibfk_1` FOREIGN KEY (`user_name`) REFERENCES `tbluser` (`user_name`);

--
-- Constraints for table `tbltransferhistory`
--
ALTER TABLE `tbltransferhistory`
  ADD CONSTRAINT `tbltransferhistory_ibfk_1` FOREIGN KEY (`from_user_name`) REFERENCES `tbluser` (`user_name`),
  ADD CONSTRAINT `tbltransferhistory_ibfk_2` FOREIGN KEY (`to_user_name`) REFERENCES `tbluser` (`user_name`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
