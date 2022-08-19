package interviewPrep.string_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task9_NumberLetterSort {

    public static void main(String[] args) {

        String str = "DC501GCCCA098911N9";
        System.out.println(sortAndSplit(str));
    }

    public static String sortAndSplit(String str){

        String res = "";
        List<String> letters = new ArrayList<>();
        List<String> numbers = new ArrayList<>();

        for(int i = 0; i < str.length(); i++){

            if(Character.isLetter(str.charAt(i))){
                letters.add(str.charAt(i) + "");
                Collections.sort(numbers);
                for(String each: numbers){
                    res += each;
                }
                numbers.clear();
            } else if(Character.isDigit(str.charAt(i))) {
                numbers.add(str.charAt(i) + "");
                Collections.sort(letters);
                for(String each: letters){
                    res += each;
                }
                letters.clear();
            }
        }
        for(String each: numbers){
            res += each;
        }
        for(String each: letters){
            res += each;
        }

        return res;
    }
}

/*
9
String str="DC501GCCCA098911";

output
CD015ACCCG011899
 */
