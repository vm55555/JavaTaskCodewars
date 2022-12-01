package codingBat;

public class Task12012022 {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(right2(str));

    }

    public static String right2(String str) {

        String res = "";

        if(str.length() > 2){
            res = "" + str.charAt(str.length() - 2) + str.charAt(str.length() - 1) + str.substring(0, str.length() - 2);
        } else {
            res = str;
        }

        return res;

    }
}

//https://codingbat.com/prob/p130781
