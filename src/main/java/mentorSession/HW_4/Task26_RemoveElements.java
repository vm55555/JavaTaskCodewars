package mentorSession.HW_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Task26_RemoveElements {

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 5, 100, 200));
        System.out.println(removeElements(num, 100));
        System.out.println(removeElements2(num, 100));

    }

    public static ArrayList<Integer> removeElements(ArrayList<Integer> list, int num){

        list.removeIf(each -> each >= num);

        return list;
    }
    public static ArrayList<Integer> removeElements2(ArrayList<Integer> list, int num){

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()){
            if(it.next() >= num){
                it.remove();
            }
        }

        return list;
    }


}

/*
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
 */
