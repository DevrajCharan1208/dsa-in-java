public class BM07FastExponent{
    public static int fastExponent(int num, int pow){
        int ans = 1;
        while(pow>0){
            if((pow&1) != 0){
                ans = ans*num;
            }

            num = num*num;
            pow = pow>>1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fastExponent(5, 5));
    }
}