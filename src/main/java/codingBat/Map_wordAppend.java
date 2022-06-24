package codingBat;

import java.util.*;

public class Map_wordAppend {

    public static void main(String[] args) {
        String [] arr = {"this", "or", "that", "and", "this", "and", "that"};
        System.out.println(wordAppend(arr));
    }

    public static String wordAppend(String[] strings) {

        Map<Integer, String> map = new TreeMap<>();
        int count = 0;
        ArrayList<String> list  = new ArrayList<>(Arrays.asList(strings));
        String res = "";

        for(int i = 0; i < list.size();i++){
            for(int j = i - 1; j >= 0; j--){
                if(list.get(i).equalsIgnoreCase(list.get(j))){
                    count++;
                }
            }

            if(count > 0 && count % 2 != 0){
                res += list.get(i);
            }
            count = 0;
        }

        return res;
    }
}
/*
Loop over the given array of strings to build a result string like this: when a string appears the 2nd, 4th, 6th, etc.
 time in the array, append the string to the result. Return the empty string if no string appears a 2nd time.


wordAppend(["a", "b", "a"]) → "a"
wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
wordAppend(["a", "", "a"]) → "a"
wordAppend(["this", "or", "that", "and", "this", "and", "that"]) → "thisandthat"
 */
