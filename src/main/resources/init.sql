CREATE TABLE `nt_first`.`ft_news`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `title` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '新闻标题',
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '新闻简介',
  `photo_url` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '标题图片',
  `content` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '内容',
  `author` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '作者',
  `visit_count` int(11) NOT NULL DEFAULT 0 COMMENT '访问次数',
  `is_delete` tinyint(3) NOT NULL DEFAULT 0 COMMENT '是否删除',
  `create_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;


CREATE TABLE `nt_first`.`ft_product`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `product_type` tinyint(3) NOT NULL COMMENT '1:发动机油; 2:刹车油; 3:变速箱油;',
  `product_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '产品名称',
  `product_photo` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '产品图片url',
  `product_capacity` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '产品容量',
  `product_authentication` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '产品认证',
  `product_description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `product_features` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `product_iso` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `create_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0),
  `udpate_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;




INSERT INTO `nt_first`.`ft_news`(`id`, `title`, `description`, `photo_url`, `content`, `author`, `visit_count`, `is_delete`, `create_time`, `update_time`) VALUES (1, '菲斯拓&晟汇养车', '菲斯拓润滑油联合清远晟汇养车推出选用菲斯拓机油定期保养享10年/20万公里发动机保修活动。', 'http://www.fixtop.cn/static/photo/news.png', 'http://www.fixtop.cn/static/html/news.html', 'FIXTOP', 5, 0, '2020-11-24 17:12:07', '2020-11-24 17:31:39');
INSERT INTO `nt_first`.`ft_news`(`id`, `title`, `description`, `photo_url`, `content`, `author`, `visit_count`, `is_delete`, `create_time`, `update_time`) VALUES (2, '菲斯拓&晟汇养车', '菲斯拓润滑油联合清远晟汇养车推出选用菲斯拓机油定期保养享10年/20万公里发动机保修活动。', 'http://www.fixtop.cn/static/photo/news.png', 'http://www.fixtop.cn/static/html/news.html', 'FIXTOP', 0, 0, '2020-11-24 17:12:16', '2020-11-24 17:31:47');
INSERT INTO `nt_first`.`ft_news`(`id`, `title`, `description`, `photo_url`, `content`, `author`, `visit_count`, `is_delete`, `create_time`, `update_time`) VALUES (3, '菲斯拓&晟汇养车', '菲斯拓润滑油联合清远晟汇养车推出选用菲斯拓机油定期保养享10年/20万公里发动机保修活动。', 'http://www.fixtop.cn/static/photo/news.png', 'http://www.fixtop.cn/static/html/news.html', 'FIXTOP', 0, 1, '2020-11-24 17:12:24', '2020-11-24 17:32:07');
INSERT INTO `nt_first`.`ft_news`(`id`, `title`, `description`, `photo_url`, `content`, `author`, `visit_count`, `is_delete`, `create_time`, `update_time`) VALUES (4, '菲斯拓&晟汇养车', '菲斯拓润滑油联合清远晟汇养车推出选用菲斯拓机油定期保养享10年/20万公里发动机保修活动。', 'http://www.fixtop.cn/static/photo/news.png', 'http://www.fixtop.cn/static/html/news.html', 'FIXTOP', 0, 1, '2020-11-24 17:12:24', '2020-11-24 17:32:07');
INSERT INTO `nt_first`.`ft_news`(`id`, `title`, `description`, `photo_url`, `content`, `author`, `visit_count`, `is_delete`, `create_time`, `update_time`) VALUES (5, '菲斯拓&晟汇养车', '菲斯拓润滑油联合清远晟汇养车推出选用菲斯拓机油定期保养享10年/20万公里发动机保修活动。', 'http://www.fixtop.cn/static/photo/news.png', 'http://www.fixtop.cn/static/html/news.html', 'FIXTOP', 0, 1, '2020-11-24 17:12:24', '2020-11-24 17:32:07');
INSERT INTO `nt_first`.`ft_news`(`id`, `title`, `description`, `photo_url`, `content`, `author`, `visit_count`, `is_delete`, `create_time`, `update_time`) VALUES (6, '菲斯拓&晟汇养车', '菲斯拓润滑油联合清远晟汇养车推出选用菲斯拓机油定期保养享10年/20万公里发动机保修活动。', 'http://www.fixtop.cn/static/photo/news.png', 'http://www.fixtop.cn/static/html/news.html', 'FIXTOP', 0, 1, '2020-11-24 17:12:24', '2020-11-24 17:32:07');
INSERT INTO `nt_first`.`ft_news`(`id`, `title`, `description`, `photo_url`, `content`, `author`, `visit_count`, `is_delete`, `create_time`, `update_time`) VALUES (7, '菲斯拓&晟汇养车', '菲斯拓润滑油联合清远晟汇养车推出选用菲斯拓机油定期保养享10年/20万公里发动机保修活动。', 'http://www.fixtop.cn/static/photo/news.png', 'http://www.fixtop.cn/static/html/news.html', 'FIXTOP', 0, 1, '2020-11-24 17:12:24', '2020-11-24 17:32:07');
