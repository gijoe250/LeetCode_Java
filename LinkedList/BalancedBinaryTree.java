package LinkedList;

public class BalancedBinaryTree {
    /** The LeetCode link
     * https://leetcode.com/problems/balanced-binary-tree/
     */
    public static void main(String[] args) {
        System.out.println("Running the Assertions");
        testCodeInputs();
        System.out.println("Finished the Assertions Successfully");
    }
    /** Submitted Code
     * Code to copy paste into LeetCode
     */
    public static boolean isBalanced(TreeNode root) {
        //create a function to traverse the tree
        //track a left count and right count

        //return if next leaf is null
    }

    private int[] countNodes(TreeNode node, int leftCount, int rightCount){

    }

    /** Test Inputs
     * Add inputs to test
     */
    private static void testCodeInputs(){
        // Input: root = [3,9,20,null,null,15,7]
        // Output: true
        TreeNode Lleaf2 = new TreeNode(15);
        TreeNode Rleaf2 = new TreeNode(7);
        TreeNode Lbranch = new TreeNode(9);
        TreeNode Rbranch = new TreeNode(20,Lleaf2,Rleaf2);
        TreeNode Root = new TreeNode(3,Lbranch,Rbranch);
        boolean output = true;
        assertCode(Root, output);
    }

    /** Assertions
     * assertions for code
     */
    private static void assertCode(TreeNode root, boolean expected){
        boolean given = isBalanced(root);
        assert given == expected : String.format("The give boolean %b does not match expected boolean %b", given, expected);
    }
}
