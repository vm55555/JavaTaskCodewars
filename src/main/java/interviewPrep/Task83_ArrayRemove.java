package interviewPrep;

import java.util.*;


public class Task83_ArrayRemove {

    public static void main(String[] args) {

        int y[]=new int[]{6,-6, -5,-5, -5, 5, -5, 6, 1,2,8,6};
        System.out.println(deleteNegative(y));
    }
    public static ArrayList<Integer> deleteNegative(int [] arr){

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();

        for (int each : arr) {
            if (each < 0) {
                temp.add(-each);
            } else {
                list.add(each);
            }
        }

        list.removeIf(temp::contains);

        return list;
    }

    public static int[] remElem(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) list.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                for (int j = 0; j < list.size(); j++) {
                    if (arr[i] * -1 == list.get(j)) list.remove(j);
                }
            }
        }
        arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) arr[i] = list.get(i);
        return arr;
    }
}


/*
83 // int y[]=new int[]{6,-6,5,1,2,6,8};
Remove all digits that less than 0 and also if that numbers match any number remove that number too
ex: -6 is less than 0 and also equals 6 . So output should be [5, 1, 2, 8]
     */

