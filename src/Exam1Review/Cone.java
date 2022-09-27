package Exam1Review;

import java.util.Scanner;
public class Cone {

    public static double volume(double r, double h) {
        return (1.0 / 3.0 * Math.PI * Math.pow(r, 2) * h);
    }

    public static void main(String[] args) {

        boolean x = true;
        boolean y = true;
        double r = 0;
        double h = 0;

        while(x){
            Scanner kbd = new Scanner(System.in);
            System.out.print("Enter a radius: ");
            if(kbd.hasNextDouble()){
               r = kbd.nextDouble();
               if(r>0){
                   x = false;
               }
               else{
                   System.out.println("Please enter a positive number.");
               }
            }
            else{
                System.out.println("Please enter a number.");
            }
        }
        while(y){
            Scanner kbd = new Scanner(System.in);
            System.out.print("Enter a height: ");
            if(kbd.hasNextDouble()) {
                h = kbd.nextDouble();
                if (h > 0) {
                    y = false;
                } else {
                    System.out.println("Please enter a positive number.");
                }
            }

            else{
                System.out.println("Please enter a number.");
            }

        }

        System.out.printf("The volume of your cone is: %f",volume(r,h));



    }
}
