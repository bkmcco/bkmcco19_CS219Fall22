package Utility;

import java.util.Scanner;

public class Weather {

    public static double windchill(double t,            //temperature
                                   double v)            //velocity
    {
        double W = 35.74+(0.6215*t)+(((0.4275*t)-35.75)*Math.pow(v,0.16));
        return W;
    }
   public static double getVelocity(Scanner kbd) {

       double velocity = 0;
       boolean valid = false;

       while (valid) {
           System.out.print("Enter wind velocity in MPH:");
           if (kbd.hasNextDouble()) {
               velocity = kbd.nextDouble();
               if (velocity < 0) {
                   System.out.printf("Error: velocity can't be negative. You entered %.2f.", velocity);
                   System.out.println("");
               }

           }//end velocity if/else
       }//end velocity while
    return velocity;
   }//end getVelocity

    public static double getTemperature(Scanner kbd) {
        boolean valid = false;
        double temperature = 0;

        while (!valid) {
            System.out.print("Enter temperature in degrees F: ");
            if (kbd.hasNextDouble()) {
                temperature = kbd.nextDouble();
                valid = true;
            }
            else {
                System.out.printf("Error: You need to enter a number...you entered \"%s\". ", kbd.next());
                System.out.println("");
            }
        }
        return temperature;
    }



    public static void main(String [] args) {

        Scanner kbd = new Scanner(System.in);
        double temperature = getTemperature(kbd);

        double velocity = getVelocity(kbd);

        System.out.printf("For a temperature of" + temperature + " and a velocity of " + velocity + " you will get a windchill of " + windchill(temperature,velocity));
    }
}





