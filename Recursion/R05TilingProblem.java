//possible ways to fill 2xn floor, each tile is 2x1
public class R05TilingProblem{

    public static int tilingProblem(int n){
        if(n==0||n==1){
            return 1;
        }
        int totalWays = tilingProblem(n-1)+tilingProblem(n-2);
        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(tilingProblem(4));
    }
}