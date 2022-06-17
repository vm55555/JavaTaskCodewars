package mentorSession.HW_5;

public class String_Reverse {

    public static void main(String[] args) {
        String str = "ABCD";
        System.out.println(reverseString(str));
        System.out.println(reverseString2(str));
    }

    public static String reverseString(String str){

        String reverse = "";

        for(int i = str.length() - 1; i >= 0; i--){
            reverse+= str.charAt(i);
        }

        return reverse;
    }

    public static String reverseString2(String str){

       return String.valueOf(new StringBuilder(str).reverse());
    }
}

/*
5.    String - Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
 */
