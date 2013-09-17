public class Main {

    public static void main(String[] args) {
//        Rectangle rectangel1 = new Rectangle(1, 1, 3, 4);
//        Rectangle rectangle2 = new Rectangle(2, 3, 6, 7);
//
//        Rectangle rectangel3 = new Rectangle(1, 1, 3, 4);
//        Rectangle rectangle4 = new Rectangle(2, 3, 6, 7);
//        calculateArea(rectangel1, rectangle2);

        boolean result = canCreateRansomNote("kitty", "silly kit kats I love lots");
        System.out.print("Can create ransom? " + result);
    }

    private static void calculateArea(Rectangle rectangle1, Rectangle rectangle2) {
        int rect1Area = 0;
        int rect2Area = 0;
        int result = 0;

        // if they don't overlap return sums of both areas
        int xOverlap = rectangle1.x2 - rectangle2.x1;
        int yOverlap = rectangle1.y2 - rectangle2.y1;
        int overlapArea = xOverlap * yOverlap;

        System.out.println("xOverlap: " + xOverlap);
        System.out.println("yOverlap: " + yOverlap);
        System.out.println("new area: " + overlapArea);

        result = (rectangle1.area() + rectangle2.area()) - overlapArea;

        System.out.println("result: " + result);
    }

    // Does the magazine have all the required letters to create the note?
    public static boolean canCreateRansomNote(String note, String magazine) {

        int[] ascii = new int[256];
        int numFound = 0;

        for (int i=0;i<note.length();i++) {
            char c = note.charAt(i);
            ascii[c]++;
        }

        for (int i = 0; i < magazine.length(); i++) {
            if (numFound == note.length())
                return true;

            char c = magazine.charAt(i);
            if(ascii[c] > 0)
            {
                ascii[c]--;
                numFound++;
            }

        }

        return false;

    }


}
