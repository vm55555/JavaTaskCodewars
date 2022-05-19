package mentorSession.HW_2;

public class Task8_sumOfDigitsInString {

    public static void main(String[] args) {

        System.out.println(sumOfDigits("123fgfg@@@456"));

    }

    public static int sumOfDigits(String str){

        int sum = 0;

        if(!str.isEmpty() && !str.isBlank()){
            for(int i = 0; i < str.length(); i++){

                if(Character.isDigit(str.charAt(i))){
                    sum+=Integer.parseInt(str.charAt(i) + "");
                }
            }
        }

        return sum;
    }
}

/*
8) String - sum of digits in a string
Write a method that can return the sum of the digits in a string
 */
