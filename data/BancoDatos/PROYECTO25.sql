-- 1. BORRAR BASE DE DATOS SI ESTA EXISTE

DROP DATABASE IF EXISTS PROYECTO25;

-- 2. CREAR BASE DE DATOS

CREATE DATABASE PROYECTO25;

-- 3. USAR BASE DE DATOS

USE PROYECTO25;

-- 4. CREAR TABLA

DROP TABLE IF EXISTS Persona;

CREATE TABLE Persona (
    dni        CHAR(9)      NOT NULL PRIMARY KEY,
    nombre     VARCHAR(50)  NOT NULL,
    apellido   VARCHAR(50)  NOT NULL,
    direccion  VARCHAR(100) NOT NULL,
    telefono   CHAR(9)      NOT NULL,
    nacimiento CHAR(10)     NOT NULL
);
					  
-- 5. MOSTRAR LAS TABLAS DE LA BASE DE DATOS

SHOW TABLES;

-- 6. MOSTRAR LA ESTRUCTURA DE UNA TABLA

DESCRIBE Persona; 

-- 7. INSERTAR REGISTROS A UNA TABLA

INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('12345678A', 'Juan', 'Pérez', 'Calle Falsa 123, Ciudad', '123456789', '1990-01-01');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('23456789B', 'María', 'López', 'Avenida Siempre Viva 456, Ciudad', '123456789', '1985-02-15');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('34567890C', 'Carlos', 'García', 'Plaza Mayor 789, Ciudad', '345678902', '1975-03-22');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('45678901D', 'Ana', 'Martínez', 'Boulevard de la Luna 101, Ciudad', '453678901', '1980-04-30');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('56789012E', 'Luis', 'Hernández', 'Calle del Sol 202, Ciudad', '567890122', '1995-05-17');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('67890123F', 'Laura', 'González', 'Avenida del Mar 303, Ciudad', '678902123', '1988-06-23');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('78901234G', 'David', 'Rodríguez', 'Calle del Río 404, Ciudad', '789012334', '1992-07-30');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('89012345H', 'Isabel', 'Fernández', 'Calle de la Esperanza 505, Ciudad', '892012345', '1983-08-14');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('90123456I', 'Miguel', 'Sánchez', 'Plaza de la Libertad 606, Ciudad', '901233456', '1991-09-21');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('01234567J', 'Sara', 'Ramírez', 'Calle de los Naranjos 707, Ciudad', '012345167', '1986-10-02');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('12345670K', 'Jorge', 'Torres', 'Avenida del Castillo 808, Ciudad', '123456720', '1989-11-11');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('23456781L', 'Lucía', 'Flores', 'Calle del Parque 909, Ciudad', '234567281', '1993-12-05');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('34567892M', 'Raúl', 'Rivera', 'Calle de la Alegría 1010, Ciudad', '345637892', '1976-01-19');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('45678903N', 'Elena', 'Cruz', 'Avenida de los Olivos 1111, Ciudad', '456728903', '1984-02-23');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('56789014O', 'Alberto', 'Ortega', 'Calle del Carmen 1212, Ciudad', '567892014', '1994-03-15');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('67890125P', 'Marta', 'Ramos', 'Calle del Viento 1313, Ciudad', '678901235', '1987-04-18');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('78901236Q', 'Sergio', 'Vargas', 'Calle de la Paz 1414, Ciudad', '789012436', '1990-05-24');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('89012347R', 'Clara', 'Peña', 'Avenida de los Campos 1515, Ciudad', '890142347', '1981-06-30');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('90123458S', 'Antonio', 'Molina', 'Plaza del Sol 1616, Ciudad', '901234558', '1979-07-11');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('01234569T', 'Eva', 'Suárez', 'Calle del Mar 1717, Ciudad', '012345269', '1982-08-05');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('12345671U', 'Francisco', 'Romero', 'Avenida del Valle 1818, Ciudad', '123245671', '1996-09-20');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('23456782V', 'Patricia', 'Soto', 'Calle de los Santos 1919, Ciudad', '234562782', '1997-10-17');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('34567893W', 'Héctor', 'Campos', 'Calle de la Luna 2020, Ciudad', '345647893', '1977-11-13');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('45678904X', 'Julia', 'Chávez', 'Avenida de la Tierra 2121, Ciudad', '454678904', '1980-12-12');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('56789015Y', 'Óscar', 'Jiménez', 'Calle de la Aurora 2222, Ciudad', '567890415', '1985-01-08');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('67890126Z', 'Rocío', 'Medina', 'Plaza del Rey 2323, Ciudad', '678904126', '1998-02-22');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('78901237A', 'Adrián', 'Arias', 'Calle del Río 2424, Ciudad', '789014237', '1988-03-17');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('89012348B', 'Natalia', 'Palacios', 'Calle de los Ángeles 2525, Ciudad', '894012348', '1999-04-25');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('90123459C', 'Iván', 'Benítez', 'Calle de la Esperanza 2626, Ciudad', '901234459', '1978-05-15');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('01234560D', 'Sandra', 'Reyes', 'Avenida de los Laureles 2727, Ciudad', '012344560', '1990-06-30');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('12345672E', 'Manuel', 'Giménez', 'Calle de la Primavera 2828, Ciudad', '123456472', '1981-07-11');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('23456783F', 'Laura', 'Navarro', 'Plaza de la Fuente 2929, Ciudad', '234546783', '1992-08-24');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('34567894G', 'Pedro', 'Aguilar', 'Calle del Arco 3030, Ciudad', '345674894', '1979-09-18');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('45678905H', 'Silvia', 'Cortés', 'Avenida del Puerto 3131, Ciudad', '456478905', '1983-10-07');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('56789016I', 'Enrique', 'Guerra', 'Calle de la Victoria 3232, Ciudad', '564789016', '1991-11-22');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('67890127J', 'Ángela', 'Rivas', 'Calle de la Libertad 3333, Ciudad', '678904127', '1987-12-15');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('78901238K', 'Tomás', 'Mendoza', 'Plaza de la Cultura 3434, Ciudad', '789012438', '1986-01-05');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('89012349L', 'Verónica', 'Castro', 'Calle del Arte 3535, Ciudad', '890123449', '1995-02-14');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('90123460M', 'Hugo', 'Vega', 'Avenida del Sol 3636, Ciudad', '901234460', '1984-03-22');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('01234561N', 'Cristina', 'Ramos', 'Calle de la Paz 3737, Ciudad', '012434561', '1989-04-10');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('12345673O', 'Ricardo', 'Herrera', 'Plaza del Viento 3838, Ciudad', '124345673', '1993-05-27');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('23456784P', 'Alicia', 'Santos', 'Calle de la Alegría 3939, Ciudad', '234456784', '1997-06-12');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('34567895Q', 'Federico', 'Morales', 'Calle de los Ángeles 4040, Ciudad', '345467895', '1994-07-09');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('45678906R', 'Beatriz', 'Román', 'Avenida de los Encina 4141, Ciudad', '456784906', '1988-08-18');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('56789017S', 'Gustavo', 'Alonso', 'Calle de la Estrella 4242, Ciudad', '567890417', '1991-09-21');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('67890128T', 'Carmen', 'Serrano', 'Plaza de la Risa 4343, Ciudad', '678904128', '1982-10-14');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('78901239U', 'Roberto', 'Núñez', 'Calle de los Sueños 4444, Ciudad', '789041239', '1985-11-30');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('89012350V', 'Gloria', 'Lara', 'Calle del Futuro 4545, Ciudad', '890412350', '1996-12-22');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('90123461W', 'Felipe', 'Gómez', 'Avenida de la Esperanza 4646, Ciudad', '901423461', '1980-01-13');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('01234562X', 'Susana', 'Cabrera', 'Calle del Alba 4747, Ciudad', '012345262', '1987-02-09');
INSERT INTO Persona (dni, nombre, apellido, direccion, telefono, nacimiento) VALUES ('12345674Y', 'Ramón', 'Prieto', 'Plaza del Cielo 4848, Ciudad', '123456724', '1983-03-11');

-- 8. MOSTRAR TODOS LOS REGISTROS DE UNA TABLA

SELECT * FROM Persona;