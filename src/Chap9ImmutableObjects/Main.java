package Chap9ImmutableObjects;

public class Main {

    public static void main(String[] args) {

        String s = "hello";
        String t = new String("hello");

        //strings are immutable; can't do t[0] ='a';

        //make a version of s that is capitalized

        String s1 = Character.toUpperCase(s.charAt(0)) + s.substring(1);

        //StringBuilder - mutable strings

        char ch = 'z';

        Character ch12 = 'z';

        //Character ch3 = new Character('a');

        int x = 33;

        Integer y = 33;

        double pi = 3.14159;
        Double pi1 = 3.14159;

        Boolean flag = false;
        Long ll = 43L;   // add capital L on the end to convert integer to long type

        //Double, Long, Integer, Boolean, Character are all wrapper classes for their respective Integer type

        //taking a primitive value and wrapping it in an object is called autoboxing

        Student student1 = new Student("Hermione","Granger", "123", "The Smart One");
        Student student2 = new Student("Brenna", "McConnell", "14004703", "Bree");



        System.out.println(student1);
        System.out.println(student2);




    }
}
