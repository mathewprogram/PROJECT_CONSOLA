-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`STUDENT`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`STUDENT` (
  `idStudent` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  PRIMARY KEY (`idStudent`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`SUBJECT`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`SUBJECT` (
  `idSubject` INT NOT NULL,
  `description` VARCHAR(45) NULL,
  `credits` INT NULL,
  PRIMARY KEY (`idSubject`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`STUDENT_has_SUBJECT`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`STUDENT_has_SUBJECT` (
  `STUDENT_idStudent` INT NOT NULL,
  `SUBJECT_idSubject` INT NOT NULL,
  PRIMARY KEY (`STUDENT_idStudent`, `SUBJECT_idSubject`),
  INDEX `fk_STUDENT_has_SUBJECT_SUBJECT1_idx` (`SUBJECT_idSubject` ASC) VISIBLE,
  INDEX `fk_STUDENT_has_SUBJECT_STUDENT_idx` (`STUDENT_idStudent` ASC) VISIBLE,
  CONSTRAINT `fk_STUDENT_has_SUBJECT_STUDENT`
    FOREIGN KEY (`STUDENT_idStudent`)
    REFERENCES `mydb`.`STUDENT` (`idStudent`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_STUDENT_has_SUBJECT_SUBJECT1`
    FOREIGN KEY (`SUBJECT_idSubject`)
    REFERENCES `mydb`.`SUBJECT` (`idSubject`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
