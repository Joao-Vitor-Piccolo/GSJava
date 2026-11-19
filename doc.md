# Global Solution 2026.2 — CitizenTech

## 1. Conceito da atividade

Implementar em Java uma capacidade central da **CitizenTech**, representando o domínio do problema em uma aplicação organizada, extensível e estruturada.

## 2. Objetivo

Considerando o tema proposto para a Global Solution 2026 — 2º semestre, desenvolver uma **API RESTful utilizando o framework Spring Boot**, com integração ao banco de dados Oracle disponibilizado pela FIAP para armazenamento e interação com as informações da aplicação.

---

# 3. Entregáveis

## 3.1. Documentação — 30 pontos

A documentação deverá ser entregue em **um único arquivo PDF**, contemplando os seguintes itens:

### 3.1.1. Especificação do projeto — 5 pontos

O documento deverá conter:

- Capa com:
  - Nome do projeto;
  - Nome completo dos integrantes;
  - RM dos integrantes.
- Página com índice;
- Descritivo da solução;
- Justificativa do projeto;
- Objetivos do projeto.

**Observação:** A organização e a estruturação do documento também serão consideradas na avaliação.

### 3.1.2. Diagrama de Classes — 10 pontos

- Diagrama de classes que represente fielmente a implementação do código Java.

### 3.1.3. Protótipos, requisições e DER — 10 pontos

A documentação deverá apresentar:

**Protótipos de tela**

- Protótipos das telas envolvidas na aplicação Front-end.

**Endpoints da API**

- Tabela contendo os endpoints implementados;
- Descrição das funcionalidades;
- Métodos HTTP correspondentes:
  - `GET`
  - `POST`
  - `PUT`
  - `DELETE`
- Exemplos das respectivas requisições HTTP.

**Diagrama Entidade-Relacionamento (DER)**

- Representação das tabelas do banco de dados;
- Relacionamentos entre as entidades;
- Estrutura de armazenamento das informações.

### 3.1.4. Instruções de execução — 5 pontos

A documentação deverá apresentar instruções claras para executar o projeto, incluindo:

**Ferramentas utilizadas**

- IDE (ex.: IntelliJ IDEA);
- Ferramentas auxiliares necessárias.

**Versões necessárias**

- Java JDK 21 (ou versão definida para o projeto);
- Banco de dados Oracle;
- Spring Boot e demais dependências necessárias.

**Links**

- Link do repositório GitHub;
- Link do deploy da aplicação.

**Execução**

- Passo a passo para executar o projeto;
- Configurações necessárias;
- Variáveis de ambiente;
- Demais informações relevantes para inicialização da aplicação.

---

# 4. Parte Técnica — 70 pontos

O projeto deverá contemplar os seguintes requisitos:

## 4.1. Camada Model — 10 pontos

- Implementação de todas as classes necessárias para representar o domínio da aplicação;
- Classes compatíveis com a estrutura do banco de dados;
- Utilização do servidor Oracle disponibilizado pela FIAP.

## 4.2. Camadas DAO e BO — 10 pontos

- Implementação da camada DAO (_Data Access Object_);
- Implementação da camada BO (_Business Object_);
- Separação adequada entre acesso aos dados e regras de negócio.

## 4.3. Camada Controller — 10 pontos

Implementação dos endpoints REST da aplicação, contemplando os métodos HTTP:

- `GET` — Consulta de informações;
- `POST` — Criação de registros;
- `PUT` — Atualização de registros;
- `DELETE` — Remoção de registros.

## 4.4. Tratamento de exceções — 10 pontos

- Implementação de uma camada de tratamento de exceções;
- Tratamento adequado dos erros da aplicação;
- Retorno de respostas HTTP apropriadas para cada situação.

## 4.5. Deploy da aplicação — 30 pontos

- Realizar o deploy da aplicação em um servidor de aplicação;
- Utilizar obrigatoriamente a plataforma **Render.com**.

## 4.6. Observação

A implementação deverá seguir os padrões, as orientações e as estruturas apresentados e desenvolvidos durante as aulas.

---

# 5. Formato e entrega

A entrega deverá ser realizada por meio do **Portal do Aluno**, através do envio de um arquivo compactado no formato `.zip`.

O arquivo deverá conter:

- Documento PDF com toda a documentação do projeto;
- Link do projeto hospedado no GitHub;
- Link do deploy da aplicação.

### 5.1. Atenção aos commits

**Commits realizados após a data de entrega da Global Solution não serão aceitos.**

Caso sejam identificados commits posteriores ao prazo de entrega, a nota da parte técnica será zerada integralmente.

É responsabilidade da equipe garantir que o repositório esteja atualizado e que todos os commits necessários tenham sido realizados antes do prazo final.

### 5.2. Prazo de entrega

Ficar atento à data e ao horário máximo de entrega estabelecidos no Portal do Aluno.

---

# 6. Resumo da avaliação

| Categoria    | Critério                    |      Pontuação |
| ------------ | --------------------------- | -------------: |
| Documentação | Especificação do projeto    |              5 |
| Documentação | Diagrama de Classes         |             10 |
| Documentação | Protótipos, endpoints e DER |             10 |
| Documentação | Instruções de execução      |              5 |
| Técnica      | Camada Model                |             10 |
| Técnica      | Camadas DAO e BO            |             10 |
| Técnica      | Camada Controller           |             10 |
| Técnica      | Tratamento de exceções      |             10 |
| Técnica      | Deploy no Render            |             30 |
| **Total**    |                             | **100 pontos** |

---

# 7. Checklist de entrega

## Documentação

- [ ] Capa com nome do projeto e integrantes;
- [ ] Nome completo e RM de todos os integrantes;
- [ ] Índice;
- [ ] Descritivo da solução;
- [ ] Justificativa e objetivos;
- [ ] Diagrama de Classes;
- [ ] Protótipos das telas;
- [ ] Tabela de endpoints e requisições HTTP;
- [ ] Diagrama Entidade-Relacionamento (DER);
- [ ] Instruções de execução;
- [ ] Ferramentas e versões utilizadas;
- [ ] Link do GitHub;
- [ ] Link do deploy;
- [ ] Exportação da documentação em um único PDF.

## Implementação técnica

- [ ] API REST desenvolvida em Java com Spring Boot;
- [ ] Integração com banco de dados Oracle da FIAP;
- [ ] Camada Model;
- [ ] Camada DAO;
- [ ] Camada BO;
- [ ] Camada Controller;
- [ ] Endpoints GET;
- [ ] Endpoints POST;
- [ ] Endpoints PUT;
- [ ] Endpoints DELETE;
- [ ] Tratamento de exceções;
- [ ] Deploy realizado no Render.com.

## Entrega final

- [ ] Repositório GitHub atualizado;
- [ ] Todos os commits realizados antes do prazo;
- [ ] Aplicação publicada e acessível;
- [ ] Documentação em PDF;
- [ ] Arquivo ZIP contendo os entregáveis;
- [ ] Envio realizado pelo Portal do Aluno dentro do prazo.

---

**FIAP — Global Solution 2026.2**

**CitizenTech | Engenharia de Software | LINs | Paulista**
