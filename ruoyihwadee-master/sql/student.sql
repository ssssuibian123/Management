/*
 Navicat Premium Data Transfer

 Source Server         : 阿里云
 Source Server Type    : MySQL
 Source Server Version : 50562
 Source Host           : 39.107.245.110:3306
 Source Schema         : FaceCheck

 Target Server Type    : MySQL
 Target Server Version : 50562
 File Encoding         : 65001

 Date: 22/06/2021 15:22:00
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `id` int(11) NOT NULL,
  `stu_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (0, '2018303086', '2018303086');
INSERT INTO `student` VALUES (1, '2018303086', '???');
INSERT INTO `student` VALUES (2, '2018303086', '符育玮');
INSERT INTO `student` VALUES (3, '122', '符鱼尾');
INSERT INTO `student` VALUES (4, '555', '哟哟哟西');
INSERT INTO `student` VALUES (5, '6789', '晨晨');
INSERT INTO `student` VALUES (6, '2018303072', '胡季傲');
INSERT INTO `student` VALUES (7, '2018303085', '刘佳辉');
INSERT INTO `student` VALUES (8, '2018303089', '???');
INSERT INTO `student` VALUES (9, '2000083', '聚聚');
INSERT INTO `student` VALUES (10, '008', '急急急');
INSERT INTO `student` VALUES (11, '200077', '斤斤计较你呢');
INSERT INTO `student` VALUES (14, '2000', '快快快了');
INSERT INTO `student` VALUES (15, '2018303098', '刘哦哦');
INSERT INTO `student` VALUES (21, '333', '符鱼尾');
INSERT INTO `student` VALUES (22, '2018303089', '张煜辉');
INSERT INTO `student` VALUES (24, '96772', '周源');
INSERT INTO `student` VALUES (26, '2018303085', '钱卓');
INSERT INTO `student` VALUES (27, '444', '快快快');
INSERT INTO `student` VALUES (28, '444', '悠一悠');
INSERT INTO `student` VALUES (30, 'nt', 'nt');
INSERT INTO `student` VALUES (31, '111', '煞笔');
INSERT INTO `student` VALUES (35, '123', '123');
INSERT INTO `student` VALUES (37, '2018303030', '溜溜溜');
INSERT INTO `student` VALUES (41, '333666', '陈杨');
INSERT INTO `student` VALUES (42, '2339', '嘿嘿嘿');
INSERT INTO `student` VALUES (46, '7777', '奄奄一息');
INSERT INTO `student` VALUES (47, '222', '略略略');
INSERT INTO `student` VALUES (51, '888', '煞笔二号');
INSERT INTO `student` VALUES (59, '66600', '爬爬爬');
INSERT INTO `student` VALUES (63, '2018303085', '金恒');
INSERT INTO `student` VALUES (66, '2018303078', '啦啦啦');
INSERT INTO `student` VALUES (70, '208303089', '张煜辉');
INSERT INTO `student` VALUES (85, '2018302685', '许晋嘉');
INSERT INTO `student` VALUES (666, '2018666666', '请假');

SET FOREIGN_KEY_CHECKS = 1;
