
import java.util.Stack;

public class SK07NextGreaterElement{

    public static int[] nextGreater(int[] arr){
        Stack<Integer> s = new Stack<>();
        int[] nextGreater = new int[arr.length];

        for (int i = arr.length-1;i>=0;i--){

            while(!s.isEmpty()&&arr[i]>=s.peek()){
                s.pop();
            }
            if(s.empty()){
                nextGreater[i] = -1;
            }else{
                nextGreater[i] = s.peek();
            }

            s.push(arr[i]);
        }
        return nextGreater;
    }

    public static void main(String[] args) {
        int[] arr = {6,8,0,1,3};
        int[] nextGreater = nextGreater(arr);
        for(int i = 0; i<arr.length;i++){
            System.out.print(nextGreater[i]+ " ");
        }
    }
}