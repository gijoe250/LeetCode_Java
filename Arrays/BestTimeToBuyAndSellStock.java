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
        int buy = prices[0];
        int sell = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i-1] < prices[i]){
                if(sell == 0 &){

                }
            }
        }
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
