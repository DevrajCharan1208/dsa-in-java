import java.util.*;
public class GR06ChocolateBar{

    public static void main(String[] args) {
        int n = 4; int m = 6;

        Integer[] costVer = {2,1,3,1,4};
        Integer[] costHor = {4,1,2};

        Arrays.sort(costHor, Collections.reverseOrder());
        Arrays.sort(costVer, Collections.reverseOrder());

        int totalCost = 0;
        int v = 0;
        int h = 0;
        int hp = 1;
        int vp = 1;
        
        while(v<costVer.length&&h<costHor.length){
            if(costVer[v]>=costHor[h]){
                totalCost += costVer[v]*hp;
                vp++;
                v++;
            }else{
                totalCost += costHor[h]*vp;
                hp++;
                h++;
            }
        }
        while(v<m-1){
            totalCost += costVer[v]*hp;
                vp++;
                v++;
        }
        while(h<n-1){
             totalCost += costHor[h]*vp;
                hp++;
                h++;
        }

        System.out.println("Minimum cost to break chocolate into small squares: "+ totalCost);
    }
}