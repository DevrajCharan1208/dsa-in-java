public class A08MaxSubarrayPrefix{

    public static int maxSubarraySum(int[] a){

        int sum ;
        int maxSum = Integer.MIN_VALUE;
        int[] prefix = new int[a.length];
        prefix[0] = a[0];

        for(int i = 1; i<a.length; i++){
            prefix[i] = prefix[i-1] + a[i];
        }

        for(int i = 0; i<a.length; i++){
            int start = i;
            for(int j = i; j< a.length; j++){
                int end  = j;
                sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                
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