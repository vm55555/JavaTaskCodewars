package interviewPrep.array_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_Sort2 {

    public static void main(String[] args) {
        ArrayList<Integer> list =  new ArrayList<>(Arrays.asList(1,10, 50, 2, 4, 50, 10, 3, 2,5, 4));
        System.out.println(sortAscending(list));
        System.out.println(sortDescending(list));
        System.out.println(sortAscendingWithoutThirdVariable(list));
        System.out.println(sortDescendingWithoutThirdVariable(list));
    }

    public static ArrayList<Integer> sortAscending(ArrayList<Integer> list){

        Integer temp = 0;

        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.size(); j++){
                if(list.get(i) < list.get(j)){
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }

        return list;
    }

    public static ArrayList<Integer> sortDescending(ArrayList<Integer> list){
        Integer temp = 0;

        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.size(); j++){
                if(list.get(i) > list.get(j)){
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }

        return list;
    }

    public static ArrayList<Integer> sortAscendingWithoutThirdVariable(ArrayList<Integer> list){


        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.size(); j++){
                if(list.get(i) < list.get(j)){

                    list.set(i, list.get(j) + list.get(i));
                    list.set(j, list.get(i) - list.get(j));
                    list.set(i, list.get(i) - list.get(j));
                }
            }
        }

        return list;
    }

    public static ArrayList<Integer> sortDescendingWithoutThirdVariable(ArrayList<Integer> list){


        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.size(); j++){
                if(list.get(i) > list.get(j)){

                    list.set(i, list.get(j) + list.get(i));
                    list.set(j, list.get(i) - list.get(j));
                    list.set(i, list.get(i) - list.get(j));
                }
            }
        }

        return list;
    }
}

/*
5.
Don't use sort method
ArrayList<Integer> list =  new ArrayList<>(Arrays.asList(1,10, 50, 2, 4, 50, 10, 3, 2,5, 4));
first
output
[1, 2, 2, 3, 4, 4, 5, 10, 10, 50, 50]

second
[50, 50, 10, 10, 5, 4, 4, 3, 2, 2, 1]
 */
