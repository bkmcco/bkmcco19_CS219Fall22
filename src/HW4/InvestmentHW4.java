package HW4;

import Utility.Investment;

import java.util.Scanner;


public class InvestmentHW4 {

    public static void main(String[] args) {

       double c = 0;
        boolean ask_start = true;
        while (true) {
            Scanner kbd = new Scanner(System.in);
            System.out.println("Enter starting amount:");

            if (!kbd.hasNextDouble()) {
                System.err.println("You need to enter a number.");
            } else {
                c = kbd.nextDouble();
                if (c < 0.0) {
                    System.err.println("You need to enter a positive number.");
                } else {
                    break;
                }
            }
        }//end starting amount
        double r = 0;
        while (true) {
            Scanner kbd = new Scanner(System.in);
            System.out.println("Enter the rate of interest:");

            if (!kbd.hasNextDouble()) {
                System.err.println("You need to enter a number.");
            } else {
                r = kbd.nextDouble();
                if (r > 1 || r < 0) {
                    System.err.println("Rate of interest must be between 0 and 1.");
                } else if (r >= 0 && r <= 1) {
                    break;
                }
            }
        } //end rate of interest
        int t = 0;
        while (true) {
            Scanner kbd = new Scanner(System.in);
            System.out.println("Enter the amount of time interest accrues: ");
            if (!kbd.hasNextInt()) {
                System.err.println("Error: Input must be a whole number.");
            } else {
                t = kbd.nextInt();
                if (t < 0) {
                    System.err.println("Error: Amount of time must be a positive number.");

                } else {
                    break;
                }
            }
        }//end interest accruing
        int n = 0;
        while (true) {
            Scanner kbd = new Scanner(System.in);
            System.out.println("Enter number of times compounded per year: ");
            if (!kbd.hasNextInt()) {
                System.err.println("Error: Input must be a whole number.");
            } else {
                n = kbd.nextInt();
                if (n < 0) {
                    System.err.println("Error: Number of times compounded must be a positive number.");
                } else {
                    break;
                }
            }


        }//end number of times compounded
        System.out.printf("Your investment is worth %.2f .",Investment.investment(c,r,t,n));
    }//end main
}


