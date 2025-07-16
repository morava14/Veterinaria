CREATE DATABASE IF NOT EXISTS veterinaria;

GRANT ALL PRIVILEGES ON veterinaria.* TO 'veterinaria'@'localhost';
FLUSH PRIVILEGES;
CREATE TABLE producto (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    precio DOUBLE NOT NULL
);
USE veterinaria;

INSERT INTO producto (nombre, precio) VALUES
('Alimento para perros', 19.99),
('Juguete para gatos', 8.50),
('Champú veterinario', 12.75),
('Vitaminas para cachorros', 14.30),
('Antipulgas en spray', 11.99),
('Cama para perros', 39.90),
('Arena para gatos', 7.75),
('Cepillo dental para mascotas', 5.20),
('Bebedero automático', 18.60),
('Collar con GPS', 45.00);