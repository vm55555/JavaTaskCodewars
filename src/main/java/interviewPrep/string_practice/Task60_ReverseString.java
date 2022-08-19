package interviewPrep.string_practice;

public class Task60_ReverseString {

    public static void main(String[] args) {

        String sentence = "Today is great day";
        System.out.println(reverseString(sentence));

    }

    public static String reverseString(String str){

        String res = "";

        for(int i = str.length() - 1; i >= 0; i--){
            res += str.charAt(i);
        }

        return res;
    }
}

/*
//60
 String sentence = "Today is great day";
 yad taerg si yadoT
 */