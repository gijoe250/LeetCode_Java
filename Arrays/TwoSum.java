package Arrays;

import java.util.HashMap;
import java.util.Map;

/** LeetCode Link
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum {
    public static void main(String[] args){
        System.out.println("Running the Assertions");
        testCodeInputs();
        System.out.println("Finished the Assertions Successfully");
    }
    /** Submitted Code
     * Code to copy paste into LeetCode
     * Naive iteration
     */
    private static int[] twoSum(int[] nums, int target) {
        int[] answer = {};

        for (int i=0; i< nums.length-1; i++){
            for (int j=1; j< nums.length; j++){
                if (nums[j] + nums[i] == target && i != j){
                    answer = new int[]{i,j};
                }
            }
        }
        return answer;
    }

    /**
     * Fast Iteration
     */
    public static int[] twoSumFast(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] answer = new int[2];
        for(int i=0; i< nums.length; i++){
            if(map.containsKey(target - nums[i])){
                answer[0] = map.get(target-nums[i]);
                answer[1] = i;
                return answer;
            }
            map.put(nums[i],i);
        }
        return answer;
    }

    /** Test Inputs
     * Add inputs to test
     */
    private static void testCodeInputs(){
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] numsAnswer = {0,1};

        assertCode(nums, target, numsAnswer);

        nums = new int[]{3,2,4};
        target = 6;
        numsAnswer = new int[]{1,2};

        assertCode(nums, target, numsAnswer);

        nums = new int[]{3,3};
        target = 6;
        numsAnswer = new int[]{0,1};

        assertCode(nums, target, numsAnswer);
    }

    /** Assertions
     * assertions for code
     */
    private static void assertCode(int[] nums, int target, int[] numsAnswer){
        int[] answer = twoSum(nums, target); // Calls your implementation
//        int[] answer = twoSumFast(nums, target); // Calls your implementation

        assert numsAnswer[0] == answer[0] && numsAnswer[1] == answer[1] : String.format("No match: %d != %d and %d != %d", numsAnswer[0], answer[0], numsAnswer[1], answer[1]);
        assert nums[answer[0]] + nums[answer[1]] == target : String.format("%d and %d do not add up to target %d", nums[numsAnswer[0]], nums[numsAnswer[1]], target);
    }
}
