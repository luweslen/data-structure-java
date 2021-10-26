
package br.edu.ifpr.exercise3.Exceptions;

public class QueueEmptyException extends RuntimeException {
    public QueueEmptyException() {
        super("Underflow");
    }
}