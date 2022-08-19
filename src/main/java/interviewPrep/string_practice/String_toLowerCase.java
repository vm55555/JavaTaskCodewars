package interviewPrep.string_practice;

public class String_toLowerCase {

    public static void main(String[] args) {

        String str = "hello World";
        System.out.println(alternatingCases(str));
    }

    public static String alternatingCases(String str){

        String res = "";

        for(int i = 0; i < str.length(); i++){
            if(i % 2 == 0){
                res += (str.charAt(i) + "").toLowerCase();
            } else {
                res += (str.charAt(i) + "").toUpperCase();
            }
        }

        return res;
    }
}

/*
//53
Write a for loop that will print out the string in alternating cases,
with the first letter being lowercase
 */
