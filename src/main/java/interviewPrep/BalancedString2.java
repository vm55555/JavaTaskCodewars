package interviewPrep;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class BalancedString2 {

    public static void main(String[] args) {

        String str = "([]))";
        System.out.println(isBalanced(str));
        System.out.println(isValid(str));

    }

    public static boolean isBalanced(String str){

        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Deque<Character> deque = new LinkedList<>();
        for(int i = 0; i < str.length(); i++){

            Character closingBraces = str.charAt(i);
            Character openingBraces = map.get(closingBraces);

            if(openingBraces == null){
                deque.add(closingBraces);
            } else {
                if(deque.size() == 0 || deque.pollLast() != openingBraces){
                    return false;
                }
            }
        }

        return deque.size() == 0;
    }

    public static boolean isValid(String str){

        while (str.contains("()") || str.contains("[]") || str.contains("{}")){
            str = str.replaceAll("\\(\\)", "")
                    .replaceAll("\\[\\]", "")
                    .replaceAll("\\{\\}", "");
        }

        return str.isEmpty();
        }
}



/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
determine if the input string is valid.

(([])
0,1,2,3,4
 */

