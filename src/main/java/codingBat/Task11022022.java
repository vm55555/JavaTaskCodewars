package codingBat;

public class Task11022022 {

    public static void main(String[] args) {
        String str = "edited";
        System.out.println(frontAgain(str));
    }

    public static boolean frontAgain(String str) {

        if(str.length() < 2) {
            return true;
        } else if(str.charAt(0) == str.charAt(str.length() - 2)){
            if(str.charAt(1) == str.charAt(str.length() - 1)){
                return true;
            }
        }

        return false;
    }
}

/*https://codingbat.com/prob/p196652*/
