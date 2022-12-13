package InterfaceExample;

public class Point implements Distance {

    //two private instance variables
    private double x;
    private double y;


    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    //making constructor; must be named the same as the class
    public Point(double x, double y) {
        this.x = x;
        this.y = y;

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point p){
        return Math.sqrt(Math.pow(this.x - p.x,2) + Math.pow(this.y - p.y,2));
    }
}
