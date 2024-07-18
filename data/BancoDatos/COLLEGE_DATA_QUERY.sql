-- show Mathew subjects(1)

-- Father Student 		Mathew
-- Son    Subjects	    Matemathics 

SELECT a.name_, sub.description_ 
FROM Student a 
JOIN Student_has_Subject sa ON a.idStudent = sa.idStudent 
JOIN Subject_ sub ON sub.idSubject = sa.idSubject 
WHERE a.idStudent = 1;

SELECT sub.description_, a.name_
FROM Student a
JOIN Student_has_Subject sa ON a.idStudent = sa.idStudent
JOIN Subject_ sub ON sub.idSubject = sa.idSubject
WHERE sub.idSubject = 3;

SELECT sub.description_, a.name_
FROM Student a
JOIN Student_has_Subject sa ON a.idStudent = sa.idStudent
JOIN Subject_ sub ON sub.idSubject = sa.idSubject
ORDER BY description_;
