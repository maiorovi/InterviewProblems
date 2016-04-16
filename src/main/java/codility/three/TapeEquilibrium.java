package codility.three;

public class TapeEquilibrium {


    public int solution(int[] A) {
        // write your code in Java SE 8
        int sum = sum(A);
        int stackingSum = 0;
        int diff = Integer.MAX_VALUE;

        for (int i = 0; i < A.length; i++) {
            stackingSum = stackingSum + A[i];
            sum = sum - A[i];
            System.out.println(Math.abs(stackingSum - sum));
           int expr = Math.abs(stackingSum - sum);

           if (diff > expr) {
               diff = expr;
           }
        }

        return diff;
    }

    private int sum(int[] arr) {
        int acc = 0;
        for (int i = 0; i < arr.length; i++) {
            acc += arr[i];
        }

        return acc;
    }
}
