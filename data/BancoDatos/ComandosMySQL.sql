SHOW DATABASES; 

SELECT * FROM Alumno;

SELECT * FROM Alumno WHERE idAlumno = 6;

SELECT GRUPO, COUNT(*) AS CANTIDAD FROM Alumno GROUP BY grupo;

-- Crear un usuario
CREATE USER 'Mihai'@'localhost' IDENTIFIED BY '12345678Mihai!';
-- Mostrar los usuarios creados
SELECT USER, HOST FROM MYSQL.USER;
-- Otorgar Privilegios a un usuario para acceder a una base de datos
GRANT ALL PRIVILEGES ON CAMPUSFP1.* TO 'Mihai'@'localhost';
