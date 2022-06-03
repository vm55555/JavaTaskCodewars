package interviewPrep;

import java.util.HashMap;
import java.util.Map;

public class Task29_MapMinValue {

    public static Integer minValue(Map<String,Integer> map){
        Integer result=Integer.MAX_VALUE;
        for (Map.Entry<String,Integer>each:map.entrySet()){
            if (each.getValue()<result){
                result=each.getValue();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Map<String,Integer>t=new HashMap<>();
        t.put("a",2);
        t.put("q",5);
        t.put("w",1);
        System.out.println(minValue(t));
    }
}

/*29
    Map -- Min value  and Max value
    Map<String,Integer>t=new HashMap<>();
    t.put("a",2);
    t.put("q",5);
    t.put("w",1);
    output
     1
      */
