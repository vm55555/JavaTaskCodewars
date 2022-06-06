package mentorSession.HW_4;

import java.util.function.Predicate;

public class Task23_ArmstrongNumbers {

    public static void main(String[] args) {

        System.out.println(isArmstrong(153));
    }

    public static boolean isArmstrong (int num){

        String [] arr = String.valueOf(num).split("");
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            int multiply = 1;
            for(int j = 0; j < arr.length; j++){
                multiply *= Integer.parseInt(arr[i]);
            }
            sum += multiply;
        }

        return num == sum;
    }
}

/*
Write a method that can check if a number is Armstrong  number
 */
