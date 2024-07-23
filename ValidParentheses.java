package DSA;
import java.util.*;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else {
                if (st.isEmpty()) return false;
                char top = st.pop();
                if ((ch == ')' && top == '(') || (ch == ']' && top == '[') || (ch == '}' && top == '{')) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {

        System.out.println(isValid("()[]{}")); 
        System.out.println(isValid("(]")); 
        
    }
}

