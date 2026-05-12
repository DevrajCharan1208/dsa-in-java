public class AL01WaterContainer{

    public static int maxWater(int[] arr){
        int area;
        int maxArea = Integer.MIN_VALUE;

        for(int i = 0;i<arr.length;i++){
            for(int j = i; j<arr.length;j++){
                area = (j-1)*Math.min(arr[i],arr[j]);
                maxArea = area>maxArea?area:maxArea;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {1,8,2,6,5,4,8,3,7};
        System.out.println(maxWater(height));
    }
}