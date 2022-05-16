package mentorSession.secondHW;

public class Task7_StringPasswordValidationTask {

    public static void main(String[] args) {

        System.out.println(isPasswordValid("Qaz1236"));
    }

    public static boolean isPasswordValid(String password){

        int countUpperCase = 0;
        int countLowerCase = 0;
        int countSpecChar = 0;
        int countDigits = 0;

        if(password.length() >= 6 && !password.contains(" ")){
            for (int i = 0; i < password.length(); i++){
                char ch = password.charAt(i);
                if(Character.isUpperCase(ch)){
                    countUpperCase++;
                } else if(Character.isLowerCase(ch)){
                    countLowerCase++;
                } else if(!Character.isLetter(ch) && !Character.isDigit(ch)){
                    countSpecChar++;
                } else if(Character.isDigit(ch)){
                    countDigits++;
                }
            }

            return countUpperCase >= 1 && countLowerCase >= 1 && countSpecChar >= 1 && countDigits >= 1;
        }

        return false;
    }

}

/*
7) String - Password Validation Task
Write a return method that can verify if a password is valid or not. Requirements:
 1. Password MUST be at least 6 characters and should not contain space
2. Password should at least contain one upper case letter
3. Password should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
6. if all requirements above are met, the method returns true, otherwise returns false
 */
