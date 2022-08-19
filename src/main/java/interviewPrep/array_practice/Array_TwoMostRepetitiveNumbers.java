package interviewPrep.array_practice;

import java.util.Arrays;
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

    public static class Task10_AscendNumber {

        /*if ascend true
       int[]a={1,2,3,4,5,6,7};
       */
        public static void main(String[] args) {
            int[]a={1,2,3,4,5,6,7};
            int[]b={1,2,3,4,5,6,7};
            Arrays.sort(a);

            System.out.println(Arrays.equals(a, b));
        }
    }

    public static class Task11_IsDecreasing {

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

    public static class Task12_RemoveZeros_ {

        public static void main(String[] args) {
            int[] arr = {1, 0,0,2,0, 3, 49, 6, 5};
            System.out.println(Arrays.toString(moveZeros(arr)));

        }

        public static int [] moveZeros(int[] arr){

            int [] result = new int[arr.length];
            int count = 0;

            for(int i = 0; i < arr.length; i++){
                if(arr[i] != 0){
                    result[count++] = arr[i];
                }
            }

            return result;
        }
    }
}


/*
//k=1; output should be 3 - most repetitive
//k=2; output 2,3 - two most repetitive numbers

int[] nums=[1,2,2,3,3,3,4];
int k=2;
 */
