
package br.edu.ifpr.exercise2.Exceptions;

public class QueueFullException extends RuntimeException {
    public QueueFullException (){
        super("Overflow");
    }
}