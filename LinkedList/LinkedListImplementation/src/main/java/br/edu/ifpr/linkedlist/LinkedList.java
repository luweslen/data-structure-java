package br.edu.ifpr.linkedlist;

public class LinkedList {
    private Node head;
    private int size;

    public int size(){ return size; }
    public boolean isEmpty() { return size == 0; }
    
    public int indexOf(Object element) {
        Node aux = head;
        int i = 0;
        while (aux != null) {
            if (aux.getElement().equals(element))
                return i;
            else {
                i++;
                aux = aux.getNext();
            }
        }
        return -1;
    }
    
    public void add(int index, Object element) throws IndexOutOfBoundsException {
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        } else {
            Node n = new Node();
            n.setElement(element);
            
            if (index == 0) {
                n.setNext(head);
                head = n;
            } else {
                Node prev = head;
                for (int i = 0; i < index - 1; i++){
                    prev = prev.getNext();
                }

                n.setNext(prev.getNext());
                prev.setNext(n);
            }
            size++;
        }
    }
    
    public void add(Object element) {
        if (size < 0 || size > size){
            throw new IndexOutOfBoundsException();
        } else {
            Node n = new Node();
            n.setElement(element);
            
            if (size == 0) {
                n.setNext(head);
                head = n;
            } else {
                Node prev = head;
                for (int i = 0; i < size - 1; i++){
                    prev = prev.getNext();
                }

                n.setNext(prev.getNext());
                prev.setNext(n);
            }
            
            size++;
        }
    }
    
    public Object get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        } else {
            Node cur = head;
            for (int i = 0; i < index; i++){
                cur = cur.getNext();
            }
            return (cur.getElement());
        }
    
    }
    
    public Object set(int index, Object element) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        } else {
            Node cur = head;
            
            for (int i = 0; i < index; i++){
                cur = cur.getNext();
            }
            
            Object old = cur.getElement();
            cur.setElement(element);
            
            return old;
        }
    }
    
    public Object remove(int index) {
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        } else {
            Object temp;
            if (index == 0) {
                temp = head.getElement();
                head = head.getNext();
            } else {
                Node cur, prev = head;
                
                for (int i = 0; i < index - 1; i++){
                    prev = prev.getNext();
                }

                cur = prev.getNext();
                temp = cur.getElement();
                prev.setNext(cur.getNext());
            }
            size--;
            return temp;
        }
    }
    
    @Override
    public String toString(){
        Node cur = head;
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
