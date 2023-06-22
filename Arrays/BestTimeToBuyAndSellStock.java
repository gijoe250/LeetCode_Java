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
    public int maxProfit(int[] prices)  {
        int profit = 0;

        if (prices.length == 1){
            return 0;
        }
        int oldBuy = 0;
        int oldSell = 0;
        int oldProfit = 0;
        int newBuy = prices[0];
        int newSell = 0;
        int newProfit = 0;
        for(int i = 1; i < prices.length; i++){
            if (newSell < prices[i]){
                newSell = prices[i];
                continue;
            }
            if(newBuy > prices[i] && newSell == 0){
                newBuy = prices[i];
                continue;
            }
            if ((newBuy > prices[i] && newSell != 0 && oldBuy == 0)){
                oldBuy = newBuy;
                oldSell = newSell;
                if(oldSell - oldBuy > 0){
                    oldProfit = oldSell - oldBuy;
                }
                else {
                    oldProfit = 0;
                }
                newBuy = prices[i];
                newSell = 0;
            }
        }

        if(newSell == 0)
            return oldProfit;
        return profit;
    }

    /** Test Inputs
     * Add inputs to test
     */
    private static void testCodeInputs(){
        int[] prices = new int[]{7,1,5,3,6,4};
        int output = 5;
        assertCode();

        prices = new int[]{7,6,4,3,1};
        output = 0;
        assertCode();
    }

    /** Assertions
     * assertions for code
     */
    private static void assertCode(){
    }
}
