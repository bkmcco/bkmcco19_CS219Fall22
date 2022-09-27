
package Exam1Review;

import java.util.Scanner;

public class Exam1StudyC2F {

    public static double c2f(double c){
        return (9.0/5.0 * c) +32;
    }

    public static void main(String[] args){

        boolean correct = true;

        while(correct){
            Scanner kbd = new Scanner(System.in);
            System.out.print("Enter a temperature in celsius: ");
            if(kbd.hasNextDouble()){
                double c = kbd.nextDouble();
                System.out.printf("The temperature in Fahrenheit is: %.1f",c2f(c));
                correct = false;
            }
            else{
                System.out.println("You need to enter a number. Please try again.");
            }
        }



    }
}
