package codility.four;

public class MaxCounters {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] counters = new int[N];
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] < N+1) {
                counters[A[i]-1]++;
                if (max < counters[A[i]-1]) {
                    max = counters[A[i]-1];
                }
            } else if (A[i] == N+1){
                for (int j = 0; j < counters.length; j++) {
                    counters[j] = max;
                }
            }
        }

        return counters;
    }
}
