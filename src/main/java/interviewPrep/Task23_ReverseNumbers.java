package interviewPrep;

public class Task23_ReverseNumbers {

    public static void main(String[] args) {

        System.out.println(convertToStr(-123456));
    }


    public static String convertToStr(int num) {

        String str = String.valueOf(num);
        String res = "";

        if (str.charAt(0) == '-') {
            res += str.charAt(0);
            for (int i = str.length() - 1; i >= 1; i--) {
                res += str.charAt(i);
            }
        } else {
            res = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                res += str.charAt(i);
            }
        }
        return res;
    }
}
/*
//23
    int num=-1234556;
-6554321
        */

