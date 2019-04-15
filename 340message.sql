/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : user-crud

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2019-04-09 20:19:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for 340message
-- ----------------------------
DROP TABLE IF EXISTS `340message`;
CREATE TABLE `340message` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `duixiang` varchar(255) DEFAULT NULL,
  `phonenumber` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of 340message
-- ----------------------------
INSERT INTO `340message` VALUES ('1', 'dd', 'ddd', 'ddd', '2');
INSERT INTO `340message` VALUES ('2', '222', '222', '222', '222');
INSERT INTO `340message` VALUES ('3', '333', '333', '444', '555');
INSERT INTO `340message` VALUES ('5', '222', '???', '???', '222');
