CREATE TABLE clientes (
  alias char(20) PRIMARY KEY,
  nombre char(20),
  apellidos char(20),
  email varchar(45),
  celular char(20),
  contrasena int,
  f_nacimiento date
);

INSERT INTO clientes (alias, nombre, apellidos, email, celular, contrasena, f_nacimiento) VALUES
('diva', 'Ana', 'Diaz', 'diva@gmail.com', '3002568798', 123789, '1997-08-28'),
('dreamer', 'Luis', 'Rojas', 'dreamer@gmail.com', '3139868798', 987321, '1971-06-13'),
('green', 'Jorge', 'Rodriguez', 'green@gmail.com', '3202565892', 120456, '2001-05-18'),
('lucky', 'Pedro', 'Perez', 'lucky@gmail.com', '3102568798', 123456, '2000-04-08'),
('malopez', 'Maria', 'Lopez', 'malopez@gmail.com', '310257800', 9887654, '1998-02-04'),
('neon', 'Nelson', 'Ruiz', 'neon@gmail.com', '3107892798', 632556, '1996-04-08'),
('ninja', 'Andres', 'Cruz', 'ninja@gmail.com', '3142598798', 123951, '2000-11-21'),
('rose', 'Claudia', 'Mendez', 'rose@gmail.com', '3202568798', 123456, '2000-04-08');
