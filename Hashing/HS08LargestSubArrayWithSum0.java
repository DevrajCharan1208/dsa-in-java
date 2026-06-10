
import java.util.HashMap;

public class HS08LargestSubArrayWithSum0{

    public static int longestSubArr(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        int longest = 0;
        int sum = 0;

        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }else{
                longest = Math.max(longest,i - map.get(sum));
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        int[] arr = {15,-2,2,-8,1,7,10};

        System.out.println(longestSubArr(arr));
    }
}