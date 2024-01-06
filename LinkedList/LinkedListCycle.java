package LinkedList;

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
        //if next is null return false
        //maybe have another function to call itself if not false
        //TODO: 1st idea use size to get the size of the linked list, if size is ever exceeded, there is a loop
        //TODO: 2nd idea place a pointer on each location or a traveling point passed and store the value. if the value is found, check if the address matches the pointer
        //TODO: 3rd idea have a key value pair and store the value and address. if both value is hit, compare the addresses
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
