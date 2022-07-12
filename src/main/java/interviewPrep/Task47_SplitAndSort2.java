package interviewPrep;

import java.util.ArrayList;
import java.util.Collections;

public class Task47_SplitAndSort2 {

    public static void main(String[] args) {

        String str = "D5C01GCCCA098911H";
        System.out.println(splitAndSort(str));
    }

    public static String splitAndSort(String str){
        ArrayList<String> letters = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();
        String res = "";

        for (int i = 0; i < str.length(); i++){

            if(Character.isDigit(str.charAt(i))){
                numbers.add(str.charAt(i) + "");
                Collections.sort(letters);
                for (String letter : letters) {
                    res += letter;
                }
                letters.clear();

            } else if(Character.isLetter(str.charAt(i))){
                letters.add(str.charAt(i) + "");
                Collections.sort(numbers);
                for(String number: numbers){
                    res += number;
                }
                numbers.clear();
            }
        }

        Collections.sort(letters);
        for (String letter : letters) {
            res += letter;
        }
        letters.clear();

        Collections.sort(numbers);
        for(String number: numbers){
            res += number;
        }
        numbers.clear();

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
