package LinkedList;

public class InvertBinaryTree {
    /** The LeetCode link
     * https://leetcode.com/problems/invert-binary-tree/
     */
    public static void main(String[] args) {
        System.out.println("Running the Assertions");
        testCodeInputs();
        System.out.println("Finished the Assertions Successfully");
    }
    /** Submitted Code
     * Code to copy paste into LeetCode
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    public static TreeNode invertTree(TreeNode root) {

    }
}

    /** Test Inputs
     * Add inputs to test
     */
    private static void testCodeInputs(){
//    Input: root = [4,2,7,1,3,6,9]
//    Output: [4,7,2,9,6,3,1]
//    Input: root = [2,1,3]
//    Output: [2,3,1]
//    Input: root = []
//    Output: []
        assertCode();
    }

    /** Assertions
     * assertions for code
     */
    private static void assertCode(TreeNode root){
        TreeNode tempOutput = invertTree(root);
    }
}
