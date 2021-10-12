package br.edu.ifpr.stackfloat.Exceptions;

public class StackFullException extends RuntimeException {

    public StackFullException(String stackOverflow) {
        super(stackOverflow);
    }
    
}

