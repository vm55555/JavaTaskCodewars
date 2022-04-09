package CodingBat;

public class Task04062022 {

    public static void main(String[] args) {

        System.out.println(altPairs("Kitty"));
    }


    public static String altPairs(String str) {

        String result = "";

        if(str.length() == 1){
            return str;
        }

        for(int i = 0; i < str.length() - 1; i += 4) {
            result += str.charAt(i) + "" + str.charAt(i + 1);
        }

        if(str.length() % 2 != 0){
            result += str.charAt(str.length() - 1);
        }

        return result;
    }

}
