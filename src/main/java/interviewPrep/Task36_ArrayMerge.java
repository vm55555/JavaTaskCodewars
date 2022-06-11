package interviewPrep;

import java.util.Arrays;

public class Task36_ArrayMerge {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        System.out.println(Arrays.toString(mergeArray(arr1, arr2)));
    }

    public static int[] mergeArray(int[] arr1, int[] arr2) {

        int[] res = new int[arr1.length + arr2.length];

        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            res[count++] = arr1[i];
            res[count++] = arr2[i];
        }

        return res;
    }
}


/*
//36
 int a[]={1,3,5};
        int b[]={2,4,6};

output Array
[1, 2, 3, 4, 5, 6]
 */
