import java.util.Arrays;

public class JavaTask02052022 {

    //https://www.codewars.com/kata/57eae65a4321032ce000002d/train/java

    public static String fakeBin(String numberString) {

        int[] num = new int[numberString.length()];
        for(int i = 0; i < numberString.length(); i++) {
            num[i] = numberString.charAt(i) - '0';
        }
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < num.length; i++) {
            if(num[i] >= 5) {
                result.append(1);
            } else {
                result.append(0);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        System.out.println(fakeBin("45385593107843568"));
    }
}
