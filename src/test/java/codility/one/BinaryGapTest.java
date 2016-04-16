package codility.one;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BinaryGapTest {

    private BinaryGap binaryGap;

    @Before
    public void setUp() {
        binaryGap = new BinaryGap();
    }

    @Test
    public void return5On1041Input() {
        assertThat(binaryGap.solution(1041)).isEqualTo(5);
    }

    @Test
    public void return0On15Input() {
        assertThat(binaryGap.solution(15)).isEqualTo(0);
    }

    @Test
    public void return3OnInput1() {
        assertThat(binaryGap.solution(1)).isEqualTo(0);
    }

    @Test
    public void return0OnInputMaxInt() {
        assertThat(binaryGap.solution(Integer.MAX_VALUE)).isEqualTo(0);
    }

    @Test
    public void return0OnInput6() {
        assertThat(binaryGap.solution(6)).isEqualTo(0);
    }

    @Test
    public void return2OnInput328() {
        assertThat(binaryGap.solution(328)).isEqualTo(2);
    }

}
