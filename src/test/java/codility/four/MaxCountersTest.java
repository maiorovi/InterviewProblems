package codility.four;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class MaxCountersTest {

    private MaxCounters counters = new MaxCounters();

    @Test
    public void test() {
        assertThat(counters.solution(5, new int[]{3, 4, 4, 6, 1, 4, 4})).isEqualTo(new int[]{3, 2, 2, 4, 2});
    }

    @Test
    public void testWithOneElement() {
        assertThat(counters.solution(1, new int[]{1, 4, 4, 6, 1, 4, 4})).isEqualTo(new int[]{2});
    }
}
