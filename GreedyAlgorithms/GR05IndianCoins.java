import java.util.*;

public class GR05IndianCoins{
    public static void main(String args[]) {
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};

        Arrays.sort(coins, Comparator.reverseOrder());

        int countOfCoins = 0;
        int amount = 590;
        ArrayList<Integer> ans = new ArrayList<>();

        for (Integer coin : coins) {
            if (coin <= amount) {
                while (coin <= amount) {
                    countOfCoins++;
                    ans.add(coin);
                    amount -= coin;
                }
            }
        }

        System.out.println("total (min) coins used = " + countOfCoins);

        for(int i=0; i<ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }
}