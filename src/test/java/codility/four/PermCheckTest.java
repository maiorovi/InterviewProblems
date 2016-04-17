package codility.four;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PermCheckTest {
    private PermCheck permCheck = new PermCheck();

    @Test
    public void permuationArrayReturnsOne() {
        assertThat(permCheck.solution(new int[]{1,2,3,4,5})).isEqualTo(1);
    }

    @Test
    public void nonPermutationArrayReturnsZero() {
        assertThat(permCheck.solution(new int[]{1,2,7,4,5})).isEqualTo(0);
    }

    @Test
    public void nonPermutationArrayReturnsZeroRepetition() {
        assertThat(permCheck.solution(new int[]{1,2,3,4,5,1})).isEqualTo(0);
    }

    @Test
    public void trickyInput() {
        assertThat(permCheck.solution(new int[]{1,4,1})).isEqualTo(0);
    }
}
