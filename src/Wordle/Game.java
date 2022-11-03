package Wordle;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game {


    public static String reverse(String s) {
        if (s.length() == 0)
            return "";
        else
            return reverse(s.substring(1)) + s.charAt(0);
    }

    public static String [] load_words(String path, int n) {
        // connect to the web page of speeds
        URL url = null;    // null is the "nothing value"
        Scanner s = null;

        try {
            url = new URL(path); // create a URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // create an array of strings
        String [] words = new String[n];
        String [] palindromes = new String[9];
        String word = "";
        int i = 0;
        int j = 0;
        while (s.hasNextLine()) {
            word = s.nextLine();
            words[i++] = word;
            if (word.equals(reverse(word))&&!word.equals("")) {
                palindromes[j++] = word;
            }
        }

        /*
        while (t.hasNextLine()) {
            if(t.nextline().equals(reverse(t.nextline()))){
            palindromes[i++] = s.nextLine();}
        */



        return palindromes;}


    // return the index of target in aos
    public static int indexOf(String target, String [] aos) {
        for (int i = 0; i < aos.length; i++)
            if (aos[i].equals(target))
                return i;

        return -1;
    }

    /*
        Return the location of target in aos between low and high.
     */
    public static int bsearch(String [] aos, String target, int low, int high) {

        if (low > high)
            return -1;

        int mid = (low + high) / 2;

        if (aos[mid].equals(target))
            return mid;
        else if (aos[mid].compareTo(target) < 0)
            return bsearch(aos, target, mid+1, high);
        else
            return bsearch(aos, target, low, mid - 1);
    }

    public static void main(String[] args) {
        String [] words = load_words("http://10.60.15.25/~ehar/cs219/wordle-nyt-solutions.txt",
                2309);

        System.out.println(Arrays.toString(words));

        Random rng = new Random();

        // pick a word at random
        rng.setSeed(23);
        String word = words[rng.nextInt(0,words.length)];
        System.out.println(word);

        // find the location of word in words
        System.out.println(indexOf(word, words));
        System.out.println(bsearch(words, word, 0, words.length - 1 ));
    }

}

