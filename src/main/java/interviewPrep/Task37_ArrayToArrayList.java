package interviewPrep;

import java.util.ArrayList;

public class Task37_ArrayToArrayList {

    public static void main(String[] args) {

        int [] arr = {1,4,8,0,3,11,26,2};

        System.out.println(arrayToArrayList(arr));
    }

    public static ArrayList<Integer> arrayToArrayList(int [] arr){

        ArrayList<Integer> list  = new ArrayList<>();

        for(int i = 0; i < arr.length; i += 2){
            list.add(arr[i]);
        }

        return list;
    }
}

/*
//37  Store Array and ArrayList

 int [] arr = {1,4,8,0,3,11,26,2};

 output
 [1, 8, 3, 26]
 */
