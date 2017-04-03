CREATE TABLE kasutajad(
kasutajanimi VARCHAR(50) NOT NULL PRIMARY KEY,
saldo DECIMAL(8, 2)
);

INSERT INTO kasutajad VALUES ('Juhan', 10);
INSERT INTO kasutajad VALUES ('Malle', 14);


CREATE TABLE arved(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
knimi VARCHAR(30),
summa DECIMAL(8, 2),
FOREIGN KEY(knimi) REFERENCES kasutajad(kasutajanimi)
);

INSERT INTO arved VALUES(DEFAULT, 'Juhan', 3);
INSERT INTO arved VALUES(DEFAULT, 'Juku', 3.50);
INSERT INTO arved VALUES(DEFAULT, 'Juhan', 5.20);
