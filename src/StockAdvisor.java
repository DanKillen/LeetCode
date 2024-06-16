/**
 * Created by Daniel Killen on 15/06/2024
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 *
 * You want to maximize your profit by choosing a single day to buy one stock and
 * choosing a different day in the future to sell that stock.
 *
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 **/
public class StockAdvisor
{

   public static void main(String[] args)
   {
      int[] prices1 = {7,1,5,3,6,4};
      int[] prices2 = {1,2,4};
      //System.out.println(maxProfit(prices1));
      System.out.println(maxProfit(prices2));
   }

   public static int maxProfit(int[] prices) {
      if (prices.length == 1)
      {
         return 0;
      }
      int maxProfit = Math.max(0, prices[1] - prices[0]);
      int lowestDayPrice = 10000;
      for (int i = 0; i < prices.length - 1; i++){
         if (lowestDayPrice <= prices[i]) {
            continue;
         }
         lowestDayPrice = prices[i];
         for (int k = i + 1; k < prices.length; k++){
            if (maxProfit > prices[k])
            {
               continue;
            }
            maxProfit = Math.max(prices[k] - lowestDayPrice, maxProfit);
         }
      }
      return maxProfit;
   }
}
