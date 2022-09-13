package HW3;
import Utility.Investment;
import java.util.Scanner;


public class InvestmentHW {

    public static void main(String [] args) {

        //Prompt user for c,r,t,n input

        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter the starting amount: ");
        if(!kbd.hasNextDouble()){
            String word = kbd.next();
            System.err.println("Error: " +word+" is not a number.");
            System.exit(0);

        }
        double c = kbd.nextDouble();
        if(c < 0.0) {
            System.err.println("Error: starting amount must be a positive number.");
            System.exit(0);
        }

        System.out.print("Enter the rate of interest: ");
        if(!kbd.hasNextDouble()){
            String word = kbd.next();
            System.err.println("Error: Input must be a number. You entered " +word);
            System.exit(0);
        }
        double r = kbd.nextDouble();
        if(r>1 || r<0){
            System.err.println("Rate of interest must be between 0 and 1.");
            System.exit(0);
        }



        System.out.print("Enter the amount of time interest accrues: ");
        if(!kbd.hasNextInt()){
            String word = kbd.next();
            System.err.println("Error: Input must be a whole number. You entered " +word);
            System.exit(0);
        }
        int t = kbd.nextInt();
        if(t < 0){
            System.err.println("Error: Amount of time must be a positive number.");
            System.exit(0);
        }

        System.out.print("Enter number of times compounded per year: ");
        if(!kbd.hasNextInt()){
            String word = kbd.next();
            System.err.println("Error: Input must be a whole number. You entered " +word);
            System.exit(0);
        }
        int n = kbd.nextInt();
        if(n < 0) {
            System.err.println("Error: Number of times compounded must be a positive number.");
            System.exit(0);
        }


        System.out.printf("Your investment is worth %.2f .",Investment.investment(c,r,t,n));

    }

}
