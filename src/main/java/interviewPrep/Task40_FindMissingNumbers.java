package interviewPrep;

import java.util.ArrayList;
import java.util.List;

public class Task40_FindMissingNumbers {

    public static void main(String[] args) {
        int r[]={-1,3,5,6,7,9,13,18,70,80,1400,1401,1405};
        System.out.println(findMissingNumbers(r));
    }

    public static List<Integer> findMissingNumbers(int [] arr){

        List<Integer> res = new ArrayList<>();

        for(int i = 0; i < arr.length - 1; i++){
             int number = arr[i] + 1;
            while (number != arr[i+1]){
                if(!res.contains(number)){
                    res.add(number);
                    number++;
                }
            }
        }

        return res;
    }
}
/*
//40  FIND missing number

 int r[]={-1,3,5,6,7,9,13,18,70,80,1400,1401,1405};
 */