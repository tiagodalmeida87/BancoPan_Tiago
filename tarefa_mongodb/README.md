# PAN Academy - Atividade MongoDB

![](https://github.com/tiagodalmeida87/BancoPan_Tiago/blob/main/tarefa_mongodb/src/img/mongodb.jpg)


**MongoDB** é um banco de dados não relacional (noSQL) orientado a documentos no formato JSON. Ele é opensource e possui alta performance e flexibilidade.

Nessa atividade vamos criar um banco de dados novo (database) e uma coleção com um nome pertinente, de acordo com os dados e tema que você escolher. Os seguintes comandos devem ser feitos e entregues:
- Inserção de documentos
- Atualização de documentos
- Exclusão de documentos
- Consulta com projeção
- Consulta utilizando combinação entre os seletores
- Consulta paginada e ordenada (utilizar ignorar, limitar e classificar )

### Resolução da atividade

Com o MongoDB previamente instalado no ambiente Windows e na pasta c:\data\db 
 
  - Criar um banco de dados no MongoDB, usamos o seguinte comando: 
```
$ use cinemapan
$ db.createCollection('filme')
```

 - Inserção de Documentos:
Com o Robot 3T foi criado uma nova conexão com base de dados "cinemapan", com o botão direito na Collection -> filme, abri a opção de Insert Document, para inserir os dados via JSON;


![](https://github.com/tiagodalmeida87/BancoPan_Tiago/blob/main/tarefa_mongodb/src/img/Inserir_dados.jpg)


 - Atualização de documentos:
Para atualização do documento foi utilizado o Robot 3T, com o botão direito na Collection -> filme, abri a opção de Update Document, para inserir os dados via JSON, através do comando:

```
db.getCollection('filme').update(
    // query 
    {
        "elenco.nome" : "Chloe Grace"
    },
    // update 
    {$set:
        {
            "elenco.nome" : "Chloe Grace, Charlize Theron"
        }   
    },
    
    // options 
    {
        "multi" : false,  // update only one document 
        "upsert" : false  // insert a new document, if no existing document match the query 
    }
);
```


![](https://github.com/tiagodalmeida87/BancoPan_Tiago/blob/main/tarefa_mongodb/src/img/atualiza%C3%A7%C3%A3o.jpg)


 - Exclusão de Documentos:
Para excluir o documento foi utilizado o comando:
```
db.getCollection('filme').remove({"filme.nome" : "Luca"})
```

 - Consulta com projeção:
Para consulta com projeção foi utilizado o comando:
```
db.getCollection('filme').find({},{"filme:lancamento":"2021"})
```

 - Consulta utilizando combinação entre os seletores:
Para consulta com combinação de seletores foi utilizado o comando:
Retornando o local do cinema e a cidade 
```
db.getCollection('filme').find({$or:[{"local": /.*Adra.*/},{"cidade":/.*de.*/}]})
```


![](https://github.com/tiagodalmeida87/BancoPan_Tiago/blob/main/tarefa_mongodb/src/img/combinacao_seletores.jpg)


- Consulta paginada e ordenada (utilizar ignorar, limitar e classificar)

Limitando a 1 registros:
```
db.getCollection('filme').find().limit(1)
```

Pulando dois registros:
```
db.getCollection('filme').find().skip(2)
```

> Status da Atividade: Concluido :heavy_check_mark:


## Patrocinadores


###### Gama Academy
![image](https://user-images.githubusercontent.com/92064386/138007156-3ae6e393-a770-4bf7-85cb-9f9d390fb118.png)


###### Banco PAN
![image](https://user-images.githubusercontent.com/92064386/138007193-47cac947-928e-4909-a299-0ae99b35eed9.png)

# 