package br.edu.ifpr.stack.Exceptions;




public class StackEmptyException extends Exception {

    public StackEmptyException(String stack_Underflow) {
        super(stack_Underflow);
    }
    
}
