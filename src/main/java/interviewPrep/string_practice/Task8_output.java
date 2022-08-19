package interviewPrep.string_practice;

public class Task8_output {

    public static void main(String[] args) {
        String s="1a2b3c4f!@#";
        printSeparate(s);
    }

    public static void printSeparate(String str){

        int sum = 0;
        String letters = "";
        String numbers = "";
        String symbols = "";

        for(int i = 0; i < str.length(); i++){

            if(Character.isDigit(str.charAt(i))){
                numbers += str.charAt(i) + " ";
                sum += Integer.parseInt(str.charAt(i) + "");
            } else if(Character.isLetter(str.charAt(i))){
                letters += str.charAt(i) + " ";
            } else {
                symbols += str.charAt(i) + " ";
            }
        }

        System.out.println(sum);
        System.out.println(letters);
        System.out.println(numbers);
        System.out.println(symbols);
    }
}

/*
8
   String s="1a2b3c4f!@#";
    int sum=0;
        String letter="";
        String digit="";
        String sign="";

   output
   10
a b c f
1 2 3 4
!@#
 */
