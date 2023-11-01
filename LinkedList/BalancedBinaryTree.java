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
        //track a left count and right count
        int[] count = new int[]{0,0};
        //create a function to traverse the tree
        //return answer
        return countNodes(root, count);
    }

    /**
     * The range of nodes is 0 to 5000
     * node can be positive or negative
     */
    private static boolean countNodes(TreeNode node, int[] count){
        //edge case if null
        if (node == null){
            return true;
        }
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
        TreeNode root = new TreeNode(3,Lbranch,Rbranch);
        boolean output = true;
        assertCode(root, output);
//        Input: root = [1,2,2,3,3,null,null,4,4]
//        Output: false
        TreeNode Lleaf3 = new TreeNode(4);
        TreeNode Rleaf3 = new TreeNode(4);
        TreeNode Lleaf1 = new TreeNode(3, Lleaf3, Rleaf3);
        TreeNode Rleaf1 = new TreeNode(3);
        Lbranch = new TreeNode(2, Lleaf1, Rleaf1);
        Rbranch = new TreeNode(2);
        root = new TreeNode(1,Lbranch,Rbranch);
        output = false;
        assertCode(root, output);

//        Input: root = []
//        Output: true
        output = true;
        assertCode(null, output);
    }

    /** Assertions
     * assertions for code
     */
    private static void assertCode(TreeNode root, boolean expected){
        boolean given = isBalanced(root);
        assert given == expected : String.format("The give boolean %b does not match expected boolean %b", given, expected);
    }
}
