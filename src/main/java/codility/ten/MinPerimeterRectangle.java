package codility.ten;

public class MinPerimeterRectangle {
    public int solution(int N) {
        // write your code in Java SE 8
        int n = (int) Math.ceil(Math.sqrt(N));
        int minPerimiter = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            if (N % i == 0) {
                int secondSide = N / i;
                minPerimiter = Integer.min(minPerimiter, 2*(secondSide + i));
            }
        }

        return minPerimiter;
    }
}
