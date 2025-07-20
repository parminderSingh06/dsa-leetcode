package stack;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {

        //If string length is odd then logically the brackets cannot be valid.
        if(s.length() % 2 != 0) return false;

        //Create stack of characters to pass in opening brackets.
        Stack<Character> stack = new Stack<>();


        //Loop through the array only once.
        for(int i=0;i<s.length();i++){

            //Push opening brackets only into the stack.
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }
            else{
                //If the stack is empty that means we started the array with an closing bracket so the string is false.
                if(stack.empty()) return false;

                char poppedChar = stack.pop();

                //These conditionals are to check if the closing brackets match the opening ones when popped.
                if(s.charAt(i) == ')'){
                    if(poppedChar != '(') return false;
                    continue;
                }
                if(s.charAt(i) == ']'){
                    if(poppedChar != '[') return false;
                    continue;
                }
                if(s.charAt(i) == '}'){
                    if(poppedChar != '{') return false;
                    continue;
                }
            }
        }

        //If the stack is not empty when we leave that means some brackets were never closed of we return false.
        if(!stack.empty()) return false;

        return true;
    }
}
