/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : emp

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2020-03-23 06:06:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `department` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('101', '市场部');
INSERT INTO `department` VALUES ('102', '运营部');
INSERT INTO `department` VALUES ('103', '教学部');
INSERT INTO `department` VALUES ('104', '管理部');
INSERT INTO `department` VALUES ('105', '后勤部');
INSERT INTO `department` VALUES ('106', '公关部');

-- ----------------------------
-- Table structure for emps
-- ----------------------------
DROP TABLE IF EXISTS `emps`;
CREATE TABLE `emps` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `email` varchar(200) NOT NULL,
  `gender` int(10) NOT NULL,
  `department` varchar(50) NOT NULL,
  `birth` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1012 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of emps
-- ----------------------------
INSERT INTO `emps` VALUES ('1005', '小胖', '222@qq.com', '0', '后勤部', '2015-5-20');
INSERT INTO `emps` VALUES ('1010', '123', '122@qq.com', '1', '教学部', '2020-3-19');
INSERT INTO `emps` VALUES ('1011', '哈哈哈', '122@qq.com', '0', '公关部', '2020-1-2');
