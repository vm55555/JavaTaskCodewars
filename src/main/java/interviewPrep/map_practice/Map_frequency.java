package interviewPrep.map_practice;

import java.util.HashMap;
import java.util.Map;

public class Map_frequency {

    public static void main(String[] args) {
        String str="AABBDDDC";
        System.out.println(frequencyOfChars(str));
    }

    public static Map<Character, Integer> frequencyOfChars(String str){

        Map<Character, Integer> map = new HashMap<>();
        int count = 0;

        for(int i = 0; i < str.length(); i++){
            Character ch = str.charAt(i);
            if(map.containsKey(ch)){
              count = map.get(ch) + 1;
              map.put(ch, count);
            } else {
                map.put(ch, 1);
            }
        }

        return map;
    }
}

/*
//27 frequency
  String str="AABBDDDC";
        Map<Character, Integer> map = new LinkedHashMap<>();
        output
{A=2, B=2, D=3, C=1}
 */
