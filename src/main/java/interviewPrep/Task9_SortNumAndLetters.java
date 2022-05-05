package interviewPrep;

import java.util.Arrays;

public class Task9_SortNumAndLetters {

    public static void main(String[] args) {
       /* String str="DC501GCCCA098911";
        output CD015ACCCG011899
      */

        String str="DC501GCCCA098911";
        String result="";

        for (int i = 0; i < str.length()-1; i++) {
            if (Character.isDigit(str.charAt(i))){
                result+=str.charAt(i);

            }
            if (Character.isLetter(str.charAt(i))){
                result+=str.charAt(i);
            }
            if (Character.isDigit(str.charAt(i)) && Character.isLetter(str.charAt(i+1))){
                result+=" ";
            }
            if (Character.isLetter(str.charAt(i)) && Character.isDigit(str.charAt(i+1))){
                result+=" ";
            }
        }
        result+=str.charAt(str.length()-1);
        System.out.println(result);

        String u="";
        String[]f=result.split(" ");

        System.out.println(Arrays.toString(f));

        for (String e:f) {
            char[] c=e.toCharArray();
            Arrays.sort(c);
            for (char r:c){
                u+=r;
            }
        }
        System.out.println(u);
    }
}
