package interviewPrep.array_practice;

import java.util.HashMap;
import java.util.Map;

public class Array_Count_V {

    public static void main(String [] args){

        String [] testArray = {"Apple","Banana","Apple","Cherry"};
        System.out.println(countElements(testArray));
    }

    public static Map <String, Integer> countElements(String [] arr){

        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            int count = 0;

            if(map.containsKey(arr[i])){
                count = map.get(arr[i]) + 1;
                map.put(arr[i], count);
            } else {
                map.put(arr[i], 1);
            }
        }

        return map;
    }
}

/*
Given the array return the output
                testArray = {"Apple","Banana","Apple","Cherry"}
                Output Example
                Apple = 2
                Banana = 1
                Cherry = 1
 */
