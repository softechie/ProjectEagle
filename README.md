##Rest Client JSON Post Request

###header>custom header -->  content_type:application/json
###METHOD:POST


{
"empId":"1003",
"name": "sugyani",
"status": "T",
"tenure": "1",
"phone": "",
"email":"",
"doj":"2015-02-14",
"wl":"",
"hl":"",
"cl":"",
"rmid":"NA",
"roleid":"1",
"vertid":"2",
"acctid":"4"
}



##MYSQL DATABASE QUERIES:

INSERT INTO `database`.`employee` (`EMPID`, `NAME`, `STATUS`, `TENURE`, `ISRELOCATE`) VALUES ('1', 'sugyani', 'F', '2', 'NA');

INSERT INTO `database`.`employee` (`EMPID`, `NAME`, `STATUS`, `TENURE`, `ISRELOCATE`) VALUES ('2', 'sambit', 'T', '5', 'T');


INSERT INTO `database`.`employee`
(`EMPID`,
`NAME`,
`STATUS`,
`TENURE`,
`PHONE`,
`EMAIL`,
`JOINING_DATE`,
`WORKLOC`,
`CURRENTLOC`,
`HOMELOC`,
`ISRELOCATE`,
`ROLEID`,
`VERTICALID`,
`ACCOUNTID`)
VALUES
('1000','patnaik',
'T',
'1','','',
'2015-02-14','','','','NA','1','2','2');


drop table if exists `database`.`employee`;

CREATE TABLE `database`.`employee` (
  `EMPID` INT(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `NAME` VARCHAR(100) DEFAULT NULL,
  `STATUS` enum('T','F') NOT NULL DEFAULT 'F',
  `TENURE` INT(3) DEFAULT NULL,
  `PHONE` CHAR(15) DEFAULT NULL,
   `EMAIL` VARCHAR(52) DEFAULT NULL,
  `JOINING_DATE` DATE DEFAULT NULL,
   `WORKLOC`VARCHAR(52) DEFAULT NULL,
`CURRENTLOC`VARCHAR(52) DEFAULT NULL,
`HOMELOC` VARCHAR(52) DEFAULT NULL,
`ISRELOCATE`enum('T','F' ,'NA') NOT NULL DEFAULT 'NA',
`ROLEID` INT(11) DEFAULT NULL,
`VERTICALID` INT(11) DEFAULT NULL,
`ACCOUNTID` INT(11) DEFAULT NULL,
  PRIMARY KEY (`EMPID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;





