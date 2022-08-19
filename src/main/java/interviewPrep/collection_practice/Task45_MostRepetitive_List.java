package interviewPrep.collection_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task45_MostRepetitive_List {

    public static void main(String[] args) {

        ArrayList<String >fruits=new ArrayList<>(Arrays.asList("alma","alma","alma","alma"
                ,"armud","armud","armud","armd","pear","apple","pear","pear"));

        System.out.println("mostRepetitive(fruits) = " + mostRepetitive(fruits));

    }

    public static String mostRepetitive(ArrayList<String> list){

        int max = 0;
        String res = "";

        for(int i = 0; i < list.size(); i++){
            if((Collections.frequency(list, list.get(i)) > max)){
                max = (Collections.frequency(list, list.get(i)));
                res = list.get(i);
            }
        }

        return res;
    }


}

/*
//45
Find out most repetitive word
ArrayList<String >fruits=new ArrayList<>(Arrays.asList("alma","alma","alma","alma"
,"armud","armud","armud","armud","pear","apple","pear","pear"));
 */
