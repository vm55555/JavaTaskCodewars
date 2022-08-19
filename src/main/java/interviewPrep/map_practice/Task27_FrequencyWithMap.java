package interviewPrep.map_practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task27_FrequencyWithMap {

    public static void main(String[] args) {
        String str="AABBDDDC";
        System.out.println(frequency(str));
    }

    public static Map<Character, Integer> frequency(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                count=map.get(str.charAt(i))+1;
                map.put(str.charAt(i),count);

            } else {
                map.put(str.charAt(i),1);
            }
        }
        return map;
    }
}
/*
  27 frequency
    String str="AABBDDDC";
    Map<Character, Integer> map = new LinkedHashMap<>();
    output
    {A=2, B=2, D=3, C=1}
 */
