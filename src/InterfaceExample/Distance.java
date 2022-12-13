package InterfaceExample;

public interface Distance {


    //compute distance between current point and P
    double distance(Point p);

    static double distance(Point p1, Point p2) {
        return p1.distance(p2);

    }

}
