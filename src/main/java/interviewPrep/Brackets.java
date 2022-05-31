package interviewPrep;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Brackets {

    public static void main(String[] args) {

        String str = "{([])}";
        String str2 = "{[(])}";
        System.out.println("isBalanced(str) = " + isBalanced(str));
        System.out.println("isBalanced(str2) = " + isBalanced(str2));

    }

//    [IQ] Create a method that will accept a String of brackets. Determine
//if the brackets are balanced. Brackets are balanced if the closing
//    bracket matches the opening one.

//    Ex: {([])} -> balanced
//    {[(])} -> not balanced
//    Hint: Maps and Stacks are helpful to solve

    private static Map<Character, Character> map; // static instance variable can only be on static block

    static {
        map = new HashMap<>(); // we can use null variables
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
    }

    public static boolean isBalanced (String str){

        Deque<Character> deque = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            Character closingBracket = str.charAt(i);
            Character openingBracket = map.get(closingBracket);
            if (openingBracket == null){
                deque.add(closingBracket);
            }else {
                if (deque.size() == 0 || deque.pollLast() != openingBracket){
                    return false;
                }
            }
        }
        return deque.size() == 0;
    }
}
