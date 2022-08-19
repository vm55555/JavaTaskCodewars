package interviewPrep.array_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {
        String g = "abc";
        String h = "cabb";
        System.out.println(isSame(g, h));
    }

    public static boolean isSame(String g, String h){

        if(g.length() == h.length()){
            String [] arr = g.split("");
            String [] arr2 = h.split("");

            Arrays.sort(arr);
            Arrays.sort(arr2);
            return Arrays.equals(arr, arr2);
        }

        return false;
    }

    public static class Task12_MoveZeroToTheEnd {

        public static void main(String[] args) {

            int[] arr = {1, 0, 0, 2, 0, 3, 49, 6, 5};
            System.out.println(MoveZeroesToTheEnd(arr));
        }
        public static ArrayList<Integer> MoveZeroesToTheEnd (int[]arr){

            Integer[] aInt = new Integer[arr.length]; // create an empty Integer[] aInt array with the length of int[] arr
            Arrays.setAll(aInt, i -> arr[i]); // assign int[] arr elements to the Integer array

            ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(aInt));

            ArrayList<Integer> forZeroes = new ArrayList<>();
            for (Integer each : arrList) {
                if (each == 0) {
                    forZeroes.add(0);
                }
            }
            arrList.removeIf(each -> each == 0);
            arrList.addAll(forZeroes);

            return arrList;
        }
    }

    public static class Task13_MergeTwoArrays {

        public static void main(String[] args) {

            int arr1[]={1,2,3};
            int arr2[]={4,5,6,7};

            System.out.println(mergeTwoArrays(arr1,arr2));
        }
        public static ArrayList<Integer> mergeTwoArrays(int[] arrOne, int[] arrTwo) {

            Integer[] arrIntegerOne = new Integer[arrOne.length];
            Arrays.setAll(arrIntegerOne, i -> arrOne[i]);

            Integer[] arrIntegerTwo = new Integer[arrTwo.length];
            Arrays.setAll(arrIntegerTwo, i -> arrTwo[i]);

            ArrayList<Integer> mergedArrayList = new ArrayList<>();
            mergedArrayList.addAll(Arrays.asList(arrIntegerOne));
            mergedArrayList.addAll(Arrays.asList(arrIntegerTwo));

            return mergedArrayList;
        }
    }
}
/*
2.
use Array sort
Write a return method that check if a string is build out of the same letters as another string.
   String g="abc";
   String h="cab";
Ex:  same("abc",  "cab"); -> true
same("abc",  "abb"); -> false:

 */