CREATE TABLE bicicletas (
  id int PRIMARY KEY,
  fabricante char(20),
  precio int,
  anio int,
  FOREIGN KEY (fabricante) REFERENCES fabricantes (fabricante)
);

INSERT INTO bicicletas (id, fabricante, precio, anio) VALUES
(101, 'Cannondale', 1200000, 2017),
(102, 'Trek', 1450000, 2019),
(103, 'Yeti', 2000000, 2020),
(104, 'Fuji', 950000, 2021),
(105, 'Bmc', 1950000, 2018);
