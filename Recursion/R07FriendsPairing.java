public class R07FriendsPairing{
    public static int friendPairs(int n){
        if(n==1||n==2){
            return n;
        }

        return friendPairs(n-1)+(friendPairs(n-2)*(n-1));
    }

    public static void main(String[] args) {
        System.out.println(friendPairs(4));
    }
}