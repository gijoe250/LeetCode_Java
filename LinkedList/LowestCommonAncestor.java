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
//    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        TreeNode answer = new TreeNode();
//        //create variables
//        Queue<TreeNode> queue = new LinkedList<>();
//        //call a recursive function for p
//        if (root.val == p.val){
//            queue.add(root);
//        }else {
//            //traverse p down the tree
//            pRecursion(queue, root, p.val);
//        }
//        //clear the queue with q
//        answer = qRecursion(queue, root, q.val, answer);
//        //return answer
//        return answer;
//    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val == p.val || root.val == q.val){
            return root;
        }
        else if (root.val < p.val && root.val < q.val){
            root = lowestCommonAncestor(root.right, p, q);
        }
        else if (root.val > p.val && root.val > q.val){
            root = lowestCommonAncestor(root.left, p, q);
        }

        return root;
    }

        /**
         * Traverse p and store tree values in queue
         */
    private static TreeNode qRecursion(Queue<TreeNode> queue, TreeNode travel, int qValue, TreeNode answer){
        //check each value to see if in queue
        //stop if itself or value does not exist in queue
        if (!queue.isEmpty()){
            TreeNode check = queue.remove();
            if (check.val == travel.val){
                answer = check;
                if (qValue > travel.val){
                    answer = qRecursion(queue, travel.right, qValue, answer);
                }else if(qValue < travel.val){
                    answer = qRecursion(queue, travel.left, qValue, answer);
                }
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
        TreeNode Lleaf0 = new TreeNode(0);
        TreeNode Rleaf4 = new TreeNode(4);
        TreeNode Lleaf7 = new TreeNode(7);
        TreeNode Rleaf9 = new TreeNode(9);
        TreeNode Lbranch2 = new TreeNode(2,Lleaf0,Rleaf4);
        TreeNode Rbranch8 = new TreeNode(8,Lleaf7,Rleaf9);
        TreeNode Root = new TreeNode(6,Lbranch2,Rbranch8);
        assertCode(Root, Lbranch2, Rbranch8, Root);

        //        Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
        //        Output: 2
        //        Explanation: The LCA of nodes 2 and 8 is 6.
        assertCode(Root, Lbranch2, Rleaf4, Lbranch2);
    }

    /** Assertions
     * assertions for code
     */
    private static void assertCode(TreeNode root, TreeNode p, TreeNode q, TreeNode output){
        TreeNode answer =  lowestCommonAncestor(root, p, q);
        assert output == answer: String.format("No match: expected output %d != actual output %d", output.val, answer.val);
    }
}
