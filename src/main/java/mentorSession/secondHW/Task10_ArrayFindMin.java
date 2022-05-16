package mentorSession.secondHW;

public class Task10_ArrayFindMin {

    public static void main(String[] args) {

        int [] arr = {1, 2, 58, 6, -9};
        System.out.println(findMin(arr));
    }

    public static int findMin(int [] arr){

        if(arr != null && arr.length > 0){

            int min = Integer.MAX_VALUE;

            for (int each : arr) {
                if (each < min) {
                    min = each;
                }
            }

            return min;
        }

        return -1;
    }
}

/*
10) Array - Find Minimum
Write a method that can find the maximum number from an int Array
 */
