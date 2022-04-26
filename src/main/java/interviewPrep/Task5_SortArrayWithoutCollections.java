package interviewPrep;

import java.util.ArrayList;
import java.util.Arrays;

public class Task5_SortArrayWithoutCollections {

    public static ArrayList<Integer> withoutSortCollection(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {

            for (int j = i; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
        return list;
    }
    public static int[] sortWithoutCollections( int [] arr){

        int small = 0;
        for (int i = 0; i <arr.length; i++)
        {
            small = i;
            for (int j = i +1 ; j <= arr.length-1; j++)
            {
                if (arr[j] < arr[small])
                {
                    small = j;
                }
                //swap values
            }
            int temp = arr[i];//5
            arr[i] = arr[small];//3
            arr[small] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(15, 10, 50, 2, 4, 50, 10, 3, 2, 5, 4));
        System.out.println(withoutSortCollection(list));

        int[] arr = new int[] { 5, 4, 3, 8, 32, 768, 564, 95, 172, 1500, 859, 754 };
        System.out.println(Arrays.toString(sortWithoutCollections(arr)));
//
//        int[]num = {1,10, 50, 2, 4, 50, 10, 3, 2,5, 4};
//        Arrays.sort(num);
//        System.out.println(Arrays.toString(num));


    }
}

 /*5.
Don't use sort method
ArrayList<Integer> list =  new ArrayList<>(Arrays.asList(1,10, 50, 2, 4, 50, 10, 3, 2,5, 4));
first
output
[1, 2, 2, 3, 4, 4, 5, 10, 10, 50, 50]
second
[50, 50, 10, 10, 5, 4, 4, 3, 2, 2, 1]
---------------SECOND------------
Store into Array
2int[] arr = {1, 2, 3, 49, 6, 5};
ArrayList<Integer> list = new ArrayList(); */

