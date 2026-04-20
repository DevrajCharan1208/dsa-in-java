public class A01LinearSearch{

    //Linear Search, O(n)
    public static int linearSearch(int numbers[], int key){

        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {1,3,5,7,9,11,13};
        int key = 11;

        int idx = linearSearch(numbers, key);
        if(idx == -1){
            System.out.println(key + "Not Found");
        }else{
            System.out.println("Index of "+key+"in array is: "+ idx);
        }

    }
}