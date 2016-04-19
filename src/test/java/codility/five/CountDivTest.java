package codility.five;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class CountDivTest {

    private CountDiv countDiv = new CountDiv();

    @Test
    public void countDivTest() {
        assertThat(countDiv.solution(6,11,2)).isEqualTo(3);
    }

    @Test
    public void countDivTest1() {
        assertThat(countDiv.solution(1,11,5)).isEqualTo(2);
    }

    @Test
    public void cournerCase() {
        assertThat(countDiv.solution(0,10,5)).isEqualTo(3);
    }

    @Test
    public void cournerCase1() {
        assertThat(countDiv.solution(0,11,5)).isEqualTo(3);
    }

    @Test
    public void cournerCase2() {
        assertThat(countDiv.solution(10,10,5)).isEqualTo(1);
    }

    @Test
    public void cournerCase3() {
        assertThat(countDiv.solution(11,14,2)).isEqualTo(2);
    }
}
