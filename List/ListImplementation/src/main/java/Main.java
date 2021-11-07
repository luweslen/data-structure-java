import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List list = new List(5);
        
        int op = 1;
        
        System.out.println("# LISTA DE NÚMEROS INTEIROS");
        
        while(op != 0){
            System.out.println("Qual a opção? (1) Adicionar (2) Remover (3) Buscar número pelo index (4) Buscar index do número (5) Mostrar lista (0) Sair");
            op = input.nextInt();
            
            switch(op){
                case 0 -> System.out.println("Obrigado por usar o sistema. Volte sempre!");
                case 1 -> {
                    System.out.println("Digite o elemento?");
                    int newNumber = input.nextInt();
                    list.add(newNumber);
                    System.out.println("Número adcionado com sucesso!");
                }
                case 2 -> {
                    try {
                        System.out.println("Qual número deseja remover?");
                        int number = input.nextInt();
                        list.remove(number);
                        System.out.println("Elemento removido com sucesso!");
                    } catch(IndexOutOfBoundsException e) {
                        System.out.println("Número não encontrado!");
                    }     
                }
                case 3 -> {
                    try{
                        System.out.println("Qual index do número?");
                        int index = input.nextInt();
                        int indexSearched = list.get(index);
                        System.out.println("Elemento: " + indexSearched);
                    } catch(IndexOutOfBoundsException e) {
                        System.out.println("Index inválido!");
                    } 
                }
                case 4 -> {
                    System.out.println("Qual o número?");
                    int number = input.nextInt();
                    int indexSearched = list.indexOf(number);
                    
                    if(indexSearched == -1){
                        System.out.println("Index inválido!");
                    } else {
                        System.out.println("index do número " + number + ": " + indexSearched);
                    }
                }
                case 5 -> {
                    System.out.println("Lista: " + list);
                }
                default -> System.out.println("Operação inválida!");   
            }
        }
    }
}
