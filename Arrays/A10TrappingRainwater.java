public class A10TrappingRainwater{

    public static int trappedRainWater(int[] a){
        int n = a.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        int trappedWater = 0;
        int waterLevel;

        //left max boundary
        leftMax[0] = a[0];
        for (int i = 1; i<n; i++){
            leftMax[i] = Math.max(leftMax[i-1], a[i]);
        }

        //right max boundary
        rightMax[n-1] = a[n-1];
        for (int i = n-2; i>=0; i--){
            rightMax[i] = Math.max(a[i],rightMax[i+1]);
        }

        //calculating trapped water
        for (int i = 1; i<n; i++){
            waterLevel = Math.min(leftMax[i],rightMax[i]);
            trappedWater += waterLevel-a[i];
        }

        return trappedWater;
    }
    
    public static void main(String[] args) {
        int[] a = {4,2,0,6,3,2,5};
        System.out.println(trappedRainWater(a));
    }
}