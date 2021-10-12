package br.edu.ifpr.stackfloat;

import br.edu.ifpr.stackfloat.Exceptions.StackEmptyException;
import br.edu.ifpr.stackfloat.Exceptions.StackFullException;

public class StackFloat {
    public static final int CAPACITY = 1000;
    private int capacity;
    private float elements[];
    private int top = -1;

    public StackFloat(int capacity){
        if (capacity>0){
            this.capacity=capacity;
            elements = new float[capacity];
        } else {
            this.capacity = CAPACITY;
            elements = new float[CAPACITY];
        }
        
        for (int i = 0; i < this.capacity; i++){
            this.elements[i] = -1;
        }
    }
    
    public StackFloat(){
        this(CAPACITY);
    }
    
    public boolean isEmpty(){
        return (top < 0);
    }
    
    public boolean isFull(){
        return (top == capacity - 1);      
    }
    
    public void push(float o) throws StackFullException {
        if (isFull()){
            throw new StackFullException("Stack Overflow!");
        }
        else {
            top++;
            elements[top] = o;
        }
    }
    
    public float pop() throws StackEmptyException {
        float elem;
        if (isEmpty()){
            throw new StackEmptyException("Stack Underflow!");
        }
        else {
            elem = elements[top];
            elements[top] = -1;
            top--;
            return (elem);
        }
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

    @Override
    public String toString(){
        String string = "";
        for (int i = 0; i < this.capacity; i++){
            float element = this.elements[i];
            
            if(element != -1.00){
                string += element + " - ";
            }
        }
        string =  string.substring(0, string.length() - 2);
        string += " (topo)";
        return string;
    }
}
