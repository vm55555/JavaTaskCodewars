package codingBat;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Map_firstSwap {

    public static void main(String[] args) {

        String [] arr = {"ax", "bx", "cx", "ay", "cy", "aaa", "abb"};
        System.out.println(Arrays.toString(firstSwap(arr)));
    }

    public static String[] firstSwap(String[] strings) {

        Map<Integer, String> map = new TreeMap<>();
        int count = 0;
        String disabled = "";

        for(int i = 0; i < strings.length; i++){
            count = map.size();
            for(int j = i + 1; j < strings.length; j++){
                if(strings[i].charAt(0) == strings[j].charAt(0) && !map.containsKey(j) && !map.containsKey(i) && !disabled.contains(strings[i].charAt(0) + "")){

                    map.put(i, strings[j]);
                    map.put(j, strings[i]);
                    disabled += "" + strings[i].charAt(0);

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
 Loop over and then return the given array of non-empty strings as follows: if a string matches an earlier string in the array,
 swap the 2 strings in the array. A particular first char can only cause 1 swap, so once a char has caused a swap,
 its later swaps are disabled. Using a map, this can be solved making just one pass over the array. More difficult than it looks.


firstSwap(["ab", "ac"]) → ["ac", "ab"]
firstSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"]
firstSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "ai", "aj", "bx", "by"]
firstSwap(["ax", "bx", "cx", "ay", "cy", "aaa", "abb"]) → ["ay", "bx", "cy", "ax", "cx", "aaa", "abb"]
 */
