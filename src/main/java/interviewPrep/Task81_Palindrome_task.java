package interviewPrep;

public class Task81_Palindrome_task {

    public static void main(String[] args) {
        String first="abcghjj";
        System.out.println(isPalindrome(first));
        System.out.println(isPalindrome2(first));
        isPalindrome3(first);
    }

    public static boolean isPalindrome(String str){

        String res = "";
        for( int i = str.length() - 1; i >= 0; i--){
            res += str.charAt(i);
        }

        return res.equalsIgnoreCase(str);
    }

    public static boolean isPalindrome2(String str){

        StringBuilder stringBuilder = new StringBuilder(str);

        return String.valueOf(stringBuilder.reverse()).equals(str);
    }

    public static void isPalindrome3(String str){

        String res = "";
        for( int i = str.length() - 1; i >= 0; i--){
            res += str.charAt(i);
        }

        if(res.equals(str)){
            System.out.println(str  + " is palindrome");
        } else {
            System.out.println(str  + " is not palindrome, we will fix it");
            int count = str.length() - 1;//abccbx

            for(int i = 0; i < str.length()/2; i++){
                if(str.charAt(i) != str.charAt(count)){
                    str = str.replace(str.charAt(count), str.charAt(i));
                }
                count--;
            }

            System.out.println(str + " for now is palindrome");
        }
    }


}

/*
//81
 String first="abccba"; < palindrome
 String second="abccbx"; < if it is not palindrome change x to a and make it palindrome
 */
