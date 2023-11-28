-- Tabla de Clientes
CREATE TABLE clientes (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(255),
    apellido VARCHAR(255),
    numero_documento VARCHAR(255)
);

-- Tabla de Facturas
CREATE TABLE factura (
    id INT PRIMARY KEY AUTO_INCREMENT,
    clientes_id INT,
    fecha_creacion DATE,
    total DOUBLE,
    FOREIGN KEY (clientes_id) REFERENCES clientes(id)
);

-- Tabla de Productos
CREATE TABLE productos (
    id INT PRIMARY KEY AUTO_INCREMENT,
    descripcion VARCHAR(255),
    codigo VARCHAR(255),
    stock INT,
    precio DOUBLE
);

-- Tabla de Detalles de Factura
CREATE TABLE detalles_factura (
    id INT PRIMARY KEY AUTO_INCREMENT,
    factura_id INT,
    cantidad_productos INT,
    productos_id INT,
    subtotal DOUBLE,
    FOREIGN KEY (factura_id) REFERENCES factura(id),
    FOREIGN KEY (productos_id) REFERENCES productos(id)
);