//Pairs in Array

public class A05PairsInArray{

    public static void printPairs(int[] a){

        for (int i = 0; i<a.length; i++){
            for (int j = i+1; j< a.length; j++){
                System.out.print(" ("+ a[i]+","+ a[j]+") ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int[] numbers = {2,4,6,8,10};
        printPairs(numbers);
    }
}