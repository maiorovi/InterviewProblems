package codility.five;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Distinct {

    public int solution(int[] A) {
        // write your code in Java SE 8
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }

        return set.size();
    }
}
