package codingBat;

public class Task01052023 {

    public static void main(String[] args) {

        String str = "Hello";

    }

    public String deFront(String str) {

        if(str.length() > 2){
            if(str.charAt(0) == 'a' && str.charAt(1) == 'b'){
                return str;
            } else if(str.charAt(0) == 'a'){
                return "" + str.charAt(0) + str.substring(2);
            } else if(str.charAt(1) == 'b'){
                return str.substring(1);
            } else {
                return str.substring(2);
            }
        }

        return str;
    }
}
//https://codingbat.com/prob/p110141
