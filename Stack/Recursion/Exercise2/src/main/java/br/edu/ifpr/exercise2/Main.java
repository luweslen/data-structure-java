package br.edu.ifpr.exercise2;

public class Main {

    public static double pRec(int numberTerms) {  
        if(numberTerms <= 1)
            return 1;
        
       return (1.0/(numberTerms + (numberTerms - 1))) + pRec(numberTerms - 1);
    }
    
    public static void main(String[] args) {
        System.out.println(pRec(4));
    }
    
}
