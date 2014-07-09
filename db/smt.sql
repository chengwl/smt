/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50536
Source Host           : localhost:3306
Source Database       : smt

Target Server Type    : MYSQL
Target Server Version : 50536
File Encoding         : 65001

Date: 2014-07-09 11:18:32
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `user_info_t`
-- ----------------------------
DROP TABLE IF EXISTS `user_info_t`;
CREATE TABLE `user_info_t` (
  `username` varchar(255) DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户信息表';

-- ----------------------------
-- Records of user_info_t
-- ----------------------------
INSERT INTO `user_info_t` VALUES ('111', '111', '1');
