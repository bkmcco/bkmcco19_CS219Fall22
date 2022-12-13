package ZipCodeDB;


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Zipcode implements Comparable<Zipcode>, Distance, WeatherInfo {

    @Override
    public double distance(Zipcode zip) {
        return 0;                //distance from two points on the surface of a sphere
    }

    public WeatherObservation getWeatherData(){
        // http://api.geonames.org/findNearByWeatherJSON?formatted=true&lat=44&lng=-70&username=edharcourt

        URL url = null;    // null is the "nothing value"
        Scanner s = null;

        String path = "http://api.geonames.org/findNearByWeatherJSON?formatted=true&lat="+this.lat+"&lng=-"+this.lng+"&username=edharcourt\n";

        try {
            url = new URL(path);
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        double humidity = 0,temp=0,speed=0;
        String clouds="";
        while(s.hasNextLine()){
            String line = s.nextLine();

            //check for humidity

            if(line.indexOf("humidity") > 0) {
                humidity = Double.parseDouble(line.substring(line.indexOf(':')+1, line.indexOf(',')));

            }
            else if(line.indexOf("temperature") > 0) {
                temp = Double.parseDouble(line.substring(line.indexOf(':')+3, line.indexOf(',')-1));
            }
            else if(line.indexOf("windSpeed") > 0){
                speed = Double.parseDouble(line.substring(line.indexOf(':')+3, line.indexOf(',')-1));
            }
            else if(line.indexOf("clouds") > 0){
                clouds = line.substring(line.indexOf(':')+3,line.indexOf(',')-1);
            }

            //put this information into a graphical user interface 'GUI'

        }

        WeatherObservation ob = new WeatherObservation(humidity, speed, temp, clouds);
        return ob;
    }

    private String code;
    //private makes it so that it can't be accessed outside of the class

    private String state;       //two character abbreviation
    private String city;
    private double lng;
    private double lat;
    private int pop;


    public Zipcode(String code, String state, String city, double lng, double lat, int pop) {
        this.code = code;
        this.state = state;
        this.city = city;
        this.lng = lng;
        this.lat = lat;
        this.pop = pop;
    }

    @Override
    public String toString() {
        return "Zipcode{" +
                "code='" + code + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", lng=" + lng +
                ", lat=" + lat +
                ", pop=" + pop +
                '}';
    }

    public String getCode() {
        return code;
    }




    //The natural ordering for zipcode
    @Override
    public int compareTo(Zipcode zc) {
        return this.code.compareTo(zc.code);
    }

    public double getLat() {
        return lat;
    }
}


