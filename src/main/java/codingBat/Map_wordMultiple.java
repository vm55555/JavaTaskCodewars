package codingBat;

import java.util.*;

public class Map_wordMultiple {

    public Map<String, Boolean> wordMultiple(String[] strings) {

        Map<String, Boolean> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>(Arrays.asList(strings));

        for(String each: list){
            if(Collections.frequency(list, each) > 1){
                map.put(each, true);
            } else {
                map.put(each, false);
            }
        }

        return map;
    }

}

/*
Given an array of strings, return a Map<String, Boolean> where each different string is a key and its value is true if that string appears 2 or more times in the array.

wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"]) → {"c": true}
 */
