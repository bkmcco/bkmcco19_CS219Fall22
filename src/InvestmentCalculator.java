import Utility.Investment;
import java.util.Scanner;

public class InvestmentCalculator {

    public static void main(String [] args) {

        //Prompt user for c,r,t,n input

        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter the starting amount: ");
        double c = kbd.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double r = kbd.nextDouble();

        System.out.print("Enter the amount of time interest accrues: ");
        int t = kbd.nextInt();

        System.out.print("Enter number of times compounded per year: ");
        int n = kbd.nextInt();

        System.out.printf("Your investment is worth 💀 %.2f .",Investment.investment(c,r,t,n));

    }


}
