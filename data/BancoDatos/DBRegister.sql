DROP DATABASE IF EXISTS DBRegister;
CREATE DATABASE IF NOT EXISTS DBRegister;
USE DBRegister;

CREATE TABLE IF NOT EXISTS pet (
	idPet INT PRIMARY KEY auto_increment,
    description_ VARCHAR(20) NOT NULL
);

INSERT INTO pet VALUES
(NULL, 'Cat'),
(NULL, 'Dog'),
(NULL, 'Tiger'),
(NULL, 'Lion'),
(NULL, 'Monkey'),
(NULL, 'Hamster'),
(NULL, 'Parrot'),
(NULL, 'Tortoise'),
(NULL, 'Dolphin');

/*INSERT INTO pet (idMascota, description_) VALUES(NULL, 'Pig');
INSERT INTO pet (idMascota, description_) VALUES(NULL, 'Cat');*/

CREATE TABLE IF NOT EXISTS country (
	idCountry VARCHAR(3) PRIMARY KEY,
    description_ VARCHAR(26)
);

INSERT INTO country VALUES
('CL', 'Chile'),
('RO', 'Romania'),
('ES', 'Spain'),
('UK', 'United Kingdom'),
('USA', 'United States of America'),
('CO', 'Colombia'),
('PR', 'Puerto Rico'),
('RU', 'Russia'),
('GE', 'Germany'),
('FR', 'France');


CREATE TABLE IF NOT EXISTS hobby (
	idHobby INT PRIMARY KEY auto_increment,
    description_ VARCHAR(20) NOT NULL
);

INSERT INTO hobby VALUES
(NULL, 'Chess'),
(NULL, 'Footbal'),
(NULL, 'BascketBall'),
(NULL, 'Cinema'),
(NULL, 'Photography'),
(NULL, 'Painting');

CREATE TABLE IF NOT EXISTS client_ (
	idClient 	   INT  		PRIMARY KEY AUTO_INCREMENT,
    firstLastName  VARCHAR(20),
    pet			   JSON,
    country   	   CHAR(2),
    hobby          JSON,
    dateTime_      DATETIME,
    email		   VARCHAR(50),
    sex			   CHAR(1),
    phone 	       CHAR(9),
    password_      VARCHAR(20),
    autorize 	   BOOLEAN
    );
