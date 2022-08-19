package interviewPrep.collection_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections_Sort {

    public static void main(String[] args) {
        int a [] = {2,5,7,15,1,6};
        System.out.println(minMax(a));
    }

    public static int minMax(int [] arr){

        List<Integer> list = new ArrayList<>();

        for(int each: arr){
            list.add(each);
        }

        Collections.sort(list);

        return list.get(list.size() - 1) - list.get(1);
    }
}

/*
4.
 Use Collection int a [] = {2,5,7,15,1,6};
   int a [] = {2,5,7,15,1,6};
   output
   13   < Max number minus second min num and result is 13
 */
