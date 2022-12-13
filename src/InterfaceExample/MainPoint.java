package InterfaceExample;

import java.util.ArrayList;

public class MainPoint {

    public static void main(String[] args) {
        Point p1 = new Point(0,0);
        Point p2 = new Point(10,10);

        System.out.println(p1.distance(p2));
        System.out.println(Distance.distance(p1,p2));

        System.out.println(p1);                           //toString() method from Point.java implicitly called

        ArrayList<Point> drawing = new ArrayList<>();     //defining a new ArrayList full of points
    }
}
