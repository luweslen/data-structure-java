package br.edu.ifpr.linkedlist;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList list = new LinkedList();
        
        int op = 1;
        
        System.out.println("# TESTANDO UMA LISTA ENCADEADA");
        
        while(op != 0){
            System.out.println("Qual a opção? (1) Inserir com index (2) Inserir sem index (3) Remover (4) Acessar (5) Mudar elemento pelo index (6) Mostrar (0) Sair");
            op = input.nextInt();
            
            switch(op){
                case 0 -> System.out.println("Obrigado por usar o sistema. Volte sempre!");
                case 1 -> {
                    System.out.println("Qual a posição?");
                    int index = input.nextInt();
                    System.out.println("Digite o elemento:");
                    Object newValue = input.next();
                    
                    list.add(index, newValue);
                }
                case 2 -> {
                    System.out.println("Digite o elemento:");
                    Object newValue = input.next();
                    
                    list.add(newValue);
                }
                case 3 -> {
                    try {
                        System.out.println("Qual a posição?");
                        int index = input.nextInt();
                        Object removedItem = list.remove(index);
                        System.out.println("O elemento removido: " + removedItem);
                    } catch(IndexOutOfBoundsException e) {
                        System.out.println("Index invalido!");
                    }     
                }
                case 4 -> {
                    try{
                        System.out.println("Qual a posição?");
                        int index = input.nextInt();
                        Object searchedItem = list.get(index);
                        System.out.println("Elemento: " + searchedItem);
                    } catch(IndexOutOfBoundsException e) {
                        System.out.println("Index inválido!");
                    } 
                }
                case 5 -> {
                    try{
                        System.out.println("Qual a posição?");
                        int index = input.nextInt();
                        System.out.println("Digite o novo elemento:");
                        Object updateValue = input.next();

                        Object oldValue = list.set(index, updateValue);
                        System.out.println("Elemento antigo: " + oldValue);
                    } catch(IndexOutOfBoundsException e) {
                        System.out.println("Index inválido!");
                    } 
                }
                case 6 -> {
                    System.out.println(list.toString());
                }
                default -> System.out.println("Operação inválida!");   
            }
        }
    }
    
}
