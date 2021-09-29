
package br.edu.ifpr.stack;

import br.edu.ifpr.stack.Exceptions.StackEmptyException;
import br.edu.ifpr.stack.Exceptions.StackFullException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws StackFullException, StackEmptyException {
        Scanner input = new Scanner(System.in);
        Stack stack = new Stack();
        
        int op = 1;
        Object newItem;
        Object elementUnstack;
        Object elementTop;
        
        while(op != 0){
            System.out.println("Digite (1) para empilhar, (2) para desimpilhar, (3) para acessar o topo, (4) para mostrar elementos da pilha e (0) sair");
            op = input.nextInt();
            
            switch(op){
                case 1 -> {
                    System.out.println("Elemento?");
                    newItem = input.nextInt();
                    stack.push(newItem);
                    System.out.println("Elemento empilhado com sucesso!");
                }
                case 2 -> {
                    elementUnstack = stack.pop();
                    System.out.println("Elemento desempilhado é: " + elementUnstack);
                    
                }
                case 3 -> {
                    elementTop = stack.top();
                    System.out.println("Elemento do topo é: " + elementTop);
                }
                case 4 -> System.out.println("Pilha: " + stack);
                default -> System.out.println("Operação inválida!");   
            }
        }
    }
    
}
