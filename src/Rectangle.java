/**
 * Created with IntelliJ IDEA.
 * User: catrapture
 * Date: 16/09/13
 * Time: 10:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class Rectangle {
    public int x1;
    public int y1;
    public int x2;
    public int y2;

    public Rectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int area() {
        int area = (x2-x1) * (y2-y1);
        System.out.println("calculated area: " + area);
        return area;
    }
}
