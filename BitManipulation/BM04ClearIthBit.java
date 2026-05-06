public class BM04ClearIthBit{

    public static int ClearIthBit(int num, int i){
        return num&~(1<<i);
    }

    public static void main(String[] args) {
        System.out.println(ClearIthBit(5, 0));
        System.out.println(ClearIthBit(13, 3));
        System.out.println(ClearIthBit(10, 1));
        System.out.println(ClearIthBit(6, 2));
    }
}