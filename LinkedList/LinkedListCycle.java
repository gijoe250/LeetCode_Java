package LinkedList;

import java.util.LinkedList;

public class LinkedListCycle {
    /** The LeetCode link
     * https://leetcode.com/problems/linked-list-cycle/
     */
    public static void main(String[] args) {
        System.out.println("Running the Assertions");
        testCodeInputs();
        System.out.println("Finished the Assertions Successfully");
    }
    /** Submitted Code
     * Code to copy paste into LeetCode
     */
    public boolean hasCycle(ListNode head) {
        //base case
        if (head == null){
            return false;
        }
        //1st idea use size to get the size of the linked list, if size is ever exceeded, there is a loop
        //check size of linked-list; misunderstood what size does: failed
        //TODO: 3rd idea have a key value pair and store the value and address. if both value is hit, compare the addresses
        //create new pointer
        ListNode tracker = head;
        //iterate through list exiting if a null is hit
        while(tracker.next != null){
            //check if current value exists
            //if so check if addresses equal each other
            //on yes, return true
            //TODO:on no, store temp value in key value pair
            //iterate to next node
            tracker = tracker.next;
        }
        //since it has exited the loop, it is false
        return false;
    }

    /** Test Inputs
     * Add inputs to test
     */
    private static void testCodeInputs(){
        assertCode();
    }

    /** Assertions
     * assertions for code
     */
    private static void assertCode(){
    }
}
