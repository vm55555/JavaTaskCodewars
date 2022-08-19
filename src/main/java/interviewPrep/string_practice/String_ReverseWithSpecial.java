package interviewPrep.string_practice;

import java.nio.charset.StandardCharsets;

public class String_ReverseWithSpecial {

    public static void main(String[] args) {

        String str = "AB@#CD!E";
        System.out.println(reverseString(str));
    }

    public static String reverseString(String str){

        String temp = "";
        String res = "";
        int count = 0;

        for(int i = str.length() - 1; i >= 0; i--){
            if(Character.isLetter(str.charAt(i))){
                temp+=str.charAt(i);
            }
        }

        for(int i = 0; i < str.length(); i++){
            if(Character.isLetter(str.charAt(i))){
                res += temp.charAt(count++);
            } else {
                res += str.charAt(i);
            }
        }

        return res;
    }
}
