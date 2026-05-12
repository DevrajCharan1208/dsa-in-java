import java.util.*;

public class AL01WaterContainerBruteForce {

    public static int maxWater(ArrayList<Integer> arr) {
        int area;
        int maxArea = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {                              
                area = (j - i) * Math.min(arr.get(i), arr.get(j));                
                maxArea = area > maxArea ? area : maxArea;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        
        ArrayList<Integer> height = new ArrayList<>(Arrays.asList(1, 8, 2, 6, 5, 4, 8, 3, 7));  
        System.out.println(maxWater(height));
    }
}