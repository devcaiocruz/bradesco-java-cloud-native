```md
# 🏦 Banco Digital com Java e Orientação a Objetos

Este projeto é uma implementação de um **Banco Digital** utilizando os princípios da **Programação Orientada a Objetos (POO)** em Java. Ele permite a criação de contas bancárias e operações básicas como **depósito, saque e transferência** entre contas da mesma instituição.

## 🎯 Funcionalidades

✅ Criação de **contas bancárias** (Corrente e Poupança).  
✅ Operações bancárias básicas:  
   - Depósito  
   - Saque  
   - Transferência entre contas  
✅ Exibição do extrato bancário.  

## 🛠️ Conceitos de POO Aplicados

- **Abstração**: Representação do domínio bancário com classes e objetos.  
- **Encapsulamento**: Proteção dos atributos e métodos para garantir segurança e organização.  
- **Herança**: Criação de tipos de conta (Corrente e Poupança) a partir de uma classe base.  
- **Polimorfismo**: Diferentes implementações para métodos comuns entre os tipos de conta.  

## 🏗️ Estrutura do Projeto

O projeto segue a seguinte estrutura de classes:

- `Banco` → Responsável por armazenar contas e gerenciar operações.  
- `Conta` → Classe base que define atributos e métodos gerais das contas bancárias.  
- `ContaCorrente` e `ContaPoupanca` → Extendem `Conta` e implementam comportamentos específicos.  
- `Cliente` → Representa os clientes do banco.  

## 📌 Como Executar o Projeto

### Pré-requisitos
- Java 11+ instalado  
- IDE como IntelliJ, Eclipse ou VS Code (opcional)  

### Passos

1. Clone o repositório:
   ```sh
   git clone https://github.com/seu-usuario/banco-digital.git
   ```
2. Acesse o diretório do projeto:
   ```sh
   cd banco-digital
   ```
3. Compile o código:
   ```sh
   javac BancoDigital.java
   ```
4. Execute o programa:
   ```sh
   java BancoDigital
   ```

## 🔗 Links Úteis

- [Projeto de Referência no GitHub](https://github.com/digitalinnovationone/banco-digital)

## 📜 Licença

Este projeto é aberto para estudo e aprimoramento.  

🚀 **Explore, aprenda e evolua no desenvolvimento Java!**
```