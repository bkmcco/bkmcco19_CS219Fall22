package LogicExercises;

public class Logic {

    public static int caughtSpeeding(int speed, boolean isBirthday){
        int ticket = 0;

        if(isBirthday == true) {
            if (speed >= 66 && speed < 86) {
                ticket = 1;
            } else if (speed >= 86) {
                ticket = 2;
            }
        }

        if(isBirthday == false) {
            if (speed >= 61 && speed < 81) {
                ticket = 1;
            } else if (speed >= 81) {
                ticket = 2;
            }
        }
    return ticket;
    }//end caughtSpeeding

    public static boolean ordered(int d1, int d2, int d3){
        return((d1<d2 && d2<d3) || (d3<d2 && d2<d1));
        /*
        boolean ascending = false;
        boolean descending = false;
        boolean returned_variable = false;

        if(d3>d2 && d2>d1){
            ascending = true;
        }
        else if(d1>d2 && d2>d3){
            descending = true;
        }
        if(ascending||descending){
            returned_variable = true;
        }
        return returned_variable; */
    }//end ordered


    public static boolean cigarParty(int cigars, boolean isWeekend){


        boolean success = false;

        if (isWeekend == false) {

            if (cigars >= 40 && cigars<=60){
                success = true;
            }
        }
        else if (isWeekend == true && cigars>=40) {

            success = true;
        }

      return success;
    } //end cigarParty


    public static void main(String [] args) {

        //System.out.println(caughtSpeeding(60,false)==0);
        //System.out.println(caughtSpeeding(65,false)==1);
        //System.out.println(caughtSpeeding(65,true)==0);
        //System.out.println(caughtSpeeding(81,false)==2);
        //System.out.println(caughtSpeeding(81,true)==1);

        System.out.println(ordered(1,2,3));
        System.out.println(ordered(3,2,1));
        System.out.println(ordered(6,1,8));

        System.out.println(cigarParty(30,false));
        System.out.println(cigarParty(50,false));
        System.out.println(cigarParty(70,true));
    }

}
