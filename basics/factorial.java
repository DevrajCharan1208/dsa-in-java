import java.util.*;

public class factorial{

static int factorial(int n){
    int fact = 1;

    for (int i=1; i<=n; i++){

        fact *= i;
    }

    return fact;
}


public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number to calculate factorail : ");
    int num = sc.nextInt();
    int fact = factorial(num);
    System.out.println("Factorial of "+ num + " is "+ fact);
}
}