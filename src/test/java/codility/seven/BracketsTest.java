package codility.seven;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class BracketsTest {

    private Brackets brackets = new Brackets();

    @Test
    public void test() {
        assertThat(brackets.solution("{{{{")).isEqualTo(0);
    }

    @Test
    public void test1() {
        assertThat(brackets.solution("{[()()]}")).isEqualTo(1);
    }

    @Test
    public void test2() {
        assertThat(brackets.solution("([)()]")).isEqualTo(0);
    }
}
