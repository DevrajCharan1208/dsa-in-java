public class R03NthFibonacci{

    public static int nthFibonacci(int n){
        if(n==0||n==1){
        return n;
        }
        int nth = nthFibonacci(n-1) + nthFibonacci(n-2);
        return nth;
    }

    public static void main(String[] args) {
        System.out.println(nthFibonacci(20));
    }
}