
import java.util.ArrayList;

public class AL04PairSum1SortedOptimized{

    public static boolean pairSum1(ArrayList<Integer> list, int target){
        int l = 0;
        int r = list.size()-1;
        while(l<r){
            if(list.get(l)+list.get(r)==target){
                return true;
            }else if(list.get(l)+list.get(r)>target){
                r--;
            }else{
                l++;
            }
        }
        return false;
    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(pairSum1(list, 11));
        System.out.println(pairSum1(list, 2));
        System.out.println(pairSum1(list, 12));
        System.out.println(pairSum1(list, 5));
    }

}