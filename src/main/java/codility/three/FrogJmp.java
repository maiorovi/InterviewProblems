package codility.three;

/**
 * Created by Egor on 16.04.2016.
 */
public class FrogJmp {

    public int solution(int X, int Y, int D) {
        int result = (Y-X) / D;

        if (result*D < (Y-X)) {
            result = result+1;
        }

        return result;
    }
}
