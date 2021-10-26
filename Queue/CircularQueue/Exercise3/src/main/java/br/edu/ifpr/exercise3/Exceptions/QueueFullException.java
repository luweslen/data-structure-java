
package br.edu.ifpr.exercise3.Exceptions;

public class QueueFullException extends RuntimeException {
    public QueueFullException (){
        super("Overflow");
    }
}