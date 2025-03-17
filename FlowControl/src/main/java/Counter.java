import exceptions.ParametersInvalidException;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Enter the first parameter");
        int parameterOne = terminal.nextInt();
        System.out.println("Enter the second parameter");
        int parameterTwo = terminal.nextInt();

        try {
            //calling the method containing the counting logic
            count(parameterOne, parameterTwo);

        }catch (ParametersInvalidException exception) {
            //print the message: The second parameter must be greater than the first parameter
            System.out.println(exception.getMessage());
        }

    }
    static void count(int parameterOne, int parameterTwo ) throws ParametersInvalidException {
        // check if parameterOne is GREATER than parameterTwo and throw the exception
        if(parameterOne > parameterTwo) {
            throw new ParametersInvalidException();
        }

        int count = parameterTwo - parameterOne;
        //perform the for to print the numbers based on the count variable
        for (int i = 1; i <= count; i++) {
            System.out.println("Printing the number " + i);
        }
    }
}