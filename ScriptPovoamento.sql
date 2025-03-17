INSERT INTO cliente(nome, cpf, telefone, email) VALUES
("Lucas Silva", "23526549815", "11989647251", "lucassilva@bmail.com"),
("Gabriel Lucca Alves", "98761935412", "11957648239", "gabrielalves@bmail.com"),
("Eloisa Ribeiro Silva", "13456148877", "11978864309", "eloisa754@bmail.com"),
("Agata Carvalho Gomes", "75645355563", "11989956107", "agata1320@bmail.com"),
("Lorenzo Medeiros Richard", "65745688801", "11996437059", "lorenzo_fsd@bmail.com");

INSERT INTO funcionario(nome, cargo, email, senha) VALUES 
("Breno Alves de Araújo", "gerente", "breno@fg.com.br", MD5("64815")),
("Alisson Freire Junior", "atendente", "alisson@fg.com.br", MD5("2657")),
("Larissa Gomez da Silva", "atendente", "larissa@fg.com.br", MD5("3645")),
("Julia Alves Gomez", "atendente", "julia@fg.com.br", MD5("6435"));

INSERT INTO produto(nomeProduto, fabricante, categoria, plataforma, cor, garantia, valor) VALUES
("Rx6600", "ASUS", "Hardware", null, null, 120, 1299.99), ("4060", "MSI", "Hardware", null, null, 120, 2319.99),
 ("Memória Ram 8gb", "KINGSTON", "hardware", null, null, 60, 189.99), ("Memória Ram 16gb", "KINGSTON", "Hardware", null, null, 60, 299.99),
("B760M-A","GIGABYTE", "Hardware", null, null, 60, 449.99), ("Prime B760-A", "ASUS", "Hardware", null, null, 60, 1159.99),
("B450M Steel Legend", "AS ROCK", "Hardware", null, null, 60, 712.49),("Core I5-10400F", "INTEL", "Hardware", null, null, 60, 579.99), 
("Ryzen 5 5600", "AMD", "Hardware", null, null, 60, 848.99), ("Core I5-13400F", "INTEL", "Hardware", null, null, 60, 1300),
("Core I5-11400F","INTEL", "Hardware", null, null, 60, 980), ("Pulse Elite", "SONY", "Acessórios", null, "Branco", 60, 929.21),
("Headset Zeus Pro", "REDRAGON", "Acessórios", null, "Preto", 60, 329.90), ("Headset A50", "ASTRO", "Acessórios", null, "Preto", 60, 1499.99),
("Spider-Man 2", "INSOMNIAC", "Jogo", 60, 269.90), ("Stellar Blade", "SHIFT UP", "Jogo", "PS5", null, 30, 263.91),
("EA Sports FC 24", "ELETRONIC ARTS", "Jogo", null, 250.00), ("Elden Ring", "FromSoftware", "Jogo", "PS5", null, 30, 249.99),
("Death Strandig", "KOJIMA PRODUCTIONS", "Jogo", "PS5", null, 30, 219.91);

INSERT INTO estoque(quantidade,produto_id) VALUES
(7, 2), (8, 3),
(15, 4), (15, 5),
(10, 1), (5, 6),
(10, 8), (10, 9),
(2, 7), (10, 10),
(5, 11), (10, 12),
(15, 13), (7, 15),
(20, 14), (5, 16), (20, 17),
(7, 18), (7, 19);

INSERT INTO orcamento(data, cliente_id) VALUES
("2024-01-26", 2), ("2024-01-26", 01);

INSERT INTO orcamento_produto(valorTotal, orcamento_id, produto_id) VALUES
(299.99, 1, 4), (249.99, 2, 18);

INSERT INTO venda(data, formPagamento, orcamento_id, cliente_id) VALUES
("2024-01-27", "Débito", 1, 1),
("2024-01-27", "Crédito", NULL, 4),
("2024-01-27", "Crédito", NULL, 2),
("2024-01-28", "Crédito", NULL, 3),
("2024-01-28", "Débito", NULL, 5),
("2024-01-28", "Débito", NULL, 1);

INSERT INTO venda_produto(valorTotal, quantidade, venda_id, produto_id) VALUES
(299.99, 1, 1, 18), (219.91, 1, 2, 19), (1299.99, 1, 3, 1),
(189.99, 1, 4, 3), (449.99, 1, 5, 5), (712.49, 1, 6, 7);