-- Adminer 4.8.1 MySQL 8.0.26 dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

SET NAMES utf8mb4;

INSERT INTO `dividend` (`id`, `receivement_date`, `receivement_value`, `stock_id`) VALUES
(1,	'2020-11-16 00:00:00.000000',	6.80,	1),
(2,	'2020-12-15 00:00:00.000000',	17.00,	1),
(3,	'2021-01-15 00:00:00.000000',	18.00,	1),
(4,	'2021-02-15 00:00:00.000000',	20.40,	1),
(5,	'2021-03-12 00:00:00.000000',	20.40,	1),
(6,	'2021-04-15 01:00:00.000000',	136.00,	1),
(7,	'2021-05-14 01:00:00.000000',	149.60,	1),
(8,	'2021-06-15 01:00:00.000000',	168.00,	1),
(9,	'2021-07-15 01:00:00.000000',	216.00,	1),
(10,	'2021-08-15 01:00:00.000000',	172.00,	1),
(11,	'2021-09-15 01:00:00.000000',	172.00,	1),
(12,	'2020-11-16 00:00:00.000000',	9.10,	2),
(13,	'2020-12-15 00:00:00.000000',	18.85,	2),
(14,	'2021-01-15 00:00:00.000000',	28.13,	2),
(15,	'2021-02-15 00:00:00.000000',	33.50,	2),
(16,	'2021-03-15 00:00:00.000000',	33.50,	2),
(17,	'2021-04-15 01:00:00.000000',	33.50,	2),
(18,	'2021-05-15 01:00:00.000000',	33.50,	2),
(19,	'2021-06-15 01:00:00.000000',	34.50,	2),
(20,	'2021-07-15 01:00:00.000000',	34.50,	2),
(21,	'2021-08-15 01:00:00.000000',	34.50,	2),
(22,	'2021-09-15 01:00:00.000000',	34.50,	2),
(23,	'2020-11-13 00:00:00.000000',	10.44,	3),
(24,	'2020-12-15 00:00:00.000000',	19.14,	3),
(25,	'2021-01-15 00:00:00.000000',	19.80,	3),
(26,	'2021-02-15 00:00:00.000000',	19.14,	3),
(27,	'2021-03-15 00:00:00.000000',	19.14,	3),
(28,	'2021-04-15 01:00:00.000000',	19.14,	3),
(29,	'2021-05-15 01:00:00.000000',	19.80,	3),
(30,	'2021-06-15 01:00:00.000000',	20.13,	3),
(31,	'2021-07-15 01:00:00.000000',	20.13,	3),
(32,	'2021-08-15 01:00:00.000000',	20.46,	3),
(33,	'2021-09-15 01:00:00.000000',	20.46,	3),
(34,	'2020-11-15 00:00:00.000000',	18.00,	4),
(35,	'2020-12-15 00:00:00.000000',	47.25,	4),
(36,	'2021-01-20 00:00:00.000000',	145.00,	4),
(37,	'2021-03-17 00:00:00.000000',	194.25,	4),
(38,	'2021-04-20 01:00:00.000000',	590.85,	4),
(39,	'2021-05-19 01:00:00.000000',	667.15,	4),
(40,	'2021-06-18 01:00:00.000000',	685.00,	4),
(41,	'2021-07-18 01:00:00.000000',	685.00,	4),
(42,	'2021-08-18 01:00:00.000000',	742.00,	4),
(43,	'2021-09-18 01:00:00.000000',	734.00,	4),
(44,	'2020-11-15 00:00:00.000000',	18.00,	5),
(45,	'2020-12-15 00:00:00.000000',	47.25,	5),
(46,	'2021-01-21 00:00:00.000000',	145.00,	5),
(47,	'2021-03-17 00:00:00.000000',	194.25,	5),
(48,	'2021-04-20 01:00:00.000000',	590.85,	5),
(49,	'2021-05-19 01:00:00.000000',	667.00,	5),
(50,	'2021-06-18 01:00:00.000000',	685.00,	5),
(51,	'2021-07-18 01:00:00.000000',	685.00,	5),
(52,	'2021-08-18 01:00:00.000000',	742.00,	5),
(53,	'2021-09-18 01:00:00.000000',	732.00,	5);

