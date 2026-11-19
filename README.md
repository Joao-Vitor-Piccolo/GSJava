# SentinelaDengue

API REST em Spring Boot para o cadastro de moradores, relatos de foco e leituras de sentinela. A conexão é feita com o Oracle da FIAP via JDBC.

## Requisitos

- Java 21
- Maven
- Acesso ao banco Oracle da FIAP
- Script `script.sql` executado uma vez no schema da FIAP

## Como rodar

Na raiz do projeto:

```bash
mvn spring-boot:run
```

A API sobe em `http://localhost:8080`.

Se a porta 8080 já estiver ocupada:

```bash
mvn spring-boot:run -Dspring-boot.run.arguments=--server.port=8081
```

Para só compilar:

```bash
mvn -DskipTests compile
```

## Deploy

O `Dockerfile` está pronto para o Render. O processo escuta a variável `PORT`.

Link do GitHub: (preencher)

Link do deploy: (preencher)

## Endpoints

| Recurso | Método | URL |
| --- | --- | --- |
| Morador | GET, POST | http://localhost:8080/morador |
| Morador | GET, DELETE | http://localhost:8080/morador/{id} |
| Morador | PUT | http://localhost:8080/morador |
| Relato | GET, POST | http://localhost:8080/relato |
| Relato | GET, DELETE | http://localhost:8080/relato/{id} |
| Relato | PUT | http://localhost:8080/relato |
| Relato | PUT | http://localhost:8080/relato/{id}/confirmar |
| Relato | PUT | http://localhost:8080/relato/{id}/descartar |
| Leitura | GET, POST | http://localhost:8080/leitura |
| Leitura | GET, DELETE | http://localhost:8080/leitura/{id} |
| Leitura | PUT | http://localhost:8080/leitura |

Exemplo de cadastro de morador:

```bash
curl -X POST http://localhost:8080/morador \
  -H "Content-Type: application/json" \
  -d '{"nome":"Camila","telefone":"11999999999","rua":"Rua das Flores","numero":"120","quarteirao":"Q1"}'
```

## Integrantes

- João Vitor Piccolo | RM 565127
- Gabrielle Calazans | RM 564460
- Jéssica Domingues | RM 562973
- Kauã Carvalho de Oliveira | RM 566371
- Leonardo Pereira | RM 561349
