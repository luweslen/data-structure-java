package br.edu.ifpr.stack.Exceptions;

public class StackFullException extends RuntimeException {

    public StackFullException(String stackOverflow) {
        super(stackOverflow);
    }
    
}
