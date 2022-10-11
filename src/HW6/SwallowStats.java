package HW6;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class SwallowStats {


    public static void swallow_stats() {

        // connect to the web page of speeds
        URL url = null;    // null is the "nothing value"
        Scanner s = null;
        String path = "http://10.60.15.25/~ehar/cs219/swallow-speeds.txt";

        try {
            url = new URL(path); // create a URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        double sum = 0.0;
        int count = 0;
        double maximum = -1.0 / 0;             //begin with negative infinity -- initialize at a very small value
        double minimum = 1.0 / 0;              //begin with positive infinity -- initialize at a very high value

        // read each line of the web file
        while (true) {

            if (!s.hasNextLine())
                break;

            String line = s.nextLine();  // read a line of the web site


            if (line.indexOf("#") == -1 && !line.equals("")) {   //Ensures that the line does not contain a "#" (invalid data) and is not empty
                sum = sum + Double.parseDouble(line);
                count++;

                if(Double.parseDouble(line)>maximum){
                    maximum = Double.parseDouble(line);
                }

                if(Double.parseDouble(line)<minimum){
                    minimum = Double.parseDouble(line);
                }
            }
        }
        double average = sum/count;
        System.out.printf("The average swallow speed is: %.2f m/s. \n",average);
        System.out.printf("The maximum swallow speed is: %.1f m/s. \n",maximum);
        System.out.printf("The minimum swallow speed is: %.1f m/s. \n",minimum);
        }
     // avg_swallow_speed

    public static void main(String [] args) {
        swallow_stats();
    }
}

