package other_algorithms;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class KadanaAlgorithmTest {

    private KadanAlgorithm kadanAlgorithm = new KadanAlgorithm();

    @Test
    public void simpleTest() {
        assertThat(kadanAlgorithm.solution(new int[]{0,1,2,3,4,5})).isEqualTo(15);
    }

    @Test
    public void simpleTest1() {
        assertThat(kadanAlgorithm.solution(new int[]{0,1,2,-3,4,5})).isEqualTo(9);
    }

    @Test
    public void simpleTest2() {
        assertThat(kadanAlgorithm.solution(new int[]{-1,-2,-3,4,5})).isEqualTo(9);
    }




}
