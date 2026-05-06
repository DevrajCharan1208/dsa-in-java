public class BM03SetIthBit{

    public static int setIthBit(int num, int i){
        return num|(1<<i);
    }

    public static void main(String[] args) {
        System.out.println(setIthBit(5, 1));
        System.out.println(setIthBit(13, 1));
        System.out.println(setIthBit(10, 0));
        System.out.println(setIthBit(6, 4));
    }
}