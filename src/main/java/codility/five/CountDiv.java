package codility.five;

public class CountDiv {

    public int solution(int A, int B, int K) {
        // write your code in Java SE 8
        int a = A / K;
        int b = B / K;
        if (A % K == 0) {
            b++;
        }

        return b-a;
    }
}
