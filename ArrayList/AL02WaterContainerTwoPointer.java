import java.util.*;
public class AL02WaterContainerTwoPointer{

    public static int maxWater(ArrayList<Integer> arr){
        int n = arr.size();
        int l = 0;
        int r = n-1;
        int area;
        int maxArea = Integer.MIN_VALUE;

        while(l<r){
            
            area = (r-l)*Math.min(arr.get(l),arr.get(r));
            maxArea = area>maxArea?area:maxArea;

            if(arr.get(l)<arr.get(r)){
                l++;
            }else{
                r--;
            }

            area = (r-l)*Math.min(arr.get(l),arr.get(r));
            maxArea = area>maxArea?area:maxArea;
        }
        return maxArea;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>(Arrays.asList(1,8,6,2,5,4,8,3,7));
        System.out.println(maxWater(height));
    }
}