package br.edu.ifpr.exercise5.Exceptions;

public class StackEmptyException extends RuntimeException {
    public StackEmptyException(String stackUnderflow) {
        super(stackUnderflow);
    }
}