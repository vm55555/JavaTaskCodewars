package mentorSession.HW_3;

import java.util.Arrays;

public class Task16_ConcatTwoArrays {

    public static void main(String[] args) {

        int [] arr = {1,2,3};
        int [] arr2 = {4, 5, 6};
        System.out.println(Arrays.toString(concatArrays(arr, arr2)));
    }

    public static int[] concatArrays(int[] arr1, int[] arr2){

        int [] result = Arrays.copyOf(arr1, arr1.length + arr2.length);
        for(int i = arr1.length; i < result.length; i++){
            result[i] = arr2[i - arr1.length];
        }

        return result;
    }
}

/*
16) Array - Concat two arrays
Write a return method that can concate two arrays
 */
