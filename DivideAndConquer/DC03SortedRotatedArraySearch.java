public class DC03SortedRotatedArraySearch{
    public static int rotatedSearch(int[] arr,int key, int si, int ei){
        if(si>ei){
            return -1;
        }
        
        int mid = (si+ei)/2;
        if(arr[mid]==key){
            return mid;
        }
        if(arr[si]<=arr[mid]){
            if(arr[si]<=key&&key<=mid){
                return rotatedSearch(arr, key, si, mid);
            }else{
                return rotatedSearch(arr, key, mid+1, ei);
            }
        }else{
            if(arr[mid]<=key&&key<=arr[si]){
            return rotatedSearch(arr, key, mid+1, ei);
        }else{
            return rotatedSearch(arr, key, si, mid-1);
        }
        }
        
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(rotatedSearch(arr, 0, 0, arr.length-1));
    }
}