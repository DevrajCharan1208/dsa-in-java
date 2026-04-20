
public class A02LargestInArray{

    public static int largestInArray(int array[]){
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++){
            if(array[i]>largest){
                largest = array[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = {1,2,5,8,3,10,12,5,8};
        int largestValue = largestInArray(numbers);

        System.out.println("Largest value in Array is: "+ largestValue);
    }
}