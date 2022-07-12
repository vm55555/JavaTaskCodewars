package interviewPrep;

import java.util.HashMap;
import java.util.Map;

public class Task29_Map_MinAndMax {

    public static void main(String[] args) {

        Map<String,Integer>t=new HashMap<>();
        t.put("a",2);
        t.put("q",5);
        t.put("w",1);
        minAndMax(t);

    }

    public static void minAndMax(Map<String, Integer> map){

        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        for(Map.Entry<String, Integer> each: map.entrySet()){
            if(each.getValue() > maxValue){
                maxValue = each.getValue();
            } else if(each.getValue() < minValue){
                minValue = each.getValue();
            }
        }

        System.out.println("Min: " + minValue + "\nMax: " + maxValue);
    }
}
/*
//29
Map -- Min value  and Max value
   Map<String,Integer>t=new HashMap<>();
t.put("a",2);
t.put("q",5);
t.put("w",1);

output
 */