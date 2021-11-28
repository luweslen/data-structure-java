package br.edu.ifpr.exercise3;

public class StackEmptyException extends RuntimeException {
    public StackEmptyException(String stackUnderflow) {
        super(stackUnderflow);
    }
}