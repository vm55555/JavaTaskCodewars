package interviewPrep.array_practice;

import java.util.Arrays;

public class Task55_SortArray {

    public static void main(String[] args) {
        int[] arr11 = {200, 155, 100, 4, 3, 1, -1, -100};
        System.out.println(Arrays.toString(sortInAscendingOrder(arr11)));

    }

    public static int [] sortInAscendingOrder(int [] arr){

        int temp = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
}

/*
//55
int[] arr11 = {200, 155, 100, 4, 3, 1, -1, -100};
convert it ascending array and print like this
[-100, -1, 1, 3, 4, 100, 155, 200]
 */
