package codility.two;

public class CyclicRotation {

    public static void main(String[] args) {

    }

    public int[] solution(int[] A, int K) {
        if (K == 0) {
            return A;
        } else {
            return solution(shiftArray(A), K - 1);
        }
    }

    private int[] shiftArray(int[] arr) {
        int[] tmp = new int[arr.length];
        int counter = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                tmp[0] = arr[tmp.length - 1];
                continue;
            }
            tmp[i+1] = arr[i];
        }

        return tmp;
    }
}
