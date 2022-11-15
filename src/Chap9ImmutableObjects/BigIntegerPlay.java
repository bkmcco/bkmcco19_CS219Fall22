package Chap9ImmutableObjects;

import java.math.BigInteger;

public class BigIntegerPlay {

    public static int fact(int n){
        int product = 1;

        for(int i = 1; i <= n; i++){
            product = product*i;
        }
        return product;
    }

    public static int pow(int x, int y){
        int product = 1;
        for(int i = 0; i < y; i++){
            product = product * x;
        }
        return product;
    }

    public static BigInteger bigfact(int n){
        BigInteger product = new BigInteger(("1"));

        for(int i = 1; i <= n; i++){
            product = product.multiply(BigInteger.valueOf(i));
        }
        return product;
    }

    public static void main(String[] args) {
        System.out.println(fact(5));

        //Print the first 15 factorials

        for(int i =1; i<15; i++){
            System.out.printf("%d : %d \n", i, fact(i));
        }

        //BigInteger
        BigInteger x = new BigInteger("1234567890987654321234567890");
        System.out.println(x.multiply(x));

        System.out.println(bigfact(100));

    }
}
