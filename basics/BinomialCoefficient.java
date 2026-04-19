import java.util.*;

public class BinomialCoefficient{

    static int factorial(int n){
    int fact = 1;
    for (int i=1; i<=n; i++){
        fact *= i;
    }
    return fact;
    }

    static int binCoeff(int n, int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nr_fact = factorial(n-r);
        int coefficient = n_fact/(r_fact*nr_fact);

        return coefficient;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for n : ");
        int n = sc.nextInt();
        System.out.print("Enter value for r : ");
        int r = sc.nextInt();

        System.out.println(binCoeff(n, r));
    }
}