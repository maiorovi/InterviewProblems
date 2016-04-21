package codility.six;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TriangleTest {
    private Triangle triangle = new Triangle();

    @Test
    public void input1() {
        assertThat(triangle.solution(new int[]{5,3,3})).isEqualTo(1);
    }
}
