-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: football_dataset
-- ------------------------------------------------------
-- Server version	8.0.28

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
-- Table structure for table `appearances`
--

DROP TABLE IF EXISTS `appearances`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `appearances` (
  `appearanceID` int NOT NULL AUTO_INCREMENT,
  `gameID` int NOT NULL,
  `playerID` int NOT NULL,
  `goals` int DEFAULT NULL,
  `ownGoals` int DEFAULT NULL,
  `shots` int DEFAULT NULL,
  `xGoals` double DEFAULT NULL,
  `xGoalsChain` double DEFAULT NULL,
  `xGoalsBuildup` double DEFAULT NULL,
  `assists` int DEFAULT NULL,
  `keyPasses` int DEFAULT NULL,
  `xAssists` double DEFAULT NULL,
  `position` text,
  `positionOrder` int DEFAULT NULL,
  `yellowCard` int DEFAULT NULL,
  `redCard` int DEFAULT NULL,
  `time` int DEFAULT NULL,
  `substituteIn` int DEFAULT NULL,
  `substituteOut` int DEFAULT NULL,
  `leagueID` int DEFAULT NULL,
  `key_passes` int NOT NULL,
  `own_goals` int NOT NULL,
  `position_order` int NOT NULL,
  `red_card` int NOT NULL,
  `substitute_in` int NOT NULL,
  `substitute_out` int NOT NULL,
  `x_assists` double NOT NULL,
  `x_goals` double NOT NULL,
  `x_goals_buildup` double NOT NULL,
  `x_goals_chain` double NOT NULL,
  `x_passes` double NOT NULL,
  `yellow_card` int NOT NULL,
  PRIMARY KEY (`appearanceID`),
  UNIQUE KEY `appearanceID_UNIQUE` (`appearanceID`)
) ENGINE=InnoDB AUTO_INCREMENT=182 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `leagues`
--

DROP TABLE IF EXISTS `leagues`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `leagues` (
  `leagueID` int NOT NULL AUTO_INCREMENT,
  `name` text,
  `understatNotation` text,
  `understat_notation` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`leagueID`),
  UNIQUE KEY `leagueID_UNIQUE` (`leagueID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `players`
--

DROP TABLE IF EXISTS `players`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `players` (
  `playerID` int NOT NULL AUTO_INCREMENT,
  `name` text NOT NULL,
  UNIQUE KEY `idx_players_playerID` (`playerID`)
) ENGINE=InnoDB AUTO_INCREMENT=9814 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `teams`
--

DROP TABLE IF EXISTS `teams`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `teams` (
  `teamID` int NOT NULL AUTO_INCREMENT,
  `name` text,
  PRIMARY KEY (`teamID`),
  UNIQUE KEY `teamID_UNIQUE` (`teamID`)
) ENGINE=InnoDB AUTO_INCREMENT=265 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-25 16:26:23
