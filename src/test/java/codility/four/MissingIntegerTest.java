package codility.four;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class MissingIntegerTest {
    private MissingInteger missingInteger = new MissingInteger();

    @Test
    public void missingIntegerTest() {
        assertThat(missingInteger.solution(new int[]{1,3,6,4,1,2})).isEqualTo(5);
    }

    @Test
    public void worksWithNegativeIntegers() {
        assertThat(missingInteger.solution(new int[]{Integer.MIN_VALUE, 0,1,2,3,4})).isEqualTo(5);
    }

    @Test
    public void worksCorrectlyForSingleElemArray() {
        assertThat(missingInteger.solution(new int[]{-1})).isEqualTo(1);
    }

}
