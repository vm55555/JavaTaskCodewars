package interviewPrep;

import java.util.Scanner;

public class Task54_longestWord {

    public static void main(String[] args) {
        System.out.println(longestWord());

    }

    public static String longestWord(){

        Scanner input = new Scanner(System.in);
        String [] arr = new String[5];
        int longest = 0;
        String res = "";

        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter a word: ");
            arr[i] = input.next();
            if(arr[i].length() > longest){
                longest = arr[i].length();
                res = arr[i];
            }
        }

        return res;
    }
}
