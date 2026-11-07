# UniBiblio — Back-End (API REST)

API RESTful desenvolvida em **Spring Boot** com **Java 21**, responsável pela gestão da biblioteca (livros, alunos, empréstimos e acervo). Este repositório contém apenas a lógica de negócio e os serviços da camada back-end.

---

## Tecnologias Utilizadas

* **Linguagem:** Java 21
* **Framework:** Spring Boot 4.x
* **Persistência:** Spring Data JPA / Hibernate
* **Bancos de Dados:**
  * **H2 Database:** Banco em memória utilizado para testes rápidos em desenvolvimento local.
  * **MySQL 8.0:** Banco relacional utilizado no ambiente containerizado.
* **Gerenciador de Dependências:** Maven

---

## Pré-requisitos

Para rodar o projeto localmente de forma isolada, você precisará apenas de:
* **JDK 21** (ou `mvnw` embutido)
* **Git**

*(Caso deseje executar o projeto integrado ao Front-End e ao MySQL via Docker, consulte o repositório de infraestrutura `ADS_Equipe2_Biblioteca_Infra`).*

---

## Como Executar o Back-End

Existem duas maneiras de executar a aplicação:

### Opção 1: Desenvolvimento Local Rápido (H2 em Memória)

Nesta opção, você não precisa subir contêineres Docker nem ter o MySQL instalado na máquina. O Spring Boot utilizará o banco **H2 em memória**.

1. **Clone o repositório:**
   ```bash
   git clone [https://github.com/SEU_USUARIO/ADS_Equipe2_Biblioteca_Back.git](https://github.com/SEU_USUARIO/ADS_Equipe2_Biblioteca_Back.git)
   cd ADS_Equipe2_Biblioteca_Back

  rode o comando
   ./mvnw spring-boot:run

   E pronto você tem o Springboot solo rodando

## Opção 2 Rodar tudo e puxar pelo Docker (Mais que recomendo)

Para rodar o projeto de forma integrada aos outros repositórios, vá para [ADS_Equipe2_Biblioteca_Infra](https://github.com/SEU_USUARIO/ADS_Equipe2_Biblioteca_Infra)
