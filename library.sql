-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 29, 2024 at 05:10 PM
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
  `bYearPublished` int(4) NOT NULL,
  `bStatus` int(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `books`
--

INSERT INTO `books` (`bId`, `bName`, `bAuthor`, `bYearPublished`, `bStatus`) VALUES
(1, 'a', 's', 2023, 0),
(2, 'da', 's', 2025, 1),
(3, 'da', 's', 2025, 1),
(4, 'wew', 'wewe', 2026, 0),
(5, 'madolduwah', 'martinqg', 1991, 1),
(6, 'madolduwah', 'martinqg', 1991, 1),
(7, 'wfwfw', 'wk', 2025, 1),
(8, 'wfwfw', 'wk', 2025, 1),
(9, 'rrt', 'rtrthyrs', 2026, 1),
(10, 'rrt', 'rtrthyrs', 2026, 1),
(11, 'rrt', 'rtrthyrs', 2026, 1),
(12, 'rrt', 'rtrthyrs', 2026, 1),
(13, 'hj', 'h', 2024, 1),
(14, 'a', 's', 2023, 0),
(15, 'a', 'ss', 2023, 1),
(16, 'a', 'ss', 2024, 1),
(17, 'hj', 'j', 2024, 0),
(18, 'd4', 'dytyj', 2024, 0),
(19, 'hjhjk', 'dfd', 2024, 1),
(20, 'fh', 'sjj', 2025, 1),
(21, 'wg', 'wh', 2025, 1),
(22, 'd', 'f', 2023, 1),
(23, 'wffwe', 'w', 2025, 1),
(24, 'wgjed', 'wh', 2025, 0),
(25, 'asds', 'sadad', 2025, 0);

-- --------------------------------------------------------

--
-- Table structure for table `members`
--

CREATE TABLE `members` (
  `mId` int(11) NOT NULL,
  `mName` varchar(50) NOT NULL,
  `mPass` varchar(20) NOT NULL DEFAULT '123',
  `mContact` varchar(10) NOT NULL,
  `mCardNo` int(11) DEFAULT NULL,
  `mExpYear` int(4) DEFAULT NULL,
  `mType` char(1) NOT NULL,
  `mStatus` int(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `members`
--

INSERT INTO `members` (`mId`, `mName`, `mPass`, `mContact`, `mCardNo`, `mExpYear`, `mType`, `mStatus`) VALUES
(1000, 'dilshan', '123', '0712345678', 10000, 2026, 'u', 0),
(1002, 'kumara', '123', '0712345678', NULL, NULL, 'u', 0),
(1003, 'w', '123', 'w', NULL, NULL, 'u', 0),
(1004, 'hjh', '123', 'hs', NULL, NULL, 'u', 0),
(1005, 'hjh', '123', 'hs', NULL, NULL, 'u', 0),
(1006, 'dilshan kumara', '123', '0712345674', 10006, 2026, 'u', 0),
(1007, 'dilshan kumara', '123', '0712345678', 10007, 2026, 'u', 0),
(1008, 'kumara', '123', '0212115158', 10008, 2026, 'a', 0),
(1009, 'j', '123', 'j', 10009, 2026, 'a', 1),
(1010, 'q', '123', 'q', 10010, 2026, 'a', 1),
(1011, 'hjkjdasada', '123', 'hhh', 10011, 2026, 'u', 0),
(1012, 'hjkj', '123', 'hhhh', 10012, 2026, 'u', 0),
(1013, 'hjkj', '123', 'hhhhh', 10013, 2026, 'u', 0),
(1014, 'a', '123', 'a', 10014, 2026, 'u', 0),
(1015, 'a', '123', 'a', 10015, 2026, 'a', 0);

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
  MODIFY `bId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT for table `members`
--
ALTER TABLE `members`
  MODIFY `mId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1016;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
