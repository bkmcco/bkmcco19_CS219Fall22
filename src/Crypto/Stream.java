package Crypto;

import java.util.Random;

public class Stream {

    public static String E(String clear, int key) {
        String cipher = "";
        final int alpha_length = 26;                          //this should never change

        Random rng = new Random();
        rng.setSeed(key);   //seeding the random number generator

        for (int i = 0; i < clear.length(); i++) {

            char clear_char = clear.charAt(i);
            int clear_char_pos = clear_char -'a';
            int shift = rng.nextInt(100);
            System.out.println(shift);
            int cipher_char_pos = Math.floorMod(clear_char_pos + shift, alpha_length);
            char cipher_char = (char)(cipher_char_pos + 'a');
            cipher = cipher + cipher_char;
        }


        return cipher;
    }

    public static String D(String cipher, int key){
        String clear = "";
        final int alpha_length = 26;                          //this should never change
        Random rng = new Random();
        rng.setSeed(key);
        for (int i = 0; i < cipher.length(); i++) {

            char cipher_char = cipher.charAt(i);
            int cipher_char_pos = cipher_char -'a';
            int shift = rng.nextInt(100);
            int clear_char_pos = Math.floorMod(cipher_char_pos - shift, alpha_length);
            char clear_char = (char)(clear_char_pos + 'a');
            clear = clear + clear_char;
        }


        return clear;

    }

    public static String d(String cipher, int key){
        return E(cipher, -key);
    }

    public static void main (String [] args) {
        //System.out.println(E("cold",20).equals("wifx"));                          //to compare strings you have to use the .equals method
        //System.out.println(d("wifx",20).equals("cold"));

        System.out.println(E("java",10));
        System.out.println(D("wckm",10));
    }
}
