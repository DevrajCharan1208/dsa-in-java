public class A09MaxSubarraySumKodane{

    public static int maxSubarraySum(int[] a){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++){
            sum += a[i];            
            sum = sum<0? 0 : sum;
            maxSum = sum>maxSum? sum : maxSum;

        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] a = {1,-2,6,-1,3};
        int maxSum = maxSubarraySum(a);
        System.out.println("Maximum sum of array is: " + maxSum);
    }
}