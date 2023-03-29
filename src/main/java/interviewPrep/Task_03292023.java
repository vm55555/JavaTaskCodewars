package interviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_03292023 {

    public static void main(String[] arg){

        System.out.println(convertString("(( @"));


    }

    public static String convertString(String str){
        String res = "";
        String temp = "";
        int count = 0;

        for (int i = 0; i < str.length(); i++){
            for (int j = 0; j < str.length(); j++){
                if (str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            temp = count == 1 ? "(" : ")";
            res += temp;
            count = 0;
        }

        return res;
    }
}

/*
The goal of this exercise is to convert a string to a new string where each character in the new string
is "(" if that character appears only once in the original string, or ")" if that character appears more
than once in the original string. Ignore capitalization when determining if a character is a duplicate.
Examples

"din"      =>  "((("
"recede"   =>  "()()()"
"Success"  =>  ")())())"
"(( @"     =>  "))(("

 */
