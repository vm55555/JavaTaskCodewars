package codingBat;

import java.util.Arrays;

public class Array_0721 {

    public static void main(String[] args) {

        int [] arr = {1, 2, 3};
        System.out.println(Arrays.toString(fix23(arr)));
    }

    public static int[] fix23(int[] nums) {

        for(int i = 0; i < nums.length -1 ; i++){

            if(nums[i] == 2 && nums[i + 1] == 3){
                nums[i + 1] = 0;
            }
        }

        return nums;
    }
}

//https://codingbat.com/prob/p120347

