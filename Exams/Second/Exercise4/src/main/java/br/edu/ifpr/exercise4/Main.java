package br.edu.ifpr.exercise4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LQueue priorityQueue = new LQueue();
        LQueue queue = new LQueue();
        
        Scanner input = new Scanner(System.in);
        
        int op = 1;
        
        System.out.println("# GERENCIADOR DE FILA");
        
        while(op != 0){
            System.out.println("Qual a opção? (1) Novo paciente (2) Chamar paciente (3) Relatório (0) Sair");
            op = input.nextInt();
            
            switch(op){
                case 0 -> System.out.println("Obrigado por usar o sistema. Volte sempre!");
                case 1 -> {
                    System.out.println("Digite o nome da paciente:");
                    Object newPatient = input.next();
                    
                    System.out.println("Paciente precisa de atendimento preferencial. Digite S para sim ou N para não:");
                    String isPriority = input.next();
                    isPriority = isPriority.toUpperCase();
                                        
                    if(isPriority.equals("S") || isPriority.equals("SIM")){
                        priorityQueue.enqueue(newPatient);  
                        System.out.println(newPatient + " adcionado na fila preferencial.\n");
                    } else if(isPriority.equals("N") || isPriority.equals("NAO") || isPriority.equals("NÃO")) {
                        queue.enqueue(newPatient); 
                        System.out.println(newPatient + " adcionado na fila.\n");
                    } else {
                        System.out.println("Resposta inválida, tente novamente!\n");
                    }
                    
                }
                case 2 -> {
                    try{
                        Object patient;
                        
                        if(!priorityQueue.isEmpty()){
                            patient = priorityQueue.dequeue();
                        } else {
                            patient = queue.dequeue();
                        }
                        
                        System.out.println("Paciente " + patient);
                    } catch(QueueEmptyException e) {
                        System.out.println("Nenhum paciente na fila!");
                    }    
                    
                }
                case 3 -> {
                    System.out.println("Fila preferencial");
                    System.out.println(priorityQueue.toString());
                    
                    System.out.println("\nFila normal");
                    System.out.println(queue.toString());
                }
                default -> System.out.println("Operação inválida!");   
            }
        }
    }
    
}
