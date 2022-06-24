package codeWars;

public class JavaTask01072022 {

    // https://www.codewars.com/kata/53dc23c68a0c93699800041d

    public static String smash(String... words) {
        StringBuilder temp = new StringBuilder();
        String result = "";

        for (String word : words) {
            temp.append(word).append(" ");
        }
        result = String.valueOf(temp).trim();

        return result;
    }
}
