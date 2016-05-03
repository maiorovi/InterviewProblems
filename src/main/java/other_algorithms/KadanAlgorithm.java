package other_algorithms;

public class KadanAlgorithm {

    public int solution(int a[]) {
        int maxEndingHere = 0;
        int maxSoFar=0;

        for (int i = 0; i < a.length; i++) {
            maxEndingHere = Integer.max(0, maxEndingHere + a[i]);
            maxSoFar = Integer.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }
}
