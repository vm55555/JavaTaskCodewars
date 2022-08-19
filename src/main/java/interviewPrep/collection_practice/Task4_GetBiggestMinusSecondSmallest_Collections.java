package interviewPrep.collection_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Task4_GetBiggestMinusSecondSmallest_Collections {

    public static void main(String[] args) {
        Integer [] a={2,5,7,15,1,6};
        ArrayList<Integer> g=new ArrayList<>(Arrays.asList(a));
        Integer max= Collections.max(g);
        Integer min=Collections.min(g);
        g.remove(min);
        Integer min1=Collections.min(g);
        Integer result=max-min1;
        System.out.println(result);
    }

    public static class Task25_RemoveElementWithIterator {

        public static void main(String[] args) {
            ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 6, 333, 4, 2, 888, 7, 99, 9, 101, 200, 300));

            System.out.println(removeWithIterator(list1));

            for (int i = 0; i < list1.size(); i++) {
                if (list1.get(i) < 10) {
                    list1.remove(list1.get(i));
                }
            }
            System.out.println(list1);

        }

        public static ArrayList<Integer> removeWithIterator(ArrayList<Integer> list) {

            list.removeIf(integer -> integer > 10);

            return list;


        }
        /*
        USE ITERATOR
    ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));
    output
    [1, 2, 3, 4, 5, 6, 7, 8, 9]
         */
    }

    public static class Task25_UseIterator {

        public static void main(String[] args) {

            ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));
            System.out.println(removeNumbersAbove100(list1));

        }

        public static ArrayList<Integer> removeNumbersAbove100(ArrayList<Integer> list){

            Iterator<Integer> it = list.iterator();

            while (it.hasNext()){
                if(it.next() >= 100){
                    it.remove();
                }
            }

            return list;
        }
    }
}

/*Use Collection int a [] = {2,5,7,15,1,6};
    int a [] = {2,5,7,15,1,6};
    output
    13   < Max number minus second min num and result is 13
    */

