CREATE DATABASE  IF NOT EXISTS `music` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `music`;
-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: music
-- ------------------------------------------------------
-- Server version	8.0.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `album`
--

DROP TABLE IF EXISTS `album`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `album` (
  `idalbum` int NOT NULL AUTO_INCREMENT,
  `artist` int NOT NULL,
  `cover` int NOT NULL,
  `title` varchar(45) NOT NULL,
  `releasedate` date NOT NULL,
  `label` varchar(45) NOT NULL,
  `trackcount` int NOT NULL,
  PRIMARY KEY (`idalbum`),
  UNIQUE KEY `idalbum_UNIQUE` (`idalbum`),
  KEY `album_artist_fk_idx` (`artist`),
  KEY `album_cover_fk_idx` (`cover`),
  CONSTRAINT `album_artist_fk` FOREIGN KEY (`artist`) REFERENCES `artist` (`idartist`),
  CONSTRAINT `album_cover_fk` FOREIGN KEY (`cover`) REFERENCES `cover` (`idcover`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `album`
--

LOCK TABLES `album` WRITE;
/*!40000 ALTER TABLE `album` DISABLE KEYS */;
INSERT INTO `album` VALUES (1,1,1,'ABBA','1975-04-21','Polar Music International',13),(2,1,2,'Super Trouper','1980-11-03','Polar Music International',11),(3,1,3,'Arrival','1976-10-11','Polar Music International',12),(4,2,4,'Bury the Hatchet','1999-01-01','Island Records',13),(5,2,5,'No Need To Argue','1994-10-03','Universal Music',13),(6,3,6,'Café Tacvba','1992-06-28','Warner Music México',13),(7,3,7,'Cuatro Caminos','2003-01-01','MCA Records',14),(8,3,8,'Re','1994-06-22','Warner Music México',20);
/*!40000 ALTER TABLE `album` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `artist`
--

DROP TABLE IF EXISTS `artist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `artist` (
  `idartist` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `origin` varchar(45) NOT NULL,
  `formation` int NOT NULL,
  `genre` varchar(45) NOT NULL,
  PRIMARY KEY (`idartist`),
  UNIQUE KEY `id_UNIQUE` (`idartist`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `artist`
--

LOCK TABLES `artist` WRITE;
/*!40000 ALTER TABLE `artist` DISABLE KEYS */;
INSERT INTO `artist` VALUES (1,'ABBA','Stockholm, Sweden',1972,'Pop'),(2,'The Cranberries','Limerick, Ireland',1989,'Rock'),(3,'Café Tacvba','Mexico City, Mexico',1989,'Rock'),(7,'Plastilina Mosh','Monterrey, Nuevo León, Mexico',1998,'Alternative');
/*!40000 ALTER TABLE `artist` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cover`
--

DROP TABLE IF EXISTS `cover`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cover` (
  `idcover` int NOT NULL AUTO_INCREMENT,
  `coverartist` varchar(45) NOT NULL,
  `imagefile` varchar(45) NOT NULL,
  PRIMARY KEY (`idcover`),
  UNIQUE KEY `idcover_UNIQUE` (`idcover`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cover`
--

LOCK TABLES `cover` WRITE;
/*!40000 ALTER TABLE `cover` DISABLE KEYS */;
INSERT INTO `cover` VALUES (1,'Björn Jorgenssen','abba.jpg'),(2,'Jussi Rintannen','super_trouper.jpg'),(3,'Hilda Labrahansdatter','arrival.jpg'),(4,'John Steffan','bury_the_hatchet.jpg'),(5,'Marty O\'Brian','no_need_to_argue.jpg'),(6,'Joselo Rangel','cafe_tacvba.jpg'),(7,'Luis Ponce','cuatro_caminos.jpg'),(8,'Andrés Beltrán','re.jpg');
/*!40000 ALTER TABLE `cover` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (12);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-09-02 18:09:40
