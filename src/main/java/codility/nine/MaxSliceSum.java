package codility.nine;

import java.util.ArrayList;

public class MaxSliceSum {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int maxSlice = A[0];
        int maxSliceEndingHere = A[0];

        for (int i = 1; i < A.length; i++) {
            maxSliceEndingHere = Integer.max(A[i], maxSliceEndingHere + A[i]);
            maxSlice = Integer.max(maxSlice, maxSliceEndingHere);
        }

        return maxSlice;
    }
}
