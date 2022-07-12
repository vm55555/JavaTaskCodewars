package interviewPrep;
import java.util.HashMap;
import java.util.Map;

public class Task35_Map2 {

    public static void main(String[] args) {
        String s = "Seda, 20, Leyla, 30";
        String str = "Seda, Nurik, Leyla, Seda";
        System.out.println(combine(s));
        System.out.println(combineNull(str));
    }

    public static Map<String, Integer> combine(String str){

        String [] arr = str.split(", ");

        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i< arr.length; i+= 2){
            map.put(arr[i], Integer.parseInt(arr[i+1]));
        }

        return map;
    }

    public static String combineNull(String str){

        String [] arr = str.split(", ");
        String res = "";

        for(int i = 0; i< arr.length; i++){
            res += arr[i] + "=, ";
        }

        return "{" + res + "}";
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
