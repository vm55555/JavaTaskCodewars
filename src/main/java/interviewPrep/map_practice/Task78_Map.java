package interviewPrep.map_practice;

import java.util.HashMap;
import java.util.Map;

public class Task78_Map {
    public static void main(String[] args) {
        int a=25;
        int b=10;

        plusMinus(a, b);

    }

    public static void plusMinus(int a, int b){

        Map<String, Integer> map = new HashMap<>();
        map.put("a", a);
        map.put("b", b);

        int sum = Math.addExact(map.get("a"), map.get("b"));
        int min = Math.subtractExact(map.get("a"), map.get("b"));

        System.out.println("sum = " + sum + "\nmin " + min);
    }
}

/*
//78 USE MAP
int a=25;
int b=10;

you have 2 integers
and with values assigned
how would u add them without + sign
 result =35;
 then subtract
 result=15;
 */
