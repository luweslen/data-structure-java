package br.edu.ifpr.exercise3;

public class Node {
    private Object element;
    private Node next;

    Node(){ this(null, null); }

    Node(Object element, Node next){
        this.element = element;
        this.next = next;
    }

    Object getElement(){ return element; }
    Node getNext(){ return next; }
    void setElement(Object element){ this.element = element;}
    void setNext(Node next){ this.next = next; }
}
