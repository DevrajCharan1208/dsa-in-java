public class A04ReverseArray{
    
    public static int[] reverse(int a[]){
        int l = 0; //right pointer
        int r = a.length-1; //left pointer
        int temp;
        while (l<=r){
            //Swap
            temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
        return a;
    }

    public static void main(String[] args) {
        int a[] = {2,4,6,8,10};
        reverse(a);

        for (int i = 0; i < a.length; i++){
            System.out.print(a[i]+ " ");
        }
    }
}