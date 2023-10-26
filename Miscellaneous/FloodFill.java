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
        int oldColor = image[sr][sc];
        //check if it matches the color
        if (oldColor == color) {
            return image;
        }
        fillFloodDFS(image, sr, sc, oldColor, color);
        return image;
    }

    public static void fillFloodDFS(int[][]image, int sr, int sc, int oldColor, int newColor) {
        //check if everything is within bounds
        if (sc < 0 || sr < 0 || sc == image[0].length || sr == image.length
                || image[sr][sc] != oldColor) {
            return;
        }
        image[sr][sc] = newColor;

        fillFloodDFS(image, sr - 1, sc, oldColor, newColor);
        fillFloodDFS(image, sr + 1, sc, oldColor, newColor);
        fillFloodDFS(image, sr, sc + 1, oldColor, newColor);
        fillFloodDFS(image, sr, sc - 1, oldColor, newColor);
    }

    /** Test Inputs
     * Add inputs to test
     */
    private static void testCodeInputs(){
        int[][] image = new int[][]{{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1, sc = 1, color = 2;
        int[][] output = new int[][]{{2,2,2},{2,2,0},{2,0,1}};
        assertCode(image, sr, sc, color, output);
    }

    /** Assertions
     * assertions for code
     */
    private static void assertCode(int[][] image, int sr, int sc, int color, int[][] output){
        int answer[][] = floodFill(image, sr, sc, color);
    }
}
