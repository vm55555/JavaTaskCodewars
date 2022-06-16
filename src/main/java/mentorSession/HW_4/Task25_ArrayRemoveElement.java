package mentorSession.HW_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Task25_ArrayRemoveElement {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        String name  = "Ahmed";

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 5));
        int num = 2;


        System.out.println(removeElement1(names, name));
        System.out.println(removeElement2(names, name));
        System.out.println(removeElement2(nums, 2));
        System.out.println(removeElement3(names, name));
        System.out.println(removeElement4(names, name));
        System.out.println(removeElement4(nums, 2));

    }

    public static ArrayList<String> removeElement1(ArrayList<String> names, String name){

        names.removeIf(each -> each.equals(name));

        return names;
    }

    public static <T> ArrayList<T> removeElement2 (ArrayList<T> names, T name){

        names.removeIf(each -> each.equals(name));

        return names;
    }

    public static ArrayList<String> removeElement3 (ArrayList<String> names, String name){

        Iterator <String> it = names.iterator();

        while (it.hasNext()){
            if(it.next().equals(name)){
                it.remove();
            }
        }

        return names;
    }

    public static<T> ArrayList<T> removeElement4 (ArrayList<T> names, T name){

        Iterator <T> it = names.iterator();

        while (it.hasNext()){
            if(it.next().equals(name)){
                it.remove();
            }
        }

        return names;
    }


}
/*
25) ArrayList - Remove "Ahmed"
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
 */
