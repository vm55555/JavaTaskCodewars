package interviewPrep.string_practice;

public class Task7_NotRepeatedCharacters {

    public static void main(String[] args) {

        String h="AAABBBCCCDEF";
        System.out.println(notRepeatedCharacters(h));
    }

    public static String notRepeatedCharacters(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++){
            int count = 0;
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if(count == 1){
                result += str.charAt(i);
            }
        }

        return result;
    }
}

/*
7
String h="AAABBBCCCDEF";
        String result = "";

 output
  DEF
 */
