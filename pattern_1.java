/* print pattern

*
* *
* * *
* * * *

*/

class pattern_1{
    public static void main(String args[]) {
        for (int row = 0; row < 4; row++){
            for (int col = 0; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();           
        }
    }
}