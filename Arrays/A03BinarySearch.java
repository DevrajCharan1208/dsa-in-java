public class A03BinarySearch{

    //Binary Search
    public static int binarySearch(int a[], int key){
        int start = 0;
        int end = a.length-1;
        int mid;

        while(start<=end){
            mid = (start+end)/2;
            if(key > a[mid]){
                start = mid;
            }else if(key < a[mid]){
                end = mid;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //array should be sorted for binary search
        int array[] = {2,5,7,9,13,16,19};
        System.out.println("Index of key in array is: "+ binarySearch(array, 13));
    }
}