# ConsultaSPC - Webservice de Consulta ao SPC

![Java](https://img.shields.io/badge/Java-1.8+-blue.svg)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.5.2-brightgreen.svg)
![Maven](https://img.shields.io/badge/Maven-Build-orange.svg)

---

## ✨ Visão Geral

O **ConsultaSPC** é um webservice RESTful desenvolvido em Java com Spring Boot, responsável por realizar consultas ao SPC/Boa Vista, retornando informações essenciais de crédito para pessoas físicas e jurídicas. O serviço expõe endpoints para consulta de risco e informações essenciais, retornando respostas padronizadas e tratamento robusto de erros.

---

## 🚀 Tecnologias Utilizadas

- Java 8+
- Spring Boot 2.5.2
- Maven
- Swagger 2 (Springfox)
- Lombok
- Spring Data JPA (não obrigatório para uso, mas presente)
- HikariCP
- Spring Boot Actuator

---

## ⚙️ Instalação e Execução

### Pré-requisitos

- Java 8 ou superior
- Maven 3.6+
- Acesso à internet para dependências Maven

### Passos

```bash
# Clone o repositório
git clone <url-do-repo>
cd consultaspc

# Configure o arquivo de parâmetros (consultaspc.conf) conforme necessário
# Exemplo de conteúdo:
PASTALOG = /log/ConsultaSPC
URLACERTA= https://acerta.bvsnet.com.br/FamiliaAcertaPFXmlWeb/essencial/v3
URLDEFINE= https://define.bvsnet.com.br/DefineXml/servicos/defineRisco/v5
USRBOAVIS= <usuario>
PWRBOAVIS= <senha>

# Build do projeto
mvn clean package

# Execute a aplicação
java -jar target/consultaspc.jar
```

A aplicação estará disponível em:  
`http://localhost:8080/consultaspc`

---

## 🔗 Endpoints Disponíveis

### 1. Consulta Define Risco

- **GET** `/consultaspc/define-risco`
- **Parâmetros (query ou body):**
  - `cnpj` (string, obrigatório): Número do CNPJ

**Exemplo de Request:**
```json
{
  "cnpj": "99999999999999"
}
```

### 2. Consulta Acerta Essencial

- **GET** `/consultaspc/acerta-essencial`
- **Parâmetros (query ou body):**
  - `cpf` (string, obrigatório): Número do CPF

**Exemplo de Request:**
```json
{
  "cpf": "99999999999"
}
```

---

## 📦 Estrutura dos DTOs

### Entrada

#### AcertaEssencialInputDto

| Campo | Tipo   | Obrigatório | Exemplo         | Descrição         |
|-------|--------|-------------|-----------------|-------------------|
| cpf   | String | Sim         | 99999999999     | Número do CPF     |

#### DefineRiscoInputDto

| Campo | Tipo   | Obrigatório | Exemplo           | Descrição         |
|-------|--------|-------------|-------------------|-------------------|
| cnpj  | String | Sim         | 99999999999999    | Número do CNPJ    |

### Saída

#### RespostaOutputDto

| Campo      | Tipo   | Exemplo                        | Descrição                                 |
|------------|--------|--------------------------------|-------------------------------------------|
| protocolo  | String | 20220203092518.445.17276       | Protocolo de atendimento                  |
| resposta   | String | `<xml>...</xml>`               | Resposta da consulta (XML)                |
| essencial  | Object | -                              | Objeto com resposta detalhada (opcional)  |

---

## ❗ Tratamento de Erros

A API retorna erros padronizados no formato:

```json
{
  "status": 400,
  "timestamp": "2024-06-01T12:00:00Z",
  "type": "https://consultaspc.com.br/dados-invalidos",
  "title": "Dados inválidos",
  "detail": "Um ou mais campos estão inválidos.",
  "userMessage": "Um ou mais campos estão inválidos. Faça o preenchimento correto e tente novamente.",
  "objects": [
    {
      "name": "cpf",
      "userMessage": "O documento é obrigatório"
    }
  ]
}
```

Principais tipos de erro:
- 400: Erro de validação ou negócio
- 403: Acesso negado
- 404: Recurso não encontrado
- 500: Erro interno

---

## 🛠️ Configurações Importantes

- **Arquivo `consultaspc.conf`**: Parâmetros de integração com o serviço Boa Vista (URLs, usuário, senha, pasta de log).
- **Arquivo `application.properties`**: Configurações Spring Boot (porta, contexto, actuator, etc).

---

## 🔒 CORS

O CORS está habilitado para todas as origens, métodos e headers, permitindo integração com qualquer frontend.

---

## 📑 Documentação Swagger

Acesse a documentação interativa em:  
`http://localhost:8080/consultaspc/swagger-ui.html`

---

## 👨‍💻 Contribuição

Pull requests são bem-vindos! Para maiores informações, consulte o arquivo [CONTRIBUTING.md] (caso exista).

---

## 📄 Licença

Este projeto está sob a licença MIT.