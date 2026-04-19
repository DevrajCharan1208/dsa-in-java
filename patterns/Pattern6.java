/*
Inverted & Rotated Half-Pyramid
   *
  **
 ***
****
*/ 

public class Pattern6{
    public static void main (String args[]){

        //1.) Using Nested loop
        System.out.println("Using if-else\n\n");
        for (int row = 1; row<= 4; row++){
            for(int col = 1; col <=4; col++){

                if (col >= 4 - row + 1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        System.out.println("Using only loops \n\n");
        int n = 4;
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n-row; col++){
                System.out.print(" ");
            }

            for(int col = 1; col<= row; col++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}