package mentorSession.HW_2;

public class Task9_ArrayFindMax {

    public static void main(String[] args) {

        int [] arr = {1, 2, 58, 6, -9};
        System.out.println(findMax(arr));
    }

    public static int findMax(int [] arr){

        if(arr != null && arr.length > 0){

            int max = Integer.MIN_VALUE;

            for (int each : arr) {
                if (each > max) {
                    max = each;
                }
            }

          return max;
        }

        return -1;
    }
}

/*
9) Array - Find Maximum
Write a method that can find the maximum number from an int Array
 */
