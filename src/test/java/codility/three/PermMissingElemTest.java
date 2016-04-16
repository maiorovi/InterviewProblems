package codility.three;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PermMissingElemTest {

    private PermMissingElem missingElem;

    @Before
    public void setUp() {
        missingElem = new PermMissingElem();
    }

    @Test
    public void missingFour() {
        assertThat(missingElem.solution(new int[]{2,3,1,5})).isEqualTo(4);
    }

    @Test
    public void emptyArray() {
        assertThat(missingElem.solution(new int[]{})).isEqualTo(1);
    }

    @Test
    public void missingFirst() {
        assertThat(missingElem.solution(new int[]{2,3,4,5,6})).isEqualTo(1);
    }

}
