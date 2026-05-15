-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema paa2026-2
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema paa2026-2
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `paa2026-2` DEFAULT CHARACTER SET utf8 ;
USE `paa2026-2` ;

-- -----------------------------------------------------
-- Table `paa2026-2`.`Clientes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `paa2026-2`.`Clientes` (
  `idClie` INT NOT NULL,
  `Cedula` VARCHAR(45) NOT NULL,
  `Nombres` VARCHAR(45) NOT NULL,
  `Mail` VARCHAR(45) NULL,
  PRIMARY KEY (`idClie`),
  UNIQUE INDEX `Cedula_UNIQUE` (`Cedula` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `paa2026-2`.`Paquetes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `paa2026-2`.`Paquetes` (
  `idPaq` INT NOT NULL,
  `Descripcion` VARCHAR(45) NULL,
  `Peso` FLOAT NULL,
  `Dimension` VARCHAR(45) NULL,
  `Estado` INT NULL DEFAULT 1,
  `idClie` INT NOT NULL,
  PRIMARY KEY (`idPaq`),
  INDEX `fk_Paquetes_Clientes1_idx` (`idClie` ASC) VISIBLE,
  CONSTRAINT `fk_Paquetes_Clientes1`
    FOREIGN KEY (`idClie`)
    REFERENCES `paa2026-2`.`Clientes` (`idClie`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `paa2026-2`.`Direcciones`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `paa2026-2`.`Direcciones` (
  `idDir` INT NOT NULL,
  `Calle1` VARCHAR(45) NOT NULL,
  `Calle2` VARCHAR(45) NOT NULL,
  `Actual` INT NULL DEFAULT 1,
  `idClie` INT NOT NULL,
  PRIMARY KEY (`idDir`),
  INDEX `fk_Direcciones_Clientes_idx` (`idClie` ASC) VISIBLE,
  CONSTRAINT `fk_Direcciones_Clientes`
    FOREIGN KEY (`idClie`)
    REFERENCES `paa2026-2`.`Clientes` (`idClie`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
