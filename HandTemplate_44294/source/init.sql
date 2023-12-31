-- MySQL dump 10.13  Distrib 5.7.39, for Linux (x86_64)
--
-- Host: localhost    Database: hand_work
-- ------------------------------------------------------
-- Server version	5.7.39-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Temporary table structure for view `GET_DAYS`
--

DROP TABLE IF EXISTS `GET_DAYS`;
/*!50001 DROP VIEW IF EXISTS `GET_DAYS`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `GET_DAYS` AS SELECT 
 1 AS `CUR_MONTH`,
 1 AS `DAYS`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `countries`
--

DROP TABLE IF EXISTS `countries`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `countries` (
  `COUNTRY_ID` char(2) NOT NULL COMMENT 'Primary key of countries table.',
  `COUNTRY_NAME` varchar(40) DEFAULT NULL COMMENT 'Country name',
  `REGION_ID` int(65) DEFAULT NULL COMMENT 'Region ID for the country. Foreign key to region_id column in the departments table.',
  PRIMARY KEY (`COUNTRY_ID`) USING BTREE,
  KEY `COUNTR_REG_FK` (`REGION_ID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='country table. Contains 25 rows. References with locations table.';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `countries`
--

LOCK TABLES `countries` WRITE;
/*!40000 ALTER TABLE `countries` DISABLE KEYS */;
INSERT INTO `countries` VALUES ('AR','Argentina',2),('AU','Australia',3),('BE','Belgium',1),('BR','Brazil',2),('CA','Canada',2),('CH','Switzerland',1),('CN','China',3),('DE','Germany',1),('DK','Denmark',1),('EG','Egypt',4),('FR','France',1),('IL','Israel',4),('IN','India',3),('IT','Italy',1),('JP','Japan',3),('KW','Kuwait',4),('ML','Malaysia',3),('MX','Mexico',2),('NG','Nigeria',4),('NL','Netherlands',1),('SG','Singapore',3),('UK','United Kingdom',1),('US','United States of America',2),('ZM','Zambia',4),('ZW','Zimbabwe',4);
/*!40000 ALTER TABLE `countries` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `course` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `teacher_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course`
--

LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` VALUES (2,'test_1',1),(3,'test_2',2),(4,'test_3',3),(5,'test_4',4),(6,'test_5',5),(7,'test_6',6),(8,'test_7',7),(9,'test_8',8),(10,'test_9',9),(11,'test_10',10);
/*!40000 ALTER TABLE `course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `departments`
--

DROP TABLE IF EXISTS `departments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `departments` (
  `DEPARTMENT_ID` decimal(4,0) NOT NULL COMMENT 'Primary key column of departments table.',
  `DEPARTMENT_NAME` varchar(30) NOT NULL COMMENT 'A not null column that shows name of a department. Administration,\nMarketing, Purchasing, Human Resources, Shipping, IT, Executive, Public\nRelations, Sales, Finance, and Accounting. ',
  `MANAGER_ID` decimal(6,0) DEFAULT NULL COMMENT 'Manager_id of a department. Foreign key to employee_id column of employees table. The manager_id column of the employee table references this column.',
  `LOCATION_ID` decimal(4,0) DEFAULT NULL COMMENT 'Location id where a department is located. Foreign key to location_id column of locations table.',
  PRIMARY KEY (`DEPARTMENT_ID`) USING BTREE,
  KEY `DEPT_LOCATION_IX` (`LOCATION_ID`) USING BTREE,
  KEY `DEPT_MGR_FK` (`MANAGER_ID`) USING BTREE,
  CONSTRAINT `DEPT_LOC_FK` FOREIGN KEY (`LOCATION_ID`) REFERENCES `locations` (`LOCATION_ID`),
  CONSTRAINT `DEPT_MGR_FK` FOREIGN KEY (`MANAGER_ID`) REFERENCES `employees` (`EMPLOYEE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='Department table that shows details of departments where employees\nwork. Contains 27 rows; references with locations, employees, and job_history tables.';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `departments`
--

LOCK TABLES `departments` WRITE;
/*!40000 ALTER TABLE `departments` DISABLE KEYS */;
INSERT INTO `departments` VALUES (10,'Administration',200,1700),(20,'Marketing',201,1800),(30,'Purchasing',114,1700),(40,'Human Resources',203,2400),(50,'Shipping',121,1500),(60,'IT',103,1400),(70,'Public Relations',204,2700),(80,'Sales',145,2500),(90,'Executive',100,1700),(100,'Finance',108,1700),(110,'Accounting',205,1700),(120,'Treasury',NULL,1700),(130,'Corporate Tax',NULL,1700),(140,'Control And Credit',NULL,1700),(150,'Shareholder Services',NULL,1700),(160,'Benefits',NULL,1700),(170,'Manufacturing',NULL,1700),(180,'Construction',NULL,1700),(190,'Contracting',NULL,1700),(200,'Operations',NULL,1700),(210,'IT Support',NULL,1700),(220,'NOC',NULL,1700),(230,'IT Helpdesk',NULL,1700),(240,'Government Sales',NULL,1700),(250,'Retail Sales',NULL,1700),(260,'Recruiting',NULL,1700),(270,'Payroll',NULL,1700);
/*!40000 ALTER TABLE `departments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary table structure for view `emp_v1`
--

DROP TABLE IF EXISTS `emp_v1`;
/*!50001 DROP VIEW IF EXISTS `emp_v1`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `emp_v1` AS SELECT 
 1 AS `EMPLOYEE_ID`,
 1 AS `FIRST_NAME`,
 1 AS `LAST_NAME`,
 1 AS `EMAIL`,
 1 AS `PHONE_NUMBER`,
 1 AS `HIRE_DATE`,
 1 AS `JOB_ID`,
 1 AS `SALARY`,
 1 AS `COMMISSION_PCT`,
 1 AS `MANAGER_ID`,
 1 AS `DEPARTMENT_ID`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `emp_v10`
--

DROP TABLE IF EXISTS `emp_v10`;
/*!50001 DROP VIEW IF EXISTS `emp_v10`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `emp_v10` AS SELECT 
 1 AS `EMPLOYEE_ID`,
 1 AS `FIRST_NAME`,
 1 AS `LAST_NAME`,
 1 AS `EMAIL`,
 1 AS `PHONE_NUMBER`,
 1 AS `HIRE_DATE`,
 1 AS `JOB_ID`,
 1 AS `SALARY`,
 1 AS `COMMISSION_PCT`,
 1 AS `MANAGER_ID`,
 1 AS `DEPARTMENT_ID`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `emp_v2`
--

DROP TABLE IF EXISTS `emp_v2`;
/*!50001 DROP VIEW IF EXISTS `emp_v2`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `emp_v2` AS SELECT 
 1 AS `DEPARTMENT_ID`,
 1 AS `EMP_CNT`,
 1 AS `AVG_SALARY`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `emp_v3`
--

DROP TABLE IF EXISTS `emp_v3`;
/*!50001 DROP VIEW IF EXISTS `emp_v3`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `emp_v3` AS SELECT 
 1 AS `EMPLOYEE_ID`,
 1 AS `FIRST_NAME`,
 1 AS `LAST_NAME`,
 1 AS `EMAIL`,
 1 AS `PHONE_NUMBER`,
 1 AS `HIRE_DATE`,
 1 AS `JOB_ID`,
 1 AS `SALARY`,
 1 AS `COMMISSION_PCT`,
 1 AS `EMP_MANAGER_ID`,
 1 AS `DEPARTMENT_ID`,
 1 AS `DEPARTMENT_NAME`,
 1 AS `DEP_MANAGER_ID`,
 1 AS `LOCATION_ID`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `employees`
--

DROP TABLE IF EXISTS `employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employees` (
  `EMPLOYEE_ID` decimal(6,0) NOT NULL COMMENT 'Primary key of employees table.',
  `FIRST_NAME` varchar(20) DEFAULT NULL COMMENT 'First name of the employee. A not null column.',
  `LAST_NAME` varchar(25) NOT NULL COMMENT 'Last name of the employee. A not null column.',
  `EMAIL` varchar(25) NOT NULL COMMENT 'Email id of the employee',
  `PHONE_NUMBER` varchar(20) DEFAULT NULL COMMENT 'Phone number of the employee; includes country code and area code',
  `HIRE_DATE` datetime NOT NULL COMMENT 'Date when the employee started on this job. A not null column.',
  `JOB_ID` varchar(10) NOT NULL COMMENT 'Current job of the employee; foreign key to job_id column of the\njobs table. A not null column.',
  `SALARY` decimal(8,2) DEFAULT NULL COMMENT 'Monthly salary of the employee. Must be greater\nthan zero (enforced by constraint emp_salary_min)',
  `COMMISSION_PCT` decimal(2,2) DEFAULT NULL COMMENT 'Commission percentage of the employee; Only employees in sales\ndepartment elgible for commission percentage',
  `MANAGER_ID` decimal(6,0) DEFAULT NULL COMMENT 'Manager id of the employee; has same domain as manager_id in\ndepartments table. Foreign key to employee_id column of employees table.\n(useful for reflexive joins and CONNECT BY query)',
  `DEPARTMENT_ID` decimal(4,0) DEFAULT NULL COMMENT 'Department id where employee works; foreign key to department_id\ncolumn of the departments table',
  PRIMARY KEY (`EMPLOYEE_ID`) USING BTREE,
  KEY `EMP_DEPARTMENT_IX` (`DEPARTMENT_ID`) USING BTREE,
  KEY `EMP_JOB_IX` (`JOB_ID`) USING BTREE,
  KEY `EMP_MANAGER_IX` (`MANAGER_ID`) USING BTREE,
  KEY `EMP_NAME_IX` (`LAST_NAME`,`FIRST_NAME`) USING BTREE,
  CONSTRAINT `EMP_DEPT_FK` FOREIGN KEY (`DEPARTMENT_ID`) REFERENCES `departments` (`DEPARTMENT_ID`),
  CONSTRAINT `EMP_JOB_FK` FOREIGN KEY (`JOB_ID`) REFERENCES `job` (`JOB_ID`),
  CONSTRAINT `EMP_MANAGER_FK` FOREIGN KEY (`MANAGER_ID`) REFERENCES `employees` (`EMPLOYEE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='employees table. Contains 107 rows. References with departments,\njobs, job_history tables. Contains a self reference.';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employees`
--

LOCK TABLES `employees` WRITE;
/*!40000 ALTER TABLE `employees` DISABLE KEYS */;
INSERT INTO `employees` VALUES (100,'Steven','King','SKING','515.123.4567','2003-06-17 00:00:00','AD_PRES',24000.00,NULL,NULL,90),(101,'Neena','Kochhar','NKOCHHAR','515.123.4568','2005-09-21 00:00:00','AD_VP',17000.00,NULL,100,90),(102,'Lex','De Haan','LDEHAAN','515.123.4569','2001-01-13 00:00:00','AD_VP',17000.00,NULL,100,90),(103,'Alexander','Hunold','AHUNOLD','590.423.4567','2006-01-03 00:00:00','IT_PROG',9000.00,NULL,102,60),(104,'Bruce','John','BERNST','590.423.4568','2007-05-21 00:00:00','IT_PROG',6000.00,NULL,103,60),(105,'David','Austin','DAUSTIN','590.423.4569','2005-06-25 00:00:00','IT_PROG',4800.00,NULL,103,60),(106,'Valli','Pataballa','VPATABAL','590.423.4560','2006-02-05 00:00:00','IT_PROG',4800.00,NULL,103,60),(107,'Diana','Lorentz','DLORENTZ','590.423.5567','2007-02-07 00:00:00','IT_PROG',4200.00,NULL,103,60),(108,'Nancy','Greenberg','NGREENBE','515.124.4569','2002-08-17 00:00:00','FI_MGR',18012.00,NULL,101,100),(109,'Daniel','Faviet','DFAVIET','515.124.4169','2002-08-16 00:00:00','FI_ACCOUNT',9000.00,NULL,108,100),(110,'John','Chen','JCHEN','515.124.4269','2005-09-28 00:00:00','FI_ACCOUNT',8200.00,NULL,108,100),(111,'Ismael','Sciarra','ISCIARRA','515.124.4369','2005-09-30 00:00:00','FI_ACCOUNT',7700.00,NULL,108,100),(112,'Jose Manuel','Urman','JMURMAN','515.124.4469','2006-03-07 00:00:00','FI_ACCOUNT',7800.00,NULL,108,100),(113,'Luis','Popp','LPOPP','515.124.4567','2007-12-07 00:00:00','FI_ACCOUNT',6900.00,NULL,108,100),(114,'Den','Raphaely','DRAPHEAL','515.127.4561','2002-12-07 00:00:00','PU_MAN',16500.00,NULL,100,30),(115,'Alexander','Khoo','AKHOO','515.127.4562','2003-05-18 00:00:00','PU_CLERK',8921.15,NULL,114,30),(116,'Shelli','Baida','SBAIDA','515.127.4563','2005-12-24 00:00:00','PU_CLERK',8921.15,NULL,114,30),(117,'Sigal','Tobias','STOBIAS','515.127.4564','2005-07-24 00:00:00','PU_CLERK',8921.15,NULL,114,30),(118,'Guy','Himuro','GHIMURO','515.127.4565','2006-11-15 00:00:00','PU_CLERK',8921.15,NULL,114,30),(119,'Karen','Colmenares','KCOLMENA','515.127.4566','2007-08-10 00:00:00','PU_CLERK',8921.15,NULL,114,30),(120,'Matthew','Weiss','MWEISS','650.123.1234','2004-07-18 00:00:00','ST_MAN',12000.00,NULL,100,50),(121,'Adam','Fripp','AFRIPP','650.123.2234','2005-04-10 00:00:00','ST_MAN',12300.00,NULL,100,50),(122,'Payam','Kaufling','PKAUFLIN','650.123.3234','2003-05-01 00:00:00','ST_MAN',11850.00,NULL,100,50),(123,'Shanta','Vollman','SVOLLMAN','650.123.4234','2005-10-10 00:00:00','ST_MAN',9750.00,NULL,100,50),(124,'Kevin','Mourgos','KMOURGOS','650.123.5234','2007-11-16 00:00:00','ST_MAN',8700.00,NULL,100,50),(125,'Julia','Nayer','JNAYER','650.124.1214','2005-07-16 00:00:00','ST_CLERK',8921.15,NULL,120,50),(126,'Irene','Mikkilineni','IMIKKILI','650.124.1224','2006-09-28 00:00:00','ST_CLERK',8921.15,NULL,120,50),(127,'James','Landry','JLANDRY','650.124.1334','2007-01-14 00:00:00','ST_CLERK',8921.15,NULL,120,50),(128,'Steven','Markle','SMARKLE','650.124.1434','2008-03-08 00:00:00','ST_CLERK',8921.15,NULL,120,50),(129,'Laura','Bissot','LBISSOT','650.124.5234','2005-08-20 00:00:00','ST_CLERK',8921.15,NULL,121,50),(130,'Mozhe','Atkinson','MATKINSO','650.124.6234','2005-10-30 00:00:00','ST_CLERK',8921.15,NULL,121,50),(131,'James','Marlow','JAMRLOW','650.124.7234','2005-02-16 00:00:00','ST_CLERK',8921.15,NULL,121,50),(132,'TJ','Olson','TJOLSON','650.124.8234','2007-04-10 00:00:00','ST_CLERK',8921.15,NULL,121,50),(133,'Jason','Mallin','JMALLIN','650.127.1934','2004-06-14 00:00:00','ST_CLERK',8921.15,NULL,122,50),(134,'Michael','Rogers','MROGERS','650.127.1834','2006-08-26 00:00:00','ST_CLERK',8921.15,NULL,122,50),(135,'Ki','Gee','KGEE','650.127.1734','2007-12-12 00:00:00','ST_CLERK',8921.15,NULL,122,50),(136,'Hazel','Philtanker','HPHILTAN','650.127.1634','2008-02-06 00:00:00','ST_CLERK',8921.15,NULL,122,50),(137,'Renske','Ladwig','RLADWIG','650.121.1234','2003-07-14 00:00:00','ST_CLERK',8921.15,NULL,123,50),(138,'Stephen','Stiles','SSTILES','650.121.2034','2005-10-26 00:00:00','ST_CLERK',8921.15,NULL,123,50),(139,'John','Seo','JSEO','650.121.2019','2006-02-12 00:00:00','ST_CLERK',8921.15,NULL,123,50),(140,'Joshua','Patel','JPATEL','650.121.1834','2006-04-06 00:00:00','ST_CLERK',8921.15,NULL,123,50),(141,'Trenna','Rajs','TRAJS','650.121.8009','2003-10-17 00:00:00','ST_CLERK',8921.15,NULL,124,50),(142,'Curtis','Davies','CDAVIES','650.121.2994','2005-01-29 00:00:00','ST_CLERK',8921.15,NULL,124,50),(143,'Randall','Matos','RMATOS','650.121.2874','2006-03-15 00:00:00','ST_CLERK',8921.15,NULL,124,50),(144,'Peter','Vargas','PVARGAS','650.121.2004','2006-07-09 00:00:00','ST_CLERK',8921.15,NULL,124,50),(145,'John','Russell','JRUSSEL','011.44.1344.429268','2004-10-01 00:00:00','SA_MAN',21000.00,0.40,100,80),(146,'Karen','Partners','KPARTNER','011.44.1344.467268','2005-01-05 00:00:00','SA_MAN',20250.00,0.30,100,80),(147,'Alberto','Errazuriz','AERRAZUR','011.44.1344.429278','2005-03-10 00:00:00','SA_MAN',18000.00,0.30,100,80),(148,'Gerald','Cambrault','GCAMBRAU','011.44.1344.619268','2007-10-15 00:00:00','SA_MAN',16500.00,0.30,100,80),(149,'Eleni','Zlotkey','EZLOTKEY','011.44.1344.429018','2008-01-29 00:00:00','SA_MAN',15750.00,0.20,100,80),(150,'Peter','Tucker','PTUCKER','011.44.1344.129268','2005-01-30 00:00:00','SA_REP',10000.00,0.30,145,80),(151,'David','Bernstein','DBERNSTE','011.44.1344.345268','2005-03-24 00:00:00','SA_REP',9500.00,0.25,145,80),(152,'Peter','Hall','PHALL','011.44.1344.478968','2005-08-20 00:00:00','SA_REP',9000.00,0.25,145,80),(153,'Christopher','Olsen','COLSEN','011.44.1344.498718','2006-03-30 00:00:00','SA_REP',8000.00,0.20,145,80),(154,'Nanette','Cambrault','NCAMBRAU','011.44.1344.987668','2006-12-09 00:00:00','SA_REP',7500.00,0.20,145,80),(155,'Oliver','Tuvault','OTUVAULT','011.44.1344.486508','2007-11-23 00:00:00','SA_REP',7000.00,0.15,145,80),(156,'Janette','King','JKING','011.44.1345.429268','2004-01-30 00:00:00','SA_REP',10000.00,0.35,146,80),(157,'Patrick','Sully','PSULLY','011.44.1345.929268','2004-03-04 00:00:00','SA_REP',9500.00,0.35,146,80),(158,'Allan','McEwen','AMCEWEN','011.44.1345.829268','2004-08-01 00:00:00','SA_REP',9000.00,0.35,146,80),(159,'Lindsey','Smith','LSMITH','011.44.1345.729268','2005-03-10 00:00:00','SA_REP',8000.00,0.30,146,80),(160,'Louise','Doran','LDORAN','011.44.1345.629268','2005-12-15 00:00:00','SA_REP',7500.00,0.30,146,80),(161,'Sarath','Sewall','SSEWALL','011.44.1345.529268','2006-11-03 00:00:00','SA_REP',7000.00,0.25,146,80),(162,'Clara','Vishney','CVISHNEY','011.44.1346.129268','2005-11-11 00:00:00','SA_REP',10500.00,0.25,147,80),(163,'Danielle','Greene','DGREENE','011.44.1346.229268','2007-03-19 00:00:00','SA_REP',9500.00,0.15,147,80),(164,'Mattea','Marvins','MMARVINS','011.44.1346.329268','2008-01-24 00:00:00','SA_REP',7200.00,0.10,147,80),(165,'David','Lee','DLEE','011.44.1346.529268','2008-02-23 00:00:00','SA_REP',6800.00,0.10,147,80),(166,'Sundar','Ande','SANDE','011.44.1346.629268','2008-03-24 00:00:00','SA_REP',6400.00,0.10,147,80),(167,'Amit','Banda','ABANDA','011.44.1346.729268','2008-09-01 00:00:00','SA_REP',6200.00,0.10,147,80),(168,'Lisa','Ozer','LOZER','011.44.1343.929268','2005-03-11 00:00:00','SA_REP',11500.00,0.25,148,80),(169,'Harrison','Bloom','HBLOOM','011.44.1343.829268','2006-03-23 00:00:00','SA_REP',10000.00,0.20,148,80),(170,'Tayler','Fox','TFOX','011.44.1343.729268','2006-01-24 00:00:00','SA_REP',9600.00,0.20,148,80),(171,'William','Smith','WSMITH','011.44.1343.629268','2007-02-23 00:00:00','SA_REP',7400.00,0.15,148,80),(172,'Elizabeth','Bates','EBATES','011.44.1343.529268','2007-03-24 00:00:00','SA_REP',7300.00,0.15,148,80),(173,'Sundita','Kumar','SKUMAR','011.44.1343.329268','2008-04-21 00:00:00','SA_REP',6100.00,0.10,148,80),(174,'Ellen','Abel','EABEL','011.44.1644.429267','2004-05-11 00:00:00','SA_REP',11000.00,0.30,149,80),(175,'Alyssa','Hutton','AHUTTON','011.44.1644.429266','2005-03-19 00:00:00','SA_REP',8800.00,0.25,149,80),(176,'Jonathon','Taylor','JTAYLOR','011.44.1644.429265','2006-03-24 00:00:00','SA_REP',8600.00,0.20,149,80),(177,'Jack','Livingston','JLIVINGS','011.44.1644.429264','2006-04-23 00:00:00','SA_REP',8400.00,0.20,149,80),(178,'Kimberely','Grant','KGRANT','011.44.1644.429263','2007-05-24 00:00:00','SA_REP',7000.00,0.15,149,NULL),(179,'Charles','Johnson','CJOHNSON','011.44.1644.429262','2008-01-04 00:00:00','SA_REP',6200.00,0.10,149,80),(180,'Winston','Taylor','WTAYLOR','650.507.9876','2006-01-24 00:00:00','SH_CLERK',8921.15,NULL,120,50),(181,'Jean','Fleaur','JFLEAUR','650.507.9877','2006-02-23 00:00:00','SH_CLERK',8921.15,NULL,120,50),(182,'Martha','Sullivan','MSULLIVA','650.507.9878','2007-06-21 00:00:00','SH_CLERK',8921.15,NULL,120,50),(183,'Girard','Geoni','GGEONI','650.507.9879','2008-02-03 00:00:00','SH_CLERK',8921.15,NULL,120,50),(184,'Nandita','Sarchand','NSARCHAN','650.509.1876','2004-01-27 00:00:00','SH_CLERK',8921.15,NULL,121,50),(185,'Alexis','Bull','ABULL','650.509.2876','2005-02-20 00:00:00','SH_CLERK',8921.15,NULL,121,50),(186,'Julia','Dellinger','JDELLING','650.509.3876','2006-06-24 00:00:00','SH_CLERK',8921.15,NULL,121,50),(187,'Anthony','Cabrio','ACABRIO','650.509.4876','2007-02-07 00:00:00','SH_CLERK',8921.15,NULL,121,50),(188,'Kelly','Chung','KCHUNG','650.505.1876','2005-06-14 00:00:00','SH_CLERK',8921.15,NULL,122,50),(189,'Jennifer','Dilly','JDILLY','650.505.2876','2005-08-13 00:00:00','SH_CLERK',8921.15,NULL,122,50),(190,'Timothy','Gates','TGATES','650.505.3876','2006-07-11 00:00:00','SH_CLERK',8921.15,NULL,122,50),(191,'Randall','Perkins','RPERKINS','650.505.4876','2007-12-19 00:00:00','SH_CLERK',8921.15,NULL,122,50),(192,'Sarah','Bell','SBELL','650.501.1876','2004-02-04 00:00:00','SH_CLERK',8921.15,NULL,123,50),(193,'Britney','Everett','BEVERETT','650.501.2876','2005-03-03 00:00:00','SH_CLERK',8921.15,NULL,123,50),(194,'Samuel','McCain','SMCCAIN','650.501.3876','2006-07-01 00:00:00','SH_CLERK',8921.15,NULL,123,50),(195,'Vance','Jones','VJONES','650.501.4876','2007-03-17 00:00:00','SH_CLERK',8921.15,NULL,123,50),(196,'Alana','Walsh','AWALSH','650.507.9811','2006-04-24 00:00:00','SH_CLERK',8921.15,NULL,124,50),(197,'Kevin','Feeney','KFEENEY','650.507.9822','2006-05-23 00:00:00','SH_CLERK',8921.15,NULL,124,50),(198,'Donald','OConnell','DOCONNEL','650.507.9833','2007-06-21 00:00:00','SH_CLERK',8921.15,NULL,124,50),(199,'Douglas','Grant','DGRANT','650.507.9844','2008-01-13 00:00:00','SH_CLERK',8921.15,NULL,124,50),(200,'Jennifer','Whalen','JWHALEN','515.123.4444','2003-09-17 00:00:00','AD_ASST',4400.00,NULL,101,10),(201,'Michael','Hartstein','MHARTSTE','515.123.5555','2004-02-17 00:00:00','MK_MAN',19500.00,NULL,100,20),(202,'Pat','Fay','PFAY','603.123.6666','2005-08-17 00:00:00','MK_REP',6000.00,NULL,201,20),(203,'Susan','Mavris','SMAVRIS','515.123.7777','2002-06-07 00:00:00','HR_REP',6500.00,NULL,101,40),(204,'Hermann','Baer','HBAER','515.123.8888','2002-06-07 00:00:00','PR_REP',10000.00,NULL,101,70),(205,'Shelley','Higgins','SHIGGINS','515.123.8080','2002-06-07 00:00:00','AC_MGR',18012.00,NULL,101,110),(206,'William','Gietz','WGIETZ','515.123.8181','2002-06-07 00:00:00','AC_ACCOUNT',8300.00,NULL,205,110),(8000,'Clara','Vishney','CVISHNEY','011.44.1346.129268','2005-11-11 00:00:00','SA_REP',10500.00,0.25,147,20);
/*!40000 ALTER TABLE `employees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grade`
--

DROP TABLE IF EXISTS `grade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `grade` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `student_id` bigint(20) DEFAULT NULL,
  `course_id` bigint(20) DEFAULT NULL,
  `score` decimal(5,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grade`
--

LOCK TABLES `grade` WRITE;
/*!40000 ALTER TABLE `grade` DISABLE KEYS */;
INSERT INTO `grade` VALUES (1,7,2,20.00),(2,8,3,34.00),(3,2,4,4.00),(4,7,5,5.00),(5,8,6,56.00),(6,2,7,98.00),(7,7,8,32.00),(8,8,9,76.00),(9,2,10,88.00),(10,7,11,99.00);
/*!40000 ALTER TABLE `grade` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `job_history`
--

DROP TABLE IF EXISTS `job_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `job_history` (
  `EMPLOYEE_ID` decimal(6,0) NOT NULL COMMENT 'A not null column in the complex primary key employee_id+start_date.\nForeign key to employee_id column of the employee table',
  `START_DATE` datetime NOT NULL COMMENT 'A not null column in the complex primary key employee_id+start_date.\nMust be less than the end_date of the job_history table. (enforced by\nconstraint jhist_date_interval)',
  `END_DATE` datetime NOT NULL COMMENT 'Last day of the employee in this job role. A not null column. Must be\ngreater than the start_date of the job_history table.\n(enforced by constraint jhist_date_interval)',
  `JOB_ID` varchar(10) NOT NULL COMMENT 'Job role in which the employee worked in the past; foreign key to\njob_id column in the job table. A not null column.',
  `DEPARTMENT_ID` decimal(4,0) DEFAULT NULL COMMENT 'Department id in which the employee worked in the past; foreign key to deparment_id column in the departments table',
  PRIMARY KEY (`EMPLOYEE_ID`,`START_DATE`) USING BTREE,
  KEY `JHIST_DEPARTMENT_IX` (`DEPARTMENT_ID`) USING BTREE,
  KEY `JHIST_EMPLOYEE_IX` (`EMPLOYEE_ID`) USING BTREE,
  KEY `JHIST_JOB_IX` (`JOB_ID`) USING BTREE,
  CONSTRAINT `JHIST_DEPT_FK` FOREIGN KEY (`DEPARTMENT_ID`) REFERENCES `departments` (`DEPARTMENT_ID`),
  CONSTRAINT `JHIST_EMP_FK` FOREIGN KEY (`EMPLOYEE_ID`) REFERENCES `employees` (`EMPLOYEE_ID`),
  CONSTRAINT `JHIST_JOB_FK` FOREIGN KEY (`JOB_ID`) REFERENCES `job` (`JOB_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='Table that stores job history of the employees. If an employee\nchanges departments within the job or changes job within the department,\nnew rows get inserted into this table with old job information of the\nemployee. Contains a complex primary key: employee_id+start_date.\nContains 25 rows. References with job, employees, and departments tables.';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `job_history`
--

LOCK TABLES `job_history` WRITE;
/*!40000 ALTER TABLE `job_history` DISABLE KEYS */;
INSERT INTO `job_history` VALUES (101,'1997-09-21 00:00:00','2001-10-27 00:00:00','AC_ACCOUNT',110),(101,'2001-10-28 00:00:00','2005-03-15 00:00:00','AC_MGR',110),(102,'2001-01-13 00:00:00','2006-07-24 00:00:00','IT_PROG',60),(114,'2006-03-24 00:00:00','2007-12-31 00:00:00','ST_CLERK',50),(122,'2007-01-01 00:00:00','2007-12-31 00:00:00','ST_CLERK',50),(176,'2006-03-24 00:00:00','2006-12-31 00:00:00','SA_REP',80),(176,'2007-01-01 00:00:00','2007-12-31 00:00:00','SA_MAN',80),(200,'1995-09-17 00:00:00','2001-06-17 00:00:00','AD_ASST',90),(200,'2002-07-01 00:00:00','2006-12-31 00:00:00','AC_ACCOUNT',90),(201,'2004-02-17 00:00:00','2007-12-19 00:00:00','MK_REP',20);
/*!40000 ALTER TABLE `job_history` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `job`
--

DROP TABLE IF EXISTS `job`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `job` (
  `JOB_ID` varchar(10) NOT NULL COMMENT 'Primary key of job table.',
  `JOB_TITLE` varchar(35) NOT NULL COMMENT 'A not null column that shows job title, e.g. AD_VP, FI_ACCOUNTANT',
  `MIN_SALARY` decimal(6,0) DEFAULT NULL COMMENT 'Minimum salary for a job title.',
  `MAX_SALARY` decimal(6,0) DEFAULT NULL COMMENT 'Maximum salary for a job title',
  PRIMARY KEY (`JOB_ID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='job table with job titles and salary ranges. Contains 19 rows.\nReferences with employees and job_history table.';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `job`
--

LOCK TABLES `job` WRITE;
/*!40000 ALTER TABLE `job` DISABLE KEYS */;
INSERT INTO `job` VALUES ('AC_ACCOUNT','Public Accountant',4200,9000),('AC_MGR','Accounting Manager',8200,16000),('AD_ASST','Administration Assistant',3000,6000),('AD_PRES','President',20080,40000),('AD_VP','Administration Vice President',15000,30000),('FI_ACCOUNT','Accountant',4200,9000),('FI_MGR','Finance Manager',8200,16000),('HR_REP','Human Resources Representative',4000,9000),('IT_PROG','Programmer',4000,10000),('MK_MAN','Marketing Manager',9000,15000),('MK_REP','Marketing Representative',4000,9000),('PR_REP','Public Relations Representative',4500,10500),('PU_CLERK','Purchasing Clerk',2500,5500),('PU_MAN','Purchasing Manager',8000,15000),('SA_MAN','Sales Manager',10000,20080),('SA_REP','Sales Representative',6000,12008),('SH_CLERK','Shipping Clerk',2500,5500),('ST_CLERK','Stock Clerk',2008,5000),('ST_MAN','Stock Manager',5500,8500),('TEST_0','TEST_0',10000,10),('TEST_1','TEST_1',10000,10),('TEST_2','TEST_2',10000,10),('TEST_3','TEST_3',10000,10),('TEST_4','TEST_4',10000,10),('TEST_5','TEST_5',10000,10),('TEST_6','TEST_6',10000,10),('TEST_7','TEST_7',10000,10),('TEST_8','TEST_8',10000,10),('TEST_9','TEST_9',10000,10);
/*!40000 ALTER TABLE `job` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `locations`
--

DROP TABLE IF EXISTS `locations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `locations` (
  `LOCATION_ID` decimal(4,0) NOT NULL COMMENT 'Primary key of locations table',
  `STREET_ADDRESS` varchar(40) DEFAULT NULL COMMENT 'Street address of an office, warehouse, or production site of a company.\nContains building number and street name',
  `POSTAL_CODE` varchar(12) DEFAULT NULL COMMENT 'Postal code of the location of an office, warehouse, or production site\nof a company. ',
  `CITY` varchar(30) NOT NULL COMMENT 'A not null column that shows city where an office, warehouse, or\nproduction site of a company is located. ',
  `STATE_PROVINCE` varchar(25) DEFAULT NULL COMMENT 'State or Province where an office, warehouse, or production site of a\ncompany is located.',
  `COUNTRY_ID` char(2) DEFAULT NULL COMMENT 'Country where an office, warehouse, or production site of a company is\nlocated. Foreign key to country_id column of the countries table.',
  PRIMARY KEY (`LOCATION_ID`) USING BTREE,
  KEY `LOC_CITY_IX` (`CITY`) USING BTREE,
  KEY `LOC_COUNTRY_IX` (`COUNTRY_ID`) USING BTREE,
  KEY `LOC_STATE_PROVINCE_IX` (`STATE_PROVINCE`) USING BTREE,
  CONSTRAINT `LOC_C_ID_FK` FOREIGN KEY (`COUNTRY_ID`) REFERENCES `countries` (`COUNTRY_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='Locations table that contains specific address of a specific office,\nwarehouse, and/or production site of a company. Does not store addresses /\nlocations of customers. Contains 23 rows; references with the\ndepartments and countries tables. ';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `locations`
--

LOCK TABLES `locations` WRITE;
/*!40000 ALTER TABLE `locations` DISABLE KEYS */;
INSERT INTO `locations` VALUES (1000,'1297 Via Cola di Rie','00989','Roma',NULL,'IT'),(1100,'93091 Calle della Testa','10934','Venice',NULL,'IT'),(1200,'2017 Shinjuku-ku','1689','Tokyo','Tokyo Prefecture','JP'),(1300,'9450 Kamiya-cho','6823','Hiroshima',NULL,'JP'),(1400,'2014 Jabberwocky Rd','26192','Southlake','Texas','US'),(1500,'2011 Interiors Blvd','99236','South San Francisco','California','US'),(1600,'2007 Zagora St','50090','South Brunswick','New Jersey','US'),(1700,'2004 Charade Rd','98199','Seattle','Washington','US'),(1800,'147 Spadina Ave','M5V 2L7','Toronto','Ontario','CA'),(1900,'6092 Boxwood St','YSW 9T2','Whitehorse','Yukon','CA'),(2000,'40-5-12 Laogianggen','190518','Beijing',NULL,'CN'),(2100,'1298 Vileparle (E)','490231','Bombay','Maharashtra','IN'),(2200,'12-98 Victoria Street','2901','Sydney','New South Wales','AU'),(2300,'198 Clementi North','540198','Singapore',NULL,'SG'),(2400,'8204 Arthur St',NULL,'London',NULL,'UK'),(2500,'Magdalen Centre, The Oxford Science Park','OX9 9ZB','Oxford','Oxford','UK'),(2600,'9702 Chester Road','09629850293','Stretford','Manchester','UK'),(2700,'Schwanthalerstr. 7031','80925','Munich','Bavaria','DE'),(2800,'Rua Frei Caneca 1360 ','01307-002','Sao Paulo','Sao Paulo','BR'),(2900,'20 Rue des Corps-Saints','1730','Geneva','Geneve','CH'),(3000,'Murtenstrasse 921','3095','Bern','BE','CH'),(3100,'Pieter Breughelstraat 837','3029SK','Utrecht','Utrecht','NL'),(3200,'Mariano Escobedo 9991','11932','Mexico City','Distrito Federal,','MX');
/*!40000 ALTER TABLE `locations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `regions`
--

DROP TABLE IF EXISTS `regions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `regions` (
  `REGION_ID` int(65) NOT NULL,
  `REGION_NAME` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`REGION_ID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `regions`
--

LOCK TABLES `regions` WRITE;
/*!40000 ALTER TABLE `regions` DISABLE KEYS */;
INSERT INTO `regions` VALUES (1,'Europe'),(2,'Americas'),(3,'Asia'),(4,'Middle East and Africa');
/*!40000 ALTER TABLE `regions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (2,'test_1'),(3,'test_2'),(4,'test_3'),(5,'test_4'),(6,'test_5'),(7,'test_6'),(8,'test_7'),(9,'test_8'),(10,'test_9');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student_course`
--

DROP TABLE IF EXISTS `student_course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student_course` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `student_id` bigint(20) DEFAULT NULL,
  `course_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_course`
--

LOCK TABLES `student_course` WRITE;
/*!40000 ALTER TABLE `student_course` DISABLE KEYS */;
INSERT INTO `student_course` VALUES (1,7,2),(2,8,3),(3,2,4),(4,7,5),(5,8,6),(6,2,7),(7,7,8),(8,8,9),(9,2,10),(10,7,11);
/*!40000 ALTER TABLE `student_course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacher`
--

DROP TABLE IF EXISTS `teacher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `teacher` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacher`
--

LOCK TABLES `teacher` WRITE;
/*!40000 ALTER TABLE `teacher` DISABLE KEYS */;
INSERT INTO `teacher` VALUES (1,'test_0'),(2,'test_1'),(3,'test_2'),(4,'test_3'),(5,'test_4'),(6,'test_5'),(7,'test_6'),(8,'test_7'),(9,'test_8'),(10,'test_9');
/*!40000 ALTER TABLE `teacher` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Final view structure for view `GET_DAYS`
--

/*!50001 DROP VIEW IF EXISTS `GET_DAYS`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`%` SQL SECURITY DEFINER */
/*!50001 VIEW `GET_DAYS` AS select 1 AS `CUR_MONTH`,31 AS `DAYS` union all select 2 AS `2`,(case when ((((year(curdate()) % 100) = 0) and ((year(curdate()) % 400) = 0)) or ((year(curdate()) % 4) = 0)) then 29 else 28 end) AS `Name_exp_4` union all select 3 AS `3`,31 AS `31` union all select 4 AS `4`,30 AS `30` union all select 5 AS `5`,31 AS `31` union all select 6 AS `6`,30 AS `30` union all select 7 AS `7`,31 AS `31` union all select 8 AS `8`,31 AS `31` union all select 9 AS `9`,30 AS `30` union all select 10 AS `10`,31 AS `31` union all select 11 AS `11`,30 AS `30` union all select 12 AS `12`,31 AS `31` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `emp_v1`
--

/*!50001 DROP VIEW IF EXISTS `emp_v1`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`%` SQL SECURITY DEFINER */
/*!50001 VIEW `emp_v1` AS (select `e`.`EMPLOYEE_ID` AS `EMPLOYEE_ID`,`e`.`FIRST_NAME` AS `FIRST_NAME`,`e`.`LAST_NAME` AS `LAST_NAME`,`e`.`EMAIL` AS `EMAIL`,`e`.`PHONE_NUMBER` AS `PHONE_NUMBER`,`e`.`HIRE_DATE` AS `HIRE_DATE`,`e`.`JOB_ID` AS `JOB_ID`,`e`.`SALARY` AS `SALARY`,`e`.`COMMISSION_PCT` AS `COMMISSION_PCT`,`e`.`MANAGER_ID` AS `MANAGER_ID`,`e`.`DEPARTMENT_ID` AS `DEPARTMENT_ID` from `employees` `e` where (`e`.`DEPARTMENT_ID` = 20)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `emp_v10`
--

/*!50001 DROP VIEW IF EXISTS `emp_v10`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`%` SQL SECURITY DEFINER */
/*!50001 VIEW `emp_v10` AS (select `e`.`EMPLOYEE_ID` AS `EMPLOYEE_ID`,`e`.`FIRST_NAME` AS `FIRST_NAME`,`e`.`LAST_NAME` AS `LAST_NAME`,`e`.`EMAIL` AS `EMAIL`,`e`.`PHONE_NUMBER` AS `PHONE_NUMBER`,`e`.`HIRE_DATE` AS `HIRE_DATE`,`e`.`JOB_ID` AS `JOB_ID`,`e`.`SALARY` AS `SALARY`,`e`.`COMMISSION_PCT` AS `COMMISSION_PCT`,`e`.`MANAGER_ID` AS `MANAGER_ID`,`e`.`DEPARTMENT_ID` AS `DEPARTMENT_ID` from `employees` `e` where (`e`.`DEPARTMENT_ID` = 20)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `emp_v2`
--

/*!50001 DROP VIEW IF EXISTS `emp_v2`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`%` SQL SECURITY DEFINER */
/*!50001 VIEW `emp_v2` AS (select `e`.`DEPARTMENT_ID` AS `DEPARTMENT_ID`,count(0) AS `EMP_CNT`,round(avg(`e`.`SALARY`),2) AS `AVG_SALARY` from `employees` `e` group by `e`.`DEPARTMENT_ID`) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `emp_v3`
--

/*!50001 DROP VIEW IF EXISTS `emp_v3`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`%` SQL SECURITY DEFINER */
/*!50001 VIEW `emp_v3` AS (select `e`.`EMPLOYEE_ID` AS `EMPLOYEE_ID`,`e`.`FIRST_NAME` AS `FIRST_NAME`,`e`.`LAST_NAME` AS `LAST_NAME`,`e`.`EMAIL` AS `EMAIL`,`e`.`PHONE_NUMBER` AS `PHONE_NUMBER`,`e`.`HIRE_DATE` AS `HIRE_DATE`,`e`.`JOB_ID` AS `JOB_ID`,`e`.`SALARY` AS `SALARY`,`e`.`COMMISSION_PCT` AS `COMMISSION_PCT`,`e`.`MANAGER_ID` AS `EMP_MANAGER_ID`,`e`.`DEPARTMENT_ID` AS `DEPARTMENT_ID`,`d`.`DEPARTMENT_NAME` AS `DEPARTMENT_NAME`,`d`.`MANAGER_ID` AS `DEP_MANAGER_ID`,`d`.`LOCATION_ID` AS `LOCATION_ID` from (`employees` `e` left join `departments` `d` on((`e`.`DEPARTMENT_ID` = `d`.`DEPARTMENT_ID`)))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-09-07 11:19:29
