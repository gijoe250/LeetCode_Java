package Miscellaneous;

import java.util.HashMap;

public class ValidAnagram {
    /** The LeetCode link
     * https://leetcode.com/problems/valid-anagram/
     */
    public static void main(String[] args) {
        System.out.println("Running the Assertions");
        testCodeInputs();
        System.out.println("Finished the Assertions Successfully");
    }
    /** Submitted Code
     * Code to copy paste into LeetCode
     */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> anagram = new HashMap<>();
        for (int i=0; i < s.length(); i++){
            int sTemp = anagram.getOrDefault(s.charAt(i), 0) + 1;
            if(sTemp == 0){
                anagram.remove(s.charAt(i));
            }
            else {
                anagram.put(s.charAt(i), sTemp);
            }
            int tTemp = anagram.getOrDefault(t.charAt(i), 0) - 1;
            if(tTemp == 0){
                anagram.remove(t.charAt(i));
            }
            else {
                anagram.put(t.charAt(i), tTemp);
            }
        }
        return anagram.isEmpty();
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

