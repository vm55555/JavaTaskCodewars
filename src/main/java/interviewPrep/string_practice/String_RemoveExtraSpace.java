package interviewPrep.string_practice;

public class String_RemoveExtraSpace {

    public static void main(String[] args) {
        String str = "    I    love     java    very much!  ";
        System.out.println(removeExtraSpaces(str));
    }

    public static String removeExtraSpaces(String str){

        str = str.trim();
        String res = "";

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' ' || str.charAt(i + 1) != ' '){
                res += str.charAt(i);
            }
        }

        return res;
    }
}

/*
 String str = "    I    love     java    very much!  ";
 */
