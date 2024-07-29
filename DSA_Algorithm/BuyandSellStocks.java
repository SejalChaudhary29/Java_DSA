package DSA_Algorithm;

public class BuyandSellStocks {
    public static int BuySellStock(int prices[]){

        int buyingprice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {

            if (buyingprice < prices[i]) {
                // profit  = sp - bp;
                int profit = prices[i] - buyingprice; // todays profit
                maxProfit = Math.max(maxProfit, profit);
            }else{

                buyingprice = prices[i];
            }
            
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = { 7 , 1 , 5 ,  3 , 6 , 4};

       System.out.println( BuySellStock(prices));;
    }
}
