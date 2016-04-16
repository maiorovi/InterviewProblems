package codility.three;

public class PermMissingElem {

    public int solution(int[] A) {
        int length = A.length;
        int actualSum = sum(A);
        int expectedSum = $sum(A.length+1);
        return expectedSum - actualSum;
    }

    private int sum(int a[]) {
        int acc = 0;

        for (int i = 0; i < a.length; i++) {
            acc += a[i];
        }

        return acc;
    }

    private int $sum(int a) {
        int acc = 0;

        for (int i = 1; i <= a; i++) {
            acc += i;
        }

        return acc;
    }
}
