package mentorSession.HW_3;

import java.util.Arrays;

public class Task15_MoveZerosToTheEnd {

    public static void main(String[] args) {
        int [] arr ={1,0,2,0,3,0,4,0};
        System.out.println(Arrays.toString(moveZerosToTheEnd(arr)));
    }

    public static int[] moveZerosToTheEnd(int[]arr){

        int[] res = new int[arr.length];
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                res[count++] = arr[i];
            }
        }

        return res;
    }
}

/*
15) Array - Move Zeros to the End
Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
Ex:
input:  {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]
 */
