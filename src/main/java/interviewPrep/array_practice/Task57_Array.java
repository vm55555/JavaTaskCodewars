package interviewPrep.array_practice;

import java.util.HashMap;
import java.util.Map;

public class Task57_Array {

    public static void main(String[] args) {
        int [] arr = {1, 1, 2, 3, 4, 3, 4};
        System.out.println(findUnique(arr));
    }

    public static int findUnique(int [] arr){

        for (int k : arr) {
            int count = 0;
            for (int i : arr) {
                if (k == i) {
                    count++;
                }
            }
            if (count == 1) {
                return k;
            }
        }

        return -1;
    }
}

/*

//57
 Given an array nums with 7 integers every element is repeated twice
 - except one. Find that element and print it to console.
Example:
nums -> [1, 1, 2, 3, 4, 3, 4]
         2
 */
