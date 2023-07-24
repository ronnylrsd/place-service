<h1 align="center">Place Service</h1>

<h3 align="center">Projeto - API de lugares com Spring Boot</h3>
<p align="center">
  <a href="#-projeto">Projeto</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-tecnologias">Tecnologias</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-práticas">Práticas Adotadas</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#%EF%B8%8F-ambiente">Ambiente</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-como-executar">Como executar</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-colaborador">Colaborador</a>
</p>

<br>

## 💻 Projeto

Projeto Java utilizando o Spring Boot, criando uma API de lugares utilizando um banco de dados, campos de entidade de lugar (name, slug, state, createdAt, updatedAt), CRUD de lugares e um adicional de testes automatizados

## ✨ Tecnologias

Esse projeto foi desenvolvido com as seguintes tecnologias:

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Webflux](https://spring.io/guides/gs/serving-web-content/)
- [Spring Data](https://spring.io/projects/spring-data)
- [R2DBC](https://spring.io/projects/spring-data-r2dbc)

## 👨‍🏫 Práticas Adotadas

Esse projeto foi desenvolvido segundo essas práticas:

- SOLID
- Testes automatizados
- Consultas com filtros dinâmicos usando o Query By Example
- API reativa na web e na camada de banco
- Uso de DTOs para a API
- Injeção de Dependências
- Geração automática do Swagger com a OpenAPI 3
- Geração de slugs automática com o Slugify
- Auditoria sobre criação e atualização da entidade

## ⚙️ Ambiente
Preparar o seu ambiente Java para projetos na sua máquina.

3 ferramentas principais, para baixar:
- **Java SDK**
- **Visual Studio Code**
- **Spring Boot**, pode ser instalado diretamento no vscode, aconselho também instalar o **delux package do java**

## 🚀 Como executar

- Clone o repositório
- Constuir o projeto:
```java
 $ ./mvnw clean package
```
- Executar aplicação:
```java
$ java -jar target/todolist-0.0.1-SNAPSHOT.jar
```

A API poderá ser acessada em [localhost:8080].

### API Endpoints
Para fazer as requisições HTTP abaixo, você pode usar o [httpie](https://httpie.org/), [Postman](https://www.postman.com/) ou [Insomnia](https://insomnia.rest/).

- POST "/places"
```java
http POST :8080/places name="Place" state="State"

HTTP/1.1 200 OK
Content-Length: 129
Content-Type: application/json

{
    "createdAt": "2023-07-24T15:10:05.000+00:00",
    "name": "Place",
    "slug": "place",
    "state": "State",
    "updatedAt": "2023-07-24T15:10:05.000+00:00"
}
```

## 👷 COLABORADOR

#### Nome: Ronny Lima Ribeiro da Silva
- Registro do Aluno (RA): 00000009775
- LinkedIn: [ronnylrsd](https://www.linkedin.com/in/ronnylrsd/)
- GitHub: [ronnylrsd](https://github.com/ronnylrsd)


---

Projeto desenvolvido a partir de aulas do Youtube

