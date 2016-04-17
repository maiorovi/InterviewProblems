package codility.four;

public class PermCheck {


    public int solution(int[] A) {
        // write your code in Java SE 8
        int[] check = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            if (A[i] <= A.length) {
                check[A[i]-1] = A[i];
            }
        }

        for (int i = 0; i < check.length; i++) {
            if (check[i] == 0) {
                return 0;
            }
        }

        return 1;
    }
}
