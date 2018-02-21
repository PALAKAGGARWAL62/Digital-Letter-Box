/*
SQLyog Enterprise Trial - MySQL GUI v7.11 
MySQL - 5.5.30 : Database - application
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`application` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `application`;

/*Table structure for table `student_data` */

DROP TABLE IF EXISTS `student_data`;

CREATE TABLE `student_data` (
  `REDG_ID` int(11) DEFAULT NULL,
  `STUDENT_NAME` varchar(60) DEFAULT NULL,
  `STUDENT_CONTACT_NO` varchar(20) DEFAULT NULL,
  `PASSWORD` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `student_data` */

insert  into `student_data`(`REDG_ID`,`STUDENT_NAME`,`STUDENT_CONTACT_NO`,`PASSWORD`) values (11501286,'AMIT SHARMA',NULL,'1234'),(11501287,'ANKUSH BHANDARI',NULL,'1234'),(11501289,'ARJUN MAHAJAN',NULL,'1234'),(11501290,'BHUWAN SHARMA',NULL,'1234'),(11501292,'DIKSHA',NULL,'1234'),(11501293,'GUNTAS KAUR',NULL,'1234'),(11501294,'GURVEER SINGH',NULL,'1234'),(11501295,'GURWINDER SINGH',NULL,'1234'),(11501302,'MANPREET KAUR','          ','1234'),(11501303,'MANPREET SINGH',NULL,'1234'),(11501304,'MANSI',NULL,'1234'),(11501305,'MRIDU SOOD',NULL,'1234'),(11501306,'NAVLEEN KAUR',NULL,'1234'),(11501307,'NIKHIL SHARMA',NULL,'1234'),(11501308,'NILESH SHARMA',NULL,'1234'),(11501309,'NITALI SHARMA',NULL,'1234'),(11501311,'PALAK AGGARWAL','          ','1234'),(11501314,'PARUL SHARMA',NULL,'1234'),(11501316,'POOJA',NULL,'1234'),(11501317,'PRANAV GUPTA',NULL,'1234'),(11501328,'SRISHTY MEHTA',NULL,'1234'),(11501331,'TWINKLE',NULL,'1234'),(11501332,'SANPREET','          ','1234');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
