package interviewPrep.array_practice;

import java.util.Arrays;

public class Task74_pivot {

    public static void main(String[] args) {

        int[] arr = {5, 7, 3, 9, 1, 0};
        int pivot = 8;
        System.out.println(Arrays.toString(pivot(arr, pivot)));

    }

    public static int [] pivot(int [] arr, int pivot){

        int [] res = new int[arr.length + 1];
        int count = 0;
        for(int i = 0; i < res.length; i++){
            if(res.length /2 == i){
                res[i] = pivot;
            } else {
                res[i] = arr[count++];
            }
        }

        return res;
    }
}

/*
//74
int[] arr = {5, 7, 3, 9, 1, 0};
int pivot = 8
In case we need to have pivot int inside the array the output should be: [5, 7, 3, 8, 9, 1, 0]
 */
