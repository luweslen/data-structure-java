package br.edu.ifpr.exercise2;

import br.edu.ifpr.exercise2.Exceptions.QueueEmptyException;
import br.edu.ifpr.exercise2.Exceptions.QueueFullException;


public class Queue {
    public static final int CAPACITY=1000;
    private int capacity;
    private Object elements[];
    private int front, rear, count;

    public Queue(int capacity){
        if (capacity > 0){
            this.capacity=capacity;
            elements=new Object[capacity];
        } else {
            this.capacity=CAPACITY;
            elements=new Object[CAPACITY];
        }
    }
    
    public Queue(){
        this(CAPACITY);
    }
    
    public boolean isEmpty(){
        return (count==0);
    }
    
    public boolean isFull(){
        return (count==capacity);
    }
    
    public void enqueue (Object o) throws QueueFullException {
        if (isFull())
            throw new QueueFullException();
        else
        {
            elements[rear] = o;
            rear = (rear+1) % capacity;
            count++;
        }
    }
    
    public Object dequeue () throws QueueEmptyException {
        if (isEmpty())
            throw new QueueEmptyException();
        else{
            Object temp;
            temp = elements[front];
            elements[front] = null;
            front = (front+1) % capacity;
            count--;
            return temp;
        }
    }
    
    public Object front () throws QueueEmptyException {
        if (isEmpty()){
            throw new QueueEmptyException();
        } else {
            return elements[front];
        }
    }
    
    public int size(){
        return (count);     
    }
}
