public class JavaTask02042022 {

    //https://www.codewars.com/kata/570a6a46455d08ff8d001002/train/java

    public static int noBoringZeros(int n) {
        int result = n;

        if (n % 10 == 0) {
            result = n / 10;
        }
        if (n % 100 == 0) {
            result = n / 100;
        }
        if (n % 1000 == 0) {
            result = n / 1000;
        }
        if (n % 10000 == 0) {
            result = n / 10000;
        }
        if (n % 100000 == 0) {
            result = n / 100000;
        }
            return result;
    }
}
