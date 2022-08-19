package interviewPrep.array_practice;

import java.util.Arrays;
import java.util.Scanner;

public class Task54_Array {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(useScanner()));

    }

    public static String [] useScanner(){

        Scanner scanner = new Scanner(System.in);
        int maxSize = 0;
        String res = "";


        System.out.println("How many words do you want to have in your array?");
        String [] arr = new String[scanner.nextInt()];

        for(int i = 0; i < arr.length; i++){
            System.out.println("enter next word:");
            arr[i] = scanner.next();
            if(arr[i].length() > maxSize){
                maxSize = arr[i].length();
                res = arr[i];
            }
        }

        System.out.println("The longest word:" + res);

        return arr;
    }
}
/*
//54
Ask user enter 5 words and declare long word or Array
String h[]={"hellow", "whyyyyyyyyyy", "byererdddd", "apple" , "notettttt"};

 */