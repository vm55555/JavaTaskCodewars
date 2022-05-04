package interviewPrep;

import java.util.ArrayList;
import java.util.Arrays;

public class Task12_MoveZeroToTheEnd {

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

//    12  Move zeros
//    int[] arr = {1, 0,0,2,0, 3, 49, 6, 5};
//    ArrayList<Integer> list = new ArrayList<>();
//
//     output
//        [1, 2, 3, 49, 6, 5, 0, 0, 0]

