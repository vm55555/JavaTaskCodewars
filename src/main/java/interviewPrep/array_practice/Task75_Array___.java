package interviewPrep.array_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Task75_Array___ {

    public static void main(String[] args) {
        ArrayList<String> gg = new ArrayList<>(Arrays.asList("three,four", "five","seven"));
        System.out.println(printNumbers(gg));

    }

    public static String printNumbers(ArrayList<String> list){

        String res = "";

        for(int i = 0; i < list.size(); i++){

            if(list.get(i).contains(",")){
               res += list.get(i).substring(list.get(i).indexOf(",") + 1) + " ";
            } else {
                res += list.get(i) + " ";
            }
        }

        return res;
    }
}

/*
//75
 ArrayList<String> gg = new ArrayList<>(Arrays.asList("three,four", "five","seven"));
print out
 four five seven
 */
