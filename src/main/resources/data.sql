
//DROP TABLE IF EXISTS fabricantes;
CREATE TABLE fabricantes (
  CODIGO int NOT NULL,
  NOMBRE varchar(255) NOT NULL,
  PRIMARY KEY (CODIGO)
);

INSERT INTO fabricantes VALUES (1,'Sony'),(2,'Creative Labs'),(3,'Hewlett-Packard'),(4,'Iomega'),(5,'Fujitsu'),(6,'Winchester');


//DROP TABLE IF EXISTS articulos;
CREATE TABLE articulos (
  CODIGO int NOT NULL,
  NOMBRE varchar(255) NOT NULL,
  PRECIO decimal(10,0) NOT NULL,
  FABRICANTE int NOT NULL,
  PRIMARY KEY (CODIGO),
  CONSTRAINT articulos_ibfk_1 FOREIGN KEY (FABRICANTE) REFERENCES fabricantes (CODIGO)
);

INSERT INTO articulos VALUES (1,'Hard drive',240,5),(2,'Memory',120,6),(3,'ZIP drive',150,4),(4,'Floppy disk',5,6),(5,'Monitor',240,1),(6,'DVD drive',180,2),(7,'CD drive',90,2),(8,'Printer',270,3),(9,'Toner cartridge',66,3),(10,'DVD burner',180,2);
