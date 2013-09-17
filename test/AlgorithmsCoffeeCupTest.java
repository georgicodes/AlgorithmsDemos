import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class AlgorithmsCoffeeCupTest {

    @Test
    public void shouldFindK() {
        int[] ints = new int[]{4,5,6,7,8,9,1,2,3};
        int result = hasKAttempt1(1, ints);
        Assert.assertEquals(6, result);
    }

    /**
     * You are given an integer K, and a sorted array as an input which has been rotated about an unknown pivot. For example, 4 5 6 7 8 9 1 2 3.
     We need to write a function which should return the index of K in the array, if K is present, else return -1.
     */

    private int hasKAttempt1(int k, int[] ints) {

        for (int i =0, j= ints.length-1; i < ints.length/2; i++, j--) {
            if (ints[i] == k)
                return i;
            if (ints[j] == k)
                return j;
        }
        return -1;
    }

}
