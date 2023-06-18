# Mongo DB
  O MongoDB é uma solução de banco de dados NoSQL que usa um modelo de armazenamento baseado em documentos JSON flexíveis, chamados de documentos BSON. Ao contrário dos bancos de dados relacionais tradicionais, o MongoDB não possui esquema rígido, permitindo que os documentos em uma coleção tenham estruturas diferentes. Isso proporciona maior flexibilidade ao lidar com dados não estruturados ou semiestruturados.

As principais características do MongoDB incluem:

Modelo de Dados Baseado em Documentos: Os dados são armazenados em documentos BSON, que são estruturas flexíveis semelhantes a JSON. Cada documento pode ter campos e estruturas diferentes, o que permite uma modelagem mais dinâmica dos dados.

Escalabilidade Horizontal: O MongoDB é projetado para escalabilidade horizontal, permitindo que você distribua os dados em vários servidores ou nós. Isso facilita o dimensionamento do banco de dados para lidar com cargas de trabalho em crescimento.

Replicação: O MongoDB suporta replicação automática, permitindo que você crie cópias dos dados em vários servidores. Isso melhora a disponibilidade dos dados e fornece tolerância a falhas, permitindo que o banco de dados continue funcionando mesmo em caso de falha de um servidor.

Sharding: O MongoDB oferece suporte a sharding, que é a distribuição dos dados em várias máquinas. Isso permite que você divida um conjunto de dados grande em partes menores e as distribua em diferentes servidores. O sharding ajuda a melhorar o desempenho e a capacidade de resposta do banco de dados ao distribuir a carga entre vários servidores.

Consultas Avançadas: O MongoDB oferece uma ampla gama de recursos de consulta, incluindo consultas ad hoc, consultas geoespaciais, agregação de dados e índices para otimizar o desempenho das consultas.

Indexação: O MongoDB suporta a criação de índices para melhorar o desempenho das consultas. Os índices podem ser criados em campos individuais ou em combinação de vários campos.

Suporte a Transações: O MongoDB introduziu o suporte a transações ACID (Atomicidade, Consistência, Isolamento e Durabilidade) em versões mais recentes. Isso permite que você execute operações de leitura e gravação em várias coleções ou documentos como uma única unidade atômica.

Integração com Linguagens de Programação: O MongoDB fornece drivers e bibliotecas oficiais para várias linguagens de programação, como Java, Python, JavaScript, C#, entre outras, facilitando a integração do banco de dados com o código da aplicação.

# Sobre o projeto

GET /posts/{id}

Descrição: Recupera um post pelo seu ID.
Parâmetros:
id (Path Variable): ID do post a ser recuperado.
Resposta:
Código de status HTTP 200 OK se o post for encontrado, juntamente com o corpo da resposta contendo o post.
Código de status HTTP 404 Not Found se o post não for encontrado.
GET /posts/titlesearch

Descrição: Realiza uma busca de posts por título.
Parâmetros:
text (Query Parameter): Texto para a busca no título dos posts. O parâmetro é opcional e o valor padrão é uma string vazia.
Resposta:
Código de status HTTP 200 OK se houver posts encontrados, juntamente com o corpo da resposta contendo a lista de posts correspondentes.
Código de status HTTP 404 Not Found se nenhum post for encontrado.
GET /posts/fullsearch

Descrição: Realiza uma busca avançada de posts com base em texto, data mínima e data máxima.
Parâmetros:
text (Query Parameter): Texto para a busca no conteúdo dos posts. O parâmetro é opcional e o valor padrão é uma string vazia.
minDate (Query Parameter): Data mínima para a busca. O parâmetro é opcional e o valor padrão é uma string vazia.
maxDate (Query Parameter): Data máxima para a busca. O parâmetro é opcional e o valor padrão é a data atual.
Resposta:
Código de status HTTP 200 OK se houver posts encontrados, juntamente com o corpo da resposta contendo a lista de posts correspondentes.
Código de status HTTP 404 Not Found se nenhum post for encontrado.
UserResource
Este recurso é responsável por lidar com as operações relacionadas aos usuários.

Endpoints:

GET /users

Descrição: Recupera todos os usuários.
Resposta:
Código de status HTTP 200 OK se houver usuários encontrados, juntamente com o corpo da resposta contendo a lista de usuários.
GET /users/{id}

Descrição: Recupera um usuário pelo seu ID.
Parâmetros:
id (Path Variable): ID do usuário a ser recuperado.
Resposta:
Código de status HTTP 200 OK se o usuário for encontrado, juntamente com o corpo da resposta contendo o usuário.
Código de status HTTP 404 Not Found se o usuário não for encontrado.
POST /users

Descrição: Insere um novo usuário.
Corpo da solicitação:
Objeto JSON contendo os dados do usuário.
Resposta:
Código de status HTTP 201 Created se o usuário for inserido com sucesso, juntamente com o cabeçalho "Location" contendo a URI do usuário criado.
Código de status HTTP 400 Bad Request se os dados fornecidos forem inválidos.
DELETE /users/{id}

Descrição: Exclui um usuário pelo seu ID.
Parâmetros:
id (Path Variable): ID do usuário a ser excluído.
Resposta:
Código de status HTTP 204 No Content se o usuário for excluído com sucesso.
Código de status HTTP 404 Not Found se o usuário não for encontrado.
PUT /users/{id}

Descrição: Atualiza um usuário pelo seu ID.
Parâmetros:
id (Path Variable): ID do usuário a ser atualizado.
Corpo da solicitação:
Objeto JSON contendo os dados atualizados do usuário.
Resposta:
Código de status HTTP 204 No Content se o usuário for atualizado com sucesso.
Código de status HTTP 400 Bad Request se os dados fornecidos forem inválidos.
GET /users/{id}/posts

Descrição: Recupera os posts de um usuário pelo seu ID.
Parâmetros:
id (Path Variable): ID do usuário.
Resposta:
Código de status HTTP 200 OK se o usuário for encontrado, juntamente com o corpo da resposta contendo a lista de posts do usuário.
Código de status HTTP 404 Not Found se o usuário não for encontrado.

## Layout WorkShop
![Mobile 1](https://github.com/Thiago771414/imagensProjetos/blob/main/slices/mobile/mongoDB.png)

## Vídeo de demonstração
[[Vídeo de demonstração]](https://youtu.be/BOyvkYTSyx0)

# Tecnologias utilizadas

## BackEnd
MongoDB, Java (Spring Boot)

## Front end
Postman

# Sobre o Projeto
[https://www.udemy.com/share/101t5i3@3-C9Teh5YSi1-7jVNVrIP2EiXi4iJMWl6eLZZ87TmpcZggtJ_s6OmQOA0mbABEtY/]

# Autor

Thiago Reis Lima

https://www.linkedin.com/in/thiago-lima-2a5896166/
