package codility.seven;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class FishTest {
    private Fish fish = new Fish();

    @Test
    public void test0() {
        assertThat(fish.solution(new int[]{4,3,2,1,5}, new int[]{0,1,0,0,0})).isEqualTo(2);
    }

    @Test
    public void test1() {
        assertThat(fish.solution(new int[]{4,6,2,1,5}, new int[]{0,1,0,0,0})).isEqualTo(2);
    }

    @Test
    public void test2() {
        assertThat(fish.solution(new int[]{4,6,2,1,5}, new int[]{0,1,1,0,0})).isEqualTo(2);
    }

}
