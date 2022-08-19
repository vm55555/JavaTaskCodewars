package interviewPrep.string_practice;

public class String_LongestRepetitiveSubstring {

    public static void main(String[] args) {
        String str = "abcabcxabcabc";
        System.out.println(longestRepetitive(str));
    }

    public static String longestRepetitive(String str){

        String temp = "";
        String temp2 = "";

        for (int i = str.length()/2; i > 0; i--){

            temp2 = str;

            temp = str.substring(0, i);
            while (temp2.contains(temp)){
                temp2 = temp2.replaceAll(temp, "");
            }

            if(temp2.isBlank()){
                return temp;
            }
        }

        return "There is no repetitive String";
    }
}

/*
String str = "fabcabcabcabcf";
 */
