
import java.util.Stack;

public class SK10MaxAreaHistogram{

    public static int maxArea(int[] heights){

        int maxArea = Integer.MIN_VALUE;
        int n = heights.length;
        int[] nsr = new int[n];
        int[] nsl = new int[n];

        Stack<Integer> s = new Stack<>();

        //Next smaller right arrat
        for(int i = n-1; i>=0; i--){
            while(!s.isEmpty()&&heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = n;
            }else{
                nsr[i] = s.peek(); 
            }   
            s.push(i);
        }

        //Next smaller left array

        s = new Stack<>();
        for(int i = 0; i<n; i++){
            while(!s.isEmpty()&&heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek(); 
            }   
            s.push(i);
        }

        //Current Area : width = i(nsr)-j(nsl)-1

        for (int i = 0; i < n; i++) {
            int area = (heights[i])*(nsr[i]-nsl[i]-1);
            maxArea = Math.max(area,maxArea);
            }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};

        System.out.println("Max Area is: " + maxArea(heights));
    }
}