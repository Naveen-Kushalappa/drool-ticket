create DATABASE test;

use test;

CREATE TABLE `patient_details` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `areaId` int(11) NOT NULL,
  `isAssignable` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `patient_details` (`id`, `areaId`, `isAssignable`)
VALUES ('1', '1', '0');