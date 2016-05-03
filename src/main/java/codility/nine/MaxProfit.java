package codility.nine;

import java.util.stream.IntStream;

public class MaxProfit {

    public int solution(int[] A) {
        // write your code in Java SE 8


        if (A.length == 0) {
            return 0;
        }

        int maxProfit = 0;
        int localMinValue = A[0];

        for (int i = 1; i < A.length; i++) {
            if (localMinValue > A[i]) {
                localMinValue = A[i];
                continue;
            }
            int currentProfit = A[i] - localMinValue;

            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }
        }

        return  maxProfit;
    }

}
