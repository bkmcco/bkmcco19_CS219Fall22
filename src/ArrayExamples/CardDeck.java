package ArrayExamples;

import java.util.Arrays;
import java.util.Random;

public class CardDeck {


    public static String [] shuffle(String[] arr){
        Random rng = new Random();

        for(int i=0; i < arr.length; i++) {
            int r = rng.nextInt(i,arr.length);
            String temp = arr[i];
            arr[i] = arr[r];
            arr[r] = temp;                                     //Introducing temporary variable to swap items; common practice

        }
        return arr;
    }
    public static String[] build_deck() {
        String [] suits = {"❤", "♣","♠","♦"};
        String [] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King","Ace"};

        String [] deck = new String[suits.length*ranks.length];


        int i = 0;
        for (String suit : suits)                   //for each suit in the suits array
            for(String rank : ranks)
                deck[i++] = suit + rank;

        return(deck);
    }


    public static void main(String[] args) {

        String [] deck = build_deck();

        System.out.println(Arrays.toString(deck));
        shuffle(deck);

        System.out.println(Arrays.toString(deck));
    }

    }

