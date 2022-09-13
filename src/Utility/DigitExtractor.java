package Utility;

public class DigitExtractor {

    public static int last(int n) {

        if (n < 0) {
            n = -n;
        }

        return n%10;
    }

    public static int secondToLast(int m) {


        m = Math.abs(m);
        m = m%100;


        return (int)m/10;

    }


    public static void main(String []args) {

        System.out.println(last(2753));
        System.out.println(last(-749)==9);

        System.out.println(secondToLast(12098));

    }
}
