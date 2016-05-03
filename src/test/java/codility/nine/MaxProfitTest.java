package codility.nine;

import codility.nine.MaxProfit;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class MaxProfitTest {
    private MaxProfit maxProfit = new MaxProfit();

    @Test
    public void test() {
        assertThat(maxProfit.solution(new int[]{23171, 21011, 21123, 21366, 21013, 21367})).isEqualTo(356);
    }

    @Test
    public void emptyArrayTest() {
        assertThat(maxProfit.solution(new int[]{})).isEqualTo(0);
    }

    @Test
    public void noProfitTest() {
        assertThat(maxProfit.solution(new int[]{23171, 21011,21011,21011,21011,21011,20000})).isEqualTo(0);
    }

    @Test
    public void cornercase0() {
        assertThat(maxProfit.solution(new int[]{8,9,3,6,1,2})).isEqualTo(3);
    }
}