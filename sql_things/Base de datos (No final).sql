-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema db_Facturador
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema db_Facturador
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_Facturador` DEFAULT CHARACTER SET utf8 ;
USE `db_Facturador` ;

-- -----------------------------------------------------
-- Table `db_Facturador`.`proveedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_Facturador`.`proveedor` (
  `idrif` VARCHAR(45) NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `empresa` VARCHAR(45) NOT NULL,
  `tlf` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idrif`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_Facturador`.`producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_Facturador`.`producto` (
  `idproducto` INT NOT NULL,
  `nombre` VARCHAR(100) NOT NULL,
  `precio` DECIMAL(10,2) NOT NULL,
  `stock` INT NULL,
  `proveedor_idrif` VARCHAR(45) NULL,
  PRIMARY KEY (`idproducto`),
  INDEX `fk_producto_proveedor_idx` (`proveedor_idrif` ASC),
  CONSTRAINT `fk_producto_proveedor`
    FOREIGN KEY (`proveedor_idrif`)
    REFERENCES `db_Facturador`.`proveedor` (`idrif`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_Facturador`.`jefe`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_Facturador`.`jefe` (
  `idjefe` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `username` VARCHAR(45) NOT NULL,
  `pass` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idjefe`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_Facturador`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_Facturador`.`cliente` (
  `id_cedula` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `telf` VARCHAR(45) NOT NULL,
  `dir` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_cedula`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_Facturador`.`Compras`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_Facturador`.`Compras` (
  `jefe_idjefe` INT NOT NULL,
  `cliente_id_cedula` INT NOT NULL,
  `producto_idproducto` INT NOT NULL,
  `codigoCompra` INT NOT NULL,
  `fecha` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`jefe_idjefe`, `cliente_id_cedula`, `producto_idproducto`, `codigoCompra`),
  INDEX `fk_producto_has_cliente_cliente1_idx` (`cliente_id_cedula` ASC),
  INDEX `fk_producto_has_cliente_producto1_idx` (`producto_idproducto` ASC),
  INDEX `fk_Compras_jefe1_idx` (`jefe_idjefe` ASC),
  CONSTRAINT `fk_producto_has_cliente_producto1`
    FOREIGN KEY (`producto_idproducto`)
    REFERENCES `db_Facturador`.`producto` (`idproducto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_producto_has_cliente_cliente1`
    FOREIGN KEY (`cliente_id_cedula`)
    REFERENCES `db_Facturador`.`cliente` (`id_cedula`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Compras_jefe1`
    FOREIGN KEY (`jefe_idjefe`)
    REFERENCES `db_Facturador`.`jefe` (`idjefe`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
