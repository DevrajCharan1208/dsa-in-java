public class R04IsArraySorted{

    public static boolean isSorted(int[] arr, int si){
        if(si==arr.length-1){
            return true;
        }
        if(arr[si]>arr[si+1]){
            return false;
        }
        return isSorted(arr,si+1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr1 = {2,3,4,1,5};
        System.out.println(isSorted(arr, 0));
        System.out.println(isSorted(arr1, 0));
    }
}