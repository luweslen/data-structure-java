package br.edu.ifpr.stackfloat;

import br.edu.ifpr.stackfloat.Exceptions.StackEmptyException;
import br.edu.ifpr.stackfloat.Exceptions.StackFullException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StackFloat stack = new StackFloat();
        
        int op = 1;
        float newItem;
        float elementUnstack;
        float elementTop;
        
        while(op != 0){
            System.out.println("Digite (1) para empilhar, (2) para desempilhar, (3) para acessar o topo, (4) para mostrar os elementos da pilha e (0) sair");
            op = input.nextInt();
            
            switch(op){
                case 0 -> System.out.println("Obrigado por usar o sistema. Volte sempre!");
                case 1 -> {
                    try{
                        System.out.println("Elemento?");
                        newItem = input.nextInt();
                        stack.push(newItem);
                        System.out.println("Elemento empilhado com sucesso!");
                    } catch(StackFullException e) {
                        System.out.println("Erro de overflow – pilha cheia");
                    }
                }
                case 2 -> {
                    try{
                        elementUnstack = stack.pop();
                        System.out.println("Elemento desempilhado é: " + elementUnstack);
                    } catch(StackEmptyException e) {
                        System.out.println("Erro de underflow – pilha vazia");
                    }      
                }
                case 3 -> {
                    try{
                        elementTop = (float) stack.top();
                        System.out.println("Elemento do topo é: " + elementTop);
                    } catch(StackEmptyException e) {
                        System.out.println("Erro de underflow – pilha vazia");
                    } 
                    
                }
                case 4 -> System.out.println(stack);
                default -> System.out.println("Operação inválida!");   
            }
        }
    }
    
}
