package LeetCode;

import java.util.Stack;

/**
 * Created by yiwei on 2018/4/12.
 */
public class ValidParentheses {
    /**
     * Given a string containing "just" the characters '(', ')', '{', '}', '[' and ']',
     * determine if the input string is valid.
     *
     * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
     *
     * case 1 : ()[]{}
     * case 2 : (]
     * case 3 : ([)]
     *
     *
     *
     * @param s
     * @return
     */


    public static boolean isValid(String s){

        if (s==null | s.length()==0 )return true;
        Stack<Character> stack = new Stack<Character>();
        if (s.length() % 2 == 1 )return false;
        for (char c : s.toCharArray()) {

            if (c == '(')
                stack.push(')');
            else if (c == '[')
                stack.push(']');
            else if (c == '{')
                stack.push('}');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }

        return stack.isEmpty();









    }
}
