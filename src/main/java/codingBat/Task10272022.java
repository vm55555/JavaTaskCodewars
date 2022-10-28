package codingBat;

import java.util.Arrays;

public class Task10272022 {
    public static void main(String [] args){

        int [] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(makeMiddle(arr)));
    }

    public static int[] makeMiddle(int[] nums) {

        int first = (nums.length / 2) - 1;
        int [] res = new int[2];
        res[0] = nums[first];
        res[1] = nums[first + 1];

        return res;
    }
}

//https://codingbat.com/prob/p199519
/*Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array. The original array will be length 2 or more.


makeMiddle([1, 2, 3, 4]) → [2, 3]
makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
makeMiddle([1, 2]) → [1, 2]*/