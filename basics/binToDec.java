// Binary to Decimal
import java.util.*;

public class binToDec{

    static int binToDec(int binaryNum){

        int pow = 0;
        int decimal = 0;
        
        while (binaryNum > 0){

            int lastDigit = binaryNum % 10;
            binaryNum = binaryNum / 10;
            decimal += (int)lastDigit*Math.pow(2, pow);
            pow++;

        }
        return decimal;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the binary number: ");
        int binaryNum = s.nextInt();

        System.out.println(binToDec(binaryNum));
    }

}
