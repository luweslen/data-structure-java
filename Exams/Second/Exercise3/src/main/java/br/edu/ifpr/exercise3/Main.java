package br.edu.ifpr.exercise3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LStack stack = new LStack();
        
        int op = 1;
        
        System.out.println("### PILHA ENCADEADA");
        
        while(op != 0){
            System.out.println("Qual a opção? (1) Inserir (2) Remover (3) Acessar elemento do topo (4) Mostrar pilha (0) Sair");
            op = input.nextInt();
            
            switch(op){
                case 0 -> System.out.println("Obrigado por usar o sistema. Volte sempre!");
                case 1 -> {
                    System.out.println("Digite o elemento:");
                    Object newValue = input.next();
                    
                    stack.push(newValue);
                }
                case 2 -> {
                    try {
                        Object removedValue = stack.pop();
                        System.out.println("Elemento removido: " + removedValue);
                    } catch(StackEmptyException e) {
                        System.out.println("Pilha vazia!");
                    }     
                }
                case 3 -> {
                    try {
                        Object topValue = stack.top();
                        System.out.println("Elemento do topo: " + topValue);
                    } catch(StackEmptyException e) {
                        System.out.println("Pilha vazia!");
                    }    
                }
                case 4 -> {
                    System.out.println(stack.toString());
                }
                default -> System.out.println("Operação inválida!");   
            }
        }
    }
}
