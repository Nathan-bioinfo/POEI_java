CREATE database animaux;
USE animaux;

CREATE TABLE animal 
(
     id INTEGER primary key auto_increment not null,
     nom VARCHAR(255),
     id_espece INTEGER,
     FOREIGN KEY (id_espece) REFERENCES espece(id)
);

CREATE TABLE espece 
(
     id INTEGER primary key auto_increment not null,
     nom VARCHAR(255)
);

CREATE TABLE nourriture 
(
     id INTEGER primary key auto_increment not null,
     nom VARCHAR(255)
);

CREATE TABLE pays 
(
     id INTEGER primary key auto_increment not null,
     nom VARCHAR(255)
);


CREATE TABLE animal_nourriture 
(
     id INTEGER primary key auto_increment not null,
     id_animal INTEGER,
     id_nourriture INTEGER,
     FOREIGN KEY (id_animal) REFERENCES animal(id),
     FOREIGN KEY (id_nourriture) REFERENCES nourriture(id)
);


CREATE TABLE animal_pays 
(
     id INTEGER primary key auto_increment not null,
     id_animal INTEGER,
     id_pays INTEGER,
     FOREIGN KEY (id_animal) REFERENCES animal(id),
     FOREIGN KEY (id_pays) REFERENCES pays(id)
);

INSERT INTO animal ( nom ) VALUES 
( 'pirhana' ), ('pangolin'), ('python'), ('paon'),
('chat'), ('cochon'), ('corbeau'),  ('carpe'), ('caméléon'),  ('cigale'), 
('fourmis'),  ('souris'),  ('fourmilier'),  ('ornythorinque'),
('polatouche'),  ('chien');

INSERT INTO espece ( nom ) VALUES ('mammifère'), ('insecte'), 
('reptile'), ('poisson'), ('amphibien'), ('oiseau') ;

INSERT INTO nourriture ( nom ) VALUES 
('viande'), ('herbe'), ('graine'), ('croquette'), ('fruit'), ('vers'), 
('insectes'), ('fourmis'), ('os');

INSERT INTO pays ( nom ) VALUES 
 ('france'), ('australie'), ('indes'), ('chine'), ('congo'), 
 ('italie'), ('espagne'), ('afrique du sud'), ('brésil'), ('USA');
 
INSERT INTO animal_nourriture ( id_animal, id_nourriture ) VALUES 
( 1, 1), (2, 2), (3, 1), (3,7), (5,1), (4,3), (4,2), (5,4), (5,2), 
(7,1), (7,5), (7,3), (8,1), (9,6), (10,1), (10,2), (11,2),
 (11, 8), (14,1), (15, 2), (16, 1), (16, 9), (16, 4);
 
INSERT INTO animal_pays (id_animal,id_pays) VALUES
(1,8),(2,4),(3,5),(4,8),(5,1),(5,2); 

SELECT DISTINCT animal.nom as nom_animal, nourriture.nom as nourriture, pays.nom as pays FROM animal JOIN animal_pays JOIN pays JOIN nourriture JOIN animal_nourriture WHERE animal.id = animal_pays.id_animal AND pays.id = animal_pays.id_pays AND nourriture.id = animal_nourriture.id AND animal.id = animal_nourriture.id_animal;


