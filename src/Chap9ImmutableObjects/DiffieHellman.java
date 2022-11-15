package Chap9ImmutableObjects;

import java.math.BigInteger;

public class DiffieHellman {

    public static void main(String[] args) {

        //Get a big prime number.
        BigInteger p = new BigInteger("7919");

        //p = new BigInteger()
        BigInteger A_priv = new BigInteger("123456789");

        //Alice computes her public key
        BigInteger A_pub = BigInteger.TWO.modPow(A_priv, p);

        //Send Bob the public key

        //Then Bob picks a private key
        BigInteger B_priv = new BigInteger("497");

        //Bob computes his public key
        BigInteger B_pub = BigInteger.TWO.modPow(B_priv, p);

        //Alice can now compute the shared key
        BigInteger A_shared = B_pub.modPow(A_priv, p);

        //Bob can also compute the shared key
        BigInteger B_shared = A_pub.modPow(B_priv, p);

        //Printing to check if A_shared and
        System.out.println(A_shared);
        System.out.println(B_shared);
    }
}
