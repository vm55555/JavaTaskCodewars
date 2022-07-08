package mentorSession.HW_5;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Task {

    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";
        System.out.println(removeDupl(str));
    }
    public static Set<String> removeDupl(String str){

        return new TreeSet<>(Arrays.asList(str.split("")));
    }
}

/*
3.    String - Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex:  removeDup("AAABBBCCC") ==> ABC
 */

