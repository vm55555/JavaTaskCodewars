package interviewPrep.string_practice;

public class String_AaBbb {

    public static void main(String[] args) {

        String str = "abcd";
        System.out.println(stringManipulation(str));
    }

    public static String stringManipulation(String str){

        String res = "";


        for(int i = 0; i < str.length(); i++){
          int count = 0;

          while (count < i+1){
              if(count == 0){
                  res += (str.charAt(i) + "").toUpperCase();
              } else {
                  res += str.charAt(i);
              }
              count++;
          }

          res += "-";

        }

        return res.substring(0, res.length() - 1);
    }

}
/*
input -  "abcd"
 output  "A-Bb-Ccc-Dddd"
 */