package codility.six;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxProductOfThreeTest {
    private MaxProductOfThree productOfThree = new MaxProductOfThree();

    @Test
    public void simple() {
        assertThat(productOfThree.solution(new int[]{-3,1,2,-2,5,6})).isEqualTo(60);
    }

    @Test
    public void negative() {
        assertThat(productOfThree.solution(new int[]{-3,-2,-1,5,6})).isEqualTo(36);
    }

    @Test
    public void negative1() {
        assertThat(productOfThree.solution(new int[]{-5,5,-5,4})).isEqualTo(125);
    }

    @Test
    public void positiveCorner() {
        assertThat(productOfThree.solution(new int[]{10,10,10})).isEqualTo(1000);
    }
}
