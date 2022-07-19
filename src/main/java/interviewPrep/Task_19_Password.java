package interviewPrep;

public class Task_19_Password {

    public static void main(String[] args) {

        String str = "123Gdag%";
        System.out.println(isValidPassword(str));

    }

    public static boolean isValidPassword(String str){

        if(str.length() >= 6 && !str.contains(" ")){
            int upperCase = 0;
            int lowerCase = 0;
            int numbers = 0;
            int spec = 0;


            for(int i = 0; i < str.length(); i++){
               if(Character.isLowerCase(str.charAt(i))){
                   lowerCase++;
               } else if (Character.isUpperCase(str.charAt(i))){
                   upperCase++;
               } else if(Character.isDigit(str.charAt(i))){
                   numbers++;
               } else {
                   spec++;
               }
            }

            return upperCase >= 1 && lowerCase >= 1 && numbers >= 1 && spec >= 1;

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
