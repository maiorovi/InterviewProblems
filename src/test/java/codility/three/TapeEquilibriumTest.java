package codility.three;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class TapeEquilibriumTest {

    private TapeEquilibrium tapeEquilibrium;

    @Before
    public void setUp() {
        tapeEquilibrium = new TapeEquilibrium();
    }

    @Test
    public void returnCorrectAnswer() {
        assertThat(tapeEquilibrium.solution(new int[]{3, 1, 2, 4, 3})).isEqualTo(1);
    }

    @Test
    public void negativeNumbersInArray() {
        assertThat(tapeEquilibrium.solution(new int[]{-3, -1, -2, -4, -3})).isEqualTo(1);
    }

    @Test
    public void mixedArray() {
        assertThat(tapeEquilibrium.solution(new int[]{3, 2, 2, -4, -3})).isEqualTo(0);
    }

    @Test
    public void twoElemsInArray() {
        assertThat(tapeEquilibrium.solution(new int[]{-1000,1000})).isEqualTo(2000);
    }
}
