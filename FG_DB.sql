CREATE DATABASE fg_db;
USE fg_db;
----- drop database fg_db;
 ----- TABELA DE CLIENTE
 CREATE TABLE cliente
 (
 id INT NOT NULL AUTO_INCREMENT,
 nome VARCHAR(45) NOT NULL,
 cpf VARCHAR(14) NOT NULL,
 telefone VARCHAR(11) NOT NULL,
 email VARCHAR(45) NOT NULL,
 PRIMARY KEY(id)
 );
 
  ----- TABELA DO PRODUTO
 CREATE TABLE produto
 (
 id INT NOT NULL AUTO_INCREMENT,
 nomeProduto VARCHAR(120) NOT NULL,
 fabricante VARCHAR(45) NOT NULL,
 categoria VARCHAR(45) NOT NULL,
 plataforma VARCHAR(45),
 cor VARCHAR(20),
 garantia INT NOT NULL,
 valor DECIMAL(9,2) NOT NULL,
 PRIMARY KEY(id)
 );
 
 ----- TABELA DE ESTOQUE
 CREATE TABLE estoque
 (
 id INT NOT NULL AUTO_INCREMENT,
 quantidade INT NOT NULL,
 produto_id INT NOT NULL,
 PRIMARY KEY(id),
 FOREIGN KEY (produto_id) REFERENCES produto (id)
 );
 
  ----- TABELA DE FUNCIONÁRIOS
 CREATE TABLE funcionario
 (
 id INT NOT NULL AUTO_INCREMENT,
 nome VARCHAR(45) NOT NULL,
 cargo VARCHAR(45) NOT NULL,
 email VARCHAR(45) NOT NULL,
 senha TEXT NOT NULL,
 PRIMARY KEY(id)
 );
 
  ----- TABELA DE ORÇAMENTOS
 CREATE TABLE orcamento
 (
 id INT NOT NULL AUTO_INCREMENT,
 data DATE NOT NULL,
 cliente_id INT NOT NULL,
 PRIMARY KEY(id),
	FOREIGN KEY (cliente_id)
		REFERENCES cliente (id)
 );
 
  ----- TABELA LIGAÇÃO ORÇAMENTOS E PRODUTOS
 CREATE TABLE orcamento_produto
 (
 id INT NOT NULL AUTO_INCREMENT,
 valorTotal DECIMAL(9,2) NOT NULL,
 orcamento_id INT NOT NULL,
 produto_id INT NOT NULL,
 PRIMARY KEY(id),
 FOREIGN KEY (orcamento_id)
	REFERENCES orcamento (id),
		FOREIGN KEY (produto_id)
			REFERENCES produto (id)
 );
 
  ----- TABELA DE VENDAS
 CREATE TABLE venda
 (
 nf INT NOT NULL AUTO_INCREMENT,
 data DATE NOT NULL,
 formPagamento VARCHAR(20) NOT NULL,
 orcamento_id INT,
 cliente_id INT NOT NULL,
 PRIMARY KEY(nf),
	FOREIGN KEY (orcamento_id)
		REFERENCES orcamento (id),
			FOREIGN KEY (cliente_id)
		REFERENCES cliente (id)
 );
 
  ----- TABELA LIGAÇÃO VENDA E PRODUTO
 CREATE TABLE venda_produto
 (
 id INT NOT NULL AUTO_INCREMENT,
 valorTotal DECIMAL(9,2) NOT NULL,
 quantidade int not null,
 venda_id INT NOT NULL,
 produto_id INT NOT NULL,

 PRIMARY KEY(id),
 FOREIGN KEY (venda_id)
	REFERENCES venda (nf),
		FOREIGN KEY (produto_id)
			REFERENCES produto (id)
 );