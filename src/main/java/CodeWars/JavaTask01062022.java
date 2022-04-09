package CodeWars;

public class JavaTask01062022 {

    //https://www.codewars.com/kata/57f222ce69e09c3630000212/train/java

    public static String well(String[] x) {
        String result = "";
        int count = 0;

        for (String s : x) {
            if (s.equals("good")) {
                count++;
            }
        }

        if (count == 0) {
            result = "Fail!";
        } else if (count > 0 && count < 3) {
            result = "Publish!";
        } else {
            result = "I smell a series!";
        }

        return result;
    }

    public static void main (String [] args) {
        System.out.println(well(new String[] {"bad", "bad", "bad"}));
    }
}
