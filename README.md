<h1 align="center">Challenge Forum Hub</h1>
<br>

![ONE](https://github-production-user-asset-6210df.s3.amazonaws.com/132161011/341623397-6bbc7ff3-413f-46ef-98d6-b078eb36c7b2.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAVCODYLSA53PQK4ZA%2F20240709%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20240709T220133Z&X-Amz-Expires=300&X-Amz-Signature=2021813c9620ef2e63147be23fdce973b09b8b4f963d8e6ce50badda91333910&X-Amz-SignedHeaders=host&actor_id=138342590&key_id=0&repo_id=816525052)

## Descrição
Este projeto foi desenvolvido para implementar uma API REST criada para o challange Forum HUB. Este projeto possibilita realizar operações para incluir, listar, atualizar e excluir tópicos dentro do Forum Hub, além da funcionalidade de autenticação e autorização com tokens JWT.


<br>
<br>

# Funcionalidades Principais

### Autenticação e Segurança

- **AuthController**: Através do Endpoint `/login` para autenticação de usuários usando email e senha, gerando um token JWT.
- **TokenService**: Serviço para geração e validação de tokens JWT usando um segredo configurável.


### Gestão de Tópicos

- **TopicController**: Endpoint `/topicos` para operações CRUD em tópicos.
- **TopicService**: Serviço para incluir, atualizar, listar e deletar tópicos.


## Tecnologias e Bibliotecas Utilizadas

- **Spring Boot**: Framework para criação de aplicações Java.
- **Spring Data JPA**: Facilita o acesso e manipulação de dados com o banco de dados usando Hibernate.
- **Spring Security**: Fornecimento de autenticação e autorização.
- **Spring Validation**: Suporte para validação de dados.
- **Flyway**: Controle de versão para banco de dados.
- **PostgreSQL**: Banco de dados relacional.
- **Lombok**: Biblioteca para reduzir o código boilerplate.
- **Springdoc OpenAPI**: Geração de documentação interativa da API com o Swagger.
- **Java JWT (Auth0)**: Biblioteca para manipulação de tokens JWT.


# Configuração e Execução

## Maven
### Pré-requisitos

- Java 17 ou superior instalado.
- Maven instalado para construção do projeto.

### Configuração do Banco de Dados

- Configure um banco de dados MySQL com o nome e credenciais especificadas em `application.properties`.

#### Usuário padão
- email : murilo@email.com
- password : senha

#### Contribuição e Licença
- Este projeto está licenciado sob a MIT License. Sinta-se à vontade para contribuir e enviar pull requests para melhorar este projeto.
