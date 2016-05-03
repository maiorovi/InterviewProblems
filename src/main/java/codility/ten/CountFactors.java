package codility.ten;

public class CountFactors {
    public int solution(int N) {
        // write your code in Java SE 8
        int n = (int) Math.floor(Math.sqrt(N));
        int numberOfFactors = 0;

        for (int i = 1; i <= n; i++) {
            if (N % i == 0) {
                if (N / i == (N / (N/i))) {
                    numberOfFactors += 1;
                } else {
                    numberOfFactors += 2;
                }
            }
        }

        return numberOfFactors;
    }
}
