package codility.seven;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NestedTest {
    private Nested nested = new Nested();

    @Test
    public void simpleCase() {
        assertThat(nested.solution("()")).isEqualTo(1);
    }

    @Test
    public void negativeCase() {
        assertThat(nested.solution("(()")).isEqualTo(0);
    }

    @Test
    public void negativeCase1() {
        assertThat(nested.solution("()(")).isEqualTo(0);
    }

    @Test
    public void negativeCase2() {
        assertThat(nested.solution("())")).isEqualTo(0);
    }

    @Test
    public void emptyStringCase() {
        assertThat(nested.solution("")).isEqualTo(1);
    }

    @Test
    public void specialCase() {
        assertThat(nested.solution(")(")).isEqualTo(0);
    }
}
