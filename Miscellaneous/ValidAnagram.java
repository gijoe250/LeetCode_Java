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
            if (anagram.containsKey(s.charAt(i))){
                int tempValue = anagram.get(s.charAt(i));
                if (tempValue + 1 == 0){
                    anagram.remove(s.charAt(i));
                }else {
                    anagram.put(s.charAt(i), tempValue + 1);
                }
            }else {
                anagram.put(s.charAt(i), 1);
            }
            if (anagram.containsKey(t.charAt(i))){
                int tempValue = anagram.get(t.charAt(i));
                if (tempValue - 1 == 0){
                    anagram.remove(t.charAt(i));
                }else {
                    anagram.put(t.charAt(i), tempValue - 1);
                }
            }else {
                anagram.put(t.charAt(i), -1);
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

