/*
SQLyog Enterprise Trial - MySQL GUI v7.11 
MySQL - 5.5.30 : Database - department
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`department` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `department`;

/*Table structure for table `appdb` */

DROP TABLE IF EXISTS `appdb`;

CREATE TABLE `appdb` (
  `senderid` int(11) DEFAULT NULL,
  `sendercontact` varchar(20) DEFAULT NULL,
  `departmentid` int(11) DEFAULT NULL,
  `teachername` varchar(70) DEFAULT NULL,
  `appsubject` varchar(200) DEFAULT NULL,
  `STATUS` varchar(60) DEFAULT NULL,
  `COUNTERC` int(11) DEFAULT NULL,
  `COUNTERS` int(11) DEFAULT NULL,
  `FILEUPLOAD` varchar(200) DEFAULT NULL,
  `APPDBID` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`APPDBID`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;

/*Data for the table `appdb` */

insert  into `appdb`(`senderid`,`sendercontact`,`departmentid`,`tea0chername`,`appsubject`,`STATUS`,`COUNTERC`,`COUNTERS`,`FILEUPLOAD`,`APPDBID`) values (11501302,'          ',1,'MR. RAKESH','reappear','Pending',0,0,1),(11501311,'7986518069',5,'DEAN ACADEMICS','','Pending',0,1,16);

/*Table structure for table `departmentdetails` */

DROP TABLE IF EXISTS `departmentdetails`;

CREATE TABLE `departmentdetails` (
  `DEPARTMENTID` int(11) NOT NULL AUTO_INCREMENT,
  `DEPARTMENTNAME` varchar(90) DEFAULT NULL,
  PRIMARY KEY (`DEPARTMENTID`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=latin1;

/*Data for the table `departmentdetails` */

insert  into `departmentdetails`(`DEPARTMENTID`,`DEPARTMENTNAME`) values (1,'COMPUTER SCIENCE'),(2,'MECHANICAL'),(3,'CIVIL'),(4,'SPORTS'),(5,'HIGHER AUTHORITIES'),(6,'ELECRONICS'),(7,'ENGLISH'),(8,'COMMERCE'),(9,'MATHEMATICS'),(10,'AGRICULTURE'),(11,'CHEMISTRY'),(12,'NSS'),(13,'DRAMA'),(14,'REEJH'),(15,'POETRY'),(16,'BIOTECHNOLOGY'),(17,'COMPUTER APPLICATIONS'),(18,'YOGA'),(19,'LIBRARY'),(20,'HOSTEL'),(21,'TRANSPORT'),(22,'PHYSICS'),(23,'ENVIRONMENT');

/*Table structure for table `teachers` */

DROP TABLE IF EXISTS `teachers`;

CREATE TABLE `teachers` (
  `TEACHERID` int(11) NOT NULL AUTO_INCREMENT,
  `TEACHERNAME` varchar(80) DEFAULT NULL,
  `PASSWORD` varchar(10) DEFAULT NULL,
  `TEACHERCONTACT` varchar(20) DEFAULT NULL,
  `DEPARTMENTID` int(11) DEFAULT NULL,
  PRIMARY KEY (`TEACHERID`),
  KEY `DEPARTMENTID` (`DEPARTMENTID`),
  CONSTRAINT `teachers_ibfk_1` FOREIGN KEY (`DEPARTMENTID`) REFERENCES `departmentdetails` (`DEPARTMENTID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

/*Data for the table `teachers` */

insert  into `teachers`(`TEACHERID`,`TEACHERNAME`,`PASSWORD`,`TEACHERCONTACT`,`DEPARTMENTID`) values (1,'MR. RAKESH','1234','1234567889',1),(2,'MR. AVTAR','1234','1234567889',2),(3,'MR. ARIJIT','1234','1234567889',1),(4,'MR. MANJIT','1234','1234567889',1),(5,'MS. ARPITA','1234','1234567889',1),(6,'DEAN ACADEMICS','1234','1234567890',5),(7,'VC','1234','1234567890',5);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
