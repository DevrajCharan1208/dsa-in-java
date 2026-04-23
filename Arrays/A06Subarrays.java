//Printing Subarrays

public class A06Subarrays{

    public static void subarrays(int[] a){
        for (int i = 0; i<a.length; i++){
            for (int j = i; j<a.length; j++){
                System.out.print(" (");
                for(int k = i; k<=j; k++){
                  
                    System.out.print(" "+a[k]+" ");
                    
                }
                System.out.println(")");
            }
        }
    }
    
    public static void main(String[] args) {
        int[] numbers = {2,4,6,8,10};
        subarrays(numbers);
    }
}