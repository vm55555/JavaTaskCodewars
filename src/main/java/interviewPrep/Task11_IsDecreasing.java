package interviewPrep;

import java.util.Arrays;

public class Task11_IsDecreasing {

    public static void main(String[] args) {
        int[] arr = {4, 4, 3, 2, 1};
        System.out.println(isDesc(arr));
    }

    public static boolean isDesc(int[] arr) {

        int[] arrToCompare = Arrays.copyOf(arr, arr.length);

        Arrays.sort(arrToCompare);

        int[] arrToAdd = new int[arrToCompare.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            arrToAdd[arrToCompare.length - 1 - i] = arrToCompare[i];
        }
        return (Arrays.equals(arr, arrToAdd));

    }
}

//11  if desc  true
//  int[]a={7,6,5,4};
// check if array's elements are in descending order

