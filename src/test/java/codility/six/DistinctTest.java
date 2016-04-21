package codility.six;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DistinctTest {
    private Distinct distinct = new Distinct();

    @Test
    public void simple() {
        assertThat(distinct.solution(new int[]{1,1,2,2,3})).isEqualTo(3);
    }
}
