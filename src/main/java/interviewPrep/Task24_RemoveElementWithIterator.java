package interviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Task24_RemoveElementWithIterator {

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

