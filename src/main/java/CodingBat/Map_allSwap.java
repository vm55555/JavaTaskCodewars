package CodingBat;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Map_allSwap {

    public static void main(String[] args) {

        String [] arr = {"4", "8", "41"};
        System.out.println(Arrays.toString(allSwap(arr)));

    }

    public static String[] allSwap(String[] strings) {

        Map<Integer, String> map = new TreeMap<>();
        int count = 0;

        for(int i = 0; i < strings.length; i++){
            count = map.size();
            for(int j = i + 1; j < strings.length; j++){
                if(strings[i].charAt(0) == strings[j].charAt(0) && !map.containsKey(j) && !map.containsKey(i)){

                    map.put(i, strings[j]);
                    map.put(j, strings[i]);

                    break;
                }
            }
            if(count == map.size() && !map.containsKey(i)){
                map.put(i, strings[i]);
            }
        }

        System.out.println(map);
        count = 0;

        String [] res = new String[strings.length];
        for(String each: map.values()){
            res[count++] = each;
        }

        return res;
    }
}

/*
We'll say that 2 strings "match" if they are non-empty and their first chars are the same.
Loop over and then return the given array of non-empty strings as follows:
 if a string matches an earlier string in the array, swap the 2 strings in the array.
 When a position in the array has been swapped, it no longer matches anything. Using a map, this can be solved making just one pass over the array. More difficult than it looks.


allSwap(["ab", "ac"]) → ["ac", "ab"]
allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]
 */
