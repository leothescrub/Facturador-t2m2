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
  `idproveedor` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `rif` VARCHAR(45) NOT NULL,
  `empresa` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idproveedor`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_Facturador`.`encargado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_Facturador`.`encargado` (
  `id` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `username` VARCHAR(45) NOT NULL,
  `pass` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_Facturador`.`producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_Facturador`.`producto` (
  `idproducto` INT NOT NULL,
  `proveedor_idproveedor` INT NOT NULL,
  `encargado_id` INT NOT NULL,
  `nombre` VARCHAR(100) NOT NULL,
  `precio` DECIMAL(10,2) NOT NULL,
  `stock` INT NOT NULL,
  PRIMARY KEY (`idproducto`, `proveedor_idproveedor`, `encargado_id`),
  INDEX `fk_producto_proveedor1_idx` (`proveedor_idproveedor` ASC),
  INDEX `fk_producto_encargado1_idx` (`encargado_id` ASC),
  CONSTRAINT `fk_producto_proveedor1`
    FOREIGN KEY (`proveedor_idproveedor`)
    REFERENCES `db_Facturador`.`proveedor` (`idproveedor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_producto_encargado1`
    FOREIGN KEY (`encargado_id`)
    REFERENCES `db_Facturador`.`encargado` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_Facturador`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_Facturador`.`cliente` (
  `id_cedula` INT NOT NULL,
  `nombre` VARCHAR(45) NULL,
  `telf` INT NULL,
  `dir` VARCHAR(45) NULL,
  PRIMARY KEY (`id_cedula`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_Facturador`.`pedido`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_Facturador`.`pedido` (
  `id_pedido` INT NOT NULL,
  `cliente_id_cedula` INT NOT NULL,
  `jefe_idjefe` INT NOT NULL,
  `fecha` VARCHAR(45) NULL,
  PRIMARY KEY (`id_pedido`, `cliente_id_cedula`, `jefe_idjefe`),
  INDEX `fk_pedido_cliente_idx` (`cliente_id_cedula` ASC),
  INDEX `fk_pedido_jefe1_idx` (`jefe_idjefe` ASC),
  CONSTRAINT `fk_pedido_cliente`
    FOREIGN KEY (`cliente_id_cedula`)
    REFERENCES `db_Facturador`.`cliente` (`id_cedula`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_pedido_jefe1`
    FOREIGN KEY (`jefe_idjefe`)
    REFERENCES `db_Facturador`.`encargado` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
