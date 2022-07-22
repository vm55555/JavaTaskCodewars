package interviewPrep;

import java.util.ArrayList;
import java.util.Arrays;

public class Task75_List {

    public static void main(String[] args) {
        ArrayList<String> gg = new ArrayList<>(Arrays.asList("three,four", "five","seven"));
        System.out.println(removeFirst(gg));
    }

    public static String removeFirst(ArrayList<String> list){

        String result = "";

        for(int i = 0; i < list.size(); i++){
            if(i == 0){
                String [] arr = list.get(i).split(",");
                result += arr[1] + " ";
            } else {
                result += list.get(i) + " ";
            }
        }

        return result;
    }
}

/*

//75
 ArrayList<String> gg = new ArrayList<>(Arrays.asList("three,four", "five","seven"));
print out
 four five seven
 */