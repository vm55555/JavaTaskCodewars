package interviewPrep;

import java.util.Arrays;

public class Task12_RemoveZeros_ {

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

/*
//12  Remove zeros
  int[] arr = {1, 0,0,2,0, 3, 49, 6, 5};
        ArrayList<Integer> list = new ArrayList<>();

output
[1, 2, 3, 49, 6, 5, 0, 0, 0]
 */
