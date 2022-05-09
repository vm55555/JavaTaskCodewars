package interviewPrep;

public class Task8_CharacterIsLetter_Number_Symbol {

    public static void main(String[] args) {

        String s="1a2b3c4f!@#";
        charactersIs(s);

    }

    public static void charactersIs(String str){

        int sum = 0;
        String letters = "";
        String numbers = "";
        String symbols = "";

        for(int i = 0; i < str.length(); i++){
            if(Character.isAlphabetic(str.charAt(i))){
                letters += str.charAt(i) + " ";
            } else if(Character.isDigit(str.charAt(i))){
                sum += Integer.parseInt(str.charAt(i) + "");
                numbers += str.charAt(i) + " ";
            } else {
                 symbols += str.charAt(i) + " ";
            }
        }

        System.out.println("sum of Digits: " + sum);
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
 */
