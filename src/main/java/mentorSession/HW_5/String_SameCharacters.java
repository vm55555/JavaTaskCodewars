package mentorSession.HW_5;

public class String_SameCharacters {

    public static void main(String[] args) {
        String str1 = "abccc";
        String str2 = "cabca";
        System.out.println(isSame(str1, str2));

    }

    public static boolean isSame(String str1, String str2){

        if(str1.length() == str2.length()){

            for(int i = 0; i < str1.length(); i++){
                if(str2.contains(str1.charAt(i) + "")){
                    str2 = str2.replaceFirst(str1.charAt(i) + "", "");
                } else {
                    return false;
                }
            }
            return str2.isEmpty();

        }

        return false;
    }
}
/*
2.    String - Same letters
Write a return method that check if a string is build out of the same letters as another string.
Ex:  same("abc",  "cab"); -> true
same("abc",  "abb"); -> false:
 */
