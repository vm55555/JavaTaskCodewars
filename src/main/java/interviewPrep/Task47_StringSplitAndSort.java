package interviewPrep;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Task47_StringSplitAndSort {

    public static void main(String[] args) {
        String str = "DC501GCCCA098911N";
        System.out.println(splitAndSort(str));
    }

    public static String sort(String str) {

        String[] arr = str.split("");
        Arrays.sort(arr);
        String res = "";

        for (String each : arr) {
            res += each;
        }

        return res;
    }
    public static String splitAndSort(String str) {

        String temp = "";
        List<String> list = new LinkedList<>();
        String res = "";

        for (int i = 0; i < str.length() -1; i++) {

            char ch = str.charAt(i);
            char nextCh = str.charAt(i + 1);

            if ((Character.isLetter(ch) && Character.isLetter(nextCh) || (Character.isDigit(ch) && Character.isDigit(nextCh))) ){
                temp += ch;

            } else if ((Character.isLetter(ch) && Character.isDigit(nextCh)) || (Character.isDigit(ch) && Character.isLetter(nextCh))) {
                temp += ch;
                list.add(temp);
                temp = "";
            } else if (!Character.isDigit(ch) && !Character.isLetter(ch)) {
                return "String should contains only Numbers and Letters";
            }
        }

        if (!temp.isEmpty()) {
            temp += str.charAt(str.length() - 1);
            list.add(temp);
        }

        for (String each : list) {
            res += sort(each);
        }

        if(res.length() < str.length()){
            res += str.charAt(str.length() - 1);
        }

        return res;
    }
}

/*
//47
 Given alphanumeric String, we need to split the string into substrings of consecutive
  letters or numbers, sort the individual string and append them back together
Input:  "D5C01GCCCA098911"
OutPut: "CD015ACCCG011899"
 */
