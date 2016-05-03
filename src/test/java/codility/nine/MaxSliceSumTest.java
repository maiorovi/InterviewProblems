package codility.nine;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxSliceSumTest {
    private MaxSliceSum maxSliceSum = new MaxSliceSum();

    @Test
    public void simpleTest() {
        assertThat(maxSliceSum.solution(new int[]{3,2,-6,4,0})).isEqualTo(5);
    }

    @Test
    public void simpleTest1() {
        assertThat(maxSliceSum.solution(new int[]{10,2,-6,4,0})).isEqualTo(12);
    }

    @Test
    public void simpleTest2() {
        assertThat(maxSliceSum.solution(new int[]{-10})).isEqualTo(-10);
    }
}
