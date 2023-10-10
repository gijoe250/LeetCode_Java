package LinkedList;

public class InvertBinaryTree {
    /** The LeetCode link
     * https://leetcode.com/problems/invert-binary-tree/
     * TODO:This has the correct solution, but testing is not set up locally yet.
     * TODO:Must run in Leetcode
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
        if (root == null){
            return root;
        }
        if (root.left != null || root.right != null){
            TreeNode temp = root.right;
            root.right = root.left;
            root.left = temp;
            invertTree(root.left);
            invertTree(root.right);
        }
        return root;
    }

    /** Test Inputs
     * Add inputs to test
     * TODO: Finish setting this up
     */
    private static void testCodeInputs(){
//    Input: root = [4,2,7,1,3,6,9]
        TreeNode Lleaf1 = new TreeNode(1);
        TreeNode Rleaf1 = new TreeNode(3);
        TreeNode Lleaf2 = new TreeNode(6);
        TreeNode Rleaf2 = new TreeNode(9);
        TreeNode Lbranch = new TreeNode(2,Lleaf1,Rleaf1);
        TreeNode Rbranch = new TreeNode(7,Lleaf2,Rleaf2);
        TreeNode Root = new TreeNode(4,Lbranch,Rbranch);
//    Output: [4,7,2,9,6,3,1]
//    Input: root = [2,1,3]
//    Output: [2,3,1]
//    Input: root = []
//    Output: []
        assertCode(Root);
    }

    /** Assertions
     * assertions for code
     * TODO: finish setting this up
     */
    private static void assertCode(TreeNode root){
        TreeNode tempOutput = invertTree(root);
    }
}
