package Chap6Exercises;


//using for loops and while loops for same function
public class Exercise64 {

    public static boolean isAlphabetical(String s) {
        s = s.toLowerCase();
        //while loop method

        int i = 0;

        while(i<s.length()-1){
            if (s.charAt(i) > s.charAt(i + 1)) {
                return false;
            }
            i=i+1;

        } //end while loop
        return true;
    }


    public static String toLower(String s) {
        String r = "";
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                r = r + (char)('a' + (ch - 'A'));
            }
            else{
                r = r+ch;
            }
        }
    return r;
    }


    public static boolean isAbecedarian(String s) {
        s = s.toLowerCase();
        s = toLower(s);
        //for loop method
        for (int i = 0; i < s.length() - 1; i++) {

            if (s.charAt(i) > s.charAt(i + 1)) {
                return false;
            }

        } //end for loop

        return true;
    }


    public static void main(String[] args) {
        System.out.println(isAbecedarian("biopsy"));
        System.out.println(!isAbecedarian("apple"));
        System.out.println(isAlphabetical("biopsy"));
        System.out.println(!isAlphabetical("apple"));
        System.out.println(toLower("APPLE"));
        System.out.println(toLower("APpLe"));



    }
}