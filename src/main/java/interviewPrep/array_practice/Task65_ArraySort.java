package interviewPrep.array_practice;

import java.util.Arrays;

public class Task65_ArraySort {

    public static void main(String [] args){

        String[] arr = {"2.5","1.5", "3", "6.5","3.5", "4.5"} ;
        maxAndMin(arr);
    }

    public static void maxAndMin(String [] arr){

        Arrays.sort(arr);

        System.out.println("max: " + arr[arr.length - 1] + "\nmin " + arr[0]);
    }
}

/*
//65
String[] arrr = {"2.5","1.5", "3", "6.5","3.5", "4.5"};  by using sort Array get max and
min number
 */
