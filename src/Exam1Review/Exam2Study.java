package Exam1Review;

public class Exam2Study {


    public static boolean hasDuplicate(String [] aos) {
        for(int i =0; i < aos.length -1; i++){
            for(int j = i+1 ; j < aos.length; j++){
                if(aos[i].toLowerCase().equals(aos[j].toLowerCase())){
                    return true;
                }
            }
        }
    return false;
    }

    public static boolean isFactor(int n, int [] aos){

        for(int i=0; i < aos.length; i++){
            if(aos[i]%n != 0){
                return false;
            }
        }
        return true;
    }

    public static double power(double x, int n){
        if(n==0){
            return 1;
        }
        double result = x * power(x,n-1);
        return result;
    }

    public static void main(String [] args){
        String [] names = {"Jane","Bower", "Jane", "Ethan"};
        int    [] numbers = {2,4,6,8,10};
        System.out.println(hasDuplicate(names));
        System.out.println(isFactor(3,numbers));
        System.out.println(power(3,2));

    }


}