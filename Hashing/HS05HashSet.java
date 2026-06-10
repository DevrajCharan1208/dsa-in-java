import java.util.*;
public class HS05HashSet{
    
    public static void main (String args[]){

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(7);
        set.add(3);
        set.add(4);
        set.add(2);
        set.add(1);

        System.out.println("==== Iteration - 1 ====");
        for(int i : set){
            System.out.print(i + " ");
        }

        set.remove(2);

        System.out.println("\n==== Iteration - 2 ====");

        Iterator i = set.iterator();
        while(i.hasNext()){
            System.out.print(i.next() + " ");
        }
    }
}