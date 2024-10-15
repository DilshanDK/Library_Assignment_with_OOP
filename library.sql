-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 15, 2024 at 06:06 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `library`
--

-- --------------------------------------------------------

--
-- Table structure for table `books`
--

CREATE TABLE `books` (
  `bId` int(11) NOT NULL,
  `bName` varchar(50) NOT NULL,
  `bAuthor` varchar(50) NOT NULL,
  `bYearPublished` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `books`
--

INSERT INTO `books` (`bId`, `bName`, `bAuthor`, `bYearPublished`) VALUES
(1, 'a', 's', 2023),
(2, 'd', 's', 2025),
(3, 'd', 's', 2025),
(4, 'wew', 'wewe', 2026),
(5, 'madolduwa ', 'martin ', 1990),
(6, 'hjhjk', 'dfds', 2024),
(7, 'y', 'y', 2025),
(8, 'w', 'w', 2025);

-- --------------------------------------------------------

--
-- Table structure for table `members`
--

CREATE TABLE `members` (
  `mId` int(11) NOT NULL,
  `mName` varchar(50) NOT NULL,
  `mPass` varchar(20) NOT NULL,
  `mContact` varchar(10) NOT NULL,
  `mCardNo` int(11) DEFAULT NULL,
  `mExpYear` int(4) DEFAULT NULL,
  `mType` char(1) NOT NULL,
  `mStatus` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `members`
--

INSERT INTO `members` (`mId`, `mName`, `mPass`, `mContact`, `mCardNo`, `mExpYear`, `mType`, `mStatus`) VALUES
(1000, 'dilshan', '123', '0712345678', 10000, 2026, 'u', 0),
(1002, 'kumara', '456', '0712345678', NULL, NULL, 'a', 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `books`
--
ALTER TABLE `books`
  ADD PRIMARY KEY (`bId`);

--
-- Indexes for table `members`
--
ALTER TABLE `members`
  ADD PRIMARY KEY (`mId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `books`
--
ALTER TABLE `books`
  MODIFY `bId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `members`
--
ALTER TABLE `members`
  MODIFY `mId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1003;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
