# SQL Manager for MySQL 5.5.3.46192
# ---------------------------------------
# Host     : localhost
# Port     : 3306
# Database : high-school


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

SET FOREIGN_KEY_CHECKS=0;

CREATE DATABASE `high-school`
    CHARACTER SET 'utf8'
    COLLATE 'utf8_general_ci';

USE `high-school`;

#
# Structure for the `teacher` table : 
#

CREATE TABLE `teacher` (
  `id` INTEGER(11) NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL,
  `last_name` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL,
  `date_of_birth` DATE DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB
AUTO_INCREMENT=4 ROW_FORMAT=DYNAMIC CHARACTER SET 'utf8' COLLATE 'utf8_general_ci'
;

#
# Structure for the `course` table : 
#

CREATE TABLE `course` (
  `id` INTEGER(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL,
  `hours_by_week` INTEGER(11) DEFAULT NULL,
  `assigned_teacher` INTEGER(11) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  KEY `assignated teacher` (`assigned_teacher`) USING BTREE,
  CONSTRAINT `assignated teacher` FOREIGN KEY (`assigned_teacher`) REFERENCES `teacher` (`id`)
) ENGINE=InnoDB
AUTO_INCREMENT=4 ROW_FORMAT=DYNAMIC CHARACTER SET 'utf8' COLLATE 'utf8_general_ci'
;

#
# Structure for the `schedule time` table : 
#

CREATE TABLE `schedule time` (
  `id` INTEGER(11) NOT NULL AUTO_INCREMENT,
  `start_time` INTEGER(11) DEFAULT NULL,
  `end_time` INTEGER(11) DEFAULT NULL,
  `day` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL,
  `assigned_course` INTEGER(11) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  KEY `assigned course` (`assigned_course`) USING BTREE,
  CONSTRAINT `schedule time_fk1` FOREIGN KEY (`assigned_course`) REFERENCES `course` (`id`)
) ENGINE=InnoDB
AUTO_INCREMENT=4 ROW_FORMAT=DYNAMIC CHARACTER SET 'utf8' COLLATE 'utf8_general_ci'
;

#
# Structure for the `student` table : 
#

CREATE TABLE `student` (
  `id` INTEGER(11) NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL,
  `last_name` VARCHAR(20) COLLATE utf8_general_ci DEFAULT NULL,
  `registration_number` INTEGER(11) DEFAULT NULL,
  `date_of_birth` DATE DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB
AUTO_INCREMENT=11 ROW_FORMAT=DYNAMIC CHARACTER SET 'utf8' COLLATE 'utf8_general_ci'
;

#
# Structure for the `student notes` table : 
#

CREATE TABLE `student notes` (
  `id` INTEGER(11) NOT NULL AUTO_INCREMENT,
  `partial_note_1` INTEGER(11) DEFAULT NULL,
  `partial_note_2` INTEGER(11) DEFAULT NULL,
  `partial_note_3` INTEGER(11) DEFAULT NULL,
  `final_note` INTEGER(11) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB
AUTO_INCREMENT=1 ROW_FORMAT=DYNAMIC CHARACTER SET 'utf8' COLLATE 'utf8_general_ci'
;

#
# Structure for the `student course` table : 
#

CREATE TABLE `student course` (
  `id` INTEGER(11) NOT NULL AUTO_INCREMENT,
  `id_student` INTEGER(11) DEFAULT NULL,
  `id_course` INTEGER(11) DEFAULT NULL,
  `student_notes` INTEGER(11) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  KEY `id_course` (`id_course`) USING BTREE,
  KEY `id_student` (`id_student`) USING BTREE,
  KEY `student_notes` (`student_notes`) USING BTREE,
  CONSTRAINT `student course_fk1` FOREIGN KEY (`id_student`) REFERENCES `student` (`id`),
  CONSTRAINT `student course_fk2` FOREIGN KEY (`id_course`) REFERENCES `course` (`id`),
  CONSTRAINT `student course_fk3` FOREIGN KEY (`student_notes`) REFERENCES `student notes` (`id`)
) ENGINE=InnoDB
AUTO_INCREMENT=31 ROW_FORMAT=DYNAMIC CHARACTER SET 'utf8' COLLATE 'utf8_general_ci'
;

#
# Data for the `teacher` table  (LIMIT 0,500)
#

INSERT INTO `teacher` (`id`, `first_name`, `last_name`, `date_of_birth`) VALUES
  (1,'Jose','Perez','1990-08-05'),
  (2,'Maria','Carmen','1991-06-04'),
  (3,'Miguel','Juarez','1980-08-10');
COMMIT;

#
# Data for the `course` table  (LIMIT 0,500)
#

INSERT INTO `course` (`id`, `name`, `hours_by_week`, `assigned_teacher`) VALUES
  (1,'math',4,1),
  (2,'spanish',2,2),
  (3,'french',3,3);
COMMIT;

#
# Data for the `schedule time` table  (LIMIT 0,500)
#

INSERT INTO `schedule time` (`id`, `start_time`, `end_time`, `day`, `assigned_course`) VALUES
  (1,14,15,'Monday',1),
  (2,14,16,'Friday',2),
  (3,14,16,'Tuesday',3);
COMMIT;

#
# Data for the `student` table  (LIMIT 0,500)
#

INSERT INTO `student` (`id`, `first_name`, `last_name`, `registration_number`, `date_of_birth`) VALUES
  (1,'Agustin','Bozicovich',462450,'1995-01-01'),
  (2,'Albert','Bozico',462451,'1995-01-01'),
  (3,'Eli','Draco',462452,'1995-02-01'),
  (4,'Marisa','Otero',462453,'1995-02-20'),
  (5,'Julia','Stern',462454,'1995-08-20'),
  (6,'Joe','Floyd',462455,'1995-08-25'),
  (7,'Hector','Sigmund',462456,'1996-08-25'),
  (8,'Sasha','Dollie',462457,'1996-09-24'),
  (9,'Eddie','Ford',462458,'1996-06-27'),
  (10,'Maria','Smith',462459,'1996-06-29');
COMMIT;

#
# Data for the `student course` table  (LIMIT 0,500)
#

INSERT INTO `student course` (`id`, `id_student`, `id_course`, `student_notes`) VALUES
  (1,1,1,NULL),
  (2,2,1,NULL),
  (3,3,1,NULL),
  (4,4,1,NULL),
  (5,5,1,NULL),
  (6,6,1,NULL),
  (7,7,1,NULL),
  (8,8,1,NULL),
  (9,9,1,NULL),
  (10,10,1,NULL),
  (11,1,2,NULL),
  (12,2,2,NULL),
  (13,3,2,NULL),
  (14,4,2,NULL),
  (15,5,2,NULL),
  (16,6,2,NULL),
  (17,7,2,NULL),
  (18,8,2,NULL),
  (19,9,2,NULL),
  (20,10,2,NULL),
  (21,1,3,NULL),
  (22,2,3,NULL),
  (23,3,3,NULL),
  (24,4,3,NULL),
  (25,5,3,NULL),
  (26,6,3,NULL),
  (27,7,3,NULL),
  (28,8,3,NULL),
  (29,9,3,NULL),
  (30,10,3,NULL);
COMMIT;



/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;