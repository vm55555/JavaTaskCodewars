package codingBat;

public class Task12302022 {

    public static void main(String[] args) {
        System.out.println(lastTwo("Hello"));
    }

    public static String lastTwo(String str) {

        if(str.length() > 1){
            if(str.length() == 2){
                return "" +  str.charAt(1) + str.charAt(0);
            } else {
                return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
            }
        }

        return str;
    }
}
//https://codingbat.com/prob/p194786