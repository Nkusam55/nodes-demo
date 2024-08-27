CREATE TABLE `nodes` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `node_id` varchar(255) DEFAULT NULL,
  `node_name` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `memo` varchar(255) DEFAULT NULL,
  `node_type` varchar(255) DEFAULT NULL,
  `parent_node_group_name` varchar(255) DEFAULT NULL,
  `parent_node_group_id` varchar(255) DEFAULT NULL,
  `parent_node_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;