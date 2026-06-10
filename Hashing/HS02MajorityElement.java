import java.util.*;

public class HS02MajorityElement{

    public static ArrayList<Integer> majorityElement(int[] nums){
        ArrayList<Integer> result = new ArrayList<>();

        HashMap<Integer,Integer> map = new HashMap<>();


        for(int i = 0; i < nums.length; i++){
            int num = nums[i];

            map.put(num, map.getOrDefault(num, 0) + 1);
        }


        for(Integer key : map.keySet()){
            if (map.get(key) > nums.length/3){
                result.add(key);
                System.out.println(key);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,2,5,1,3,1,5,1,1,3,1,3,3};

        System.out.println(majorityElement(nums));
    }
}