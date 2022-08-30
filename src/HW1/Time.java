package HW1;

import java.awt.*;

public class Time {
    public static void main(String [] args){
        int hour = 17;
        int minute = 15;
        int second = 13;
        int secs_since_midnight = (hour*3600)+(minute*60)+second;
        int secs_remaining      = 86400-secs_since_midnight;
        double percent_passed = Math.round((secs_since_midnight*100.0)/86400.0);
        System.out.print("The current time is " + hour + ":" + minute + ":" + second);
        System.out.println(".");
        System.out.print("The number of seconds since midnight is : " + secs_since_midnight);
        System.out.println(".");
        System.out.print("The number of seconds remaining in the day is : "+secs_remaining);
        System.out.println(".");
        System.out.print("The rounded percentage of the day that has passed is : ");
        System.out.print(percent_passed+"%");
        System.out.println("");

        //Calculating time passed
        int new_hour = 18;
        int new_minute = 43;
        int new_second = 51;
        int new_time = (new_hour*3600)+(new_minute*60)+new_second;
        int time_passed = new_time-secs_since_midnight;
        System.out.print("The amount of seconds that have passed since I began the exercise:" + time_passed);
        System.out.println(".");




    }
}
