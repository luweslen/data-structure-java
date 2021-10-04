package br.edu.ifpr.stackfloat.Exceptions;


public class StackEmptyException extends RuntimeException {
    public StackEmptyException(String stackUnderflow) {
        super(stackUnderflow);
    }
}
