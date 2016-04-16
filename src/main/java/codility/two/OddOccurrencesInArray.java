package codility.two;

public class OddOccurrencesInArray {

    public int solution(int[] A) {
        int missingNumber = 0;
        for (int i = 0; i < A.length; i++) {
            missingNumber = missingNumber ^ A[i];
        }

        return missingNumber;
    }
}
