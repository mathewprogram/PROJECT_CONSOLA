DROP DATABASE IF EXISTS COLLEGE_DATA;
CREATE DATABASE COLLEGE_DATA;
USE COLLEGE_DATA;

CREATE TABLE IF NOT EXISTS Student (
	idStudent INT NOT NULL AUTO_INCREMENT,
    name_ VARCHAR(30) NULL,
		 PRIMARY KEY (idStudent)
         ) Engine = InnoDB;
         
CREATE TABLE IF NOT EXISTS Subject_ (
	idSubject    INT         NOT NULL AUTO_INCREMENT,
    description_ VARCHAR(30) NOT NULL,
    credit  	INT 		 NOT NULL,
		 PRIMARY KEY (idSubject)
         ) Engine = InnoDB;

CREATE TABLE IF NOT EXISTS Student_has_Subject (
	idStudent 	INT NOT NULL,
    idSubject 	INT NOT NULL,
				PRIMARY KEY (idStudent, idSubject),
                
                FOREIGN KEY (idStudent) REFERENCES Student (idStudent)
                ON DELETE NO ACTION
                ON UPDATE NO ACTION,
				
                FOREIGN KEY (idSubject) REFERENCES Subject_ (idSubject)
                ON DELETE NO ACTION
                ON UPDATE NO ACTION
    )ENGINE = InnoDB;
    
    -- ----
    -- Data
    -- ----
    
    INSERT INTO Student (idStudent, name_) VALUES (NULL, 'Mathew'); -- 1
    INSERT INTO Student (name_)           VALUES ('Mihai'); 	    -- 2
    INSERT INTO Student (name_) 		  VALUES
    ('Lavinia'),  												    -- 3
    ('Maria'),													    -- 4
    ('Flor');													    -- 5
    INSERT INTO Subject_ (description_, credit) VALUES
    ('Matematichs', 4),								 			    -- 1 
    ('Physics', 5),											        -- 2
    ('Religion', 3),   											    -- 3
    ('Computer Science', 6);									    -- 4	
    INSERT INTO Student_has_Subject (idStudent, idSubject) VALUES
    (1,1),(1,3),
    (2,1),(2,2),(2,3),(2,4),
    (3,4),
    (4,1),(4,2),(4,4),
    (5,1),(5,3);
    
    
    