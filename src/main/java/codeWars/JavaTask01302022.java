package codeWars;

public class JavaTask01302022 {

    //https://www.codewars.com/kata/57cfdf34902f6ba3d300001e

    public static String twoSort(String[] s) {

        java.util.Arrays.sort(s);

        return String.join("***",s[0].split(""));
    }

    public static void main (String[] args) {
        System.out.println(twoSort(new String[] {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}));
    }

}
