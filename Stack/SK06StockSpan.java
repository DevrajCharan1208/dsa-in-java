
import java.util.Stack;

public class SK06StockSpan{

    public static int[] stockSpan(int[] stocks){
        int[] span = new int[stocks.length];

        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for(int i = 1; i<stocks.length;i++){
            int currPrice = stocks[i];
            while(!s.isEmpty()&&currPrice>stocks[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;
            }else{
                span[i] = i-s.peek();
            }

            s.push(i);
        }

        return span;
    }

    public static void main(String[] args){

        int stocks[] = {100,80,60,70,60,85,100};
        int span[] = stockSpan(stocks);
        for (int i = 0; i<span.length;i++) {
            System.out.println(span[i]+ " ");
            
        }


    }
}