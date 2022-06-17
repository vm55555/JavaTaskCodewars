package mentorSession.HW_5;

import java.util.HashMap;
import java.util.Map;

public class String_FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "AAABBCDD";
        System.out.println(frequencyOfCharacters(str));

    }

    public static String frequencyOfCharacters(String str){

        Map<String, Integer> map = new HashMap<>();
        int count = 0;
        String res = "";

        for(int i = 0; i < str.length(); i++){
            if(map.containsKey(str.charAt(i) + "")){
                count = map.get(str.charAt(i) + "");
                map.put(str.charAt(i) + "", count + 1);
            } else {
                map.put(str.charAt(i) + "", 1);
            }
        }

        for(Map.Entry<String, Integer> each: map.entrySet()){
            res += each.getKey() + each.getValue();
        }

        return res;
    }
}

/*
1.    String - Frequency of Characters
Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */
