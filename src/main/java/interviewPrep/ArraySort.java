package interviewPrep;

import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {
        String g = "abc";
        String h = "cabb";
        System.out.println(isSame(g, h));
    }

    public static boolean isSame(String g, String h){

        if(g.length() == h.length()){
            String [] arr = g.split("");
            String [] arr2 = h.split("");

            Arrays.sort(arr);
            Arrays.sort(arr2);
            return Arrays.equals(arr, arr2);
        }

        return false;
    }
}
/*
2.
use Array sort
Write a return method that check if a string is build out of the same letters as another string.
   String g="abc";
   String h="cab";
Ex:  same("abc",  "cab"); -> true
same("abc",  "abb"); -> false:

 */