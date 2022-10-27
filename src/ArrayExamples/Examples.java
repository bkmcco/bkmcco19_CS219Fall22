package ArrayExamples;


import java.util.Arrays;
import java.util.Random;

public class Examples {

    public static void f(int x){

        x = 7;
    }


    public static void fill_random(int [] arr) {
        Random rng = new Random();
        rng.setSeed(10);

        for(int i = 0; i< arr.length; i++) {
            arr[i] = rng.nextInt(1,11);
        }


    }

    public static void print_array(int [] arr){

        System.out.print("[");
        for(int i = 0; i < arr.length-1; i++){         //going to length-1 because we are avoiding printing a comma after the last element
            System.out.print(arr[i] + ",");
        }
        System.out.print(arr[arr.length-1]);
        System.out.println("]");
        System.out.println();

    }

    public static void print_array2(int [] arr) {

        System.out.print('[');

        //enhanced for loop
        for(int v : arr)
            System.out.print(v+", ");

        System.out.println(']');

    }

    public static int sum(int [] arr){

        int total = 0;
        for(int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }

        return total;
    }

    public static int sum2(int[] arr) {
        int total = 0;
        for(int v : arr){
            total+=v;
        }
        return total;
    }

    public static int sum3(int[] arr) {
        boolean loop_run = true;
        int total = 0;
        int i = 0;
        while(i<arr.length){
            total += arr[i++];    //common idiom

        }
        return total;
    }

    //reverse the values in the array
    public static int[] reverse(int [] arr) {

        for(int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length -1 -i] = temp;
        }
        return arr;

    }



    //Return the value of the largest element in the array
     public static int max(final int[] arr){
       int curr_max = Integer.MIN_VALUE;   //initialize the variable as the first element of the list

       for(int i =0; i < arr.length; i++) {
           if(arr[i] > curr_max)
               curr_max = arr[i];
       }
       return curr_max;
    }

    //Return average of an array
    public static double average(int[] arr){
        int total = 0;
        for(int v : arr){
            total+=v;
        }
       double avg = (double)total/arr.length;                         //int/int = integer
        return avg;

    }

    public static double median(int[] arr) {
        int med = 0;
        Arrays.sort(arr);

        if(arr.length % 2 == 0){
            return (arr[arr.length / 2] + arr[arr.length/2 -1]) / 2.0;
        }
        else{
            return arr[arr.length/2];
        }
    }

    //Return the index of an item in an array. If not found -1

    public static int indexOf(final String [] arr, String item) {
        boolean present = false;
        int place = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String [] args) {

        String [] names = {"Harry", "Hermione", "Ron", "Draco"};
        System.out.println(indexOf(names,"Ron")==2);



        int [] nums = {4,1,0,9,2,8};        //shorthand
        int [] nums2 = new int [] {1,2,3,4,5};

        System.out.println(max(nums)==9);

        reverse(nums);



        int [] grades = new int[10];       //allocate space for ten grades

        //System.out.println(nums[2]);
        //System.out.println(nums[-1]);      //error: index out of range

        fill_random(grades);
        //System.out.println(grades);

        int z = 33;
        f(z);                               //when z is passed to x a copy is made
        //System.out.println(z);

        int [] test = {1,2,3};
        ///print_array(test);
        print_array2(grades);

        System.out.println(sum(grades)==48);
        System.out.println(sum2(grades)==48);
        System.out.println(sum3(grades)==48);
        System.out.println(average(grades)==4.8);
        System.out.println(median(grades)==4.5);


    }
}
