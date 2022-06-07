package mentorSession.HW_4;

import java.util.ArrayList;
import java.util.Arrays;

public class Task27_ArraySortAscending {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 5, 6, 8, 4, 0));
        System.out.println(sortAscending(list));
    }

    public static ArrayList<Integer> sortAscending(ArrayList<Integer> list){

        int temp = 0;

        for(int i = 0; i < list.size() ; i++){
            for(int j = i; j < list.size();j++){
                if(list.get(i) > list.get(j)){
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }

        return list;
    }

}
/*
ArrayList - sorting in ascending
 */