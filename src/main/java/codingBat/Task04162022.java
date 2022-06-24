package codingBat;

public class Task04162022 {

            /*
            https://codingbat.com/prob/p197720

            Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.


        left2("Hello") → "lloHe"
        left2("java") → "vaja"
        left2("Hi") → "Hi"
             */

    public static void main(String[] args) {

        String str = "Hello";

        String result = "";

        if(str.length() > 2){
            if(str.length() % 2 == 0){
                for(int i = str.length() - 3; i < str.length(); i++){
                    result += str.charAt(i);
                }

                for(int i = 0; i < str.length() - 3; i++){
                    result += str.charAt(i);
                }
            } else {
                for(int i = str.length() - 2; i < str.length(); i++){
                    result += str.charAt(i);
                }

                for(int i = 0; i < str.length() - 2; i++){
                    result += str.charAt(i);
                }
            }

        }else {
            result = str;
        }

        System.out.println(result);

    }


}
