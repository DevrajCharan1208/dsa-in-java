//Sum of first n natural numbers
public class R02SumOfNumbers{
    
    public static int sumOfNums(int num){
        if(num==0){
            return 0;
        }

        int sum = num;
        sum += sumOfNums(num-1);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfNums(5));
    }
}