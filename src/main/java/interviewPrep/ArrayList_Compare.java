package interviewPrep;

import java.util.ArrayList;
import java.util.Arrays;

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
}
/*
You have expected result ArrayList and actual result ArrayList. You need to compare them and return true or false.
 */
