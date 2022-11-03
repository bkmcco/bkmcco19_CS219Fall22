package Exam2;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exam2Redo {

    public static String reverse(String s) {
        if (s.length() == 0)
            return "";
        else
            return reverse(s.substring(1)) + s.charAt(0);
    }

    public static String[] load_words(String path, int n) {
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
        String[] words = new String[n];
        String[] palindromes = new String[9];
        String word = "";
        int i = 0;
        int j = 0;
        while (s.hasNextLine()) {
            word = s.nextLine();
            words[i++] = word;
            if (word.equals(reverse(word)) && !word.equals("")) {
                palindromes[j++] = word;
            }
        }
        return palindromes;
    }

    public static void main(String[] args) {
        String [] palindromes = load_words("http://10.60.15.25/~ehar/cs219/wordle-nyt-solutions.txt",
                2309);

        //Putting the array in alphabetical order
        Arrays.sort(palindromes);

        //reversing the order of the palindromes array
        for(int i = 0; i < palindromes.length/2; i++){
            String temp = palindromes[i];
            palindromes[i] = palindromes[palindromes.length-1-i];
            palindromes[palindromes.length -1 -i] = temp;
        }

        System.out.println(Arrays.toString(palindromes));
    }
}
