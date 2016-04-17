package codility.four;

import java.util.HashSet;

public class MissingInteger {

    public int solution(int[] A) {
        // write your code in Java SE 8
        HashSet<Integer> integers = new HashSet<Integer>();

        int minimalInteger = 1;


        for (int i = 0; i < A.length; i++) {
            integers.add(A[i]);
        }

        while (integers.contains(minimalInteger)) {
            minimalInteger++;
        }

        return minimalInteger;
    }
}
