package codility.seven;

import java.util.Stack;

public class Nested {

    public int solution(String s) {
        int counter = 0;
        if (s == null) {
            return 0;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return 0;
                }

                stack.pop();
            } else if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }

}
