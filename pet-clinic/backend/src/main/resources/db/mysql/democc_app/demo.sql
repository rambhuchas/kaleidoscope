-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Aug 16, 2019 at 06:38 AM
-- Server version: 5.7.19
-- PHP Version: 7.1.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `demo`
--

-- --------------------------------------------------------

--
-- Table structure for table `audit_constants`
--

DROP TABLE IF EXISTS `audit_constants`;
CREATE TABLE IF NOT EXISTS `audit_constants` (
  `name` varchar(100) DEFAULT NULL,
  `action` int(3) NOT NULL DEFAULT '0',
  UNIQUE KEY `action` (`action`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `audit_constants`
--

INSERT INTO `audit_constants` (`name`, `action`) VALUES
('INVALID_ACTION_CODE', 0),
('AUDIT_ACTION_SUB_INTIMATION_REQUEST_SUCCESS', 39),
('SUB_QUEUE_INVALID_MSISDN_DELETED', 40),
('SUB_INTIMATION_REQUEST_FAILED', 41),
('SUB_REQUEST_RECEIVED_SUCCESS', 42),
('SUB_GET_BALANCE_FAILED', 43),
('SUB_LOW_BALANCE_FAILED', 44),
('SUB_CHARGING_REQUEST_LOWBALANCE', 45),
('SUB_CHARGING_REQUEST_ERROR', 46),
('SUB_CHARGING_FAILED', 47),
('SUB_CHARGING_REQUEST_SUCCESS', 48),
('SUB_CHARGING_REQUEST_FAILED', 49),
('SUB_CHARGING_CALLBACK_SUCCESS', 51),
('SUB_CHARGING_CALLBACK_LOWBALANCE', 52),
('SUB_CHARGING_CALLBACK_ERROR', 53),
('SUBRETRY_GET_BALANCE_FAILED', 55),
('SUBRETRY_LOW_BALANCE_FAILED', 56),
('SUBRETRY_CHARGING_REQUEST_LOWBALANCE', 57),
('SUBRETRY_CHARGING_REQUEST_ERROR', 58),
('SUBRETRY_CHARGING_FAILED', 59),
('SUBRETRY_CHARGING_REQUEST_SUCCESS', 60),
('SUBRETRY_CHARGING_CALLBACK_SUCCESS', 61),
('SUBRETRY_CHARGING_CALLBACK_LOWBALANCE', 62),
('SUBRETRY_CHARGING_CALLBACK_ERROR', 63),
('UNSUB_REQUEST_RECEIVED_SUCCESS', 64),
('UNSUBSCRIPTION_SUCCEED', 65),
('RENEWAL_GET_BALANCE_FAILED', 66),
('RENEWAL_LOW_BALANCE_FAILED', 67),
('RENEWAL_CHARGING_LOW_BALANCE_FAILED', 68),
('RENEWAL_CHARGING_FAILED', 69),
('RENEWAL_SUCCEED', 70),
('RENEWAL_CHARGING_REQUEST_SUCCESS', 71),
('RENEWAL_CHARGING_REQUEST_LOWBALANCE', 72),
('RENEWAL_CHARGING_REQUEST_ERROR', 73),
('RENEWAL_CHARGING_CALLBACK_SUCCESS', 74),
('RENEWAL_CHARGING_CALLBACK_LOWBALANCE', 75),
('RENEWAL_CHARGING_CALLBACK_ERROR', 76),
('RENEWAL_NON_GPRS_CAPABLE_MSISDN_IGNORED', 77),
('SUB_QUEUE_DM_CONNECTIVITY_FAILED_PROCEESING_RECORD', 78),
('RENEWAL_DM_CONNECTIVITY_FAILED_PROCEESING_RECORD', 79),
('SUBSCRIBED_ALREADY_RESPONSE_SUCCESS', 80),
('UNSUB_NONCUST_RESPONSE_SUCCESS', 81),
('HELP_KEYWORD_RESPONSE_SUCCESS', 82),
('INVALID_KEYWORD_RESPONSE_SUCCESS', 83),
('UNSUB_KEYWORD_RESPONSE_SUCCESS', 84),
('SUB_QUEUE_NON_GPRS_CAPABLE_MSISDN_DELETED', 85),
('FREE_SUBSCRIPTION_SUCCESS', 89),
('UNSUB_INTIMATION_REQUEST_FAILED', 90),
('RENEWALRETRYCHURN_CHURN', 95),
('SUBRETRYCHURN_CHURN', 96),
('SUBRETRY_CHARGING_REQUEST_FAILED', 100),
('UNSUBSCRIPTION_SUCCEED_UPDATED_FAILED', 101),
('RENEWAL_CHARGING_REQUEST_SUCCESS_UPDATED_FAILED', 102),
('SUB_QUEUE_UNSUB_MSISDN_NOT_FOUND', 103),
('RENEWAL_CALLBACK_SUCCESS_BUT_MSISDN_NOT_FOUND', 104),
('SUB_CHARGING_CALLBACK_NON_SUCCESS_UPDATED_FAILED', 105),
('SUBRETRY_CHARGING_CALLBACK_NON_SUCCESS_UPDATED_FAILED', 106),
('SUB_CHARGING_CALLBACK_SUCCESS_UPDATED_FAILED', 107),
('SUBRETRY_CHARGING_CALLBACK_SUCCESS_UPDATED_FAILED', 108),
('SUB_CHARGING_CALLBACK_SUCCESS_BUT_DUPLCIATE_INSERT', 109),
('SUBRETRY_CHARGING_CALLBACK_SUCCESS_BUT_DUPLCIATE_INSERT', 110),
('SUB_SUBRETRY_CHARGING_CALLBACK_SUCCESS_BUT_DUPLCIATE_INSERT', 112),
('SUB_CHARGING_CALLBACK_SUCCESS_BUT_CUST_MISSING', 113),
('SUBRETRY_CHARGING_CALLBACK_SUCCESS_BUT_CUST_MISSING', 114),
('RENEWAL_CHARGING_CALLBACK_SUCCESS_UPDATED_FAILED', 115),
('RENEWAL_CHARGING_REQUEST_FAILED', 116),
('SUB_REQUEST_RECEIVED_FAILED', 117),
('UNSUB_REQUEST_RECEIVED_FAILED', 118),
('SUB_ALREADY_RESPONSE_FAILED', 119),
('UNSUBSCRIPTION_FAILED', 120),
('SUB_QUEUE_INVALID_MSISDN_DELETED_FAILED', 121),
('SUBSCRIBER_ALREADY_EXIST', 122),
('UNSUB_NONCUST_RESPONSE_FAILED', 123),
('HELP_KEYWORD_RESPONSE_FAILED', 124),
('INVALID_KEYWORD_RESPONSE_FAILED', 125),
('UNSUB_KEYWORD_RESPONSE_FAILED', 126),
('SUBRETRY_CHARGING_CALLBACK_SUCCESS_CUST_UPDATED_BUT_REMOVE_QUEUE_FAILED', 127),
('SUB_CHARGING_CALLBACK_SUCCESS_CUST_UPDATED_BUT_REMOVE_QUEUE_FAILED', 128),
('SUBRETRY_CHARGING_CALLBACK_SUCCESS_CUST_UPDATED_FAILED', 129),
('SUB_CHARGING_CALLBACK_SUCCESS_CUST_UPDATED_FAILED', 130),
('UNSUBSCRIPTION_SUCCESS_BUT_REMOVE_QUEUE_FAILED', 131),
('RENEWALRETRYCHURN_SUCCESS_BUT_REMOVE_QUEUE_FAILED', 132),
('SUBRETRYCHURN_SUCCESS_BUT_REMOVE_QUEUE_FAILED', 133),
('CHURN_UNSUB_INTIMATE_API_FAILED', 134),
('INVALID_ACTION_ID_CAME_SO_DELETED', 135),
('INVALID_ACTION_ID_CAME_SO_DELETING_OOPS_FAILED_TO_DELETE', 136),
('CALLBACK_UNKNOWN_PROCESS_ID', 137),
('SUB_CHARGING_UNKNOWN_CUST_CALLBACK_SUCCESS', 138),
('SUBRETRY_CHARGING_UNKNOWN_CUST_CALLBACK_SUCCESS', 139),
('RENEWAL_CHARGING_UNKNOWN_CUST_CALLBACK_SUCCESS', 140),
('SUB_CHARGING_UNKNOWN_CUST_CALLBACK_LOWBALANCE', 141),
('SUBRETRY_CHARGING_UNKNOWN_CUST_CALLBACK_LOWBALANCE', 142),
('RENEWAL_CHARGING_UNKNOWN_CUST_CALLBACK_LOWBALANCE', 143),
('SUB_CHARGING_UNKNOWN_CUST_CALLBACK_ERROR', 144),
('SUBRETRY_CHARGING_UNKNOWN_CUST_CALLBACK_ERROR', 145),
('RENEWAL_CHARGING_UNKNOWN_CUST_CALLBACK_ERROR', 146),
('SUBRETRY_INVALID_MSISDN_AS_TRANS_RESP', 147),
('RENEWAL_INVALID_MSISDN_AS_TRANS_RESP', 148),
('SUB_INVALID_MSISDN_AS_TRANS_RESP', 149),
('PROGRAM_LOGIC_OR_TIMEOUT_EXCEPTION_FOR_SUB', 150),
('PROGRAM_LOGIC_OR_TIMEOUT_EXCEPTION_FOR_SUBRETRY', 151),
('PROGRAM_LOGIC_OR_TIMEOUT_EXCEPTION_FOR_RENEWAL', 152),
('PROGRAM_LOGIC_OR_TIMEOUT_EXCEPTION_FOR_UNSUB', 153);

-- --------------------------------------------------------

--
-- Table structure for table `audit_content_visit`
--

DROP TABLE IF EXISTS `audit_content_visit`;
CREATE TABLE IF NOT EXISTS `audit_content_visit` (
  `msisdn` bigint(15) DEFAULT '0',
  `pack_id` int(2) UNSIGNED NOT NULL DEFAULT '0',
  `catid` int(3) UNSIGNED NOT NULL DEFAULT '0',
  `sub_catid` int(3) UNSIGNED NOT NULL DEFAULT '0',
  `content_id` int(11) DEFAULT '0',
  `user_agent` varchar(250) DEFAULT NULL,
  `user_ip` varchar(20) DEFAULT NULL,
  `cr_dt` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `audit_mo`
--

DROP TABLE IF EXISTS `audit_mo`;
CREATE TABLE IF NOT EXISTS `audit_mo` (
  `id` int(9) UNSIGNED NOT NULL AUTO_INCREMENT,
  `msisdn` bigint(16) UNSIGNED NOT NULL,
  `sc` int(6) DEFAULT NULL,
  `msg` varchar(250) DEFAULT NULL,
  `cr_dt` datetime NOT NULL,
  KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `audit_mo`
--

INSERT INTO `audit_mo` (`id`, `msisdn`, `sc`, `msg`, `cr_dt`) VALUES
(23, 2349099361802, 35333, '1', '2019-07-29 14:46:36'),
(24, 2349099361802, 35333, 'news', '2019-07-29 14:46:55'),
(25, 2349099361802, 35333, '2', '2019-07-29 14:47:56'),
(26, 2349099361802, 35333, '21', '2019-07-29 14:48:09'),
(27, 2349099361802, 35333, '1', '2019-07-29 14:48:15');

-- --------------------------------------------------------

--
-- Table structure for table `audit_sub`
--

DROP TABLE IF EXISTS `audit_sub`;
CREATE TABLE IF NOT EXISTS `audit_sub` (
  `audit_id` int(9) UNSIGNED NOT NULL AUTO_INCREMENT,
  `action` int(4) UNSIGNED NOT NULL,
  `op_dt` datetime DEFAULT NULL,
  `msisdn` bigint(16) DEFAULT NULL,
  `channel_id` int(4) UNSIGNED DEFAULT NULL,
  `pack_id` int(2) UNSIGNED NOT NULL DEFAULT '0',
  `pid` int(3) UNSIGNED NOT NULL DEFAULT '0',
  `catid` int(3) UNSIGNED NOT NULL DEFAULT '0',
  `amt_charged` double(16,2) DEFAULT '0.00',
  `validity` int(3) DEFAULT NULL,
  `end_dt` date DEFAULT NULL,
  `trans_id` varchar(127) DEFAULT NULL,
  `trans_resp` varchar(10) DEFAULT NULL,
  `req_dt` datetime DEFAULT NULL,
  `till_got` double(16,2) NOT NULL DEFAULT '0.00',
  `via_sub` int(3) UNSIGNED NOT NULL DEFAULT '0',
  PRIMARY KEY (`audit_id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `audit_sub`
--

INSERT INTO `audit_sub` (`audit_id`, `action`, `op_dt`, `msisdn`, `channel_id`, `pack_id`, `pid`, `catid`, `amt_charged`, `validity`, `end_dt`, `trans_id`, `trans_resp`, `req_dt`, `till_got`, `via_sub`) VALUES
(15, 42, '2019-07-29 14:46:55', 2349099361802, 2, 2, 1, 0, 0.00, 0, NULL, NULL, NULL, NULL, 0.00, 0),
(16, 42, '2019-08-09 15:48:40', 2348183938561, 1, 1, 1, 0, 50.00, 0, NULL, NULL, NULL, NULL, 0.00, 0),
(17, 42, '2019-08-09 15:49:18', 2348183938561, 1, 1, 1, 0, 50.00, 0, NULL, NULL, NULL, NULL, 0.00, 0),
(18, 42, '2019-08-09 15:50:59', 2348183938561, 1, 1, 1, 0, 50.00, 0, NULL, NULL, NULL, NULL, 0.00, 0);

-- --------------------------------------------------------

--
-- Table structure for table `audit_visit`
--

DROP TABLE IF EXISTS `audit_visit`;
CREATE TABLE IF NOT EXISTS `audit_visit` (
  `msisdn` bigint(15) UNSIGNED NOT NULL DEFAULT '0',
  `pack_id` int(2) UNSIGNED NOT NULL DEFAULT '0',
  `pid` int(2) UNSIGNED NOT NULL DEFAULT '0',
  `catid` int(3) UNSIGNED NOT NULL DEFAULT '0',
  `pp` double(5,2) UNSIGNED NOT NULL DEFAULT '0.00',
  `page` int(1) NOT NULL DEFAULT '0',
  `state` int(1) NOT NULL DEFAULT '0',
  `user_agent` varchar(250) DEFAULT NULL,
  `user_ip` varchar(20) DEFAULT NULL,
  `ref_url` varchar(100) DEFAULT NULL,
  `click_url` varchar(200) DEFAULT NULL,
  `temp` longtext,
  `vs` double(5,2) UNSIGNED NOT NULL DEFAULT '0.00',
  `ad_param` varchar(200) DEFAULT NULL,
  `cr_dt` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `audit_visit`
--

INSERT INTO `audit_visit` (`msisdn`, `pack_id`, `pid`, `catid`, `pp`, `page`, `state`, `user_agent`, `user_ip`, `ref_url`, `click_url`, `temp`, `vs`, `ad_param`, `cr_dt`) VALUES
(2340123456789, 1, 1, 0, 0.00, -1, 0, 'Mozilla/5.0 (Linux; Android 6.0.1; Redmi 3S) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.101 Mobile Safari/537.36', '157.51.112.80', 'android-app://com.google.android.gm', 'http://13.234.113.198/democms/index?pk=1&pid=1&u=s&t=fb&op=demo&catid=0&pg=1&st=1&name=FootBall', 'host~13.234.113.198;;;upgrade-insecure-requests~1;;;user-agent~Mozilla/5.0 (Linux; Android 6.0.1; Redmi 3S) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.101 Mobile Safari/537.36;;;accept~text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;;;referer~android-app://com.google.android.gm;;;accept-encoding~gzip, deflate;;;accept-language~en-GB,en;q=0.9,pl;q=0.8;;;cookie~mSiSdn=2340123456789; JSESSIONID=598FEA86204483556DB60EF3F7B63B4E;;;x-forwarded-for~157.51.112.80;;;connection~close', 0.00, NULL, '2019-08-09 19:54:07'),
(2340123456789, 1, 1, 0, 0.00, -1, 0, 'Mozilla/5.0 (Linux; Android 6.0.1; Redmi 3S) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.101 Mobile Safari/537.36', '157.51.112.80', 'android-app://com.google.android.gm', 'http://13.234.113.198/democms/index?pk=1&pid=1&u=s&t=fb&op=demo&catid=0&pg=1&st=1&name=FootBall', 'host~13.234.113.198;;;upgrade-insecure-requests~1;;;user-agent~Mozilla/5.0 (Linux; Android 6.0.1; Redmi 3S) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.101 Mobile Safari/537.36;;;accept~text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;;;referer~android-app://com.google.android.gm;;;accept-encoding~gzip, deflate;;;accept-language~en-GB,en;q=0.9,pl;q=0.8;;;cookie~mSiSdn=2340123456789;;;x-forwarded-for~157.51.112.80;;;connection~close', 0.00, NULL, '2019-08-10 05:22:39'),
(2340123456789, 1, 1, 0, 0.00, -1, 0, 'Mozilla/5.0 (Linux; Android 6.0.1; Redmi 3S) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.101 Mobile Safari/537.36', '157.51.112.80', 'android-app://com.google.android.gm', 'http://13.234.113.198/democms/index?pk=1&pid=1&u=s&t=fb&op=demo&catid=0&pg=1&st=1&name=FootBall', 'host~13.234.113.198;;;cache-control~max-age=0;;;upgrade-insecure-requests~1;;;user-agent~Mozilla/5.0 (Linux; Android 6.0.1; Redmi 3S) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.101 Mobile Safari/537.36;;;accept~text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;;;referer~android-app://com.google.android.gm;;;accept-encoding~gzip, deflate;;;accept-language~en-GB,en;q=0.9,pl;q=0.8;;;cookie~mSiSdn=2340123456789; JSESSIONID=2EE832AD1C98212BE5120BF31A08AA94;;;x-forwarded-for~157.51.112.80;;;connection~close', 0.00, NULL, '2019-08-10 05:22:42'),
(2340123456789, 1, 1, 0, 0.00, -1, 0, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.142 Safari/537.36', '157.51.112.80', NULL, 'http://13.234.113.198/democms/index?pk=1&pid=1&u=s&t=fb&op=demo&catid=0&pg=1&st=1&name=FootBall', 'host~13.234.113.198;;;upgrade-insecure-requests~1;;;user-agent~Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.142 Safari/537.36;;;accept~text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;;;accept-encoding~gzip, deflate;;;accept-language~en-US,en;q=0.9;;;cookie~mSiSdn=2340123456789; JSESSIONID=95652042D8D41FB6EEEF1C16C3EBB2EE;;;x-forwarded-for~157.51.112.80;;;connection~close', 0.00, NULL, '2019-08-10 05:23:01'),
(0, 1, 1, 0, 0.00, 1, 0, 'Mozilla/5.0 (Linux; Android 6.0.1; Redmi 3S) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.101 Mobile Safari/537.36', '157.51.112.80', 'android-app://com.google.android.gm', 'http://13.234.113.198/democms/index?pk=1&pid=1&u=s&t=fb&op=demo&catid=0&pg=1&st=1&name=FootBall', 'host~13.234.113.198;;;upgrade-insecure-requests~1;;;user-agent~Mozilla/5.0 (Linux; Android 6.0.1; Redmi 3S) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.101 Mobile Safari/537.36;;;accept~text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;;;referer~android-app://com.google.android.gm;;;accept-encoding~gzip, deflate;;;accept-language~en-GB,en;q=0.9,pl;q=0.8;;;x-forwarded-for~157.51.112.80;;;connection~close', 0.00, NULL, '2019-08-10 05:24:28'),
(0, 1, 1, 0, 0.00, 1, 0, 'Mozilla/5.0 (Linux; Android 6.0.1; Redmi 3S) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.101 Mobile Safari/537.36', '157.51.112.80', 'android-app://com.google.android.gm', 'http://13.234.113.198/democms/index?pk=1&pid=1&u=s&t=fb&op=demo&catid=0&pg=1&st=1&name=FootBall', 'host~13.234.113.198;;;upgrade-insecure-requests~1;;;user-agent~Mozilla/5.0 (Linux; Android 6.0.1; Redmi 3S) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.101 Mobile Safari/537.36;;;accept~text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;;;referer~android-app://com.google.android.gm;;;accept-encoding~gzip, deflate;;;accept-language~en-GB,en;q=0.9,pl;q=0.8;;;cookie~JSESSIONID=282329DF3D25BD33174496ABBDAE9E4E;;;x-forwarded-for~157.51.112.80;;;connection~close', 0.00, NULL, '2019-08-10 05:24:59'),
(0, 1, 1, 0, 0.00, 1, 0, 'Mozilla/5.0 (Linux; Android 6.0.1; Redmi 3S) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.101 Mobile Safari/537.36', '157.51.112.80', 'android-app://com.google.android.gm', 'http://13.234.113.198/democms/index?pk=1&pid=1&u=s&t=fb&op=demo&catid=0&pg=1&st=1&name=FootBall', 'host~13.234.113.198;;;upgrade-insecure-requests~1;;;user-agent~Mozilla/5.0 (Linux; Android 6.0.1; Redmi 3S) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.101 Mobile Safari/537.36;;;accept~text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;;;referer~android-app://com.google.android.gm;;;accept-encoding~gzip, deflate;;;accept-language~en-GB,en;q=0.9,pl;q=0.8;;;cookie~JSESSIONID=183699BA92ECF6CF0EA1DABCF1BD3FDE;;;x-forwarded-for~157.51.112.80;;;connection~close', 0.00, NULL, '2019-08-10 05:25:10'),
(2340123456789, 1, 1, 0, 0.00, -1, 0, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.142 Safari/537.36', '157.51.112.80', NULL, 'http://13.234.113.198/democms/index?pk=1&pid=1&u=s&t=fb&op=demo&catid=0&pg=1&st=1&name=FootBall', 'host~13.234.113.198;;;cache-control~max-age=0;;;upgrade-insecure-requests~1;;;user-agent~Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.142 Safari/537.36;;;accept~text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;;;accept-encoding~gzip, deflate;;;accept-language~en-US,en;q=0.9;;;cookie~mSiSdn=2340123456789; JSESSIONID=10C4556F4B57C4B751355C8C1310980F;;;x-forwarded-for~157.51.112.80;;;connection~close', 0.00, NULL, '2019-08-10 05:25:46'),
(0, 1, 1, 0, 0.00, 1, 0, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.142 Safari/537.36', '157.51.112.80', NULL, 'http://13.234.113.198/democms/index?pk=1&pid=1&u=s&t=fb&op=demo&catid=0&pg=1&st=1&name=FootBall', 'host~13.234.113.198;;;cache-control~max-age=0;;;upgrade-insecure-requests~1;;;user-agent~Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.142 Safari/537.36;;;accept~text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;;;accept-encoding~gzip, deflate;;;accept-language~en-US,en;q=0.9;;;x-forwarded-for~157.51.112.80;;;connection~close', 0.00, NULL, '2019-08-10 05:26:45'),
(0, 1, 1, 0, 0.00, 1, 0, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.142 Safari/537.36', '157.51.112.80', NULL, 'http://13.234.113.198/democms/index?pk=1&pid=1&u=s&t=fb&op=demo&catid=0&pg=1&st=1&name=FootBall', 'host~13.234.113.198;;;cache-control~max-age=0;;;upgrade-insecure-requests~1;;;user-agent~Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.142 Safari/537.36;;;accept~text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;;;accept-encoding~gzip, deflate;;;accept-language~en-US,en;q=0.9;;;cookie~JSESSIONID=4A258AA8D5F8349139EEE3C4F7C79CD0;;;x-forwarded-for~157.51.112.80;;;connection~close', 0.00, NULL, '2019-08-10 05:28:35'),
(0, 1, 1, 0, 0.00, 1, 0, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.142 Safari/537.36', '157.51.112.80', NULL, 'http://13.234.113.198/democms/index?pk=1&pid=1&u=s&t=fb&op=demo&catid=0&pg=1&st=1&name=FootBall', 'host~13.234.113.198;;;cache-control~max-age=0;;;upgrade-insecure-requests~1;;;user-agent~Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.142 Safari/537.36;;;accept~text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;;;accept-encoding~gzip, deflate;;;accept-language~en-US,en;q=0.9;;;cookie~JSESSIONID=8A012F20676CD638DF1AED1AEFE696A5;;;x-forwarded-for~157.51.112.80;;;connection~close', 0.00, NULL, '2019-08-10 05:28:37'),
(0, 1, 1, 0, 0.00, 1, 0, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.142 Safari/537.36', '157.51.112.80', NULL, 'http://13.234.113.198/democms/index?pk=1&pid=1&u=s&t=fb&op=demo&catid=0&pg=1&st=1&name=FootBall', 'host~13.234.113.198;;;cache-control~max-age=0;;;upgrade-insecure-requests~1;;;user-agent~Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.142 Safari/537.36;;;accept~text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;;;accept-encoding~gzip, deflate;;;accept-language~en-US,en;q=0.9;;;cookie~JSESSIONID=EF69519ECDAB0D5D4A1108908BA81BA6;;;x-forwarded-for~157.51.112.80;;;connection~close', 0.00, NULL, '2019-08-10 05:28:37'),
(0, 1, 1, 0, 0.00, 1, 0, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.142 Safari/537.36', '157.51.112.80', NULL, 'http://13.234.113.198/democms/index?pk=1&pid=1&u=s&t=fb&op=demo&catid=0&pg=1&st=1&name=FootBall', 'host~13.234.113.198;;;cache-control~max-age=0;;;upgrade-insecure-requests~1;;;user-agent~Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.142 Safari/537.36;;;accept~text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;;;accept-encoding~gzip, deflate;;;accept-language~en-US,en;q=0.9;;;cookie~JSESSIONID=27B348042F10F30B55A71E95D4713B22;;;x-forwarded-for~157.51.112.80;;;connection~close', 0.00, NULL, '2019-08-10 05:28:37');

-- --------------------------------------------------------

--
-- Table structure for table `blacklist`
--

DROP TABLE IF EXISTS `blacklist`;
CREATE TABLE IF NOT EXISTS `blacklist` (
  `msisdn` bigint(16) NOT NULL DEFAULT '0',
  `cr_dt` datetime DEFAULT NULL,
  PRIMARY KEY (`msisdn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `camp_details`
--

DROP TABLE IF EXISTS `camp_details`;
CREATE TABLE IF NOT EXISTS `camp_details` (
  `vs` int(2) NOT NULL,
  `amount` int(9) NOT NULL,
  `currency` varchar(10) NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
CREATE TABLE IF NOT EXISTS `category` (
  `pack_id` int(2) UNSIGNED NOT NULL DEFAULT '0',
  `service_num` int(2) UNSIGNED NOT NULL DEFAULT '0',
  `catid` int(3) UNSIGNED NOT NULL DEFAULT '0',
  `cat_name` varchar(50) DEFAULT NULL,
  `sub_catid` int(3) UNSIGNED NOT NULL DEFAULT '0',
  `sub_cat_name` varchar(50) DEFAULT NULL,
  `cat_img_url` varchar(200) DEFAULT NULL,
  `cat_desc` varchar(500) DEFAULT NULL,
  `type` tinyint(1) UNSIGNED NOT NULL DEFAULT '1',
  `state` int(1) UNSIGNED NOT NULL DEFAULT '0',
  UNIQUE KEY `pid` (`pack_id`,`service_num`,`catid`,`sub_catid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`pack_id`, `service_num`, `catid`, `cat_name`, `sub_catid`, `sub_cat_name`, `cat_img_url`, `cat_desc`, `type`, `state`) VALUES
(1, 1, 0, NULL, 0, NULL, NULL, NULL, 2, 1),
(2, 1, 0, NULL, 0, NULL, NULL, NULL, 2, 1);

-- --------------------------------------------------------

--
-- Table structure for table `channel`
--

DROP TABLE IF EXISTS `channel`;
CREATE TABLE IF NOT EXISTS `channel` (
  `channel_id` int(4) NOT NULL,
  `channel_desc` varchar(64) DEFAULT NULL,
  `mode` varchar(20) NOT NULL,
  PRIMARY KEY (`channel_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `channel`
--

INSERT INTO `channel` (`channel_id`, `channel_desc`, `mode`) VALUES
(0, 'WAP', 'WAP'),
(1, 'WAP', 'WAP'),
(2, 'SMS', 'SMS'),
(3, 'USSD', 'USSD'),
(4, 'CUSTCARE', 'WEB-CC'),
(5, 'OBD', 'OBD'),
(6, 'Backend', 'Backend');

-- --------------------------------------------------------

--
-- Table structure for table `content`
--

DROP TABLE IF EXISTS `content`;
CREATE TABLE IF NOT EXISTS `content` (
  `id` int(9) NOT NULL AUTO_INCREMENT,
  `pack_id` int(2) UNSIGNED NOT NULL DEFAULT '0',
  `catid` int(3) UNSIGNED NOT NULL DEFAULT '0',
  `sub_catid` int(3) UNSIGNED NOT NULL DEFAULT '0',
  `title` varchar(200) DEFAULT NULL,
  `article` longtext,
  `sms_txt` varchar(160) DEFAULT NULL,
  `path` varchar(500) DEFAULT NULL,
  `state` int(1) NOT NULL DEFAULT '1',
  `author` varchar(50) DEFAULT NULL,
  `cr_dt` datetime NOT NULL,
  `app_dt` datetime DEFAULT NULL,
  `sch_dt` datetime DEFAULT NULL,
  `mod_dt` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=32989 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `content`
--

INSERT INTO `content` (`id`, `pack_id`, `catid`, `sub_catid`, `title`, `article`, `sms_txt`, `path`, `state`, `author`, `cr_dt`, `app_dt`, `sch_dt`, `mod_dt`) VALUES
(32980, 1, 0, 0, 'Antoine Griezmann', '<div><br><img src=\"http://13.234.113.198/pic/1_1565371827665.png\" onerror=\"this.src=\'/democms/images/no-img.jpg\'\" class=\"contentImg\" id=\"3_img\"><br><br><br><div>Antoine Griezmann is no doubt one of the most talented young footballers in the world at the moment. The Frenchman has been sensational for Atletico Madrid in La Liga for the past couple of seasons and has earned tons of praise from fans and pundits all around the world.</div><div><br></div><div>Although Griezmann’s performances at the Euro’s couldn\'t take the French all the way, the youngster did give the world a memorable goal celebration in the form a dance.&nbsp;</div><div><br></div><div>Griezmann’s inspiration behind the dance was, in fact, popular R&amp;B star Drake and his music video ‘Hotline Bling’. Dance celebrations are increasingly becoming popular amongst many footballers around the world, dance moves on the football pitch have never been better thanks to the likes of Griezmann</div></div>', 'Antoine Griezmann', 'http://13.234.113.198/pic/0_1565371827606.png,http://13.234.113.198/pic/1_1565371827665.png', 4, 'demousr', '2019-08-09 17:30:27', '2019-08-09 17:30:32', NULL, '2019-08-09 17:30:39'),
(32981, 1, 0, 0, 'Mario Balotelli', '<div><br><img src=\"http://13.234.113.198/pic/1_1565371896117.png\" onerror=\"this.src=\'/democms/images/no-img.jpg\'\" class=\"contentImg\" id=\"5_img\"><br><br></div><div><br></div><div><div>This one can be argued that it is not a celebration since Mario Balotelli never actually celebrates his goals, never with a smile on his face at least. The one that comes to our memory is his “Why Always Me\" t-shirt that he displayed after he scored against Manchester United in the past. Balotelli had written that particular phrase on his shirt to question why the media were focussed only on his behaviour on and off the field.</div><div><br></div><div>That act Balotelli caught the attention of many footballers and football fans all around the world and also became a popular meme material for the internet.</div><div><br></div><div>Another one of Balotelli’s celebrations came when he took off his shirt and stood like a rock without a smile, after scoring against Germany at the 2012 European Championship. When Balotelli was asked about the reason behind his no celebration routine, he simply had this to say. “When I score, I don\'t celebrate because I\'m only doing my job. When a postman delivers letters, does he celebrate?\". We understand Mario</div></div>', 'Mario Balotelli', 'http://13.234.113.198/pic/0_1565371896053.png,http://13.234.113.198/pic/1_1565371896117.png', 4, 'demousr', '2019-08-09 17:31:36', '2019-08-09 17:36:11', NULL, '2019-08-09 17:36:17'),
(32982, 1, 0, 0, 'Gareth Bale', '<br><img src=\"http://13.234.113.198/pic/1_1565371963555.png\" onerror=\"this.src=\'/democms/images/no-img.jpg\'\" class=\"contentImg\" id=\"7_img\"><br><br><div><div>The Welsh winger has been on a roll ever since he joined Real Madrid from White Hart Lane for a mindblowing £85.3 million back in 2013. The 27-year old has been one of the standout performers at the Santiago Bernabeu over the last couple of seasons.&nbsp;</div><div><br></div><div>Whether it be the Champions League, La Liga or the Copa del Rey, Bale has always been motivated to score goals in tournaments.</div><div><br></div><div>Bale’s goal celebration “The Eleven of Hearts” is now officially trademarked by the Welshman. But what people don’t know is that his trademark celebration was actually first used by Alexander Pato, who was actually dedicating the celebration to his sweetheart Sthefany Brito. Many other footballers including Angel Di Maria have previously nabbed the celebration on many occasions</div></div>', 'Gareth Bale', 'http://13.234.113.198/pic/0_1565371963553.png,http://13.234.113.198/pic/1_1565371963555.png', 4, 'demousr', '2019-08-09 17:32:43', '2019-08-09 17:36:12', NULL, '2019-08-09 17:36:21'),
(32983, 1, 0, 0, 'Luis Suarez', '<br><img src=\"http://13.234.113.198/pic/1_1565372014715.png\" onerror=\"this.src=\'/democms/images/no-img.jpg\'\" class=\"contentImg\" id=\"9_img\"><br><br><div><div>There is no denying that at this moment in world football, Luis Suarez is the best striker in the around. Suarez has been involved in many controversies throughout his career right and some deem him to be a ‘villainous ’ character, but the reason for his celebration will probably change people’ s minds about the Uruguayan\'s personality.&nbsp;</div><div><br></div><div>Everytime Suarez scores, he kisses his wrist and three fingers, which is actually a dedication to his wife and three children. The wrist tattoo for his wife and three fingers for his three children.</div></div>', 'Luis Suarez', 'http://13.234.113.198/pic/0_1565372014713.png,http://13.234.113.198/pic/1_1565372014715.png', 4, 'demousr', '2019-08-09 17:33:34', '2019-08-09 17:36:14', NULL, '2019-08-09 17:36:24'),
(32984, 1, 0, 0, 'Fabio Borini', '<br><img src=\"http://13.234.113.198/pic/1_1565372060591.png\" onerror=\"this.src=\'/democms/images/no-img.jpg\'\" class=\"contentImg\" id=\"11_img\"><br><br><div><div>The Italian striker might not have had the kind of career he was hoping for at Liverpool FC, in fact, he went out on loan to Sunderland the one time Liverpool actually looked like they were going to win the Premier League.&nbsp;</div><div><br></div><div>One thing Borini is quite popular for is his goal celebration, where he sticks his hand between his teeth while running towards the corner flag. The reason behind Borini’s celebration you ask? \"In Italy, we say when one person wants something so much it is like he has a knife between his teeth, like a warrior who never gives up,\" he claimed a few years back.</div></div>', 'Fabio Borini', 'http://13.234.113.198/pic/0_1565372060585.png,http://13.234.113.198/pic/1_1565372060591.png', 4, 'demousr', '2019-08-09 17:34:20', '2019-08-09 17:36:26', NULL, '2019-08-09 17:36:38'),
(32985, 1, 0, 0, 'Bafetimbi Gomis', '<br><img src=\"http://13.234.113.198/pic/1_1565372107235.png\" onerror=\"this.src=\'/democms/images/no-img.jpg\'\" class=\"contentImg\" id=\"13_img\"><br><br><div><div>The France international striker who is currently on loan with Ligue 1 club Marseille from Swansea City had many memorable moments during his time with the Welsh club.&nbsp;</div><div><br></div><div>The 30-year-old had scored some memorable goals for the club last season but none more significant than the goal he scored against Manchester United and especially the celebration that followed.</div><div><br></div><div>Gomis performed the Panther celebration” which he actually picked up from Salif Keita during his days at St Etienne. Salif Keita was one of the club’s greatest players and netted 125 goals in 149 appearances for the team and was given the nickname “The Black Panther”. Gomis continued his tradition of dropping to the ground roaring like a panther as a tribute.&nbsp;</div><div><br></div></div>', 'Bafetimbi Gomis', 'http://13.234.113.198/pic/0_1565372107229.png,http://13.234.113.198/pic/1_1565372107235.png', 4, 'demousr', '2019-08-09 17:35:07', '2019-08-09 17:36:27', NULL, '2019-08-09 17:36:35'),
(32986, 1, 0, 0, 'Daniel Sturridge', '<br><img src=\"http://13.234.113.198/pic/1_1565372165287.png\" onerror=\"this.src=\'/democms/images/no-img.jpg\'\" class=\"contentImg\" id=\"15_img\"><br><br><div><div>The man with the groove, Daniel Sturridge has got the moves both with the ball at his feet and without it. The 27-year-old Liverpool striker is one the best, if not the best strikers for England.&nbsp;</div><div><br></div><div>Although he has had a dip in form for Liverpool over the last couple of months, there were times when he was lighting up the Premier League with striker after striker alongside Luis Suarez during the 2013/14 season.</div><div><br></div><div>Sturridge is not one to not show off his dance moves, almost every time he scored he did “The Sturridge” a trademark dance celebration started by him. In an interview with Talksport, the Liverpool striker revealed that he did the dance as a joke between him and his cousins.&nbsp;</div><div><br></div><div>“The Sturridge” is a much safer alternative to taking off his shirt and take a card from the referee, too!</div></div>', 'Daniel Sturridge', 'http://13.234.113.198/pic/0_1565372165284.png,http://13.234.113.198/pic/1_1565372165287.png', 4, 'demousr', '2019-08-09 17:36:05', '2019-08-09 17:36:28', NULL, '2019-08-09 17:36:31'),
(32987, 1, 0, 0, 'Lionel Messi', '<br><img src=\"http://13.234.113.198/pic/1_1565372252684.png\" onerror=\"this.src=\'/democms/images/no-img.jpg\'\" class=\"contentImg\" id=\"17_img\"><br><br><div><div>Arguably the greatest footballer on this planet, Lionel Messi has revolutionised modern football. From breaking existing records and making new ones, Messi never fails to impress whenever he steps onto the football pitch. And the best footballer on the earth also has a little goal celebration of his own.</div><div><br></div><div>Almost every time Messi nets a goal, he points to the sky. Not many know that it is in fact in honour of Messi’s grandmother who passed away before the Argentine became a sensation that he is today. Messi’s grandmother was the one who first put him on a football pitch despite coaches writing him off because of his small stature.&nbsp;</div><div><br></div><div>So if it weren’t for Messi’s grandmother, we might have never seen him play football at this level or break records and create new ones.</div></div>', 'Lionel Messi', 'http://13.234.113.198/pic/0_1565372252682.png,http://13.234.113.198/pic/1_1565372252684.png', 4, 'demousr', '2019-08-09 17:37:32', '2019-08-09 17:38:40', NULL, '2019-08-09 17:38:56'),
(32988, 1, 0, 0, 'Paul Pogba/ Jesse Lingard', '<br><img src=\"http://13.234.113.198/pic/1_1565372314382.png\" onerror=\"this.src=\'/democms/images/no-img.jpg\'\" class=\"contentImg\" id=\"19_img\"><br><br><div><div>The most expensive footballer in the world surely hasn’t been picked up by Manchester United just to perform a few cool dance moves on the pitch, did they? The former Juventus midfielder has not had the kind of impact Manchester United fans have been hoping for, but it is safe to say that it’s just the beginning and there is plenty of time for the Frenchman to prove his worth over the next couple of seasons.</div><div><br></div><div>Pogba and fellow Manchester United played Jesse Lingard are famous for the “Dab” celebration. The dance move was made famous by Cam Newton of the Carolina Panthers in the NFL. There’s no particular reason behind this famous celebration other than the fact that it is all over the internet, and everybody is doing it.</div></div>', 'Paul Pogba/ Jesse Lingard', 'http://13.234.113.198/pic/0_1565372314379.png,http://13.234.113.198/pic/1_1565372314382.png', 4, 'demousr', '2019-08-09 17:38:34', '2019-08-09 17:38:42', NULL, '2019-08-09 17:38:52');

-- --------------------------------------------------------

--
-- Table structure for table `content_deleted`
--

DROP TABLE IF EXISTS `content_deleted`;
CREATE TABLE IF NOT EXISTS `content_deleted` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `pack_id` int(2) UNSIGNED NOT NULL DEFAULT '0',
  `catid` int(3) UNSIGNED NOT NULL DEFAULT '0',
  `sub_catid` int(3) UNSIGNED NOT NULL DEFAULT '0',
  `title` varchar(200) DEFAULT NULL,
  `article` longtext,
  `sms_txt` varchar(120) DEFAULT NULL,
  `path` varchar(500) DEFAULT NULL,
  `state` int(1) NOT NULL DEFAULT '1',
  `author` varchar(50) DEFAULT NULL,
  `cr_dt` datetime NOT NULL,
  `app_dt` datetime DEFAULT NULL,
  `sent_dt` datetime DEFAULT NULL,
  `mod_dt` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=32980 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `content_deleted`
--

INSERT INTO `content_deleted` (`id`, `pack_id`, `catid`, `sub_catid`, `title`, `article`, `sms_txt`, `path`, `state`, `author`, `cr_dt`, `app_dt`, `sent_dt`, `mod_dt`) VALUES
(32965, 1, 0, 0, 'hgj', ',mnlk<div><br><img src=\"http://localhost:8080/cms/1_1561638367687.png\" onerror=\"this.src=\'/gt_cms/images/no-img.jpg\'\" class=\"contentImg\" id=\"1_img\"><br><br></div>', 'mjbk', 'http://localhost:8080/cms/0_1561638367660.png,http://localhost:8080/cms/1_1561638367687.png', 5, 'gtel', '2019-06-27 17:56:07', '2019-06-27 18:03:13', NULL, '2019-06-27 18:19:11'),
(32966, 1, 0, 0, 'test', 'jn<div><br><img src=\"http://localhost:8080/cms/1_1561639935895.png\" onerror=\"this.src=\'/gt_cms/images/no-img.jpg\'\" class=\"contentImg\" id=\"1_img\"><br><br></div>', 'test', 'http://localhost:8080/cms/0_1561639935849.png,http://localhost:8080/cms/1_1561639935895.png', 5, 'gtel', '2019-06-27 18:22:15', '2019-06-27 18:22:38', NULL, '2019-06-27 18:23:00'),
(32967, 1, 0, 0, 'vhjhv', 'nbk/<div><br><img src=\"http://localhost:8080/cms/1_1561640059264.png\" onerror=\"this.src=\'/gt_cms/images/no-img.jpg\'\" class=\"contentImg\" id=\"3_img\"><br><br></div>', 'mhbhj___', 'http://localhost:8080/cms/0_1561640059248.png,http://localhost:8080/cms/1_1561640059264.png', 3, 'gtel', '2019-06-27 18:24:19', '2019-06-27 19:00:25', NULL, '2019-06-27 18:24:27'),
(32968, 1, 0, 0, 'Content 1', 'Heading 1<div><br><img src=\"http://localhost:8080/cms/1_1561898848995.png\" onerror=\"this.src=\'/gt_cms/images/no-img.jpg\'\" class=\"contentImg\" id=\"1_img\"><br><br></div>', 'Content 1', 'http://localhost:8080/cms/0_1561898848954.png,http://localhost:8080/cms/1_1561898848995.png', 4, 'admin', '2019-06-30 18:17:29', '2019-06-30 18:24:07', NULL, '2019-06-30 18:24:32'),
(32969, 1, 0, 0, 'Content 2', 'Heading 2<div><br></div>', 'Content 1', 'http://localhost:8080/cms/0_1561898902515.png', 4, 'admin', '2019-06-30 18:18:22', '2019-06-30 18:24:09', NULL, '2019-06-30 18:24:54'),
(32970, 1, 0, 0, 'Content 3', 'heading 3', 'Content 1', 'http://localhost:8080/cms/0_1561898920673.png', 4, 'admin', '2019-06-30 18:18:40', '2019-06-30 18:24:10', NULL, '2019-06-30 18:25:00'),
(32971, 1, 0, 0, 'Content 4', 'Heading 4<div><br><img src=\"http://localhost:8080/cms/1_1561899002638.png\" onerror=\"this.src=\'/gt_cms/images/no-img.jpg\'\" class=\"contentImg\" id=\"3_img\"><br><br></div>', 'Content 1', 'http://localhost:8080/cms/0_1561899002622.png,http://localhost:8080/cms/1_1561899002638.png', 4, 'admin', '2019-06-30 18:20:02', '2019-06-30 18:24:11', NULL, '2019-06-30 18:25:05'),
(32972, 1, 0, 0, 'Content 5', 'Heading 5<div><br><img src=\"http://localhost:8080/cms/1_1561899199357.png\" onerror=\"this.src=\'/gt_cms/images/no-img.jpg\'\" class=\"contentImg\" id=\"5_img\"><br><br></div>', 'Content 1', 'http://localhost:8080/cms/0_1561899199345.png,http://localhost:8080/cms/1_1561899199357.png', 4, 'admin', '2019-06-30 18:23:19', '2019-06-30 18:24:15', NULL, '2019-06-30 18:25:10'),
(32973, 1, 0, 0, 'Content 6', 'heading 6<div><br><img src=\"http://localhost:8080/cms/1_1561899218990.png\" onerror=\"this.src=\'/gt_cms/images/no-img.jpg\'\" class=\"contentImg\" id=\"7_img\"><br><br></div>', 'Content 1', 'http://localhost:8080/cms/0_1561899218963.png,http://localhost:8080/cms/1_1561899218990.png', 4, 'admin', '2019-06-30 18:23:39', '2019-06-30 18:24:16', NULL, '2019-06-30 18:25:15'),
(32974, 1, 0, 0, 'Content 7', 'Heading 7<div><br><img src=\"http://localhost:8080/cms/1_1561899242633.png\" onerror=\"this.src=\'/gt_cms/images/no-img.jpg\'\" class=\"contentImg\" id=\"9_img\"><br><br></div>', 'Content 1', 'http://localhost:8080/cms/0_1561899242627.png,http://localhost:8080/cms/1_1561899242633.png', 4, 'admin', '2019-06-30 18:24:02', '2019-06-30 18:24:17', NULL, '2019-06-30 18:25:20'),
(32975, 1, 0, 0, 'Test', '<div><br><img src=\"http://localhost:8080/cms/1_1562400521401.png\" onerror=\"this.src=\'/gt_cms/images/no-img.jpg\'\" class=\"contentImg\" id=\"1_img\"><br><br></div>Testing', 'Test', 'http://localhost:8080/cms/0_1562400521347.png,http://localhost:8080/cms/1_1562400521401.png', 1, 'admin', '2019-07-06 13:38:41', NULL, NULL, NULL),
(32976, 1, 0, 0, 'AA', 'sd<div><br><img src=\"http://localhost:8080/cms/1_1562400747778.png\" onerror=\"this.src=\'/gt_cms/images/no-img.jpg\'\" class=\"contentImg\" id=\"3_img\"><br><br></div>', 'AA', 'http://localhost:8080/cms/0_1562400746491.png,http://localhost:8080/cms/1_1562400747778.png', 1, 'admin', '2019-07-06 13:42:28', NULL, NULL, NULL),
(32977, 1, 0, 0, 'jih', '<br><img src=\"http://localhost:8080/cms/1_1562401071324.png\" onerror=\"this.src=\'/gt_cms/images/no-img.jpg\'\" class=\"contentImg\" id=\"5_img\"><br><br>', 'nb ', 'http://localhost:8080/cms/0_1562401070789.png,http://localhost:8080/cms/1_1562401071324.png', 1, 'admin', '2019-07-06 13:47:51', NULL, NULL, NULL),
(32978, 1, 0, 0, 'tjvyjy', 'mjhjk<div><br><img src=\"http://13.234.113.198/pic/1_1565364234212.png\" onerror=\"this.src=\'/democms/images/no-img.jpg\'\" class=\"contentImg\" id=\"1_img\"><br><br></div>', 'mjbjm', 'http://13.234.113.198/pic/0_1565364234134.png,http://13.234.113.198/pic/1_1565364234212.png', 1, 'demousr', '2019-08-09 15:23:54', NULL, NULL, NULL),
(32979, 1, 0, 0, 'fffhgj', 'nhvhj<div><br><img src=\"http://13.234.113.198/pic/1_1565364435727.png\" onerror=\"this.src=\'/democms/images/no-img.jpg\'\" class=\"contentImg\" id=\"3_img\"><br><br></div>', ' nbbvnh', 'http://13.234.113.198/pic/0_1565364435723.png,http://13.234.113.198/pic/1_1565364435727.png', 1, 'demousr', '2019-08-09 15:27:15', NULL, NULL, '2019-08-09 15:27:55');

-- --------------------------------------------------------

--
-- Table structure for table `content_sms_pushed`
--

DROP TABLE IF EXISTS `content_sms_pushed`;
CREATE TABLE IF NOT EXISTS `content_sms_pushed` (
  `id` int(9) UNSIGNED NOT NULL,
  `pack_id` int(2) UNSIGNED NOT NULL DEFAULT '0',
  `catid` int(3) UNSIGNED NOT NULL DEFAULT '0',
  `msg` varchar(300) DEFAULT NULL,
  `state` tinyint(1) NOT NULL DEFAULT '1',
  `sent_cnt` int(9) NOT NULL DEFAULT '0',
  `success_cnt` int(9) NOT NULL DEFAULT '0',
  `failed_cnt` int(9) NOT NULL DEFAULT '0',
  `cr_dt` datetime NOT NULL,
  `sch_dt` datetime DEFAULT NULL,
  `mod_dt` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `content_sms_pushed`
--

INSERT INTO `content_sms_pushed` (`id`, `pack_id`, `catid`, `msg`, `state`, `sent_cnt`, `success_cnt`, `failed_cnt`, `cr_dt`, `sch_dt`, `mod_dt`) VALUES
(32965, 1, 0, 'mjbk', 5, 0, 0, 0, '2019-06-27 17:56:07', NULL, NULL),
(32966, 1, 0, 'test', 5, 0, 0, 0, '2019-06-27 18:22:15', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `cust_details`
--

DROP TABLE IF EXISTS `cust_details`;
CREATE TABLE IF NOT EXISTS `cust_details` (
  `msisdn` bigint(16) UNSIGNED NOT NULL DEFAULT '0',
  `name` varchar(100) NOT NULL,
  `email` varchar(100) DEFAULT NULL,
  `cr_dt` datetime DEFAULT NULL,
  `mod_dt` datetime DEFAULT NULL,
  PRIMARY KEY (`msisdn`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `dnd`
--

DROP TABLE IF EXISTS `dnd`;
CREATE TABLE IF NOT EXISTS `dnd` (
  `msisdn` bigint(16) NOT NULL DEFAULT '0',
  `cr_dt` datetime DEFAULT NULL,
  PRIMARY KEY (`msisdn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `fallback_mapping`
--

DROP TABLE IF EXISTS `fallback_mapping`;
CREATE TABLE IF NOT EXISTS `fallback_mapping` (
  `pack_id` int(2) UNSIGNED NOT NULL DEFAULT '0',
  `pid` int(3) UNSIGNED NOT NULL DEFAULT '0',
  `service_num` int(2) UNSIGNED NOT NULL DEFAULT '0',
  `parent_id` bigint(10) UNSIGNED NOT NULL DEFAULT '0',
  `child_id` bigint(10) UNSIGNED NOT NULL DEFAULT '0',
  `price` double(10,2) UNSIGNED NOT NULL DEFAULT '0.00',
  `validity` int(2) UNSIGNED NOT NULL DEFAULT '0',
  UNIQUE KEY `pack_id` (`pack_id`,`pid`,`parent_id`,`child_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `price_points`
--

DROP TABLE IF EXISTS `price_points`;
CREATE TABLE IF NOT EXISTS `price_points` (
  `ppid` int(6) NOT NULL,
  `service_num` int(2) NOT NULL DEFAULT '0',
  `price_desc` varchar(127) DEFAULT NULL,
  `price` double(10,2) NOT NULL DEFAULT '0.00',
  `price_alias` double(10,2) NOT NULL DEFAULT '0.00',
  `price_currency` varchar(10) DEFAULT NULL,
  `validity` int(4) NOT NULL DEFAULT '0',
  `validity_term` varchar(2) DEFAULT NULL,
  `validity_desc` varchar(10) DEFAULT NULL,
  `temp_price` varchar(20) DEFAULT NULL,
  `state` int(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`ppid`,`service_num`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `price_points`
--

INSERT INTO `price_points` (`ppid`, `service_num`, `price_desc`, `price`, `price_alias`, `price_currency`, `validity`, `validity_term`, `validity_desc`, `temp_price`, `state`) VALUES
(0, 1, NULL, 0.00, 0.00, NULL, 0, NULL, NULL, NULL, 0),
(10, 1, 'Naira per 1 day', 10.00, 0.00, 'N', 1, 'd', 'day', NULL, 1),
(50, 1, 'Naira per 5 days', 50.00, 0.00, 'N', 5, 'd', 'day', NULL, 1);

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
CREATE TABLE IF NOT EXISTS `product` (
  `pack_id` bigint(20) NOT NULL,
  `pid` int(3) NOT NULL,
  `service_id` bigint(10) NOT NULL,
  `service_num` int(2) DEFAULT NULL,
  `service_name` varchar(50) DEFAULT NULL,
  `prod_name` varchar(50) DEFAULT NULL,
  `prod_desc` varchar(100) DEFAULT NULL,
  `ismsg` int(1) DEFAULT '0',
  `msg_link` varchar(100) NOT NULL,
  `tag_name` varchar(100) DEFAULT NULL,
  `tag_service` varchar(100) DEFAULT NULL,
  `max_pp_id` int(10) UNSIGNED DEFAULT NULL,
  `sub_keyword` varchar(20) DEFAULT NULL,
  `unsub_keyword` varchar(20) DEFAULT NULL,
  `alias_subkeyword` varchar(20) NOT NULL DEFAULT '',
  `alias_unsubkeyword` varchar(20) NOT NULL DEFAULT '',
  `sc` varchar(10) DEFAULT NULL,
  `billing_sc` varchar(10) NOT NULL DEFAULT '',
  `state` int(1) DEFAULT '0',
  `temp_prod` varchar(20) DEFAULT NULL,
  `mail_flg` int(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`pid`,`service_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`pack_id`, `pid`, `service_id`, `service_num`, `service_name`, `prod_name`, `prod_desc`, `ismsg`, `msg_link`, `tag_name`, `tag_service`, `max_pp_id`, `sub_keyword`, `unsub_keyword`, `alias_subkeyword`, `alias_unsubkeyword`, `sc`, `billing_sc`, `state`, `temp_prod`, `mail_flg`) VALUES
(1, 1, 1, 1, 'Football', 'Football', 'Football', 0, '', 'Digital Bouqtue', 'Digital Bouqtue', 50, 'FOOTBALL', 'STOP FOOTBALL', '', '', '902', '902', 1, 'FOOTBALL50', 0),
(2, 1, 2, 1, 'News', 'News', 'News', 0, '', 'Digital Bouqtue', 'Digital Bouqtue', 50, 'NEWS', 'STOP NEWS', '', '', '35333', '33333', 1, 'NEWS50', 0);

-- --------------------------------------------------------

--
-- Table structure for table `sms_queue`
--

DROP TABLE IF EXISTS `sms_queue`;
CREATE TABLE IF NOT EXISTS `sms_queue` (
  `sms_id` int(9) UNSIGNED NOT NULL AUTO_INCREMENT,
  `msisdn` bigint(16) UNSIGNED NOT NULL,
  `msg_id` int(2) NOT NULL DEFAULT '0',
  `msg` varchar(800) DEFAULT NULL,
  `msg_type` int(2) UNSIGNED NOT NULL DEFAULT '0',
  `state` int(2) UNSIGNED NOT NULL DEFAULT '1',
  `sch_dt` datetime DEFAULT NULL,
  `cr_dt` datetime DEFAULT NULL,
  `mod_dt` datetime DEFAULT NULL,
  `counter` int(2) NOT NULL DEFAULT '0',
  `priority` int(2) NOT NULL DEFAULT '1',
  `sc` varchar(10) DEFAULT NULL,
  `metadata_id` bigint(20) NOT NULL DEFAULT '0',
  PRIMARY KEY (`sms_id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `sms_queue`
--

INSERT INTO `sms_queue` (`sms_id`, `msisdn`, `msg_id`, `msg`, `msg_type`, `state`, `sch_dt`, `cr_dt`, `mod_dt`, `counter`, `priority`, `sc`, `metadata_id`) VALUES
(18, 2349099361802, 0, 'Hello, you sent invalid keyword, please text HELP to 35333 to know details.', 5, 1, NULL, '2019-07-29 14:46:36', NULL, 0, 3, '35333', 1),
(19, 2349099361802, 0, 'You are about to subscribe to News service. Service costs N50/5days. Text 1 to 35333 for Auto renewal or 2 for one-off purchase to continue.', 11, 1, NULL, '2019-07-29 14:46:55', NULL, 0, 3, '35333', 1),
(20, 2349099361802, 0, 'Hello, you sent invalid keyword, please text HELP to 35333 to know details.', 5, 1, NULL, '2019-07-29 14:48:09', NULL, 0, 3, '35333', 1),
(21, 2349099361802, 0, 'Hello, you sent invalid keyword, please text HELP to 35333 to know details.', 5, 1, NULL, '2019-07-29 14:48:15', NULL, 0, 3, '35333', 1);

-- --------------------------------------------------------

--
-- Table structure for table `sms_queue_nest`
--

DROP TABLE IF EXISTS `sms_queue_nest`;
CREATE TABLE IF NOT EXISTS `sms_queue_nest` (
  `msg_id` int(9) UNSIGNED NOT NULL DEFAULT '0',
  `pack_id` int(2) NOT NULL DEFAULT '0',
  `pid` int(2) NOT NULL DEFAULT '0',
  `msg_type` int(2) NOT NULL DEFAULT '0',
  `tmpint` int(5) NOT NULL DEFAULT '0',
  `tmpstr` varchar(10) DEFAULT NULL,
  `msg` varchar(600) DEFAULT NULL,
  `sc` varchar(10) DEFAULT NULL,
  `metadata_id` bigint(20) NOT NULL DEFAULT '0',
  `metadata` varchar(200) DEFAULT NULL,
  `cr_dt` datetime DEFAULT NULL,
  UNIQUE KEY `msg_id` (`msg_id`,`metadata_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `sms_queue_nest`
--

INSERT INTO `sms_queue_nest` (`msg_id`, `pack_id`, `pid`, `msg_type`, `tmpint`, `tmpstr`, `msg`, `sc`, `metadata_id`, `metadata`, `cr_dt`) VALUES
(0, 0, 0, 0, 0, NULL, NULL, NULL, 0, NULL, NULL),
(0, 0, 0, 0, 0, NULL, NULL, '35333', 1, '', NULL),
(0, 0, 0, 0, 0, NULL, NULL, '35333', 2, '', NULL),
(0, 0, 0, 0, 0, NULL, NULL, '35333', 60, '&pid=64', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `subscriber`
--

DROP TABLE IF EXISTS `subscriber`;
CREATE TABLE IF NOT EXISTS `subscriber` (
  `subs_id` int(9) UNSIGNED NOT NULL AUTO_INCREMENT,
  `msisdn` bigint(16) DEFAULT NULL,
  `channel_id` int(1) UNSIGNED DEFAULT NULL,
  `pack_id` int(2) UNSIGNED NOT NULL DEFAULT '0',
  `pid` int(2) UNSIGNED NOT NULL DEFAULT '0',
  `catid` int(2) UNSIGNED NOT NULL DEFAULT '0',
  `amt_charged` double(16,2) DEFAULT '0.00',
  `amt_charged_credit` double(16,2) DEFAULT '0.00',
  `validity` int(3) DEFAULT '0',
  `end_dt` date DEFAULT NULL,
  `credit_dt` date DEFAULT NULL,
  `subs_type` int(1) DEFAULT '0',
  `state` int(1) NOT NULL DEFAULT '0',
  `till_got` double(16,2) NOT NULL DEFAULT '0.00',
  `trans_id` varchar(50) DEFAULT NULL,
  `trans_resp` varchar(50) DEFAULT NULL,
  `req_dt` datetime DEFAULT NULL,
  `cr_dt` datetime DEFAULT NULL,
  `mod_dt` datetime DEFAULT NULL,
  `via_sub` int(3) UNSIGNED NOT NULL DEFAULT '0',
  `total_credit` int(11) NOT NULL DEFAULT '0',
  `sms_flg` int(1) DEFAULT '1',
  `temp` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`subs_id`),
  UNIQUE KEY `msisdn_service_id_uniquekey` (`msisdn`,`pack_id`),
  KEY `checkSub` (`msisdn`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `subscriber`
--

INSERT INTO `subscriber` (`subs_id`, `msisdn`, `channel_id`, `pack_id`, `pid`, `catid`, `amt_charged`, `amt_charged_credit`, `validity`, `end_dt`, `credit_dt`, `subs_type`, `state`, `till_got`, `trans_id`, `trans_resp`, `req_dt`, `cr_dt`, `mod_dt`, `via_sub`, `total_credit`, `sms_flg`, `temp`) VALUES
(1, 2340123456789, 1, 1, 1, 0, 50.00, 0.00, 7, '2019-12-31', NULL, 0, 0, 50.00, NULL, NULL, '2019-08-09 21:37:02', '2019-08-09 21:37:05', NULL, 0, 0, 1, NULL),
(3, 2340123456789, 1, 2, 1, 0, 50.00, 0.00, 7, '2019-12-31', NULL, 0, 0, 50.00, NULL, NULL, '2019-08-09 21:37:43', '2019-08-09 21:37:47', NULL, 0, 0, 1, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `subscriber_churn`
--

DROP TABLE IF EXISTS `subscriber_churn`;
CREATE TABLE IF NOT EXISTS `subscriber_churn` (
  `subs_id` int(9) UNSIGNED NOT NULL AUTO_INCREMENT,
  `msisdn` bigint(16) UNSIGNED NOT NULL DEFAULT '0',
  `pack_id` int(2) UNSIGNED NOT NULL DEFAULT '0',
  `pid` int(3) UNSIGNED NOT NULL DEFAULT '0',
  `catid` int(3) UNSIGNED NOT NULL DEFAULT '0',
  `churn_type` int(1) NOT NULL DEFAULT '0',
  `sub_channel_id` int(1) UNSIGNED DEFAULT NULL,
  `churn_channel_id` int(1) UNSIGNED DEFAULT NULL,
  `last_validity` int(3) DEFAULT NULL,
  `last_amt_charged` double(16,2) NOT NULL DEFAULT '0.00',
  `end_dt` date DEFAULT NULL,
  `credit_dt` date DEFAULT NULL,
  `subs_type` int(1) DEFAULT '0',
  `till_got` double(16,2) NOT NULL DEFAULT '0.00',
  `trans_id` varchar(50) DEFAULT NULL,
  `trans_resp` varchar(50) DEFAULT NULL,
  `req_dt` datetime DEFAULT NULL,
  `cr_dt` datetime DEFAULT NULL,
  `churn_dt` datetime DEFAULT NULL,
  `via_sub` int(3) NOT NULL DEFAULT '0',
  `total_credit` int(2) NOT NULL DEFAULT '0',
  `sms_flg` int(1) NOT NULL DEFAULT '0',
  `temp` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`subs_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `subscriber_queue`
--

DROP TABLE IF EXISTS `subscriber_queue`;
CREATE TABLE IF NOT EXISTS `subscriber_queue` (
  `subs_id` int(9) UNSIGNED NOT NULL AUTO_INCREMENT,
  `action` int(1) NOT NULL,
  `msisdn` bigint(16) NOT NULL,
  `channel_id` int(4) UNSIGNED DEFAULT NULL,
  `pack_id` int(2) UNSIGNED NOT NULL DEFAULT '0',
  `pid` int(3) UNSIGNED NOT NULL DEFAULT '0',
  `catid` int(3) UNSIGNED NOT NULL DEFAULT '0',
  `subs_type` int(1) NOT NULL DEFAULT '0',
  `state` int(1) NOT NULL DEFAULT '0',
  `price` double(16,2) NOT NULL DEFAULT '0.00',
  `counter` int(2) DEFAULT '0',
  `trans_id` varchar(100) DEFAULT NULL,
  `trans_resp` varchar(100) DEFAULT NULL,
  `cr_dt` datetime NOT NULL,
  `mod_dt` datetime DEFAULT NULL,
  `via_ip` varchar(20) DEFAULT NULL,
  `via_sub` double(5,2) UNSIGNED NOT NULL DEFAULT '0.00',
  `sms_flg` int(1) NOT NULL DEFAULT '1',
  `temp` varchar(100) DEFAULT '',
  PRIMARY KEY (`subs_id`),
  UNIQUE KEY `unique` (`action`,`msisdn`,`pack_id`,`temp`),
  KEY `checkRow` (`subs_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `subscriber_queue`
--

INSERT INTO `subscriber_queue` (`subs_id`, `action`, `msisdn`, `channel_id`, `pack_id`, `pid`, `catid`, `subs_type`, `state`, `price`, `counter`, `trans_id`, `trans_resp`, `cr_dt`, `mod_dt`, `via_ip`, `via_sub`, `sms_flg`, `temp`) VALUES
(1, 1, 0, 1, 1, 1, 0, 0, 1, 50.00, 0, NULL, NULL, '2019-08-10 05:24:54', '2019-08-10 05:28:32', '', 0.00, 1, '');

-- --------------------------------------------------------

--
-- Table structure for table `temp`
--

DROP TABLE IF EXISTS `temp`;
CREATE TABLE IF NOT EXISTS `temp` (
  `msisdn` bigint(16) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `trans_resp_details`
--

DROP TABLE IF EXISTS `trans_resp_details`;
CREATE TABLE IF NOT EXISTS `trans_resp_details` (
  `trans_resp` varchar(100) NOT NULL,
  `name` varchar(500) NOT NULL,
  `desc` varchar(500) DEFAULT NULL,
  UNIQUE KEY `trans_resp` (`trans_resp`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `trans_resp_details`
--

INSERT INTO `trans_resp_details` (`trans_resp`, `name`, `desc`) VALUES
('200', 'The payment was successful', 'The payment was successful'),
('201', 'The payment was not successful', 'The payment was not successful'),
('202', 'The balance of the subscriber is insufficient', 'The balance of the subscriber is insufficient'),
('225', 'The subscriber does not exist', 'The subscriber does not exist'),
('239', 'Blocked By DNC', 'Blocked By DNC');

-- --------------------------------------------------------

--
-- Table structure for table `user_access`
--

DROP TABLE IF EXISTS `user_access`;
CREATE TABLE IF NOT EXISTS `user_access` (
  `username` varchar(50) NOT NULL,
  `passwd` varchar(200) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `cr_dt` datetime NOT NULL,
  `role` int(1) UNSIGNED NOT NULL DEFAULT '0',
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user_access`
--

INSERT INTO `user_access` (`username`, `passwd`, `name`, `cr_dt`, `role`) VALUES
('demousr', '*F60A4F626755BB917836622B136882B1B3860E39', 'demousr', '2019-08-09 19:55:42', 4);

-- --------------------------------------------------------

--
-- Table structure for table `vs_details`
--

DROP TABLE IF EXISTS `vs_details`;
CREATE TABLE IF NOT EXISTS `vs_details` (
  `vs` int(3) NOT NULL DEFAULT '0',
  `pack_id` int(3) NOT NULL DEFAULT '0',
  `pid` int(3) NOT NULL DEFAULT '0',
  `vs_name` varchar(50) NOT NULL,
  `state` tinyint(1) NOT NULL DEFAULT '0',
  UNIQUE KEY `vs` (`vs`,`pack_id`,`pid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
