# Gestão de Vagas

Este é um projeto desenvolvido focado na construção de uma API para gestão de vagas utilizando Java e Spring Boot.

## 🛠 Tecnologias Utilizadas

-   Java 17
-   Spring Boot 3
-   Spring Data JPA
-   PostgreSQL
-   Docker
-   Flyway (Migration)
-   Spring Security (JWT Authentication)
-   JUnit & Mockito (Testes automatizados)
-   Swagger (Documentação)

## 🚀 Funcionalidades

-   Autenticação e autorização com JWT
-   Cadastro, edição e remoção de empresas
-   Cadastro, edição e remoção de vagas
-   Associação de candidatos às vagas
-   Persistência de dados com PostgreSQL

## 📦 Instalação e Execução

### Pré-requisitos

-   Docker Compose instalado
-   Java 17+
-   Maven 3+

### Passos para rodar o projeto

1. Clone o repositório:

```sh
  git clone https://github.com/tiagogb21/gestao_eventos
  cd ignite-java-gestao-vagas
```

2. Suba o banco de dados com Docker Compose:

```sh
  docker-compose up -d
```

3. Configure o banco de dados no arquivo `application.properties` ou `application.yml`.

4. Execute a aplicação:

```sh
  ./mvnw spring-boot:run
```

A API estará disponível em `http://localhost:8080`.

## 📖 Documentação da API

A documentação da API pode ser acessada via Swagger após iniciar a aplicação:

-   `http://localhost:8080/swagger-ui.html`

## ✅ Testes

Para rodar os testes automatizados, execute:

```sh
  ./mvnw test
```
