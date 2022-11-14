package Easy;

import java.util.Stack;

public class Valid_Parentheses {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {// odd number of parentheses is not valid 
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (c == ')' && top != '(') {
                    return false;
                }
                if (c == ']' && top != '[') {
                    return false;
                }
                if (c == '}' && top != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public boolean isValid2(String s) {
       if(s.length() % 2 != 0) return false;
         Stack<Character> stack = new Stack<>();

         for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c =='(' || c == '{' || c == '['){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if(c == ')' && top != '(') return false;
                if(c == '}' && top != '{') return false;
                if(c == ']' && top != '[') return false;

            }
         }
            return stack.isEmpty();
    }
}

