## Sintaxe - Desafio

Vamos exercitar todo o conteúdo apresentado no módulo de Sintaxe codificando o seguinte cenário.

1. Crie o projeto `BankAccount` que receberá dados via terminal contendo as características de uma conta bancária de acordo com os atributos abaixo:
2. Dentro do projeto, crie a classe `ContaTerminal.java` para realizar toda a codificação do nosso programa.

###### Revisar regras de declaração de variáveis

| Atributo | Tipo | Exemplo   
| --------- | ---------| ------- 
| Número | Inteiro | 1021 
| Agência | Texto | 067-8
| Nome do Cliente | Texto | MARIO ANDRADE
| Saldo | Decimal | 237.48

###### Revisar terminal, argumentos main e a classe Scanner
2. Permitir que os dados sejam inseridos via terminal e o usuário receberá uma mensagem solicitando as informações, exemplo:

* Programa: “Por favor, digite o número da agência!”
* Usuário: 1021 *(então ENTER para o próximo campo)*

###### Revisar concatenação e a classe String com o método concat

3. Uma vez que todas as informações tenham sido inseridas, o sistema deve exibir a seguinte mensagem:

*"Olá [Nome do Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agência], conta [Número] e seu saldo [Saldo] já está disponível para saque.”*

Os campos em [ ] devem ser alterados pelas informações inseridas pelos usuários.

