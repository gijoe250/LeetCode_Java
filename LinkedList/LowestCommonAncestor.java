package LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class LowestCommonAncestor {
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
        TreeNode answer = null;
        //create variables
        Queue<TreeNode> queue = new LinkedList<>();
        //call a recursive function for p
        if (root.val == p.val){
            queue.add(root);
        }else {
            //traverse p down the tree
            pRecursion(queue, root, p.val);
        }
        //clear the queue with q
        answer = qRecursion(queue, root, q, answer);

        //return answer
        return answer;
    }

    /**
     * Traverse p and store tree values in queue
     */
    private static TreeNode qRecursion(Queue<TreeNode> queue, TreeNode travel, int qValue, TreeNode answer){
        //check each value to see if in queue
        //stop if itself or value does not exist in queue
        TreeNode check = queue.remove();
        if (check.val == travel.val){
            answer = check;
            if (qValue > travel.val){
                qRecursion(queue, travel.right, qValue, answer);
            }else {
                qRecursion(queue, travel.left, qValue, answer);
            }
        }
        return answer;
    }
    private static void pRecursion(Queue<TreeNode> queue, TreeNode travel, int pValue){
        //store each value hit by p in a queue
        //stop if matching value is hit
        if (pValue == travel.val){
            queue.add(travel);
        }
        else if (pValue > travel.val){
            queue.add(travel);
            pRecursion(queue, travel.right, pValue);
        }else {
            queue.add(travel);
            pRecursion(queue, travel.left, pValue);
        }
    }
    /** Test Inputs
     * Add inputs to test
     */
    private static void testCodeInputs(){
        //        Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
        //        Output: 6
        //        Explanation: The LCA of nodes 2 and 8 is 6.
        TreeNode Lleaf1 = new TreeNode(0);
        TreeNode Rleaf1 = new TreeNode(4);
        TreeNode Lleaf2 = new TreeNode(7);
        TreeNode Rleaf2 = new TreeNode(9);
        TreeNode Lbranch = new TreeNode(2,Lleaf1,Rleaf1);
        TreeNode Rbranch = new TreeNode(8,Lleaf2,Rleaf2);
        TreeNode Root = new TreeNode(6,Lbranch,Rbranch);
        assertCode(Root, Lbranch, Rbranch, Root);
    }

    /** Assertions
     * assertions for code
     */
    private static void assertCode(TreeNode root, TreeNode p, TreeNode q, TreeNode output){
        TreeNode answer =  lowestCommonAnc(root, p, q);
        assert output == answer: String.format("No match: expected output %d != actual output %d", output.val, answer.val);
    }
}
