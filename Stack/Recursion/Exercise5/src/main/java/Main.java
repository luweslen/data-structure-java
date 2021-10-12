
public class Main {
    public static double power(int base, int exponent) {
        if(exponent == 0)
            return 1;
        else if(exponent <= 0)
            return 1.0 / (base * power(base, (-1) * (exponent + 1)));
        else
            return base * power(base, exponent - 1);
    }
    
    public static void main(String[] args) {
        System.out.println(power(2, -5));
    }
    
}
