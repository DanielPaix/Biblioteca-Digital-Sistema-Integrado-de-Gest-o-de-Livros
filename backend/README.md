Biblioteca Digital
Descrição:
Projeto simples de uma aplicação backend para gerenciamento de livros em uma biblioteca digital. Desenvolvido com Spring Boot 3.0.6, Java 17, utilizando banco de dados.

Funcionalidades
CRUD completo para livros:

Listar todos os livros (GET /livros)

Buscar livro por ID (GET /livros/{id})

Adicionar novo livro (POST /livros)

Atualizar livro existente (PUT /livros/{id})

Deletar livro (DELETE /livros/{id})

Configuração CORS para permitir requisições de frontend em http://127.0.0.1:5500

Interface simples em HTML estática servida via src/main/resources/static

Tecnologias Utilizadas
Java 17

Spring Boot 3.0.6

Spring Data JPA

Banco H2 (in-memory, para facilitar testes e desenvolvimento)

Maven para gerenciamento de dependências e build

HTML/JS para interface frontend simples

Como Rodar
Clone o repositório e acesse a pasta backend:

bash
Copiar
Editar
git clone <url-do-repo>
cd backend
Execute o backend com Maven:

bash
Copiar
Editar
mvn spring-boot:run
O backend estará rodando na porta 8080 (http://localhost:8080)

Abra o arquivo index.html no navegador (exemplo: via Live Server na porta 5500) para acessar a interface.

Configuração do Banco
Banco H2 configurado em application.properties (modo in-memory)

spring.jpa.hibernate.ddl-auto=update para criação automática da tabela Book

Configuração para facilitar desenvolvimento local, sem necessidade de banco externo

