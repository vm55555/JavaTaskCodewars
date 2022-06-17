package mentorSession.HW_5;

import java.util.*;
import java.util.stream.Collectors;

public class String_RemoveDuplicates {

    public static void main(String[] args) {

        String str = "AAABBBCCC";
        System.out.println(removeDuplicates(str));
        System.out.println(removeDuplicates2(str));
        System.out.println(removeDuplicates3(str));

    }

    public static String removeDuplicates(String str){

        String [] arr = str.split("");

        return (Arrays.stream(arr).distinct().collect(Collectors.toList()).toString());
    }

    public static String removeDuplicates2(String str){

        String res = "";
        for(int i = 0; i < str.length(); i++){
            if(!res.contains(str.charAt(i) + "")){
                res += str.charAt(i);
            }
        }

        return res;
    }

    public static Set<String> removeDuplicates3(String str){

        return new TreeSet<>(Arrays.asList(str.split("")));
    }

}
/*
3.    String - Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex:  removeDup("AAABBBCCC") ==> ABC
 */
