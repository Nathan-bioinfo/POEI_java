CREATE TABLE classe 
(
     id INTEGER primary key auto_increment not null,
     nom VARCHAR(255)
);

INSERT INTO classe ( nom ) VALUES ( 'cp' ),( 'ce1' ),( 'ce2' ),( 'cm1' ), ( 'cm2' ) ;


CREATE TABLE eleve 
(
     id INTEGER primary key auto_increment not null,
     nom VARCHAR(255),
     ID_classe INTEGER
 );

INSERT INTO eleve (nom, ID_classe) VALUES ( 'toto', 2 ), ( 'tata', 2 ), ( 'gontrand', 5 ), ( 'isidore', 5 ), ( 'alienor', 5 ); 

SELECT
    eleve.nom,
    classe.nom as classe
FROM
    eleve,
    classe
WHERE
    eleve.ID_classe=classe.ID;

CREATE TABLE eleve_sport 
(
     id INTEGER primary key auto_increment not null,
     id_eleve INTEGER,
     id_sport INTEGER
);

INSERT INTO eleve_sport ( id_eleve, id_sport ) VALUES 
( 1, 1 ),
( 1, 2 ),
( 3, 3 ),
( 5, 5 ),
( 5, 4 );


SELECT
    eleve.nom,
    sport.nom as sport
FROM 
    eleve,
    sport,
    eleve_sport
WHERE
    eleve_sport.id_eleve=eleve.id
    and eleve_sport.id_sport=sport.id
    and eleve.nom='alienor';
CREATE TABLE sport 
(
     id INTEGER primary key auto_increment not null,
     nom VARCHAR(255)
 );


INSERT INTO sport (nom) VALUES 
( 'foot' ), 
( 'natation' ), 
( 'belote' ), 
( 'cyclisme' ), 
( 'tir sportif' ),
( 'foot-ball americain' );
