import java.util.*;


class isPrime{

    static boolean checkPrime( int n){
        if (n==0 || n ==1){
            return false;
        }

        if (n==2){
            return true;
        }    

        for (int i  = 2; i*i < n; i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;

}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        System.out.println(checkPrime(n));
    }
}
