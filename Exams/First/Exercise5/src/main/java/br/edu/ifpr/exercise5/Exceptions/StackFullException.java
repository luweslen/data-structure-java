package br.edu.ifpr.exercise5.Exceptions;

public class StackFullException extends RuntimeException {
    public StackFullException(String stackOverflow) {
        super(stackOverflow);
    }
}