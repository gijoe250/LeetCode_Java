package Miscellaneous;

import java.util.LinkedList;
import java.util.Queue;

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
//        fillFloodBFS(image, sr, sc, oldColor, color);
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

    public static void fillFloodBFS(int[][] image, int sr, int sc, int oldColor, int newColor){

        int rowLength = image.length;
        if (rowLength == 0)
            return;
        int colLength = image[0].length;

        boolean[][] visited = new boolean[rowLength][colLength];

        Queue<String> queue = new LinkedList<>();

        queue.add(sr + "," + sc);

        while (!queue.isEmpty()) {

            String x = queue.remove();
            int row = Integer.parseInt(x.split(",")[0]);
            int col = Integer.parseInt(x.split(",")[1]);

            if (row < 0 || col < 0 || row >= rowLength || col >= colLength
                    || visited[row][col])
                continue;

            visited[row][col] = true;
            if (image[row][col] == oldColor){
                image[row][col] = newColor;
            }
            else {
                continue;
            }

            queue.add(row + "," + (col - 1)); //go left
            queue.add(row + "," + (col + 1)); //go right
            queue.add((row - 1) + "," + col); //go up
            queue.add((row + 1) + "," + col); //go down
        }
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
