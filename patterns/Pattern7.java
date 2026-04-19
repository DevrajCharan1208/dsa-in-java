/*
Inverted Half Pyramid with Number
12345
1234
123
12
1 
*/
public class Pattern7{

    static void inverted_half_pyramid_num(int n){

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n-i+1; j++){
                if (j <= n - i + 1){
                    System.out.print(j);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        inverted_half_pyramid_num(5);
    }
}

