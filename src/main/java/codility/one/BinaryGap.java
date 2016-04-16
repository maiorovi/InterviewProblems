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
        int length = 0;
        if (binaryString.endsWith("1"))
            length = result.length;
        else {
            length = result.length - 1;
        }

        for (int i = 0; i < length; i++) {
            if( maxLength < result[i].length()) {
                maxLength = result[i].length();
            }
        }

        return maxLength;
    }
}
