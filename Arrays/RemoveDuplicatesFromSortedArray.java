package Arrays;

/** The LeetCode link
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/
 */
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args){
        System.out.println("Running the Assertions");
        testRemoveDuplicates();
        System.out.println("Finished the Assertions Successfully");
    }
    /** Submitted Code
     * Code to copy paste into LeetCode
     */
    private static int removeDuplicates(int[] nums) {
        int tempIndex = 1;

        for(int i=1; i< nums.length; i++){
            if(nums[i-1] != nums[i]){
                nums[tempIndex] = nums[i];
                tempIndex++;
            }
        }

        return tempIndex;
    }

    /** Test Inputs
     * Add inputs to test
     */
    private static void testRemoveDuplicates(){
        int[] nums = {1,1,2};
        int[] expectedNums = {1,2}; // The expected answer with correct length

        assertRemoveDuplicates(nums, expectedNums);

        nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        expectedNums = new int[]{0,1,2,3,4};

        assertRemoveDuplicates(nums, expectedNums);
    }

    /** Assertions
     * assertions for code
     */
    private static void assertRemoveDuplicates(int[] nums, int[] expectedNums){

        int k = removeDuplicates(nums); // Calls your implementation

        assert k == expectedNums.length : "lengths dont match";
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i] : String.format("%d nums doesnt match expected %d",nums[i], expectedNums[i]);
        }
    }
}
