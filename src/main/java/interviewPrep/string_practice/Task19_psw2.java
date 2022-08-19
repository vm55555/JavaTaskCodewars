package interviewPrep.string_practice;

public class Task19_psw2 {

    public static void main(String[] args) {

        String psw = "Asdfghg12$";
        System.out.println(isPasswordValid(psw));

    }

    public static boolean isPasswordValid(String str){

        int upperCase = 0;
        int lowerCase = 0;
        int digit = 0;
        int spec = 0;

        if(str.length() >= 6){
            for(int i = 0; i < str.length(); i++){
                if(Character.isUpperCase(str.charAt(i))){
                    upperCase++;
                } else if(Character.isLowerCase(str.charAt(i))){
                    lowerCase++;
                } else if(Character.isDigit(str.charAt(i))){
                    digit++;
                } else {
                    spec++;
                }
            }

            return upperCase >=1 && lowerCase >= 1 && digit >= 1 && spec>= 1;

        }

        return false;
    }

}

/*
//19
1. Write a return method that can verify if a password is valid or not.
 1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
 */
