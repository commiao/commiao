/*
SQLyog Ultimate v9.62 
MySQL - 5.6.24-log : Database - commiao
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`commiao` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;

USE `commiao`;

/*Table structure for table `commiao_user_email` */

DROP TABLE IF EXISTS `commiao_user_email`;

CREATE TABLE `commiao_user_email` (
  `EMAIL_ID` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `EMAIL` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '电子邮箱',
  `ACTIVE_CODE` varchar(8) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '激活码',
  `EMAIL_STATUS` int(10) NOT NULL DEFAULT '0' COMMENT '是否已激活（0：否，1：是）',
  `USER_ID` int(10) DEFAULT NULL COMMENT '用户ID',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `CREATE_USER_ID` int(10) DEFAULT NULL COMMENT '创建人ID',
  `CREATE_NICKNAME` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '创建人昵称（用户名）',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '更新时间',
  `UPDATE_USER_ID` int(10) DEFAULT NULL COMMENT '更新人ID',
  `UPDATE_NICKNAME` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '更新人昵称（用户名）',
  `STATUS` int(10) NOT NULL DEFAULT '10000001' COMMENT '否（false，没有）10000000 或者 是（true，有）10000001',
  PRIMARY KEY (`EMAIL_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='用户邮件绑定表';

/*Data for the table `commiao_user_email` */

/*Table structure for table `commiao_user_head_pic` */

DROP TABLE IF EXISTS `commiao_user_head_pic`;

CREATE TABLE `commiao_user_head_pic` (
  `HEAD_PIC_ID` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `TITLE` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '标题',
  `FILE_ID` int(10) DEFAULT NULL COMMENT '文件ID',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `CREATE_USER_ID` int(10) DEFAULT NULL COMMENT '创建人ID',
  `CREATE_NICKNAME` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '创建人昵称（用户名）',
  `STATUS` int(10) NOT NULL DEFAULT '10000001' COMMENT '否（false，没有）10000000 或者 是（true，有）10000001',
  PRIMARY KEY (`HEAD_PIC_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='用户头像表';

/*Data for the table `commiao_user_head_pic` */

/*Table structure for table `commiao_user_id_card` */

DROP TABLE IF EXISTS `commiao_user_id_card`;

CREATE TABLE `commiao_user_id_card` (
  `ID_CARD_ID` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `REAL_NAME` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '真实姓名',
  `CARD_NUMBER` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '身份证号',
  `ID_CARD_STATUS` int(10) NOT NULL DEFAULT '0' COMMENT '是否已实名认证（0：否，1：是）',
  `FILE_ID` int(10) DEFAULT NULL COMMENT '上传身份证照片文件',
  `USER_ID` int(10) DEFAULT NULL COMMENT '用户ID',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `CREATE_USER_ID` int(10) DEFAULT NULL COMMENT '创建人ID',
  `CREATE_NICKNAME` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '创建人昵称（用户名）',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '更新时间',
  `UPDATE_USER_ID` int(10) DEFAULT NULL COMMENT '更新人ID',
  `UPDATE_NICKNAME` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '更新人昵称（用户名）',
  `STATUS` int(10) NOT NULL DEFAULT '10000001' COMMENT '否（false，没有）10000000 或者 是（true，有）10000001',
  PRIMARY KEY (`ID_CARD_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='用户绑定身份证表';

/*Data for the table `commiao_user_id_card` */

/*Table structure for table `commiao_user_main` */

DROP TABLE IF EXISTS `commiao_user_main`;

CREATE TABLE `commiao_user_main` (
  `USER_ID` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `NICKNAME` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '用户名（昵称）',
  `PASSWORD` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT 'MD5加密后的密码',
  `MOBILE_ID` int(10) DEFAULT NULL COMMENT '手机绑定USER_MOBILE表的主键',
  `MOBILE` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '取自绑定手机USER_MOBILE表中的数据',
  `EMAIL_ID` int(10) DEFAULT NULL COMMENT '邮箱绑定USER_MAIL表的主键',
  `EMAIL` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '取自绑定邮箱USER_EMAIL表中的数据',
  `ID_CARD_ID` int(10) DEFAULT NULL COMMENT '身份证绑定USER_ID_CARD表的主键',
  `REAL_NAME` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '真实姓名',
  `CARD_NUMBER` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '身份证号',
  `HEAD_PIC_ID` int(10) DEFAULT NULL COMMENT '用户头像ID',
  `USER_STATUS` int(10) NOT NULL DEFAULT '0' COMMENT '用户状态（0：注册，1：开户，2：充值，3：交易，10：禁用）',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `CREATE_USER_ID` int(10) DEFAULT NULL COMMENT '创建人ID',
  `CREATE_NICKNAME` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '创建人昵称（用户名）',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '更新时间',
  `UPDATE_USER_ID` int(10) DEFAULT NULL COMMENT '更新人ID',
  `UPDATE_NICKNAME` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '更新人昵称（用户名）',
  `STATUS` int(10) NOT NULL DEFAULT '10000001' COMMENT '否（false，没有）10000000 或者 是（true，有）10000001',
  PRIMARY KEY (`USER_ID`),
  KEY `FK_EMAIL_ID` (`EMAIL_ID`),
  KEY `FK_HEAD_PIC_ID` (`HEAD_PIC_ID`),
  KEY `FK_ID_CARD_ID` (`ID_CARD_ID`),
  KEY `FK_MOBILE_ID` (`MOBILE_ID`),
  CONSTRAINT `FK_EMAIL_ID` FOREIGN KEY (`EMAIL_ID`) REFERENCES `commiao_user_email` (`EMAIL_ID`),
  CONSTRAINT `FK_HEAD_PIC_ID` FOREIGN KEY (`HEAD_PIC_ID`) REFERENCES `commiao_user_head_pic` (`HEAD_PIC_ID`),
  CONSTRAINT `FK_ID_CARD_ID` FOREIGN KEY (`ID_CARD_ID`) REFERENCES `commiao_user_id_card` (`ID_CARD_ID`),
  CONSTRAINT `FK_MOBILE_ID` FOREIGN KEY (`MOBILE_ID`) REFERENCES `commiao_user_mobile` (`MOBILE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=10000002 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='用户信息表';

/*Data for the table `commiao_user_main` */

insert  into `commiao_user_main`(`USER_ID`,`NICKNAME`,`PASSWORD`,`MOBILE_ID`,`MOBILE`,`EMAIL_ID`,`EMAIL`,`ID_CARD_ID`,`REAL_NAME`,`CARD_NUMBER`,`HEAD_PIC_ID`,`USER_STATUS`,`CREATE_TIME`,`CREATE_USER_ID`,`CREATE_NICKNAME`,`UPDATE_TIME`,`UPDATE_USER_ID`,`UPDATE_NICKNAME`,`STATUS`) values (1,'趸交费用',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,10000001),(2,'期缴费用',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,10000001),(3,'中转账户',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,10000001),(4,'罚息账户',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,10000001),(5,'滞纳金账户',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,10000001),(6,'第三方费用',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,10000001),(10000000,'admin','123456',NULL,NULL,NULL,NULL,NULL,'管理员',NULL,NULL,20000000,'2016-05-12 21:51:26',10000000,'admin',NULL,NULL,NULL,10000001),(10000001,'jingmiao','e10adc3949ba59abbe56e057f20f883e',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,20000000,NULL,NULL,NULL,NULL,NULL,NULL,10000001);

/*Table structure for table `commiao_user_mobile` */

DROP TABLE IF EXISTS `commiao_user_mobile`;

CREATE TABLE `commiao_user_mobile` (
  `MOBILE_ID` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `MOBILE_PHONE` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '手机号码',
  `ACTIVE_CODE` varchar(8) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '验证码',
  `MOBILE_STATUS` int(10) NOT NULL DEFAULT '0' COMMENT '是否已绑定（0：否，1：是）',
  `USER_ID` int(10) DEFAULT NULL COMMENT '用户ID',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `CREATE_USER_ID` int(10) DEFAULT NULL COMMENT '创建人ID',
  `CREATE_NICKNAME` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '创建人昵称（用户名）',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '更新时间',
  `UPDATE_USER_ID` int(10) DEFAULT NULL COMMENT '更新人ID',
  `UPDATE_NICKNAME` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '更新人昵称（用户名）',
  `STATUS` int(10) NOT NULL DEFAULT '10000001' COMMENT '否（false，没有）10000000 或者 是（true，有）10000001',
  PRIMARY KEY (`MOBILE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='用户手机绑定表';

/*Data for the table `commiao_user_mobile` */

/*Table structure for table `components_file_manager` */

DROP TABLE IF EXISTS `components_file_manager`;

CREATE TABLE `components_file_manager` (
  `ID` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `FILE_REALNAME` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '实际存储名字',
  `FILE_PATH` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '实际存储路径',
  `FILE_TITLE` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '文件标题',
  `STATUS` int(10) DEFAULT '10000001' COMMENT '否（false，没有）10000000 或者 是（true，有）10000001',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `components_file_manager` */

insert  into `components_file_manager`(`ID`,`FILE_REALNAME`,`FILE_PATH`,`FILE_TITLE`,`STATUS`) values (1,'001.jsp','/upoad/001.jsp','update-test',10000001),(2,'JavaForExcel[6].rar','JavaForExcel[6].rar','JavaForExcel.rar',10000001),(3,'JavaForExcel.rar','D:\\java\\workspaces\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\commiao-mgt\\test/JavaForExcel.rar','JavaForExcel.rar',10000001),(4,'fep.log','D:\\java\\workspaces\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\commiao-mgt\\test/fep.log','fep.log',10000001),(5,'20160719153809.rar','D:\\java\\workspaces\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\wtpwebapps\\commiao-mgt\\test/20160719153809.rar','JavaForExcel.rar',10000001),(6,'20160719153837.rar','D:\\java\\workspaces\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\wtpwebapps\\commiao-mgt\\test/20160719153837.rar','JavaForExcel.rar',10000001),(7,'20160719155757.rar','D:\\java\\workspaces\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\wtpwebapps\\commiao-mgt\\test/20160719155757.rar','JavaForExcel.rar',10000001),(8,'20160719161900.rar','D:\\java\\workspaces\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\wtpwebapps\\commiao-mgt\\test/20160719161900.rar','JavaForExcel.rar',10000001),(9,'20160719162804.rar','D:\\java\\workspaces\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\wtpwebapps\\commiao-mgt\\test/20160719162804.rar','JavaForExcel.rar',10000001),(10,'20160719162855.rar','D:\\java\\workspaces\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\wtpwebapps\\commiao-mgt\\test/20160719162855.rar','JavaForExcel.rar',10000001),(11,'20160719162914.rar','D:\\java\\workspaces\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\wtpwebapps\\commiao-mgt\\test/20160719162914.rar','JavaForExcel.rar',10000001),(12,'20160719163057.rar','D:\\java\\workspaces\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\wtpwebapps\\commiao-mgt\\test/20160719163057.rar','JavaForExcel.rar',10000001),(13,'20160719163311.jpg','D:\\java\\workspaces\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\wtpwebapps\\commiao-mgt\\test/20160719163311.jpg','c3cd203bb85c431d078ec8f2d34a6c3e_1016_760.jpg',10000001),(14,'20160719164132.rar','D:\\java\\workspaces\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\wtpwebapps\\commiao-mgt\\test/20160719164132.rar','JavaForExcel.rar',10000001),(15,'20160719164542.rar','D:\\java\\workspaces\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\wtpwebapps\\commiao-mgt\\test/20160719164542.rar','JavaForExcel.rar',10000001),(16,'20160719164917.rar','D:\\java\\workspaces\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\wtpwebapps\\commiao-mgt\\test/20160719164917.rar','JavaForExcel.rar',10000001),(17,'20160719170043.rar','D:\\java\\workspaces\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\wtpwebapps\\commiao-mgt\\test/20160719170043.rar','JavaForExcel.rar',10000001);

/*Table structure for table `components_security_menus` */

DROP TABLE IF EXISTS `components_security_menus`;

CREATE TABLE `components_security_menus` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `TITLE` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '菜单名称',
  `URL` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '菜单地址',
  `CODE` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '菜单编码',
  `ORDERSN` int(11) DEFAULT NULL COMMENT '同父菜单的排序',
  `PARENT_ID` int(11) DEFAULT NULL COMMENT '父菜单ID',
  `MENU_LEVEL` int(11) DEFAULT NULL COMMENT '用来知晓所属菜单树的哪一层',
  `DESCRIPTION` text COLLATE utf8_unicode_ci,
  `STATUS` int(11) DEFAULT NULL,
  `CREATOR` int(11) DEFAULT NULL,
  `CREATE_TIME` datetime DEFAULT NULL,
  `UPDATOR` int(11) DEFAULT NULL,
  `UPDATE_TIME` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `components_security_menus` */

insert  into `components_security_menus`(`ID`,`TITLE`,`URL`,`CODE`,`ORDERSN`,`PARENT_ID`,`MENU_LEVEL`,`DESCRIPTION`,`STATUS`,`CREATOR`,`CREATE_TIME`,`UPDATOR`,`UPDATE_TIME`) values (1,'权限系统','','',NULL,0,NULL,'',1,NULL,NULL,NULL,'2016-05-12 21:57:18'),(2,'菜单管理','components/security/menu/index','',NULL,1,NULL,'',1,NULL,NULL,NULL,NULL),(3,'角色管理','components/security/role/index','',NULL,1,NULL,'',1,NULL,NULL,NULL,NULL),(4,'组织机构','components/security/org/index','',NULL,1,NULL,'',1,NULL,NULL,NULL,'2016-07-07 16:25:41'),(5,'系统用户','components/security/sysuser/index','',NULL,1,NULL,'',1,NULL,NULL,NULL,NULL),(6,'用户系统','','',NULL,0,NULL,'',1,NULL,'2016-05-12 21:57:35',NULL,NULL),(7,'用户管理','commiao/user/index','',NULL,6,NULL,'',1,NULL,'2016-05-12 21:57:55',NULL,NULL),(8,'文件上传','components/file/upload/index','',NULL,9,NULL,'',1,NULL,'2016-07-05 16:23:11',NULL,'2016-07-07 16:27:35'),(9,'文件系统','','',NULL,0,NULL,'',1,NULL,'2016-07-07 16:26:23',NULL,'2016-07-07 16:26:50'),(10,'系统文件','components/file/manager/index','',NULL,9,NULL,'',1,NULL,'2016-07-07 16:27:16',NULL,NULL);

/*Table structure for table `components_security_operation_log` */

DROP TABLE IF EXISTS `components_security_operation_log`;

CREATE TABLE `components_security_operation_log` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `OPERATION_TYPE` int(11) DEFAULT NULL COMMENT '增、删、改、查、登陆等',
  `CONTENT` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL,
  `CREATOR` int(11) DEFAULT NULL,
  `CREATOR_NAME` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `CREATE_TIME` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `components_security_operation_log` */

/*Table structure for table `components_security_org` */

DROP TABLE IF EXISTS `components_security_org`;

CREATE TABLE `components_security_org` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `PARENT_ID` int(11) DEFAULT NULL,
  `ORG_TYPE` int(11) DEFAULT NULL COMMENT '目前来说分为：部门（总部）、分公司、部门（分公司）',
  `NAME` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL,
  `CODE` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ADDRESS` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ORDERSN` int(11) DEFAULT NULL COMMENT '用来排序用',
  `STATUS` int(11) DEFAULT NULL,
  `DESCRIPTION` varchar(1000) COLLATE utf8_unicode_ci DEFAULT NULL,
  `CREATOR` int(11) DEFAULT NULL,
  `CREATE_TIME` datetime DEFAULT NULL,
  `UPDATOR` int(11) DEFAULT NULL,
  `UPDATE_TIME` datetime DEFAULT NULL,
  `WEBSITE_CODE` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '分公司的网站编码或者说是前缀',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `components_security_org` */

/*Table structure for table `components_security_org_rela_role` */

DROP TABLE IF EXISTS `components_security_org_rela_role`;

CREATE TABLE `components_security_org_rela_role` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ROLE_ID` int(11) DEFAULT NULL,
  `ORG_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_Reference_3` (`ROLE_ID`),
  KEY `FK_Reference_7` (`ORG_ID`),
  CONSTRAINT `FK_Reference_3` FOREIGN KEY (`ROLE_ID`) REFERENCES `components_security_roles` (`ID`),
  CONSTRAINT `FK_Reference_7` FOREIGN KEY (`ORG_ID`) REFERENCES `components_security_org` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `components_security_org_rela_role` */

/*Table structure for table `components_security_org_role` */

DROP TABLE IF EXISTS `components_security_org_role`;

CREATE TABLE `components_security_org_role` (
  `ID` int(11) NOT NULL,
  `USER_ID` int(11) DEFAULT NULL,
  `ORG_ID` int(11) DEFAULT NULL,
  `ROLE_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_Reference_12` (`ORG_ID`),
  KEY `FK_Reference_13` (`ROLE_ID`),
  KEY `FK_Reference_8` (`USER_ID`),
  CONSTRAINT `FK_Reference_12` FOREIGN KEY (`ORG_ID`) REFERENCES `components_security_org` (`ID`),
  CONSTRAINT `FK_Reference_13` FOREIGN KEY (`ROLE_ID`) REFERENCES `components_security_roles` (`ID`),
  CONSTRAINT `FK_Reference_8` FOREIGN KEY (`USER_ID`) REFERENCES `components_security_user` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `components_security_org_role` */

/*Table structure for table `components_security_role_rela_menu` */

DROP TABLE IF EXISTS `components_security_role_rela_menu`;

CREATE TABLE `components_security_role_rela_menu` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `ROLE_ID` int(11) DEFAULT NULL COMMENT '菜单ID',
  `MENU_ID` int(11) DEFAULT NULL COMMENT '角色ID',
  PRIMARY KEY (`ID`),
  KEY `FK_Reference_1` (`MENU_ID`),
  KEY `FK_Reference_2` (`ROLE_ID`),
  CONSTRAINT `FK_Reference_1` FOREIGN KEY (`MENU_ID`) REFERENCES `components_security_menus` (`ID`),
  CONSTRAINT `FK_Reference_2` FOREIGN KEY (`ROLE_ID`) REFERENCES `components_security_roles` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `components_security_role_rela_menu` */

/*Table structure for table `components_security_roles` */

DROP TABLE IF EXISTS `components_security_roles`;

CREATE TABLE `components_security_roles` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL,
  `CODE` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ORDERSN` int(11) DEFAULT NULL,
  `STATUS` int(11) DEFAULT NULL,
  `DESCRIPTION` varchar(1000) COLLATE utf8_unicode_ci DEFAULT NULL,
  `CREATOR` int(11) DEFAULT NULL,
  `CREATE_TIME` datetime DEFAULT NULL,
  `UPDATOR` int(11) DEFAULT NULL,
  `UPDATE_TIME` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `components_security_roles` */

/*Table structure for table `components_security_user` */

DROP TABLE IF EXISTS `components_security_user`;

CREATE TABLE `components_security_user` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `LOGIN_NAME` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `REAL_NAME` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `LOGIN_PASSWORD` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `USER_TYPE` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `components_security_user` */

/*Table structure for table `components_security_user_info` */

DROP TABLE IF EXISTS `components_security_user_info`;

CREATE TABLE `components_security_user_info` (
  `ID` int(11) NOT NULL,
  `USER_ID` int(11) DEFAULT NULL,
  `NICK_NAME` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `EMAIL` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `MOBILE` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `TELPHONE` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `SEX` int(11) DEFAULT NULL,
  `BIRTH_DAY` datetime DEFAULT NULL,
  `ID_CARD` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ADDRESS` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `IMG_ID` int(11) DEFAULT NULL,
  `STATUS` int(11) DEFAULT NULL,
  `CREATOR` int(11) DEFAULT NULL,
  `CREATE_TIME` datetime DEFAULT NULL,
  `UPDATOR` int(11) DEFAULT NULL,
  `UPDATE_TIME` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_Reference_11` (`USER_ID`),
  CONSTRAINT `FK_Reference_11` FOREIGN KEY (`USER_ID`) REFERENCES `components_security_user` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `components_security_user_info` */

/*Table structure for table `components_security_user_rela_menu` */

DROP TABLE IF EXISTS `components_security_user_rela_menu`;

CREATE TABLE `components_security_user_rela_menu` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `USER_ID` int(11) DEFAULT NULL,
  `MENU_ID` int(11) DEFAULT NULL,
  `ROLE_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_Reference_10` (`MENU_ID`),
  KEY `FK_Reference_9` (`USER_ID`),
  CONSTRAINT `FK_Reference_10` FOREIGN KEY (`MENU_ID`) REFERENCES `components_security_menus` (`ID`),
  CONSTRAINT `FK_Reference_9` FOREIGN KEY (`USER_ID`) REFERENCES `components_security_user` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `components_security_user_rela_menu` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
