package Arrays;

public class BestTimeToBuyAndSellStock {
    /** The LeetCode link
     * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
     */
    public static void main(String[] args) {
        System.out.println("Running the Assertions");
        testCodeInputs();
        System.out.println("Finished the Assertions Successfully");
    }
    /** Submitted Code
     * Code to copy paste into LeetCode
     */
    public static int maxProfit(int[] prices)  {
        int profit = 0;

        if (prices.length == 1){
            return 0;
        }
        int oldBuy = 0;
        int oldProfit = 0;
        int newBuy = prices[0];
        int newSell = 0;
        int newProfit = 0;
        for(int i = 1; i < prices.length; i++){
            if(newBuy > prices[i] && newSell == 0){
                newBuy = prices[i];
                continue;
            }
            if ((newBuy > prices[i] && newSell != 0)){
                if(oldBuy == 0 || newProfit > oldProfit){
                    oldBuy = newBuy;
                    oldProfit = newProfit;
                }
                newBuy = prices[i];
                newSell = 0;
                continue;
            }
            if (newSell < prices[i]){
                newSell = prices[i];
                newProfit = newSell - newBuy;
            }
        }
        return Math.max(oldProfit, newProfit);
    }

    /** Test Inputs
     * Add inputs to test
     */
    private static void testCodeInputs(){
        int[] prices = new int[]{7,1,5,3,6,4};
        int output = 5;
        assertCode(prices, output);

        prices = new int[]{7,6,4,3,1};
        output = 0;
        assertCode(prices, output);

        prices = new int[]{2,1,2,1,0,1,2};
        output = 2;
        assertCode(prices, output);
    }

    /** Assertions
     * assertions for code
     */
    private static void assertCode(int[] prices, int output){
        int profit = maxProfit(prices);
        assert profit == output : String.format("The profit %d does not match expected output %d", profit, output );
    }
}
