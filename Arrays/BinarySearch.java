package Arrays;

import java.util.Arrays;

public class BinarySearch {
    /** The LeetCode link
     * https://leetcode.com/problems/binary-search/
     */
    public static void main(String[] args) {
        System.out.println("Running the Assertions");
        testCodeInputs();
        System.out.println("Finished the Assertions Successfully");
    }
    /** Submitted Code
     * Code to copy paste into LeetCode
     */
    public static int search(int[] nums, int target) {
        if (nums.length == 1 && nums[0] == target){
            System.out.println("pass " + target);
            return 0;
        }

        int half = (nums.length-1)/2;
        int count = nums.length/2;
        int length = nums.length;
        while(count >= 0){
            if (half < 0 || half > nums.length -1){
                return -1;
            }
            if (nums[half] == target){
                System.out.println("pass " + target);
                return half;
            }
            if (nums[half] > target){
                System.out.println(half + " " + nums[half] + " > " + target);
                if (half - (nums.length-1-half)/2 == half){
                    half--;
                }
                else {
                    half = half - (nums.length-1-half)/2;
                }
                count--;
            }
            else if (nums[half] < target){
                System.out.println(half + " " + nums[half] + " < " + target);
                if (half + (nums.length-1-half)/2 == half){
                    half++;
                }
                else {
                    half = half + (nums.length-1-half)/2;
                }
                count--;
            }
        }
        System.out.println("fail " + target + " " + nums[half]);
        return -1;
    }
    /** Test Inputs
     * Add inputs to test
     */
    private static void testCodeInputs(){
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 9;
        int output = 4;
        assertCode(nums, target, output);

        nums = new int[]{-1, 0, 3, 5, 9, 12};
        target = 2;
        output = -1;
        assertCode(nums, target, output);

        nums = new int[]{2,5};
        target = 5;
        output = 1;
        assertCode(nums, target, output);

        nums = new int[]{2,5};
        target = 0;
        output = -1;
        assertCode(nums, target, output);

        nums = new int[]{-1,0,5};
        target = 5;
        output = 2;
        assertCode(nums, target, output);

        nums = new int[]{-1, 0, 3, 5, 9, 12};
        target = 12;
        output = 5;
        assertCode(nums, target, output);

        nums = new int[]{-1, 0, 3, 5, 9, 12};
        target = 0;
        output = 1;
        assertCode(nums, target, output);

        nums = new int[]{-1, 0, 3, 5, 9, 12};
        target = -1;
        output = 0;
        assertCode(nums, target, output);
    }

    /** Assertions
     * assertions for code
     */
    private static void assertCode(int[] nums, int target, int output){
        int answer = search(nums, target);
        assert output == answer : String.format("%s answer %d does not equal %d output", Arrays.toString(nums), answer, output);
    }
}
