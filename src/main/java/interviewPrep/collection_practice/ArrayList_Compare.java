package interviewPrep.collection_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayList_Compare {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("4", "5", "6"));
        ArrayList<String> list4 = new ArrayList<>(Arrays.asList("4", "5", "6"));

        System.out.println(isSame(list1, list2));
        System.out.println(isSame(list3, list4));
    }

    public static<T> boolean isSame(ArrayList<T>list1, ArrayList<T>list2){

        return list1.equals(list2);
    }

    public static class Task10_BiggestNumber {

        /*if ascend true
        int[]a={1,2,3,9,4,5,6,7};
        output: biggest number 9
        */
        public static void main(String[] args) {


            int[] a = {1, 2, 3, 9, 4, 5, 6, 7};

            int max = Integer.MIN_VALUE;
            for (int j : a) {
                if (j > max) {
                    max = j;
                }
            }
            System.out.println(max);
        }
    }

    public static class Task24_RemoveElementWithIterator {

        /*USE ITERATOR
       ArrayList -- Remove "Ahmed"
       ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", Eric", "Ahmed".));
       */
        public static ArrayList<String> removeAhmed(ArrayList<String>list){
            Iterator<String> it=list.iterator();
            while (it.hasNext()){
                if (it.next().equals("Ahmed")){
                    it.remove();
                }
            }
            return list;
        }

        public static void main(String[] args) {
            ArrayList<String> names = new ArrayList<>(Arrays.asList( "Ahmed", "John", "Eric","Ahmed"));
            System.out.println(removeAhmed(names));
        }

    }
}
/*
You have expected result ArrayList and actual result ArrayList. You need to compare them and return true or false.
 */
