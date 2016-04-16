package codility.four;


import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import static org.assertj.core.api.Assertions.assertThat;

public class FrogRiverOneTest {
    private FrogRiverOne frogRiverOne;

    @Before
    public void setUp() {
        frogRiverOne = new FrogRiverOne();
    }


    @Test
    public void find6AsSolution() {
        assertThat(frogRiverOne.solution(5, new int[]{1,3,1,4,2,3,5,4})).isEqualTo(6);
    }

    @Test
    public void returnMinusOneWhenPasNotExist() {
        assertThat(frogRiverOne.solution(5, new int[]{1,3,1,4,2,1,5,4})).isEqualTo(6);
    }

}
