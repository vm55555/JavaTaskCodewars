package interviewPrep.array_practice;

import java.util.HashMap;
import java.util.Map;

public class Task80_Array {

    public static void main(String[] args) {
        Integer arr[]={22,101,102,101,102,101,525,88};
        System.out.println(mostRepetitive(arr));

    }

    public static int mostRepetitive(Integer [] arr){

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int max = 0;
        int result = 0;

        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                count = map.get(arr[i]);
                map.put(arr[i], count + 1);
                if(count + 1 > max){
                    max = count + 1;
                    result = arr[i];
                }
            } else {
                map.put(arr[i], 1);
            }
        }

        return result;
    }
}

/*
//80
 // Write a function that receives an array of positive integers with values
        //between and the length or the array. That function returns the number
        //that most frucient array
         Integer arr[]={22,101,102,101,102,101,525,88};
         output 101
 */