public class BM01OddOrEven{

    public static void isOddEven(int num){
        if((num&1) == 0){
            System.out.println(num + " is even.");
        }else{
            System.out.println(num + " is odd.");
        }
    }

    public static void main(String[] args) {
        isOddEven(73);
        isOddEven(46);
        isOddEven(25);
    }
}