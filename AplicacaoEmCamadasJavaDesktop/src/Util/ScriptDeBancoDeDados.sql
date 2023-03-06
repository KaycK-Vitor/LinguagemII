CREATE DATABASE livraria;

USE livraria;

CREATE TABLE cliente (
    id INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    telefone bigint NOT NULL,
    PRIMARY KEY (id)
);
