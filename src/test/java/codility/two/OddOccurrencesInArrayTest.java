package codility.two;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OddOccurrencesInArrayTest {
    private OddOccurrencesInArray oddOccurrencesInArray;

    @Before
    public void setUp() {
        oddOccurrencesInArray = new OddOccurrencesInArray();
    }

    @Test
    public void findTheMissingNumberInArray() {
        assertThat(oddOccurrencesInArray.solution(new int[]{9,3,9,3,9,7,9})).isEqualTo(7);
    }
}
