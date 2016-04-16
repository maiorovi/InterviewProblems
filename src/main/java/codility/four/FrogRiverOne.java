package codility.four;

import java.util.HashSet;

public class FrogRiverOne {
    public int solution(int X, int[] A) {
        HashSet<Integer> set = new HashSet<Integer>();
        int time = -1;

        for (int i = 0; i < A.length; i++) {
            if (X >= A[i]) {
                set.add(A[i]);
            }

            if (set.size() == X) {
                time = i;
                break;
            }
        }



        return time;
    }
}
