package br.edu.ifpr.exercise4;

public class Main {
    public static double PiRec(int term) {
        double numerator = (term % 2 != 0) ? 4 : -4;
	double denominator = (2 * term) - 1;
        
        if(term <= 1) {
            return 4;
        }
        
        return (numerator / denominator) + PiRec(term - 1);
    }
    
    public static void main(String[] args) {
        System.out.println(PiRec(3));
    }
    
}
