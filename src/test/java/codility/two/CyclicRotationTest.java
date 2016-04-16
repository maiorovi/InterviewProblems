package codility.two;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CyclicRotationTest {

    private CyclicRotation cyclicRotation;

    @Before
    public void setUp() {
        cyclicRotation = new CyclicRotation();
    }

    @Test
    public void rotateArrayByOneRightShift() {
        int testArr[] = new int[]{1,2,3,4,5,6};
        assertThat(cyclicRotation.solution(testArr, 1)).isEqualTo(new int[]{6,1,2,3,4,5});
    }

    @Test
    public void rotateArrayBy3RightShift() {
        int testArr[] = new int[]{1,2,3,4,5,6};
        assertThat(cyclicRotation.solution(testArr, 3)).isEqualTo(new int[]{4,5,6,1,2,3});
    }

    @Test
    public void circleRotation() {
        int testArr[] = new int[]{1,2,3,4,5,6};
        assertThat(cyclicRotation.solution(testArr, 6)).isEqualTo(new int[]{1,2,3,4,5,6});
    }

    @Test
    public void oneHundreadRotations() {
        int testArr[] = new int[]{1,2,3,4,5,6};
        assertThat(cyclicRotation.solution(testArr, 100)).isEqualTo(new int[]{3,4,5,6,1,2});
    }

    @Test
    public void noWorkDoneWhenGivenZeroRotations() {
        int testArr[] = new int[]{1,2,3,4,5,6};
        assertThat(cyclicRotation.solution(testArr, 0)).isEqualTo(testArr);
    }


}
