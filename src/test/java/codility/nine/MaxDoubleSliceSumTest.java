package codility.nine;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class MaxDoubleSliceSumTest {
    private MaxDoubleSliceSum maxDoubleSliceSum = new MaxDoubleSliceSum();

    @Test
    public void simpleTest() {
        assertThat(maxDoubleSliceSum.solution(new int[]{3,2,6,-1,4,5,-1,2})).isEqualTo(17);
    }

//    A[0] = 3
//    A[1] = 2
//    A[2] = 6
//    A[3] = -1
//    A[4] = 4
//    A[5] = 5
//    A[6] = -1
//    A[7] = 2
}
