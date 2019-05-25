-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 25, 2019 at 12:28 AM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.2.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `docentes`
--

-- --------------------------------------------------------

--
-- Table structure for table `asistencia`
--

CREATE TABLE `asistencia` (
  `AsistenciaID` int(4) NOT NULL,
  `HorarioID` int(4) NOT NULL,
  `UserID` int(4) NOT NULL,
  `asistencia` tinyint(4) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `asistencia`
--

INSERT INTO `asistencia` (`AsistenciaID`, `HorarioID`, `UserID`, `asistencia`) VALUES
(58, 25, 2, 0),
(59, 26, 2, 1),
(60, 27, 2, 0),
(61, 28, 2, 1),
(62, 25, 3, 0),
(63, 26, 3, 0),
(64, 27, 3, 0),
(65, 28, 3, 1),
(66, 25, 4, 0),
(67, 26, 4, 0),
(68, 27, 4, 0),
(69, 28, 4, 0),
(70, 25, 5, 0),
(71, 26, 5, 0),
(72, 27, 5, 0),
(73, 28, 5, 0),
(74, 31, 2, 0),
(75, 31, 3, 0),
(76, 31, 4, 0),
(77, 31, 5, 0),
(78, 31, 6, 0),
(79, 32, 2, 0),
(80, 34, 8, 0),
(81, 35, 8, 0),
(82, 36, 8, 1),
(83, 37, 8, 0),
(84, 38, 8, 0),
(85, 39, 8, 0),
(86, 40, 8, 0),
(87, 41, 8, 0),
(88, 36, 9, 0),
(89, 37, 9, 0),
(90, 38, 9, 0),
(91, 39, 9, 0),
(92, 40, 9, 0),
(93, 41, 9, 0),
(94, 42, 8, 1),
(95, 36, 11, 0),
(96, 37, 11, 0),
(97, 38, 11, 0),
(98, 39, 11, 0),
(99, 40, 11, 0),
(100, 41, 11, 0),
(101, 42, 11, 1),
(102, 36, 12, 0),
(103, 37, 12, 0),
(104, 38, 12, 0),
(105, 39, 12, 0),
(106, 40, 12, 0),
(107, 41, 12, 0),
(108, 42, 12, 1),
(109, 36, 13, 0),
(110, 37, 13, 0),
(111, 38, 13, 0),
(112, 39, 13, 0),
(113, 40, 13, 0),
(114, 41, 13, 0),
(115, 42, 13, 0),
(116, 36, 14, 0),
(117, 37, 14, 0),
(118, 38, 14, 0),
(119, 39, 14, 0),
(120, 40, 14, 0),
(121, 41, 14, 0),
(122, 42, 14, 0),
(123, 43, 15, 0),
(124, 44, 15, 0),
(125, 45, 15, 0),
(126, 43, 14, 0),
(127, 44, 14, 0),
(128, 45, 14, 0),
(129, 43, 13, 1),
(130, 44, 13, 0),
(131, 45, 13, 0),
(132, 43, 12, 0),
(133, 44, 12, 0),
(134, 45, 12, 0),
(135, 43, 11, 1),
(136, 44, 11, 0),
(137, 45, 11, 0),
(138, 46, 15, 0),
(139, 46, 14, 0),
(140, 46, 13, 0),
(141, 46, 12, 0),
(142, 46, 11, 0),
(143, 47, 11, 1),
(144, 47, 12, 1);

-- --------------------------------------------------------

--
-- Table structure for table `cursos`
--

CREATE TABLE `cursos` (
  `CursoID` int(4) NOT NULL,
  `UserID` int(4) NOT NULL,
  `FechaHora` datetime NOT NULL,
  `Nombre` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `cursos`
--

INSERT INTO `cursos` (`CursoID`, `UserID`, `FechaHora`, `Nombre`) VALUES
(16, 10, '2019-05-24 12:26:29', 'Diplomado en Mercadotecnia y Ventas'),
(17, 10, '2019-05-24 12:26:41', 'Diplomado en Recursos Humanos'),
(18, 10, '2019-05-24 12:26:52', 'Diplomado en Finanzas para no Especialistas'),
(19, 10, '2019-05-24 13:59:13', 'Curso de capacitacÃ²n');

-- --------------------------------------------------------

--
-- Table structure for table `documentos`
--

CREATE TABLE `documentos` (
  `ArchivoID` int(4) NOT NULL,
  `UserID` int(4) NOT NULL,
  `CursoID` int(4) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `FechaHora` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `horarios`
--

CREATE TABLE `horarios` (
  `HorarioID` int(4) NOT NULL,
  `CursoID` int(4) NOT NULL,
  `FechaHora` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `horarios`
--

INSERT INTO `horarios` (`HorarioID`, `CursoID`, `FechaHora`) VALUES
(43, 16, '2019-05-25 13:00:00'),
(44, 16, '2019-05-25 13:00:00'),
(45, 16, '2019-05-26 13:00:00'),
(46, 16, '2019-05-15 14:00:00'),
(47, 17, '2019-05-30 15:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `inscritos`
--

CREATE TABLE `inscritos` (
  `InscritosID` int(4) NOT NULL,
  `CursoID` int(4) NOT NULL,
  `UserID` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `inscritos`
--

INSERT INTO `inscritos` (`InscritosID`, `CursoID`, `UserID`) VALUES
(42, 16, 14),
(43, 16, 13),
(44, 16, 12),
(45, 16, 11),
(46, 17, 11),
(47, 17, 12);

-- --------------------------------------------------------

--
-- Table structure for table `usuario`
--

CREATE TABLE `usuario` (
  `UserID` int(4) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Apellidos` varchar(45) NOT NULL,
  `Nivel` varchar(45) DEFAULT NULL,
  `Password` varchar(32) NOT NULL,
  `Direccion` varchar(60) DEFAULT NULL,
  `Email` varchar(25) NOT NULL,
  `Nacimiento` date DEFAULT NULL,
  `Admin` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `usuario`
--

INSERT INTO `usuario` (`UserID`, `Nombre`, `Apellidos`, `Nivel`, `Password`, `Direccion`, `Email`, `Nacimiento`, `Admin`) VALUES
(10, 'David', 'Partida', 'David', 'Wefnet507', 'null', 'coondee@hotmail.com', NULL, 1),
(11, 'Maria', 'Perez', 'Maria', '123650123', 'null', 'mperez@hotmail.com', NULL, 0),
(12, 'Pedro', 'Torres', 'Pedro', '123650123', 'null', 'ptorres@gmail.com', NULL, 0),
(13, 'Edgar', 'Roman', 'Edgar', '123650123', 'null', 'eroman@hotmail.com', NULL, 0),
(14, 'Jesus', 'Gonzalez', 'Jesus', '123650123', 'null', 'jgonzalez@gmail.com', NULL, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `asistencia`
--
ALTER TABLE `asistencia`
  ADD PRIMARY KEY (`AsistenciaID`);

--
-- Indexes for table `cursos`
--
ALTER TABLE `cursos`
  ADD PRIMARY KEY (`CursoID`);

--
-- Indexes for table `documentos`
--
ALTER TABLE `documentos`
  ADD PRIMARY KEY (`ArchivoID`);

--
-- Indexes for table `horarios`
--
ALTER TABLE `horarios`
  ADD PRIMARY KEY (`HorarioID`);

--
-- Indexes for table `inscritos`
--
ALTER TABLE `inscritos`
  ADD PRIMARY KEY (`InscritosID`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`UserID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `asistencia`
--
ALTER TABLE `asistencia`
  MODIFY `AsistenciaID` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=145;

--
-- AUTO_INCREMENT for table `cursos`
--
ALTER TABLE `cursos`
  MODIFY `CursoID` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT for table `horarios`
--
ALTER TABLE `horarios`
  MODIFY `HorarioID` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=48;

--
-- AUTO_INCREMENT for table `inscritos`
--
ALTER TABLE `inscritos`
  MODIFY `InscritosID` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=48;

--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `UserID` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
