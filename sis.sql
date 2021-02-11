-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Aug 10, 2017 at 08:31 AM
-- Server version: 5.6.20
-- PHP Version: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `sis`
--

-- --------------------------------------------------------

--
-- Table structure for table `exam`
--

CREATE TABLE IF NOT EXISTS `exam` (
  `username` varchar(20) NOT NULL,
  `firstname` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `exam`
--

INSERT INTO `exam` (`username`, `firstname`, `password`) VALUES
('exam ', 'exam', 'exam'),
('ashish', 'ashish007', 'ashish'),
('bcis', '', ''),
('nobel', 'nobel007', 'nobel');

-- --------------------------------------------------------

--
-- Table structure for table `logintbl`
--

CREATE TABLE IF NOT EXISTS `logintbl` (
  `Id` int(11) NOT NULL,
  `Username` varchar(25) NOT NULL,
  `Password` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `logintbl`
--

INSERT INTO `logintbl` (`Id`, `Username`, `Password`) VALUES
(0, 'admin', 'admin'),
(2, 'ashish', 'ashish'),
(3, 'hello', 'hello'),
(5, 'aksdnh', 'lasdlk');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE IF NOT EXISTS `student` (
  `StdId` int(11) NOT NULL,
  `FirstName` varchar(20) NOT NULL,
  `MiddleName` varchar(20) NOT NULL,
  `LastName` varchar(20) NOT NULL,
  `Gender` varchar(20) NOT NULL,
  `PerAddress` varchar(20) NOT NULL,
  `TempAddress` varchar(20) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Mobile` varchar(20) NOT NULL,
  `Program` varchar(20) NOT NULL,
  `Semester` varchar(20) NOT NULL,
  `Section` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`StdId`, `FirstName`, `MiddleName`, `LastName`, `Gender`, `PerAddress`, `TempAddress`, `Email`, `Mobile`, `Program`, `Semester`, `Section`) VALUES
(1, 'ashish', 'alsd', 'lalskd', 'male', 'asdj', 'lasdl', 'lkaslkd', 'lasl', 'lalskjd', 'Fifth', 'aiushd'),
(2, 'hello', 'khaskld', 'lkalskjd', 'Female', 'ashkdhj', 'asdkl', 'ljaslkdj', 'ljalskdj', 'lajsldkj', 'First', 'a');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `userid` int(11) NOT NULL,
  `username` varchar(20) NOT NULL,
  `firstname` varchar(20) NOT NULL,
  `middlename` varchar(20) DEFAULT NULL,
  `lastname` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `peraddress` varchar(20) NOT NULL,
  `tempaddress` varchar(20) NOT NULL,
  `contact` varchar(20) NOT NULL,
  `email` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`userid`, `username`, `firstname`, `middlename`, `lastname`, `password`, `peraddress`, `tempaddress`, `contact`, `email`) VALUES
(2, 'ashish', 'aklsdnl', 'lasdkl', 'lkajsldkj', 'ashish', 'laksjdklj', 'lkajsdlkj', 'lkajsldkj', 'lkajslkd'),
(3, 'hello', 'kajsd', 'kajsdkj', 'kjakj', 'hello', 'kjaskjd', 'kjasjk', 'kjaskjd', 'kaskjd'),
(5, 'aksdnh', 'ram', 'prashad', 'sharma', 'lasdlk', 'lkajslkdj', '2222222', 'ljaslkdj', 'lajslkdjl');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `logintbl`
--
ALTER TABLE `logintbl`
 ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
 ADD PRIMARY KEY (`StdId`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
 ADD PRIMARY KEY (`userid`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
