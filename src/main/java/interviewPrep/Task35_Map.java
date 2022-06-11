package interviewPrep;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task35_Map {

    public static void main(String[] args) {
        String s = "Seda, 20, Leyla, 30";
        String str = "Seda, Nurik, Leyla, Seda";
        System.out.println(createMap(s));
        System.out.println(concatenateEquals(str));
    }

    public static Map<String, String> createMap(String str){

        Map<String, String> map = new LinkedHashMap<>();
        String [] arr = str.split(", ");
        for(int i = 0; i < arr.length - 1; i++){

           if(Character.isDigit(arr[i + 1].charAt(0))){
               map.put(arr[i], arr[i + 1]);
               i++;
           } else {
               map.put(arr[i], null);
           }
        }

        if(!Character.isDigit(arr[arr.length - 1].charAt(0))){
            map.put(arr[arr.length - 1], null);
        }

        return map;
    }

    public static String concatenateEquals(String str){

        String [] arr = str.split(", ");
        String res = "{";
       for(int i = 0 ; i < arr.length; i++){
           res += arr[i] + "=, ";
       }

       res = res.substring(0, res.lastIndexOf(","));

        return res + "}";
    }
}

/*
//35
 String s = "Seda, 20, Leyla, 30";

 First output
 {Seda= 20,  Leyla= 30}

 Second
  String str = "Seda, Nurik, Leyla, Seda";
{Seda=,  Nurik=,  Leyla=,  Seda=}
 */
