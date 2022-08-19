package interviewPrep.string_practice;

public class Braces_Practice_ {

    public static void main(String[] args) {

        String str = "([])";
        System.out.println(isBalanced(str));

    }

    public static boolean isBalanced(String str){

        while (str.contains("()") || str.contains("{}") || str.contains("[]")){

            str = str.replaceAll("\\{\\}", "").replaceAll("\\(\\)", "").replaceAll("\\[\\]", "");
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
