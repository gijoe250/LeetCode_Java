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
        //send starting color left
        if (sc-1 >= 0 && image[sr][sc-1] == image[sr][sc]){
            System.out.printf("sc is %d sr is %d image color 1 is %d image color 2 is %d \n",
                    sc, sr, image[sr][sc], image[sr][sc-1]);
            image = floodFill(image, sr, sc-1, color);
        }
        //send starting color up
        if (sr-1 >= 0 && image[sr-1][sc] == image[sr][sc]){
            image = floodFill(image, sr-1, sc, color);
        }
        //send starting color right
        if (sc+1 < image[sr].length && image[sr][sc+1] == image[sr][sc]){
            image = floodFill(image, sr, sc+1, color);
        }
        //send starting color down
        if (sr+1 < image.length && image[sr+1][sc] == image[sr][sc]){
            image = floodFill(image, sr+1, sc, color);
        }
        image[sr][sc] = color;
        return image;
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
