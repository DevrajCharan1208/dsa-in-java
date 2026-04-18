// Decimal to Binary
import java.util.*;

public class decToBin{

    static int decToBin(int decimalNum){

        int remainder;
        int binary = 0;
        int digit = 0;
        
        while (decimalNum > 0){

            remainder = decimalNum % 2;
            decimalNum = decimalNum / 2;
            binary += remainder*(int)Math.pow(10, digit);
            digit++;

        }
        return binary;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the decimal number: ");
        int decimalNum = s.nextInt();

        System.out.println(decToBin(decimalNum));
    }

}