package LinkedList;

import java.util.HashMap;

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
        //create new pointer
        ListNode tracker = head;
        //create hashmap
        HashMap<ListNode, Integer> map = new HashMap<ListNode, Integer>();
        //iterate through list exiting if a null is hit
        while(tracker.next != null){
            //check if current value exists in dictionary
            if ( map.containsKey(tracker) ){
                //cycle exists if so
                return true;
            }
            map.put(tracker, tracker.val);
            //iterate to next node
            tracker = tracker.next;
        }
        //since it has exited the loop, it is false
        return false;
    }
    //slow and fast pointer goes here
    //Slow pointer will go to next value and the fast pointer will skipp 2 values
    //TODO: time limit exceeded
    public boolean hasCycle2(ListNode head) {
        //base case
        if (head == null){
            return false;
        }
        //create new pointer
        ListNode trackerSlow = head;
        ListNode trackerFast = head;

        //iterate through list exiting if a null is hit
        while(trackerSlow.next != null && trackerSlow.next.next != null){
            trackerSlow = trackerSlow.next;
            trackerFast = trackerSlow.next.next;
            //if these 2 pointers meet, then it is a cycle
            if (trackerSlow == trackerFast){
                return true;
            }
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
