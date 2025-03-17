# DIO - Basic Java Track
www.dio.me

#### Authors
- Gleyson Sampaio](https://github.com/glysns)

## Flow Control - Challenge

Let's practice all the content presented in the Flow Control module by coding the following scenario.

The system should receive two parameters via the terminal that represent two integers. With these two numbers, you should obtain the number of interactions (for) and print the incremented numbers on the console (System.out.print), for example:

* If you pass the numbers 12 and 30, then we will have an interaction (for) with 18 occurrences to print the numbers, example: `“Printing the number 1”`, `“Printing the number 2”` and so on.
* If the first parameter is GREATER than the second parameter, you must throw the customized exception called `ParametersInvalidException` with the second message: “The second parameter must be greater than the first”.


1. Create the `FlowControlChallenge` project
2. Inside the project, create the class `Counter.java` to do all the coding for our program.
3. Within the project, create the class `ParametersInvalidException` which will represent the business exception in the system.

Below is a code snippet which you can follow by changing the parts containing `??`

```java
public class Counter {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Enter the first parameter");
		int parameterOne = terminal.??;
		System.out.println("Enter the second parameter");
		int parameterTwo = terminal.??;
		
		try {
			//calling the method containing the counting logic
			count(parameterOne, parameterTwo);
		
		}catch (? exception) {
			//print the message: The second parameter must be greater than the first parameter
		}
		
	}
	static void count(int parameterOne, int parameterTwo ) throws ParametersInvalidException {
		// check if parameterOne is GREATER than parameterTwo and throw the exception
		
		int count = parameterTwo - parameterOne;
		//perform the for to print the numbers based on the count variable
	}
}
```
