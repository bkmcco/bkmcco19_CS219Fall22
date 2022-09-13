import java.util.Random;

public class LogicalOperators {

    public static void main(String [] args) {

        Random r = new Random();

        int coinflip = r.nextInt(2);

        if(coinflip == 0) {
            System.out.println("Heads");
        }
        else{
            System.out.println("Tails");

        }

        int die_roll = r.nextInt(6) + 1;
        int die_roll2 = r.nextInt(6) +1;

        if(die_roll == 1 && die_roll2 == 1) {
            System.out.println("Snake eyes");
        }
        else{
            System.out.println("No snake eyes :(");
        }

        //check if die roll is in between 2 and 5 inclusive

        //if(die_roll>=2 && die_roll <= 5){
            //System.out.println("Die roll is between two and five");
        //}

        if(die_roll != 1 || die_roll2 != 1) {
            System.out.println("One of the dice didn't roll a one :/");
        }


        if(die_roll !=1 || die_roll2 !=1) {

            if(die_roll!=1){
                System.out.println("Die 1 is to blame.");
                if(die_roll2!=1){
                    System.out.println("Die 2 is also to blame.");
                }
            }
            else{
                System.out.println("Die 2 is to blame.");
            }

        }

    }




}
