CREATE TABLE compras (
  id int PRIMARY KEY,
  alias char(20),
  fabricante char(20),
  fecha_hora timestamp,
  FOREIGN KEY (alias) REFERENCES clientes (alias),
  FOREIGN KEY (fabricante) REFERENCES fabricantes (fabricante)
);

INSERT INTO compras (id, alias, fabricante, fecha_hora) VALUES
(101, 'lucky', 'Cannondale', '2017-10-26 01:00:00'),
(102, 'lucky', 'Trek', '2019-03-15 23:30:00'),
(103, 'lucky', 'Starker', '2019-05-21 01:30:00'),
(104, 'malopez', 'Cannondale', '2018-05-21 01:30:00'),
(105, 'malopez', 'Starker', '2020-01-21 01:30:00'),
(106, 'diva', 'Yeti', '2019-05-21 01:30:00'),
(107, 'diva', 'Fuji', '2018-06-23 02:30:00'),
(108, 'diva', 'Lucky Lion', '2020-03-17 20:30:20'),
(109, 'dreamer', 'Lucky Lion', '2020-03-17 20:30:20'),
(110, 'dreamer', 'Be Electric', '2020-04-10 23:30:20'),
(111, 'ninja', 'Aima', '2020-02-18 01:30:20'),
(112, 'ninja', 'Starker', '2020-02-20 21:30:20'),
(113, 'ninja', 'Mec de Colombia', '2020-03-27 23:30:20'),
(114, 'rose', 'Atom Electric', '2020-03-21 02:30:20'),
(115, 'green', 'Yeti', '2020-01-10 22:30:20'),
(116, 'green', 'Trek', '2020-02-16 01:30:20'),
(117, 'green', 'Bmc', '2020-03-17 23:30:20');