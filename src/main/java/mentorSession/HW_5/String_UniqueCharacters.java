package mentorSession.HW_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class String_UniqueCharacters {

    public static void main(String[] args) {
        String str = "AAABBBCCCDEF";
        System.out.println(findUnique(str));

    }

    public static String findUnique(String str){

        String res = "";

        List<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        list.removeIf(each -> Collections.frequency(list, each) > 1);

        for(String each: list){
           res += each;
        }

      return res;
    }
}

/*
4.    String - Find the unique
Write a return method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF") ==> "DEF";
 */
