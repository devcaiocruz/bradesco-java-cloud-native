## Controle de Fluxo - Desafio

Vamos praticar todo o conteúdo apresentado no módulo de Controle de Fluxo codificando o seguinte cenário.

O sistema deve receber dois parâmetros via terminal que representam dois números inteiros. Com esses dois números, você deve obter o número de interações (for) e imprimir os números incrementados no console (System.out.print), por exemplo:

* Se você passar os números 12 e 30, então teremos uma interação (for) com 18 ocorrências para imprimir os números, exemplo: `“Imprimindo o número 1”`, `“Imprimindo o número 2”` e assim por diante.
* Se o primeiro parâmetro for MAIOR que o segundo parâmetro, você deve lançar a exceção personalizada chamada `ParametersInvalidException` com a mensagem: “O segundo parâmetro deve ser maior que o primeiro”.

1. Crie o projeto `FlowControlChallenge`
2. Dentro do projeto, crie a classe `Counter.java` para fazer toda a codificação do nosso programa.
3. Dentro do projeto, crie a classe `ParametersInvalidException` que representará a exceção de negócio no sistema.

Abaixo está um trecho de código que você pode seguir alterando as partes contendo `??`

```java
public class Counter {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parameterOne = terminal.??;
		System.out.println("Digite o segundo parâmetro");
		int parameterTwo = terminal.??;
		
		try {
			//chamando o método que contém a lógica de contagem
			count(parameterOne, parameterTwo);
		
		}catch (? exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro parâmetro
		}
		
	}
	static void count(int parameterOne, int parameterTwo ) throws ParametersInvalidException {
		// verificar se parameterOne é MAIOR que parameterTwo e lançar a exceção
		
		int count = parameterTwo - parameterOne;
		//realizar o for para imprimir os números com base na variável count
	}
}
```
