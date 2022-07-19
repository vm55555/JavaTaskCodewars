package interviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task6_RemoveDupl {

    public static void main(String[] args) {

        String str = "AAABBBCCC";
        System.out.println(removeDupl(str));
    }

    public static String removeDupl(String str){

        List<String> list2  = new ArrayList<>(Arrays.asList(str.split("")));
       return  String.valueOf(list2.stream().distinct().collect(Collectors.toList()));
    }
}

/*
6
String h="AAABBBCCC";
        String result = "";

output
ABC
 */
