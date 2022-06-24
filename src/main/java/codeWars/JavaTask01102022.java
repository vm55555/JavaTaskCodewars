package codeWars;

public class JavaTask01102022 {

    //https://www.codewars.com/kata/56f173a35b91399a05000cb7/train/java

    public static int findLongest(final String str) {
    String[] spl = str.split("\\s");
    int longest = 0;
        for (String s : spl) {
            if (s.length() > longest) {
                longest = s.length();
            }
        }
        return longest;
    }
}
