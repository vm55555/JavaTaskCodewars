package mentorSession.HW_3;

import java.util.Arrays;

public class MoveZero_Session {

    public static void main(String[] args) {

        int [] arr = {0, 0, 5, 0, 56, 0, 45, 0, 5, 0};
        System.out.println(Arrays.toString(moveZero(arr)));

    }

    public static int[] moveZero(int [] arr){

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
