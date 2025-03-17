package exceptions;

public class ParametersInvalidException extends Exception{
    public ParametersInvalidException() {
        super("The second parameter must be greater than the first");
    }
}
