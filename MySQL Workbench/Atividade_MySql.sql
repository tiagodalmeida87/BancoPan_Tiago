use panacademy;

create table panacademy.estados (
	id integer unsigned not null auto_increment,
    nome varchar(20) not null,
    uf enum('AC','AL','AP','AM','BA','CE','ES','GO','MA','MT','MS','MG','PA','PB','PR','PE','PI','RJ','RN','RS','RO','RR','SC','SP','SE','TO','DF' ) not null,
    regiao enum('Norte','Nordeste','Centro-Oeste','Sudeste','Sul') not null,
    populacao integer not null,
    UNIQUE KEY(nome),
    primary key(id)
);

insert into estados (nome, uf, regiao, populacao) values ("Acre","AC","Norte","906.876");
insert into estados (nome, uf, regiao, populacao) values ("Amazonas","AM","Norte","4.269.995");
insert into estados (nome, uf, regiao, populacao) values ("Ceará","CE","Nordeste","9.240.580");
insert into estados (nome, uf, regiao, populacao) values ("Pernambuco","PE","Nordeste","9.674.793");
insert into estados (nome, uf, regiao, populacao) values ("Distrito Federal","DF","Centro-Oeste","3.094.325");
insert into estados (nome, uf, regiao, populacao) values ("Goiás","GO","Centro-Oeste","7.206.589");
insert into estados (nome, uf, regiao, populacao) values ("Minas Gerais","MG","Sudeste","21.411.923");
insert into estados (nome, uf, regiao, populacao) values ("Rio de Janeiro","RJ","Sudeste","17.463.349");
insert into estados (nome, uf, regiao, populacao) values ("Rio Grande do Sul","RS","Sul","11.466.630");
insert into estados (nome, uf, regiao, populacao) values ("Paraná","PR","Sul","11.597.484");

-- Inserir 10 estados (dois de cada região)
insert into estados (nome, uf, regiao, populacao) values ("Acre","AC","Norte",906876),
 ("Amazonas","AM","Norte",4269995), 
 ("Ceará","CE","Nordeste",9240580), 
 ("Pernambuco","PE","Nordeste",9674793), 
 ("Distrito Federal","DF","Centro-Oeste",3094325), 
 ("Goiás","GO","Centro-Oeste",7206589), 
 ("Minas Gerais","MG","Sudeste",21411923),
 ("Rio de Janeiro","RJ","Sudeste",17463349), 
 ("Rio Grande do Sul","RS","Sul",11466630), 
 ("Paraná","PR","Sul",11597484);

select * from estados;

-- Listar estados ordenando por sigla
SELECT * from estados
order by uf;

-- Encontrar a população total de cada região
SELECT sum(populacao),
    regiao,
    group_concat(nome)
from estados
group by regiao
order by nome;

-- Encontrar a média da população por região 
SELECT avg(populacao),
    regiao,
    group_concat(nome)
from estados
group by regiao
order by nome;

-- Agrupar estados por região
SELECT regiao,
    group_concat(nome)
from estados
group by regiao
order by nome;



delete from estados
where id = 1
