/*
Butterfly Pattern
*      *
**    **
***  ***
********
********
***  ***
**    **
*      *
*/

public class pattern_10{
    static void butterfly_condition(int n){
        for(int i=1; i<= n; i++){
            for(int j=1; j<=n*2; j++){
                if(j>i&&j<(n*2)-i+1){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        for(int i=1; i<=n;i++){
            for(int j=1;j<=n*2;j++){
                if(j>n-i+1&&j<n+i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }

    static void butterfly_loop(int n) {
        for(int i = 1; i<=n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            for(int j = 1; j <= (n-i)*2; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }

            System.out.println("");
        }
        for (int i = 1; i <=n; i++){
            for(int j =1; j<= n-i+1; j++){
                System.out.print("*");
            }
            for(int j =1;j<= (i-1)*2 ;j++ ){
                System.out.print(" ");
            }
            for(int j =1; j<= n-i+1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        System.out.println("Using condition method\n");
        butterfly_condition(4);
        System.out.println("\nUsing only loop method\n");
        butterfly_loop(4);
    }
}