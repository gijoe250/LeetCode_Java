package LinkedList;

public class MergeTwoSortedLists {
    /** The LeetCode link
     * https://leetcode.com/problems/merge-two-sorted-lists/
     */
    public static void main(String[] args) {
        System.out.println("Running the Assertions");
        testCodeInputs();
        System.out.println("Finished the Assertions Successfully");
    }
    /** Submitted Code
     * Code to copy paste into LeetCode
     * Definition for singly-linked list.
     *  public class ListNode {
     *      int val;
     *      ListNode next;
     *      ListNode() {}
     *      ListNode(int val) { this.val = val; }
     *      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     */
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode temp =  head;

        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        if(list1.val <= list2.val){
            head = list1;
            temp = head;
            list1 = list1.next;
        } else{
            head = list2;
            temp = head;
            list2 = list2.next;
        }

        while(list1 != null && list2 != null){
            System.out.println(temp.val + " " + list1.val + " " + list2.val);
            if( list1.val <= list2.val){
                temp.next = list1;
                temp = temp.next;
                list1 = list1.next;
            }
            else {
                temp.next = list2;
                temp = temp.next;
                list2 = list2.next;
            }
        }
        if(list1 != null){
            temp.next = list1;
        }
        if(list2 != null){
            temp.next = list2;
        }
        return head;
    }

    /** Test Inputs
     * Add inputs to test
     */
    private static void testCodeInputs(){
        ListNode temp3 =  new ListNode(4);
        ListNode temp2 =  new ListNode(2, temp3);
        ListNode list1 =  new ListNode(1, temp2);

        ListNode temp4 =  new ListNode(4);
        ListNode temp5 =  new ListNode(3, temp4);
        ListNode list2 =  new ListNode(1, temp5);
        int[] output = new int[]{1,1,2,3,4,4};
        assertCode(list1, list2, output);

        list1 = null;
        list2 = null;
        output = null;
        assertCode(list1, list2, output);

        list1 = null;
        list2 = new ListNode(0);
        output = new int[]{0};
        assertCode(list1, list2, output);
    }

    /** Assertions
     * assertions for code
     */
    private static void assertCode(ListNode list1, ListNode list2, int[] answer){
        ListNode output = mergeTwoLists(list1, list2);
        ListNode temp = output;
        int i=0;

        while(temp != null){
            assert answer[i] == temp.val : String.format("No match at index %d: val %d != ans %d", i, temp.val, answer[i]);
            i++;
            temp = temp.next;
        }

    }
}
