package codingBat;

public class Task11292022 {

    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(wordMethod(str));
    }

    public static String wordMethod(String str){

        String res = "";

        for(int i = 0; i < str.length(); i++){
            for(int j = 0; j <= i; j++){
                res += str.charAt(j);
            }
        }

        return res;
    }
}

//https://codingbat.com/prob/p117334
