package Arrays;

import java.util.Stack;

public class ValidParentheses {
    /** The LeetCode link
     * https://leetcode.com/problems/valid-parentheses/
     */
    public static void main(String[] args) {
        System.out.println("Running the Assertions");
        testCodeInputs();
        System.out.println("Finished the Assertions Successfully");
    }
    /** Submitted Code
     * This is code to copy and paste into LeetCode
     */
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for(int i=0; i< s.length(); i++){
            if ( s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }
            else if ( s.charAt(i) == ')'){
                if(stack.empty()){
                    return false;
                }
                char check = stack.pop();
                if(check != '('){
                    return false;
                }
            }
            else if ( s.charAt(i) == '}'){
                if(stack.empty()){
                    return false;
                }
                char check = stack.pop();
                if(check != '{'){
                    return false;
                }
            }
            else if ( s.charAt(i) == ']'){
                if(stack.empty()){
                    return false;
                }
                char check = stack.pop();
                if(check != '['){
                    return false;
                }
            }
        }
        return stack.empty();
    }
    /** Test Inputs
     * Add inputs to test
     */
    private static void testCodeInputs(){
        String s = "()";
        assertCode(s, true);

        s = "()[]{}";
        assertCode(s, true);

        s = "(]";
        assertCode(s, false);

        s = "(";
        assertCode(s, false);
    }

    /** Assertions
     * assertions for code
     */
    private static void assertCode(String s, boolean answer){
        System.out.println("The answer for " + s + " is : " + isValid(s));
    }
}
