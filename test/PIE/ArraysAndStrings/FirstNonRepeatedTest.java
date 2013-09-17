package PIE.ArraysAndStrings;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: catrapture
 * Date: 17/09/13
 * Time: 9:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class FirstNonRepeatedTest {

    @Test
    public void shouldCompute() {
        findFirstNonRepeated("total");
    }

    // Time complexity of O(n), Space complexity of O(m)
    private char findFirstNonRepeated(String s) {
        int[] ascii = new int [256];
        Character first = null;
        for (int i = s.length()-1; i >= 0; i--) {
            char c = s.charAt(i);
            int count = ascii[c];
            count++;
            ascii[c] = count;
            if (count == 1)
                first = c;
        }

        System.out.print("char: " + first);
        return first;
    }
}
