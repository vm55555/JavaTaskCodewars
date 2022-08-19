package interviewPrep.map_practice;

import java.util.*;

public class Map_TimeSeries {

    public static void main(String[] args) {

       Map <Integer, Double> listA = new HashMap<>();
       listA.put(1, 1.0);
       listA.put(2, 1.5);
       listA.put(3, 2.0);

       Map <Integer, Double> listB = new HashMap<>();
       listB.put(2, 1.0);
       listB.put(3, 2.5);
       listB.put(5, 1.0);

        System.out.println(timeSeries(listA, listB));
    }

    public static Map<Integer, Double> timeSeries( Map <Integer, Double> listA, Map <Integer, Double> listB){

        Map <Integer, Double> result = new HashMap<>();

        iterationMap(listA, result);
        iterationMap(listB, result);

        return result;
    }

    public static void iterationMap(Map<Integer, Double> listA, Map<Integer, Double> result) {
        double count;
        for(Map.Entry<Integer, Double> each: listA.entrySet()){

            if(result.containsKey(each.getKey())){
                count = each.getValue() + result.get(each.getKey());
                result.put(each.getKey(), count);
            } else {
                result.put(each.getKey(), each.getValue());
            }
        }
    }
}

/*
what is the answer to this task guys if you can help now please
A time series is represented as a list of time/value pairs. Write a function whose input is two time series and whose output is a new time series of the summation of them.
Example:
series A: [(1, 1.0), (2, 1.5), (3, 2.0)]
series B: [(2, 1.0), (3, 2.5), (5, 1.0)]
Assuming we have '0' for a time pair that's missing, this is the result:
output: [(1, 1.0), (2, 2.5), (3, 4.5), (5, 1.0)]
 */
