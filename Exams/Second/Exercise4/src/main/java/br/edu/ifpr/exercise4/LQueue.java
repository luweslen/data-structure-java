package br.edu.ifpr.exercise4;

public class LQueue {
    private Node front,rear;
    private int size;

    public boolean isEmpty(){ return this.size == 0; }
    
    public int size(){ return this.size; }
    
    public void enqueue(Object element){
        Node n = new Node();
        n.setElement(element);
        
        if(this.size == 0) {
            this.front = n;
            this.rear = n;
        }

        this.rear.setNext(n);
        this.rear = n;

        size++;
    }
    
    public Object dequeue () throws QueueEmptyException {
        if(this.size == 0){
            throw new QueueEmptyException("Queue underflow!");
        }
        
        Object temp = this.front.getElement();
        
        this.front = this.front.getNext();
        
        if(this.size == 1) {
            this.rear = null;
        }
        
        this.size--;
        
        return temp;
    }
    
    public Object front() throws QueueEmptyException {
        if(this.size == 0){
            throw new QueueEmptyException("Queue underflow!");
        }
        
        return this.front.getElement();
    }

    @Override
    public String toString() {
        if(this.size == 0){
          return "\tFila vazia";
        }
        
        Node cur = this.front;
        String string = "";
                
        while(cur != null){
            string += "  - " + cur.getElement() + "\n";
            cur = cur.getNext();
        }
        
        return string;  
    }
        
}
