package codility.one;

import java.util.Collections;

public class BinaryGap {

    public static void main(String[] args) {
        System.out.println(new BinaryGap().solution(1041));
    }

    public int solution(int number) {
        String binaryString = Integer.toBinaryString(number);
        String[] result = binaryString.split("1");
        int maxLength = 0;

        for (int i = 0; i < result.length - 1; i++) {
            if( maxLength < result[i].length()) {
                maxLength = result[i].length();
            }
        }

        return maxLength;
    }
}
