# JDBC Connection Project

![java](https://img.icons8.com/?size=100&id=13679&format=png&color=000000)
![docker](https://img.icons8.com/?size=100&id=cdYUlRaag9G9&format=png&color=000000)
![postgres](https://img.icons8.com/?size=100&id=LwQEs9KnDgIo&format=png&color=000000)

Este é um projeto simples criado com a **IDE IntelliJ** e desenvolvido utilizando **Java 8, Docker (com uma imagem do PostgreSQL) e biblioteca JDBC PostgreSQL.**

Este projeto é um exemplo de como estabelecer uma conexão com um Banco de Dados utilizando a biblioteca **JDBC** em **Java.**
Neste caso, será utilizado o **PostgreSQL**, mas o código pode ser facilmente adaptado para trabalhar
com qualquer outro sistema de Banco de Dados.

# Artigo do Projeto publicado na Medium
https://medium.com/@williannvieira.w/conexão-jdbc-java-8-7a3312ca543d

## Downloads

### Downloads Necessários para o Projeto
- [x] Java 8 (JDK 8) -> https://www.oracle.com/java/technologies/downloads/#java8
- [x] Driver JDBC PostgreSQL -> https://jdbc.postgresql.org/
- [x] Docker -> https://www.docker.com/products/docker-desktop/

## Instalação

1. Clone o repositório:
```bash
  git clone https://github.com/willian-vieira/jdbc-connection
```
2. Ao clonar o projeto o Driver JDBC já virá no projeto. Se o arquivo não estiver presente, adicione-o às dependências do projeto (Libs).


3. Após clonar o projeto, abra o terminal e utilize o seguinte comando para baixar a imagem Docker do PosgreSQL:
```bash
  docker pull postgres
```

4. Após baixar a imagem, utilize o seguinte comando para criar e rodar um Contêiner com o PostgreSQL:
```bash
  docker docker run -p 5432:5432 -e POSTGRES_PASSWORD=postgres postgres
```