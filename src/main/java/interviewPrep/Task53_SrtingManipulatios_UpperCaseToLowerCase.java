package interviewPrep;

public class Task53_SrtingManipulatios_UpperCaseToLowerCase {

    public static void main(String[] args) {

        String str = "Java is Fun";
        System.out.println(alternative(str));
        System.out.println(lowerUpper(str));
    }

    public static String alternative(String str){

        String res = "";

        for(int i = 0; i < str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                res += (str.charAt(i) + "").toLowerCase();
            } else{
                res +=  (str.charAt(i) + "").toUpperCase();
            }
        }

        return res;
    }

    public static String lowerUpper(String str){

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

/*//53
Write a for loop that will print out the string in alternating cases,
with the first letter being lowercase

 */
