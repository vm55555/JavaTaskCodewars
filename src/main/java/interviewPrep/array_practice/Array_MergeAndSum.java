package interviewPrep.array_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_MergeAndSum {

    public static void main(String[] args) {
        int a[]={1,2,3};
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(4,5,6,7,8));
        mergeArr(a, list);

    }

    public static void mergeArr(int [] arr, ArrayList<Integer> list){

        if(arr.length > list.size()){
            for(int i = 0; i < list.size(); i++){
                arr[i]+= list.get(i);
            }

            System.out.println(Arrays.toString(arr));
        } else {
            for(int i = 0; i < arr.length; i++){
                list.set(i, list.get(i) + arr[i]);
            }

            System.out.println(list);
        }
    }
}

/*
    //Create 1 array int[] and 1 ArrayList and store result into them and get this result
//Calculate each number of array: Ex 1+4,2+5,6+3
//input
//int a[]={1,2,3};// length 3
// ArrayList<Integer>list=new ArrayList<>(Arrays.asList(4,5,6,7,8));// length 5
//
//outputint a[]={1,2,3};// length 3
////        int b[]={4,5,6,7,8};// length 5
//[5, 7, 9, 7, 8]
---------------------
*/
