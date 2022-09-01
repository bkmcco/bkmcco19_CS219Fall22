public class Weather {

    public static double windchill(double t,            //temperature
                                   double v)            //velocity
    {
        double W = 35.74+(0.6215*t)+(((0.4275*t)-35.75)*Math.pow(v,0.16));
        return W;
    }
    public static void main(String [] args) {
        System.out.print("The windchill is: ");
        System.out.println(windchill(32,10));
    }
}
