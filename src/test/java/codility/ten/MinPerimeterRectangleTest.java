package codility.ten;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MinPerimeterRectangleTest {
    private MinPerimeterRectangle minPerimeterRectangle = new MinPerimeterRectangle();

    @Test
    public void test1() {
        assertThat(minPerimeterRectangle.solution(30)).isEqualTo(22);
    }

    @Test
    public void test2() {
        assertThat(minPerimeterRectangle.solution(31)).isEqualTo(64);
    }

    @Test
    public void cornerCase1() {
        assertThat(minPerimeterRectangle.solution(1)).isEqualTo(4);
    }

    @Test
    public void cornerCase2() {
        assertThat(minPerimeterRectangle.solution(1000000000)).isEqualTo(126500);
    }
}
