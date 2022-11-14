package codingBat;

public class Task11142022 {

    public static void main(String[] args) {

        String str = "aaaaaabbjbbbadddl";
        System.out.println(countChars(str));
    }

    public static String countChars(String str){

        int count = 1;
        String res = "";

        for(int i = 0; i < str.length() - 1; i++){
            if (str.charAt(i) == str.charAt(i + 1)){
                count++;
            } else {
                res += "" + str.charAt(i) + count;
                count = 1;
            }
        }

        return res + "" + str.charAt(str.length() - 1) + count;
    }
}

//aaaaaabbbbbadddd