INSERT INTO `stock` (`id`, `name`, `tag`) VALUES
(1,	'CSHG RENDA URBANA FII CF (BVMF:HGRU11)',	'HGRU11'),
(2,	'HG REAL ESTATE FDO INV IMOB CF (BVMF:HGRE11)',	'HGRE11'),
(3,	'XP LOG FDO INV IMOB CF (BVMF:XPLG11)',	'XPLG11'),
(4,	'CAPITANIA SECURITIES II FII CF (BVMF:CPTS11)',	'CPTS11'),
(5,	'RBRR11 - FDO INV IMOB - FII RBR RENDIMENTO HIGH GRADE',	'RBRR11');

INSERT INTO `transaction` (`id`, `purchase_date`, `quantity`, `transaction_type_enum`, `unitary_value`, `stock_id`) VALUES
(1,	'2020-10-19 01:00:00.000000',	5,	0,	129.64,	1),
(2,	'2020-10-23 01:00:00.000000',	5,	0,	129.93,	1),
(3,	'2020-11-23 00:00:00.000000',	15,	0,	129.05,	1),
(4,	'2021-01-20 00:00:00.000000',	5,	0,	129.38,	1),
(5,	'2021-03-19 00:00:00.000000',	80,	0,	123.78,	1),
(6,	'2021-03-25 00:00:00.000000',	90,	0,	123.07,	1),
(7,	'2021-04-26 01:00:00.000000',	20,	0,	122.80,	1),
(8,	'2021-05-27 01:00:00.000000',	20,	0,	122.80,	1),
(9,	'2020-10-19 01:00:00.000000',	7,	0,	150.45,	2),
(10,	'2020-10-23 01:00:00.000000',	7,	0,	152.50,	2),
(11,	'2020-11-23 00:00:00.000000',	15,	0,	149.97,	2),
(12,	'2021-01-20 00:00:00.000000',	21,	0,	149.98,	2),
(13,	'2020-10-19 01:00:00.000000',	9,	0,	132.99,	3),
(14,	'2020-10-23 01:00:00.000000',	9,	0,	136.44,	3),
(15,	'2020-11-23 00:00:00.000000',	15,	0,	129.37,	3),
(16,	'2020-10-19 01:00:00.000000',	10,	0,	99.00,	4),
(17,	'2020-10-23 01:00:00.000000',	10,	0,	99.58,	4),
(18,	'2020-11-23 00:00:00.000000',	25,	0,	97.50,	4),
(19,	'2020-12-23 00:00:00.000000',	100,	0,	99.98,	4),
(20,	'2021-01-24 00:00:00.000000',	40,	0,	99.90,	4),
(21,	'2021-03-19 00:00:00.000000',	300,	0,	100.27,	4),
(22,	'2021-03-25 00:00:00.000000',	100,	0,	100.94,	4),
(23,	'2021-04-26 01:00:00.000000',	50,	0,	102.05,	4),
(24,	'2021-05-25 01:00:00.000000',	50,	0,	100.00,	4),
(25,	'2021-07-21 01:00:00.000000',	50,	0,	99.73,	4),
(26,	'2021-09-21 01:00:00.000000',	100,	0,	97.98,	4),
(27,	'2020-10-19 01:00:00.000000',	11,	0,	101.00,	5),
(28,	'2020-10-23 01:00:00.000000',	10,	0,	99.39,	5),
(29,	'2020-11-23 00:00:00.000000',	15,	0,	96.90,	5),
(30,	'2021-01-21 00:00:00.000000',	24,	0,	93.57,	5),
(31,	'2021-03-19 00:00:00.000000',	80,	0,	98.31,	5),
(32,	'2021-03-19 00:00:00.000000',	20,	0,	98.34,	5),
(33,	'2021-03-25 00:00:00.000000',	100,	0,	98.01,	5),
(34,	'2021-04-26 01:00:00.000000',	30,	0,	101.49,	5),
(35,	'2021-05-25 01:00:00.000000',	30,	0,	99.38,	5),
(36,	'2021-07-31 01:00:00.000000',	50,	0,	99.38,	5),
(37,	'2021-09-21 01:00:00.000000',	50,	0,	96.82,	5);

-- 2021-09-23 20:53:28