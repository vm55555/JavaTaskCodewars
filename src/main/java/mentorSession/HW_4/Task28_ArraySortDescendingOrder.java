package mentorSession.HW_4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task28_ArraySortDescendingOrder {

    public static void main(String[] args) {
         int [] arr = {5, 8, 6, 1, 2, 9, 10};
        System.out.println(Arrays.toString(sortDescendingOrder(arr)));
    }

    public static int[] sortDescendingOrder(int [] arr){

        int temp = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){

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
ArrayList - sorting in descending order
 */
