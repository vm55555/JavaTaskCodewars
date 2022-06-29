package interviewPrep;

import java.util.*;

public class Task50_RemoveDuplicates {

    public static void main(String[] args) {
        String h = "AABCC";
        System.out.println(removeDuplicatesMap(h));

        System.out.println(removeDuplicatesFreq(h));
    }

    public static String removeDuplicatesMap(String str) {

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            if (map.containsKey(str.charAt(i) + "")) {
                count = map.get(str.charAt(i) + "") + 1;
                map.put(str.charAt(i) + "", count);
            } else {
                map.put(str.charAt(i) + "", 1);
            }
        }
        str = "";
        for (Map.Entry<String, Integer> each : map.entrySet()) {

            if (each.getValue() == 1) {
                str += each.getKey();
            }
        }

        return str;
    }

    public static String removeDuplicatesFreq(String str) {

        List<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        list.removeIf(each -> Collections.frequency(list, each) > 1);

        return String.valueOf(list);
    }
}
/*
//50 Remove from same string assign same string
String h="AABCC";
Remove
SECOND WAY --write a program that can return the unique characters from a string
Ex:  "AABCC" ==> "B"
 */

