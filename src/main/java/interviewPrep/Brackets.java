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
        //System.out.println("isBalanced(str2) = " + isBalanced(str2));

    }
    private static Map<Character, Character> map; // static instance variable can only be on static block

    static {
        map = new HashMap<>(); // we can use null variables
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
    }

    public static boolean isBalanced (String str){

        Deque<Character> deque = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) { //"{([])}";
            Character closingBracket = str.charAt(i);
            Character openingBracket = map.get(closingBracket);
            if (openingBracket == null){
                deque.add(closingBracket);
                System.out.println("deque = " + deque);

            }else {
                if (deque.size() == 0 || deque.pollLast() != openingBracket){ // pollLast get last element from deque and compare it with openingBracket element,
                    // if they do not match - return false, if match pollLast removed last element from deque.
                    return false;
                }
                System.out.println("deque = " + deque);
            }
        }
        return deque.size() == 0;
    }
}

/*
    [IQ] Create a method that will accept a String of brackets. Determine
    if the brackets are balanced. Brackets are balanced if the closing
     bracket matches the opening one.

    Ex: {([])} -> balanced
    {[(])} -> not balanced
    Hint: Maps and Stacks are helpful to solve

    //https://www.youtube.com/watch?v=U1vmrjpHEfQ
 */
