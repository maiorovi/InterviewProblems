package codility.seven;

import java.util.Stack;

public class Fish {

    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
         Stack<Integer> stack = new Stack<Integer>();
        int aliveFishCount = A.length;

        for (int i = 0; i < A.length; i++) {
            if (B[i] == 1) {
                stack.push(i);
            } else if (B[i] == 0) {
                    while (!stack.isEmpty()) {
                        Integer index = stack.pop();
                        if (A[index] > A[i]) {
                            stack.push(index);
                            aliveFishCount--;
                            break;
                        } else {
                            aliveFishCount--;
                        }
                    }
                }
        }

        return aliveFishCount;
    }
}
