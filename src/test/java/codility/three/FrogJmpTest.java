package codility.three;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

/**
 * Created by Egor on 16.04.2016.
 */
public class FrogJmpTest {

    private FrogJmp frogJmp;

    @Before
    public void setUp() {
        frogJmp = new FrogJmp();
    }

    @Test
    public void countTheNumberOfJumpsToReachTargetLocation() {
        assertThat(frogJmp.solution(10,85,30)).isEqualTo(3);
    }

    @Test
    public void whenFrogStartAndTargePositionAreEqualResultIsZero() {
        assertThat(frogJmp.solution(1,1,1)).isEqualTo(0);
    }
}


