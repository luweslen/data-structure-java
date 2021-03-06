package br.edu.ifpr.exercise2;

import br.edu.ifpr.exercise2.Exceptions.QueueEmptyException;
import br.edu.ifpr.exercise2.Exceptions.QueueFullException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue queue = new Queue();
        
        int op = 1;
        Object newItem;
        Object elementDequeue;
        Object elementFront;
        
        while(op != 0){
            System.out.println("Qual a opção? (1) Enfileirar (2) Desenfileirar (3) Acessar (4) Mostrar Fila (0) Sair");
            op = input.nextInt();
            
            switch(op){
                case 0 -> System.out.println("Obrigado por usar o sistema. Volte sempre!");
                case 1 -> {
                    try{
                        System.out.println("Digite o elemento?");
                        newItem = input.next();
                        queue.enqueue(newItem);
                        System.out.println("Elemento empilhado com sucesso!");
                    } catch(QueueFullException e) {
                        System.out.println("Erro de overflow – fila cheia");
                    }
                }
                case 2 -> {
                    try{
                        elementDequeue = queue.dequeue();
                        System.out.println("Elemento desenfileirado: " + elementDequeue);
                    } catch(QueueEmptyException e) {
                        System.out.println("Erro de underflow – fila vazia");
                    }      
                }
                case 3 -> {
                    try{
                        elementFront = queue.front();
                        System.out.println("Elemento da frente: " + elementFront);
                    } catch(QueueEmptyException e) {
                        System.out.println("Erro de underflow – fila vazia");
                    } 
                    
                }
                case 4 -> System.out.println(queue);
                default -> System.out.println("Operação inválida!");   
            }
        }
    }
    
}
