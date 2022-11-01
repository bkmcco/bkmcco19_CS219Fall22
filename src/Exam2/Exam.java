package Exam2;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;


public class Exam {

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
        int i = 0;
        while (s.hasNextLine()) {
            words[i++] = s.nextLine();
            }

        String [] palindromes = new String[n];
        //words array contains all of the words in the file, in string form
        for(int j = 0; j < words.length-1; j++){
            String check = words[j];
            if(check.equals(reverse(check))){
                palindromes[i++] = check;
            }

        }

        return words;
    }

    public static void main(String[] args) {

        String [] palindromes1 = load_words("http://10.60.15.25/~ehar/cs219/wordle-nyt-solutions.txt",
                2309);
        Arrays.sort(palindromes1);

        for(int i = 0; i < palindromes1.length/2; i++){
            String temp = palindromes1[i];
            palindromes1[i] = palindromes1[palindromes1.length-1-i];
            palindromes1[palindromes1.length -1 -i] = temp;
        }

        System.out.println(Arrays.toString(palindromes1));
        }




    }

