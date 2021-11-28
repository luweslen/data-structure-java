package br.edu.ifpr.exercise3;

public class LStack {
    private Node top;
    private int size;

    public boolean isEmpty(){ return this.size == 0; }
    
    public int size(){ return this.size; }
    
    public void push (Object element) {
        Node n = new Node();
        n.setElement(element);
        n.setNext(this.top);

        this.top = n;
        
        size++;
    }
    
    public Object pop() throws StackEmptyException {
        if(this.size == 0){
          throw new StackEmptyException("Stack underflow!");
        }
        
        Object temp = top.getElement();
        
        this.top = this.top.getNext();
        
        this.size--;
        
        return temp;
    }

    public Object top() throws StackEmptyException {
        if(this.size == 0){
          throw new StackEmptyException("Stack underflow!");
        }
        
        return top.getElement();
    }

    @Override
    public String toString() {
        if(this.size == 0){
          return "[ ]";
        }
        
        Node cur = this.top;
        String string = "[";
        
        while(cur != null){
            string += " " + cur.getElement() + ",";
            cur = cur.getNext();
        }
        
        string =  string.substring(0, string.length() - 1);
        string += " ]";
        return string;    
    }
}
