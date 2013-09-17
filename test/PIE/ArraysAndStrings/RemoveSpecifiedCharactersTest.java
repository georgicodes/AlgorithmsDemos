package PIE.ArraysAndStrings;

import org.junit.Test;

public class RemoveSpecifiedCharactersTest {

    @Test
    public void shouldCompute() {
        removeChars("Battle of the Vowels: Hawaii vs. Grozny", "aeiou");
    }

    private String removeChars( String str, String remove ) {
        char[] chars = str.toCharArray();
        char[] rems = remove.toCharArray();
        int m = 0;
        boolean toDelete = false;

        for (int i=0; i<chars.length; i++,m++) {
            char c = chars[i];

            for (int j=0; j<remove.length(); j++) {
                if (rems[j] == c) {
                    toDelete = true;
                    break;
                }
                else {
                    toDelete = false;
                }
            }

            if (!toDelete) {
                chars[m] = c;
            } else {
                m--;
            }

        }

        System.out.println("Result: " + new String(chars));
        return new String(chars);
    }
}
