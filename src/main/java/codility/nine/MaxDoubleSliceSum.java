package codility.nine;

public class MaxDoubleSliceSum {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int[] maxSumEndingHere = new int[A.length];

        int maxSumStartHere[] = new int[A.length];

        for (int i = 1; i < A.length; i++) {
            maxSumEndingHere[i] = Integer.max(0, maxSumEndingHere[i-1] + A[i]);
        }

        for (int i = A.length - 2; i > 0; i--) {
            maxSumStartHere[i] = Integer.max(0, maxSumStartHere[i+1]+A[i]);
        }

        int result = 0;

        for (int i = 1; i < A.length - 1; i++) {
            result = Integer.max(result, maxSumEndingHere[i-1] + maxSumStartHere[i+1]);
        }

        return result;
    }
}
