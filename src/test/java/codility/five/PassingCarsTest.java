package codility.five;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class PassingCarsTest {

    private PassingCars passingCars = new PassingCars();

    @Test
    public void test() {
        assertThat(passingCars.solution(new int[]{0,1,0,1,1})).isEqualTo(5);
    }



}
