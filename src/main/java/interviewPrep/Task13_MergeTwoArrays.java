package interviewPrep;

import java.util.ArrayList;
import java.util.Arrays;

public class Task13_MergeTwoArrays {

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

/*
int arr1[]={1,2,3};
        int arr2[]={4,5,6,7};

        output
     [1, 2, 3, 4, 5, 6, 7]
 */
