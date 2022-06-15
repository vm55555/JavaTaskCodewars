package interviewPrep;

import java.util.ArrayList;
import java.util.Arrays;

public class Task40_MissingNumbers {

    public static void main(String[] args) {

        int r[]={-1,3,5,6,7,9,13,18,70,80,1400,1401,1405};
        System.out.println(missingNumbers(r));
    }

    public static ArrayList<Integer> missingNumbers(int [] arr){

        ArrayList<Integer> list  = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        for(int each: arr){
            temp.add(each);
        }

        Arrays.sort(arr);

        for(int i = arr[0]; i < arr[arr.length - 1]; i++){
            if(!temp.contains(i)){
                list.add(i);
            }
        }

        return list;
    }

}
/*
//40  FIND missing number

 int r[]={-1,3,5,6,7,9,13,18,70,80,1400,1401,1405};

 */