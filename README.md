# API-REST-SpringBoot-PostgreSQL-Java 
![Spring Boot Logo](https://www.vectorlogo.zone/logos/springio/springio-ar21.svg) ![PostgreSQL Logo](https://www.vectorlogo.zone/logos/postgresql/postgresql-ar21.svg)

Este repositório contém uma API REST desenvolvida com Spring Boot para realizar operações CRUD (Create, Read, Update, Delete) em uma entidade de usuário. A API utiliza o banco de dados PostgreSQL para armazenar os dados dos usuários.

## Recursos e Tecnologias Utilizadas
- **Spring Boot:** Framework para criação de aplicativos Java.
- **Spring Framework:** Fornece suporte abrangente para o desenvolvimento de aplicativos Java.
- **Spring MVC:** Arquitetura de design de software que separa uma aplicação em três componentes principais: Model, View e Controller.
- **Spring Data JPA:** Biblioteca do Spring que simplifica o acesso a dados em bancos de dados relacionais.
- **Hibernate:** Framework de mapeamento objeto-relacional (ORM) para o Java.
- **PostgreSQL:** Banco de dados relacional de código aberto.
- **Lombok:** Biblioteca Java que ajuda a reduzir a verbosidade do código, gerando automaticamente métodos como getters, setters, construtores, etc.
- **Swagger:** Ferramenta para documentação de APIs.
## Funcionalidades
- CRUD de Usuários: A API permite criar, recuperar, atualizar e excluir usuários.
- Tratamento de Exceções: Implementação de tratamento de exceções para fornecer respostas claras e adequadas aos erros que ocorrem durante as operações da API.
- Documentação com Swagger: Utilização do Swagger para documentar a API, facilitando o entendimento dos endpoints, parâmetros e respostas disponíveis.
## Como Usar

1. **Clonar o Repositório:**


      git clone https://github.com/seu-usuario/nome-do-repositorio.git

      Configurar o Banco de Dados:

Certifique-se de ter o PostgreSQL instalado e configurado em sua máquina.
Atualize as configurações do banco de dados no arquivo application.properties.
Executar a Aplicação:

Execute a classe principal MyProjectWebApiApplication.java.
Testar a API:

Use uma ferramenta como Postman para interagir com a API.
Acessar a Documentação com Swagger:

Após iniciar a aplicação, acesse http://localhost:8080/swagger-ui.html para visualizar a documentação da API gerada pelo Swagger.
## Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request com melhorias, correções de bugs ou novos recursos.
