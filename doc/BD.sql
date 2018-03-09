-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         5.7.14-log - MySQL Community Server (GPL)
-- SO del servidor:              Win64
-- HeidiSQL Versión:             9.4.0.5174
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para beefstore
CREATE DATABASE IF NOT EXISTS `comica` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `comica`;

-- Volcando estructura para tabla beefstore.accountsreceivable
CREATE TABLE IF NOT EXISTS `accountsreceivable` (
  `AccountID` int(11) NOT NULL AUTO_INCREMENT,
  `CustomerID` int(11) DEFAULT NULL,
  `BalanceDue` float DEFAULT NULL,
  `PreviousPayments` float DEFAULT NULL,
  `Payments` float DEFAULT NULL,
  PRIMARY KEY (`AccountID`),
  UNIQUE KEY `AccountID_UNIQUE` (`AccountID`),
  UNIQUE KEY `CustomerID_UNIQUE` (`CustomerID`),
  KEY `CustomerFK_idx` (`CustomerID`),
  CONSTRAINT `CustomerFK` FOREIGN KEY (`CustomerID`) REFERENCES `customer` (`CustomerID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla beefstore.categories
CREATE TABLE IF NOT EXISTS `categories` (
  `CategoryID` int(11) NOT NULL AUTO_INCREMENT,
  `CategoryName` varchar(50) NOT NULL,
  `Description` varchar(100) DEFAULT NULL,
  `Image` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`CategoryID`),
  UNIQUE KEY `CategoryID_UNIQUE` (`CategoryID`),
  UNIQUE KEY `CategoryName_UNIQUE` (`CategoryName`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla beefstore.customer
CREATE TABLE IF NOT EXISTS `customer` (
  `CustomerID` int(11) NOT NULL AUTO_INCREMENT,
  `RFC` varchar(50) DEFAULT NULL,
  `FirstName` varchar(50) DEFAULT NULL,
  `LastName` varchar(50) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `Phone` varchar(50) DEFAULT NULL,
  `Cellphone` varchar(50) DEFAULT NULL,
  `Due` float DEFAULT NULL,
  PRIMARY KEY (`CustomerID`),
  UNIQUE KEY `CustomerID_UNIQUE` (`CustomerID`),
  UNIQUE KEY `CustomerRFC_UNIQUE` (`RFC`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla beefstore.products
CREATE TABLE IF NOT EXISTS `products` (
  `ProductID` bigint(20) NOT NULL AUTO_INCREMENT,
  `ProductName` varchar(50) DEFAULT NULL,
  `Description` varchar(200) DEFAULT NULL,
  `SuggestedPrice` float DEFAULT NULL,
  `BuyPrice` float DEFAULT NULL,
  `UnitsInStock` float DEFAULT NULL,
  `UnitsInOrder` float DEFAULT NULL,
  `SKU` varchar(50) DEFAULT NULL,
  `Scale` varchar(50) DEFAULT NULL,
  `CategoryID` int(11) DEFAULT NULL,
  `SupplierID` int(11) DEFAULT NULL,
  `Image` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ProductID`),
  UNIQUE KEY `ProductID_UNIQUE` (`ProductID`),
  UNIQUE KEY `ProductName_UNIQUE` (`ProductName`),
  KEY `CategoryFK_idx` (`CategoryID`),
  KEY `SupplierFK_idx` (`SupplierID`),
  CONSTRAINT `CategoryFK` FOREIGN KEY (`CategoryID`) REFERENCES `categories` (`CategoryID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `SupplierFK` FOREIGN KEY (`SupplierID`) REFERENCES `supplier` (`SupplierID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=96 DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla beefstore.sales
CREATE TABLE IF NOT EXISTS `sales` (
  `SaleID` int(11) NOT NULL AUTO_INCREMENT,
  `CustomerID` int(11) NOT NULL,
  `SaleDate` datetime NOT NULL,
  PRIMARY KEY (`SaleID`),
  UNIQUE KEY `SaleID_UNIQUE` (`SaleID`),
  KEY `CustomerID_FK` (`CustomerID`),
  CONSTRAINT `CustomerID_FK` FOREIGN KEY (`CustomerID`) REFERENCES `customer` (`CustomerID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla beefstore.saleticket
CREATE TABLE IF NOT EXISTS `saleticket` (
  `TransactionID` bigint(20) NOT NULL AUTO_INCREMENT,
  `SaleID` int(11) NOT NULL,
  `ProductID` bigint(20) NOT NULL,
  `Quantity` float NOT NULL,
  PRIMARY KEY (`TransactionID`),
  UNIQUE KEY `TransactionID_UNIQUE` (`TransactionID`),
  KEY `ProductID_FK` (`ProductID`),
  KEY `SaleID_FK` (`SaleID`),
  CONSTRAINT `ProductID_FK` FOREIGN KEY (`ProductID`) REFERENCES `products` (`ProductID`),
  CONSTRAINT `SaleID_FK` FOREIGN KEY (`SaleID`) REFERENCES `sales` (`SaleID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla beefstore.supplier
CREATE TABLE IF NOT EXISTS `supplier` (
  `SupplierID` int(11) NOT NULL AUTO_INCREMENT,
  `CompanyName` varchar(50) NOT NULL,
  `ContactName` varchar(50) DEFAULT NULL,
  `Address` varchar(150) DEFAULT NULL,
  `City` varchar(50) DEFAULT NULL,
  `Phone` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`SupplierID`),
  UNIQUE KEY `SupplierID_UNIQUE` (`SupplierID`),
  UNIQUE KEY `SupplierName_UNIQUE` (`CompanyName`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
