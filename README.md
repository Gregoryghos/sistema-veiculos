# Sistema de Gestão de Estoque de Veículos

## 📌 Descrição

Este projeto é um sistema de gestão de estoque de veículos desenvolvido em Java utilizando Spring Boot e MySQL.

O sistema permite realizar operações CRUD (Create, Read, Update e Delete) para o gerenciamento de veículos e marcas, além de disponibilizar filtros para consulta de informações específicas.

O projeto foi desenvolvido com foco na aplicação dos conceitos de Programação Orientada a Objetos (POO), API REST e persistência de dados.

---

## 🚀 Tecnologias Utilizadas

* Java
* Spring Boot
* Spring Data JPA
* MySQL
* Maven
* Postman
* Git e GitHub

---

## 📂 Estrutura do Projeto

```text
src
 └─ main
     ├─ java
     │   ├─ controller
     │   ├─ model
     │   ├─ repository
     │   └─ EstoqueveiculosApplication.java
     └─ resources
         └─ application.properties
```

---

## 🛠 Funcionalidades

### Marcas

* Cadastrar marca
* Listar marcas

### Veículos

* Cadastrar veículo
* Listar veículos
* Atualizar veículo
* Excluir veículo

### Filtros

* Buscar por modelo
* Buscar por ano
* Buscar por status
* Buscar por marca
* Buscar por preço

---

## 📋 Exemplo de Veículo

```json
{
  "modelo": "Corolla XEI",
  "ano": 2024,
  "cor": "Prata",
  "preco": 145000,
  "quilometragem": 10000,
  "status": "Disponivel",
  "marca": {
    "id": 1
  }
}
```

---

## 🔗 Endpoints Principais

### Marcas

GET /marcas

POST /marcas

### Veículos

GET /veiculos

POST /veiculos

PUT /veiculos/{id}

DELETE /veiculos/{id}

### Filtros

GET /veiculos/modelo/{modelo}

GET /veiculos/ano/{ano}

GET /veiculos/status/{status}

GET /veiculos/marca/{nome}

GET /veiculos/preco/{preco}

---

## ▶️ Como Executar

1. Clonar o repositório.
2. Criar um banco de dados MySQL chamado `estoque_veiculos`.
3. Configurar usuário e senha do banco no arquivo `application.properties`.
4. Executar a classe `EstoqueveiculosApplication`.
5. Utilizar o Postman para testar os endpoints.

---

## 👨‍💻 Autor

Gregory Rian Nunes Carvalho Dos Santos

Projeto acadêmico desenvolvido para estudo de Java, Spring Boot, MySQL e APIs REST.
