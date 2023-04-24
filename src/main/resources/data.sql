
/*DROP TABLE IF EXISTS fabricantes;*/
CREATE TABLE fabricantes (
  CODIGO int NOT NULL AUTO_INCREMENT,
  NOMBRE varchar(255) DEFAULT NULL,
  PRIMARY KEY (CODIGO)
);

INSERT INTO fabricantes(nombre) VALUES ('Sony'),('Creative Labs'),('Hewlett-Packard'),('Iomega'),('Fujitsu'),('Winchester');


/*DROP TABLE IF EXISTS articulos;*/
CREATE TABLE articulos (
  CODIGO int NOT NULL AUTO_INCREMENT,
  NOMBRE varchar(255) DEFAULT NULL,
  PRECIO decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (CODIGO),
  FABRICANTE int,
   CONSTRAINT articulos_ibfk_1 FOREIGN KEY (FABRICANTE) REFERENCES fabricantes (CODIGO) ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT INTO articulos(nombre,precio,fabricante) VALUES ('Hard drive',240,5),('Memory',120,6),('ZIP drive',150,4),('Floppy disk',5,6),('Monitor',240,1),('DVD drive',180,2),('CD drive',90,2),('Printer',270,3),('Toner cartridge',66,3),('DVD burner',180,2);
