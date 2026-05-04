public class S04CountingSort{

    public static void countingSort(int[] arr){
        int Largest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            Largest = arr[i]>Largest? arr[i] : Largest;
        }

        int[] count = new int[Largest+1];

        for(int i = 0; i<arr.length; i++){
                count[arr[i]]++;
        }

        int idx = 0;
        for(int k = 0; k<=Largest; k++){
            while(count[k]>0){
                arr[idx] = k;
                count[k]--;
                idx++;
            }
        }

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2,4,6,2,4,5,3,6};
        countingSort(arr);
    }
}