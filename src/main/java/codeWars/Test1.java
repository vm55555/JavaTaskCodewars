package codeWars;

public class Test1 {

    public static void frequency(String str){

        String reserve="";

        for (int i = 0; i < str.length(); i++) {

            int count=0;
            char letter=str.charAt(i);

            if (reserve.contains(""+letter)){
                continue;
            }

            for (int j = 0; j < str.length(); j++) {
                char eachLetter=str.charAt(j);
                if (eachLetter==letter){
                    count++;
                }

            }
            reserve+=letter;
            System.out.println(str  + " has " + count + " times " + letter);
        }
    }

    public static void main(String[] args) {
        frequency("AAABBCDD");
    }
}
