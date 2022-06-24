package codeWars;

public class JavaTask02012022 {

    //https://www.codewars.com/kata/57d814e4950d8489720008db/train/java

    public static int nthPower(int[] array, int n) {

        int result = 1;
        if(n < array.length) {
            for(int i = 1; i <= n; i++) {
                result *= array[n];
            }
        } else {
            result = -1;
        }
        return result;
    }
}
