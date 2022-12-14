package HW2;

import java.util.Scanner;

public class DayOfWeek {

    public static double dayofweek(int m,           //month
                                   int d,           //day
                                   int y)           //year
    {
       double y0 = y-((14-m)/12);

       double x = y0+(y0/4)-(y0/100)+(y0/400);

       double m0 = m+12*((14-m)/12)-2;

       double d0 = (d+x+(31*(m0/12)))%7;

       return d0;
    }

    public static void main(String [] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter the number of the month: ");
        int month = kbd.nextInt();

        System.out.print("Enter the day: ");
        int day = kbd.nextInt();

        System.out.print("Enter the year: ");
        int year = kbd.nextInt();

        System.out.println((int)dayofweek(month,day,year));


    }
}
