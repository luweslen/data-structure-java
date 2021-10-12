package br.edu.ifpr.stack.Exceptions;

public class StackEmptyException extends RuntimeException {
    public StackEmptyException(String stackUnderflow) {
        super(stackUnderflow);
    }
}
