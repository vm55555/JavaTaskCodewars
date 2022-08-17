package interviewPrep;

import java.util.Arrays;

public class Task59_ReverseArray2 {

    public static void main(String[] args) {
        String sentence = "Today is great day";
        System.out.println(Arrays.toString(reverseArr(sentence)));
    }

    public static String[] reverseArr(String str){

        String [] temp = str.split(" ");
        String [] res = new String[temp.length];
        int count = 0;

        for(int i = temp.length - 1; i >= 0; i--){
            res[count++] = temp[i];
        }

        return res;
    }
}

/*
//59
 String sentence = "Today is great day";
  Array [Today, is, great, day]
 reverse Array[Today, is, great, day] to >  day great is Today
 */
