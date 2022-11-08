package codingBat;

public class Task11082022 {

    public static void main(String[] args) {

        String syt = "";
        System.out.println(withoutX(syt));
    }

    public static String withoutX(String str) {

        if(str.length() > 0 && str.charAt(0) == 'x'){
            str = str.substring(1);
        }
        if(str.length() > 0 && str.charAt(str.length() -1) == 'x'){
            str = str.substring(0, str.length() - 1);
        }

        return str;
    }
}

//https://codingbat.com/prob/p151940
