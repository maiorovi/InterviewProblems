package codility.six;

import java.util.Arrays;

public class MaxProductOfThree {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int size = A.length-1;
        int result = 0;
        if (A[0] < 0 && A[1] < 0 ) {
            result = Math.max(A[size] * A[size-1]*A[size-2],(A[size] * A[1]*A[0]));
        } else {
            result = A[size] * A[size - 1] * A[size - 2];
        }

        return result;
    }
}
