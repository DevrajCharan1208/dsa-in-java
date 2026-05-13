//roated and sorted array
import java.util.ArrayList;

public class AL05PairSum2Optimized{

    public static boolean pairSum2(ArrayList<Integer> list, int target){            
        int n = list.size();
        int pvt = -1;
        for(int i = 0; i<n;i++){
            if(list.get(i)>list.get(i+1)){
                pvt = i;
                break;
            }
        }

        int l = pvt+1;
        int r = pvt;
        while(l!=r){
             if(list.get(l)+list.get(r)==target){
                return true;
            }
            if(list.get(l)+list.get(r)>target){
                r = (n+r-1)%n;
            }else{
                l = (l+1)%n;
            }
        }
        

        return false;
    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(pairSum2(list, 16));
        System.out.println(pairSum2(list, 2));
        System.out.println(pairSum2(list, 15));
        System.out.println(pairSum2(list, 5));
    }

}