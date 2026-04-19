/*
HALF-PYRAMID pattern
1
12
123
1234 
*/

class Pattern3{
    public static void main(String args[]) {
        for (int row = 1; row <= 4; row++){
            for (int col = 1; col <= row; col++){
                System.out.print(col);
            }
            System.out.println();           
        }
    }
}