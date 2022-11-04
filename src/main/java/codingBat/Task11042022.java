package codingBat;

public class Task11042022 {

    public static void main(String[] args) {

        String str = "HilloHo";
        System.out.println(without2(str));
    }

    public static String without2(String str) {

        if(str.length() > 1){
            if(str.charAt(0) == str.charAt(str.length() -2)){
                if(str.charAt(1) == str.charAt(str.length() - 1)){
                    str = str.substring(2);
                }
            }
        }

        return str;
    }
}

//https://codingbat.com/prob/p142247
