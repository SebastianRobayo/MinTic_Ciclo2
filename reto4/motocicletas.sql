CREATE TABLE motocicletas (
  id int PRIMARY KEY,
  fabricante char(20),
  precio int,
  autonomia int,
  id_prov int,
  FOREIGN KEY (fabricante) REFERENCES fabricantes (fabricante),
  FOREIGN KEY (id_prov) REFERENCES proveedor (prov_id)
);

INSERT INTO motocicletas (id, fabricante, precio, autonomia, id_prov) VALUES
(201, 'Starker', 4200000, 18, 101),
(202, 'Lucky Lion', 5600000, 14, 102),
(203, 'Be Electric', 4600000, 26, 101),
(204, 'Aima', 8000000, 36, 103),
(205, 'Mec de Colombia', 5900000, 20, 104),
(206, 'Atom Electric', 4500000, 12, 105);