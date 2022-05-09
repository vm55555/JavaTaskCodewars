package interviewPrep;

import java.util.ArrayList;

public class ReturnArrayListWithEvenNumbers {


    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4 ,5, 6};
        System.out.println(listWithEvenNumbers(arr));

    }

    public static ArrayList<Integer> listWithEvenNumbers(int [] arr){ // we created custom method with return type  ArrayList<Integer>, we have int[]arr as parameter

        ArrayList<Integer> list  = new ArrayList<>(); // we created empty ArrayList<Integer>

        for(int i = 0; i < arr.length; i++){ // go through every element of arr 1, 2, 3 ...
            if(arr[i] % 2 == 0){
                list.add(arr[i]); // if element is even we add it to the list
            }
        }

        return list; // return ArrayList<Integer> with even numbers
    }
}

/*
Create a method which will return an Integer ArrayList. The method will accept an int array parameter. // Return every even number which are in the Array.
 */
