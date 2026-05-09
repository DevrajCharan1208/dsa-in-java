public class DC02QuickSort{
    public static void quickSort(int[] arr,int si, int ei){
        if(si>=ei){
            return;
        }
        int j = si-1;
        int pivot = arr[ei];
        for(int i = si; i<ei;i++){
            if(arr[i]<=pivot){
                j++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        j++;
        int temp = arr[j];
        arr[j] = arr[ei];
        arr[ei] = temp;

        int pvidx = j;
        quickSort(arr,0,pvidx-1);
        quickSort(arr, pvidx+1, ei);
        
    }

    public static void main(String[] args) {
        int[] arr = {6,3,9,8,2,5};

        quickSort(arr, 0, arr.length-1);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}