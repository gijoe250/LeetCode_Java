package Miscellaneous;

import LinkedList.TreeNode;

public class lowestCommonAncestor {
    /** The LeetCode link
     * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/description/
     */
    public static void main(String[] args) {
        System.out.println("Running the Assertions");
        testCodeInputs();
        System.out.println("Finished the Assertions Successfully");
    }
    /** Submitted Code
     * Code to copy paste into LeetCode
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    public static TreeNode lowestCommonAnc(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode answer;
        //call a recursive function
        //traverse p down the tree
        //store each value hit by p in a queue
        //stop if itself is hit
        //traverse q down the tree
        //check each value to see if in queue
        //stop if itself or value does not exist in queue
        //return answer
        return answer;
    }

    /** Test Inputs
     * Add inputs to test
     */
    private static void testCodeInputs(){
        //        Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
        //        Output: 6
        //        Explanation: The LCA of nodes 2 and 8 is 6.
        assertCode();
    }

    /** Assertions
     * assertions for code
     */
    private static void assertCode(){
    }
}
