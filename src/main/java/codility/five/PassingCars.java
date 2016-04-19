package codility.five;

public class PassingCars {

    public int solution(int[] A) {

        // write your code in Java SE 8
        int result = 0;
        int factor = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                factor += 1;
            }

            if (A[i] == 1) {
                result += factor;
            }

            if (result > 1000000000) {
                result = -1;
                break;
            }
        }

        return result;
    }
}
