CREATE TABLE `gym` (
  `id` bigint(20) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `membership_type` varchar(50) DEFAULT NULL,
  `member_name` varchar(50) DEFAULT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `starting_date` datetime DEFAULT NULL,
  `membership_price` decimal(10,0) DEFAULT NULL,
  `account_number` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

INSERT INTO `gym`.`gym`
(`id`,
`email`,
`membership_type`,
`member_name`,
`phone`,
`starting_date`,
`membership_price`,
`account_number`)
VALUES
(1,"ramiro@gym.com","Platinium","Ro","124-854-9632","07-29-2019",15,"2525");


INSERT INTO hibernate_sequence (next_val) VALUES (4);