package codility.ten;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CountFactorsTest {
    private CountFactors factors = new CountFactors();

    @Test
    public void simpleTest() {
        assertThat(factors.solution(24)).isEqualTo(8);
    }

    @Test
    public void simpleTest2() {
        assertThat(factors.solution(2)).isEqualTo(2);
    }

    @Test
    public void simpleTest1() {
        assertThat(factors.solution(1)).isEqualTo(1);
    }

    @Test
    public void cornerCase1() {
        assertThat(factors.solution(Integer.MAX_VALUE)).isEqualTo(2);
    }

    @Test
    public void cornerCase2() {
        assertThat(factors.solution(13)).isEqualTo(2);
    }

    @Test
    public void cornerCase3() {
        assertThat(factors.solution(4)).isEqualTo(3);
    }
}
