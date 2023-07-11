package Arrays;

import java.util.Stack;

public class ValidPalindrome {
        /** The LeetCode link
         * https://leetcode.com/problems/valid-palindrome/
         */
        public static void main(String[] args) {
            System.out.println("Running the Assertions");
            testCodeInputs();
            System.out.println("Finished the Assertions Successfully");
        }
        /** Submitted Code
         * Code to copy paste into LeetCode
         */
        public static boolean isPalindrome(String s) {
            s = s.toLowerCase().replaceAll("[\\W_]", "");
            System.out.println(s + " Cleaned version");
            if(s.isEmpty()){
                return true;
            }
            if (s.length() == 1) {
                return true;
            }

            for (int i=0, j=s.length()-1; i<s.length()/2; i++, j--){
                System.out.println(s.charAt(i) + " " + s.charAt(j));
                if(s.charAt(i) != s.charAt(j))
                    return false;
            }

            return true;
        }

        /** Test Inputs
         * Add inputs to test
         */
        private static void testCodeInputs(){
            String s = "A man, a plan, a canal: Panama";
            boolean output = true;
            //Explanation: "amanaplanacanalpanama" is a palindrome.
            assertCode(s, output);


            s = "race a car";
            output = false;
            //Explanation: "raceacar" is not a palindrome.
            assertCode(s, output);

            s = " ";
            output = true;
            //Explanation: s is an empty string "" after removing non-alphanumeric characters.
            // Since an empty string reads the same forward and backward, it is a palindrome.
            assertCode(s, output);

            s = ".";
            output = true;
            assertCode(s, output);

            s = "ab_a";
            output = true;
            assertCode(s, output);
        }

        /** Assertions
         * assertions for code
         */
        private static void assertCode(String s, boolean answer){
            boolean result = isPalindrome(s);
            assert result == answer : String.format("The answer %b for the string %s is not correct", answer, s );
        }
}
