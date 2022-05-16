-- phpMyAdmin SQL Dump
-- version 5.3.0-dev+20220427.b008cca95d
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 28, 2022 at 02:57 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `programming_java`
--

-- --------------------------------------------------------

--
-- Table structure for table `informations`
--

CREATE TABLE `informations` (
  `st_id` int(11) NOT NULL,
  `stu_names` varchar(255) NOT NULL,
  `stu_grades` int(11) NOT NULL,
  `stu_degree` varchar(255) NOT NULL,
  `Id` int(11) NOT NULL,
  `roll_number` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `informations`
--

INSERT INTO `informations` (`st_id`, `stu_names`, `stu_grades`, `stu_degree`, `Id`, `roll_number`) VALUES
(1, ' Mukantwari Françoise', 19, 'Computer Science', 1, '2022/1'),
(2, 'Clare Kanja', 20, 'Computer Science', 2, '2022/2'),
(3, 'Nessa M', 13, 'Business courses', 3, '2022/3'),
(4, 'Prudence Kayijuka', 16, 'Global Challenge', 4, '2022/4'),
(5, 'Iriza Nicole', 12, 'Business courses', 5, '2022/5'),
(6, 'Ian Nkotanyi', 15, 'Global Challenge', 6, '2022/6');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `Id` int(11) NOT NULL,
  `User_name` varchar(255) NOT NULL,
  `Email` varchar(255) NOT NULL,
  `Password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`Id`, `User_name`, `Email`, `Password`) VALUES
(1, 'Franco', 'f.mukantwari@alustudent.com -', 'franco12'),
(2, 'Clare1', 'clare@alustudent.com', 'Kanja'),
(3, 'Nessa', 'nessa@gmail.com', 'nessa'),
(4, 'Prudence', 'p.kayijuka@gmail.com', 'prude'),
(5, 'Nicole', 'nicole@gmail.com', 'nicole'),
(6, 'Ian', 'Ian@gmail.com', '12');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `informations`
--
ALTER TABLE `informations`
  ADD PRIMARY KEY (`st_id`),
  ADD KEY `Id` (`Id`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `informations`
--
ALTER TABLE `informations`
  MODIFY `st_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;



