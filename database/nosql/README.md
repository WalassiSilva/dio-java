# dio-db-nosql

<details>
<summary>CASSANDRA QUERY LANGUAGE</summary>

```sql
CREATE KEYSPACE fenda_biquini WITH replication = {'class': "SimpleStrategy', 'replication_factor': 1};

use fenda_biquini;

CREATE COLUMNFAMILY clients (name TEXT PRIMARY KEY, age int);

SELECT * FROM clients;

INSERT INTO clients (name, age) VALUES
('Bob Esponja', 38), ('Patrick',35);

INSERT INTO clients JSON '{"name": "Lula Molusco"}'

SELECT age, WRITETIME(age) from clients;

SELECT * FROM clients WHERE name = 'Bob Esponja';

SELECT * JSON FROM clients;

UPDATE clients SET age=33 WHERE name= "Patrick";

ALTER COLUMNFAMILY clients ADD hobby text
UPDATE clients SET hobby='Caçar agua viva' WHERE name='Patrick';

SELECT age, WRITETIME(age). hobby, WRITETIME(hobby) FROM clients WHERE name='Patrick';

DELETE FROM clients WHERE name='Bob Esponja';

```

</details>

<details>
<summary>CHAVE E VALOR (REGIS)</summary>

```sql
SET user1: name "Bob Esponja"

GET user1:name

SET user '{"name": "Patrick", "age": 31}'
GET user

-- ADICIONA TEMPO PRO REGISTRO EXPIRAR
SET user2:name "Lula Molusco" EX 10

-- VERIFICAR A EXISTENCIA DE UM REGISTRO
EXISTS user2:name

-- MANIPULANDO LISTAS
LPUSH user1:hobbies "Caçar agua viva"
LPUSH user1:hobbies "Comer hamburgers"

-- BUSCAR DADOS EM LISTA
LINDEX user1:hobbies

-- BUSCAR RANGE DE RESGISTROS
LRANGE user1:hobbies 0 1

-- VER O TIPO DE UM VALOR DENTRO DA CHAVE
TYPE user1:name
TYPE user1:hobbies

-- VER O TEMPO DE EXPIRAÇÃO DE UM DADO
TTL user1:name
-- VER EM MILISECONDS
PTTL user1:name

-- TORNAR UM DADO PERMANENTE
SET user2:name "Patrick" EX 30
TTL user2:name
PERSIST user2:name

-- DELETAR DADOS
 DEL user2:name
```

</details>
<details>
  <summary>MongoDB</summary>

  <details>
  <summary>Introdução</summary>

## Vantagens

- Código aberto
- Alta performance
- Schema-free
- Usa json para armazenamento de dados
- Suporte a indices
- Auto Sharding
- Map-reduce
- GridFS (método de armazenamento de arquivos)
- Tem uma rica linguagem de consulta
- Ótimo pra grande volume de dados
- Dados não necessariamente estruturados

## Desvantagens

### Quando não usar

- Necessidade de relacionamento/joins
- Propriedades ACID e transações são importantes.
- Diversas entidades de pagamento não homologam sistemas cujos dados financeiros dos clientes não estajam em bancos de dados relacionais tradicionais


## Comparação de estrutura
- Document => Registro. 
O Documento precisa ser auto contido e auto descritivo. Não pode depender de outros dados

- Collection => Tabela. É schema-free, então a descrição é feita pra o registro e nao a collection

Embedding/linking => Join. Existe algumas formas de fazer relaçao entre collection, mas não é recomendado.

  </details>

</details>
