package Miscellaneous;

public class FloodFill {
    /** The LeetCode link
     * https://leetcode.com/problems/flood-fill/
     */
    public static void main(String[] args) {
        System.out.println("Running the Assertions");
        testCodeInputs();
        System.out.println("Finished the Assertions Successfully");
    }
    /** Submitted Code
     * Code to copy paste into LeetCode
     */
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {

    }

    /** Test Inputs
     * Add inputs to test
     */
    private static void testCodeInputs(){
        int[][] image = new int[][]{{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1, sc = 1, color = 2;
        int[][] output = new int[][]{{2,2,2},{2,2,0},{2,0,1}};
        assertCode();
    }

    /** Assertions
     * assertions for code
     */
    private static void assertCode(){
    }
}
