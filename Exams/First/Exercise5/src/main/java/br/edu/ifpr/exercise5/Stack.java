package br.edu.ifpr.exercise5;

import br.edu.ifpr.exercise5.Exceptions.StackEmptyException;
import br.edu.ifpr.exercise5.Exceptions.StackFullException;

public class Stack {
    public static final int CAPACITY = 1000;
    private int capacity;
    private Object elements[];
    private int top = -1;

    public Stack(int capacity){
        if (capacity > 0){
            this.capacity = capacity;
            elements = new Object[capacity];
        } else {
            this.capacity = CAPACITY;
            elements = new Object[CAPACITY];
        }
    }
    
    public Stack(){
        this(CAPACITY);
    }
    
    public boolean isEmpty(){
        return (top < 0);
    }
    
    public boolean isFull(){
        return (top == capacity - 1);      
    }
    
    public void push(Object o) throws StackFullException {
        if (isFull()){
            throw new StackFullException("Stack Overflow!");
        }
        else {
            top++;
            elements[top] = o;
        }
    }
    
    public void pushAll (Object all[]) throws StackFullException {
        if((this.size() + all.length) > this.capacity){
            throw new StackFullException("Stack Overflow!");
        }
        
        for(Object item : all) {
            this.push(item);
        }
    }
    
    public Object pop() throws StackEmptyException {
        Object elem;
        if (isEmpty()){
            throw new StackEmptyException("Stack Underflow!");
        }
        else {
            elem = elements[top];
            elements[top] = null;
            top--;
            return (elem);
        }
    }
    
    public Object[] popN (int n) throws StackEmptyException {
        if((this.size() - n) > this.capacity){
            throw new StackEmptyException("Stack Underflow!");
        }
        
        Object removedItems[] = new Object[n];
        
        for(int i = 0; i < n; i++) {
            Object item = this.pop();
            
            removedItems[i] = item;
        }
        
        return removedItems;
    }
    
    public Object top() throws StackEmptyException {
        if (isEmpty()){
            throw new StackEmptyException("Stack Underflow!");
        }
        else {
            return (elements[top]);
        }
    }
    
    public int size(){
        return (top + 1);
    };

    public Object[] getElements() {
        return elements;
    }
    
    @Override
    public String toString(){
        String string = "[";
        for (int i = 0; i < this.capacity; i++){
            Object element = this.elements[i];
            
            if(element != null){
                string += element + ",";
            }
        }
        string =  string.substring(0, string.length() - 1);
        string += "]";
        return string;
    }
}
