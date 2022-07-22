package interviewPrep;

import java.util.ArrayList;
import java.util.Arrays;

public class Task73_MergeArrayAndList_ {

    public static void main(String[] args) {
        int a[]={1,2,3};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,5,6,7,8));
        System.out.println(Arrays.toString(concatArr(a, list)));


    }

    public static int[] concatArr(int[] arr, ArrayList<Integer> list){

        if(arr.length > list.size()){
            int [] res = arr;

            for(int i = 0; i < list.size(); i++){
                res[i] = res[i] + list.get(i);
            }

            return res;
        } else {

            int [] res = new int[list.size()];

            for(int i = 0; i < list.size(); i++){
                res[i] = list.get(i);
            }

            for(int i = 0; i < arr.length; i++){
                res[i] = res[i] + arr[i];
            }

            return res;
        }

    }
}

/*
//73
 //Create 1 array int[] and 1 ArrayList and store result into them and get this result
//Calculate each number of array: Ex 1+4,2+5,6+3
//input
//int a[]={1,2,3};// length 3
//        int b[]={4,5,6,7,8};// length 5
//
//outputint a[]={1,2,3};// length 3
////        int b[]={4,5,6,7,8};// length 5
//[5, 7, 9, 7, 8]
 */
