package interviewPrep;

import java.util.ArrayList;

public class Task12_Remove0 {

    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 2, 0, 3, 49, 6, 5};
        System.out.println(removeZeros(arr));
    }

    public static ArrayList<Integer> removeZeros(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                list.add(arr[i]);
            }
        }
        return list;
    }
}

/*
//12  Remove zeros
  int[] arr = {1, 0,0,2,0, 3, 49, 6, 5};
        ArrayList<Integer> list = new ArrayList<>();
 */