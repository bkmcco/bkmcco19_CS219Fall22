package Utility;

import java.util.Scanner;

public class Weather {

    public static double windchill(double t,            //temperature
                                   double v)            //velocity
    {
        double W = 35.74+(0.6215*t)+(((0.4275*t)-35.75)*Math.pow(v,0.16));
        return W;
    }
    public static void main(String [] args) {

        //used for getting input from the keyboard
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter temperature in degrees F: ");

        double temperature = 0;
        if (kbd.hasNextDouble()) {
             temperature = kbd.nextDouble();
        }
        else{
            System.out.printf("Error: You need to enter a number...you entered \"%s\". ", kbd.next());
            return;    //exit main
        }
        System.out.print("Enter wind velocity in MPH: ");

        double velocity = kbd.nextDouble();

        System.out.printf("The windchill for %.1f degrees at %.1f MPH is %.2f degrees. \n",temperature,velocity,windchill(temperature,velocity));
        System.out.println("They said \"Don't do it\".");
    }
}