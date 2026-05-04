public class A11BuyAndSellStock{

    public static  int maxProfit(int[] a){
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        int sellPrice;
        for(int i = 0; i<a.length; i++){
            sellPrice = a[i];
            if(sellPrice>buyPrice){
                int profit = sellPrice - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            }else{
                buyPrice = sellPrice;
            }

        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}