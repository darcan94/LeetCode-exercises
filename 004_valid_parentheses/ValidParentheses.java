/**
 * 
 *  Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

    An input string is valid if:
        Open brackets must be closed by the same type of brackets.
        Open brackets must be closed in the correct order.
        Every close bracket has a corresponding open bracket of the same type.
 

    Example 1:
        Input: s = "()"
        Output: true

    Example 2:
        Input: s = "()[]{}"
        Output: true
    
    Example 3:
        Input: s = "(]"
        Output: false
 */
import java.util.Stack;
public class ValidParentheses {
    public static void main(String[] args) {
        boolean validParentheses = validParentheses("([}}])");
        System.out.println(validParentheses);
    }

    public static boolean validParentheses(String str){
        int strlen = str.length();
        Stack<Character> stack = new Stack<>();
        if(strlen%2 != 0) return false;
        for(char c: str.toCharArray()){
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            }else if(c == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }else if(c == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }else if(c == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }else{
                return false;
            }
        }
        return stack.isEmpty();
    }
}
