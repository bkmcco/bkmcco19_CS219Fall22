package Exam1;
import java.util.Scanner;


public class Exam1 {

    public static int count27(int n){
        int count = 0;
        while(n>0){
          if(n%10>2 && n%10<7){
              count++;
          }
              n = n/10;
        }

    return count;
    }


    public static void main(String[] args){
        boolean valid_input = false;
        int c = 0;
        while(!valid_input) {
            Scanner kbd = new Scanner(System.in);
            System.out.print("Enter a positive integer: ");

            if(!kbd.hasNextInt()){
                System.out.println("That is not an integer. Please try again.");
            }
            else{
                c = kbd.nextInt();
                if(c<0){
                    System.out.println("That is not a positive integer. Please try again.");
                }
                else{
                    valid_input = true;
                }

            }
        }

        System.out.printf("The number of digits between 2 and 7 in your number is: %d",count27(c));
        }


    }





