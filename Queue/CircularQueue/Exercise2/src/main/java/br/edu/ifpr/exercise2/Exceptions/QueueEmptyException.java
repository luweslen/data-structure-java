
package br.edu.ifpr.exercise2.Exceptions;

public class QueueEmptyException extends RuntimeException {
    public QueueEmptyException() {
        super("Underflow");
    }
}