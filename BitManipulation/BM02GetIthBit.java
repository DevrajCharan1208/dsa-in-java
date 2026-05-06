public class BM02GetIthBit{
    public static void getIthBit(int num, int i){
        if((num&(1<<i))==0){
            System.out.println(i+"th bit of "+ num+ " is " + 0);
        }else{
            System.out.println(i+"th bit of "+ num+ " is " + 1);
        }
    }

    public static void main(String[] args) {
        getIthBit(13, 3);
        getIthBit(15, 2);
        getIthBit(5, 1);
    }
}