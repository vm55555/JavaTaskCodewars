package mentorSession.HW_2;

import java.util.Arrays;

public class Task12_ArraySortDescending {

    public static void main(String[] args) {
        int [] arr = {10, 5, 4, 7, 6, -9};
        System.out.println(Arrays.toString(sortAscending(arr)));
    }

    public static int[] sortAscending(int [] arr){

        if(arr != null && arr.length > 0){

            int temp = 0;

            for(int i = 0; i < arr.length - 1; i++){
                for (int j = i + 1; j < arr.length; j++){
                    if(arr[i] < arr[j]){
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

            return arr;
        }

        return null;
    }
}

/*
12) Array - Sort Descending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex:  int[] arr = {10,20,7, 8, 90};
                 arr = Sort(arr);  ==>  {90, 20, 10, 8, 7};
 */
