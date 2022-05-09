package interviewPrep;

public class Task6_UniqueCharacters {

    public static void main(String[] args) {
        String h="AAABBBCCC";
        System.out.println(uniqueCharacters(h));
    }
    public static String uniqueCharacters(String str){

        String result = "";

      for(int i = 0; i < str.length(); i++){
          if(!result.contains(str.charAt(i) + "")){
              result += str.charAt(i);
          }
      }

      return result;
    }
}

/*

6
String h="AAABBBCCC";
        String result = "";

output
ABC
 */
