Prisma migrations (schema) para o projeto Gerenciador de Estoque

Este diretório contém o `schema.prisma` usado para criar as tabelas `Usuario` e `Produto` em um banco Postgres.

Passos rápidos:

1) Instale Node.js (>=16) e inicialize um projeto Node se necessário:

   npm init -y

2) Instale dependências do Prisma (no diretório do projeto onde for rodar o CLI):

   npm install prisma --save-dev @prisma/client

3) Configure a variável de ambiente `DATABASE_URL` no arquivo `.env` abaixo (ou no ambiente):

   # Exemplo
   # DATABASE_URL="postgresql://postgres:senha@localhost:5432/gerenciador_estoque?schema=public"

4) Rode as migrations apontando para este schema (use o --schema para informar o caminho):

   npx prisma migrate dev --schema=src/main/resources/db_migration/prisma/schema.prisma --name init

Observações:
- O arquivo `schema.prisma` foi criado com base nas classes Java `Usuario` e `Produto`.
- Por padrão, o Prisma procura `schema.prisma` na raiz `prisma/`. Aqui usamos um caminho diferente, por isso o `--schema` ao executar comandos.
- Se preferir, mova esse diretório para um diretório `prisma/` na raiz do repositório para usar comandos sem `--schema`.
