package interviewPrep.array_practice;

import java.util.Arrays;

public class Array_ArraySort {

    public static boolean sameLetter(String str,String str2){
        String[]result1=str.split("");
        String[]result2=str2.split("");
        Arrays.sort(result1);
        Arrays.sort(result2);
        return Arrays.equals(result1, result2);
    }

    public static void main(String[] args) {
        String g="vic";
        String h="icv";
        System.out.println(sameLetter(g,h));

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
