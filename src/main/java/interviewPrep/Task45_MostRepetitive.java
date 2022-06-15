package interviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task45_MostRepetitive {

    public static void main(String[] args) {
        ArrayList<String > fruits=new ArrayList<>(Arrays.asList("alma","alma","alma"
                ,"armud","armud","armud","armud","pear","apple","pear","pear"));
        System.out.println("longestRepetitive(fruits) = " + longestRepetitive(fruits));
    }

    public static String longestRepetitive(ArrayList<String> str){
        Map<String, Integer> res = new HashMap<>();
        int count = 0;
        for (String each : str){
            if (res.containsKey(each)){
                count = res.get(each) + 1;
                res.put(each,count);
            }else {
                res.put(each,1);
            }
        }
        int max =0;
        String result = "";
        for (String each : res.keySet()){
            if (res.get(each) > max){
                max = res.get(each);
                result = each;
            }
        }
        return result;
    }
}

/*
//45
Find out most repetitive word
ArrayList<String >fruits=new ArrayList<>(Arrays.asList("alma","alma","alma","alma"
,"armud","armud","armud","armud","pear","apple","pear","pear"));

====================================================================================
*/

