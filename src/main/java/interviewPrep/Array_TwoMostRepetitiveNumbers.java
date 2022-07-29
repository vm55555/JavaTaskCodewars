package interviewPrep;

import java.util.HashMap;
import java.util.Map;

public class Array_TwoMostRepetitiveNumbers {

    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 3, 3, 3, 4};
        System.out.println(mostRepetitiveNumbers(nums));
    }

    public static String mostRepetitiveNumbers(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int mostRepCount = 0;
        int mostRepNum = 0;
        int secondRepNum = 0;

        for (int i = 0; i < nums.length; i++) {

            Integer temp = nums[i];

            if (map.containsKey(temp)) {
                int count = map.get(temp) + 1;
                map.put(temp, count);
                if (count > mostRepCount) {

                    if (secondRepNum != mostRepCount) {
                        secondRepNum = mostRepNum;
                    }
                    mostRepCount = count;
                    mostRepNum = nums[i];
                }

                } else {
                    map.put(temp, 1);
                }
            }

        return "Most repetitive numbers are: " + mostRepCount + " and " + secondRepNum;
    }
}


/*
//k=1; output should be 3 - most repetitive
//k=2; output 2,3 - two most repetitive numbers

int[] nums=[1,2,2,3,3,3,4];
int k=2;
 */
