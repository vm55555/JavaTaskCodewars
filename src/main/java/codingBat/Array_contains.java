package codingBat;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_contains {

    public static void main(String[] args) {

    }

    public boolean no23(int[] nums) {

        for (int num : nums) {
            if (num == 2 || num == 3) {
                return false;
            }
        }

        return true;
    }
}

//https://codingbat.com/prob/p175689
