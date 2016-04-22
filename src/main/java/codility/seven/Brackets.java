package codility.seven;

import java.util.HashMap;
import java.util.Stack;
import java.util.stream.Collector;

public class Brackets {

    private HashMap<Character, Character> mapping = new HashMap<>();

    {
        mapping.put('{','}');
        mapping.put('[', ']');
        mapping.put('(',')');
    }

    public int solution(String s) {
        // write your code in Java SE 8
        Stack<Character> stack = new Stack<>();
//        char[] characters = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '}' || s.charAt(i) == ')' || s.charAt(i) == ']') {
                if (stack.isEmpty()) {
                    return 0;
                } else {
                    Character topChar = stack.pop();
                    if (mapping.get(topChar) != s.charAt(i)) {
                        return 0;
                    } else {
                        continue;
                    }
                }
            } else {
                stack.push(s.charAt(i));
            }
        }


        return stack.isEmpty() ? 1 : 0;
    }
}
