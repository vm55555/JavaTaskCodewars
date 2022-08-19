package interviewPrep.array_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task48_ArrayDuplicates {

    public static void main(String[] args) {
        List<String> str = new ArrayList<>(Arrays.asList("A","A","A","A","D","C"));
        containsDuplicates(str);
    }

    public static void containsDuplicates(List<String> list) {

        List<String> noDupes = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (!noDupes.contains(list.get(i))) {
                noDupes.add(list.get(i));
            }
        }
        System.out.println((noDupes.size() == list.size()) ? "The array doesn't contain duplicates" : "There array contains duplicates");
        System.out.println(noDupes);
    }
}

/*
//48
  ArrayList<String>d=new ArrayList<>(Arrays.asList("A","A","A","A","D","C"));
How do you find if ArrayList contains duplicates or not?
(ALSO REMOVE DUPLICATE AT SAME TIME)

 */

