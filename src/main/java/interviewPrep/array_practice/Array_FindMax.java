package interviewPrep.array_practice;

public class Array_FindMax {

    public static void main(String[] args) {

        int [] arr = {1, 2, 56, 89, 7, 15};
        System.out.println(findMax(arr));
    }

    public static int findMax(int [] arr){

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }
}


 /*
        Write a function that can find the maximum number from an int Array
     */

