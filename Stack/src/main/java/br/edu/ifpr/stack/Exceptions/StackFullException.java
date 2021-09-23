package br.edu.ifpr.stack.Exceptions;



public class StackFullException extends Exception {

    public StackFullException(String stack_Overflow) {
        super(stack_Overflow);
    }
    
}
