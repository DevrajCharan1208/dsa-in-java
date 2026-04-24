//Maximum Subarray Sum using Brute Force approach

public class A07MaxSubarrayBrute{
    
    public static int maxSubarraySum(int[] a){
        int sum ;
        int maxSum = Integer.MIN_VALUE; 
        
        for (int i = 0; i < a.length; i++){
            for(int j = i; j<a.length; j++){
                sum = 0;
                for (int k = i; k<=j; k++){
                    sum += a[k];
                }
                if (sum>maxSum){
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] a = {1,-2,6,-1,3};
        int maxSum = maxSubarraySum(a);
        System.out.println("Maximum sum of array is: " + maxSum);
    }

}