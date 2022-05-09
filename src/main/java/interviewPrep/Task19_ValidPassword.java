package interviewPrep;

public class Task19_ValidPassword {

    public static void main(String[] args) {
        System.out.println(passwordIsValid("asdffg!A"));
    }

    public static boolean passwordIsValid(String str) {


        if (str.length() >= 6 && !str.contains(" ")) {
            int countLower = 0;
            int countUpper = 0;
            int countDigits = 0;
            int countSpecial = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                    countLower++;
                }
            }

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) >= 'A' && str.charAt(j) <= 'Z') {
                    countUpper++;
                }
            }

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    countDigits++;
                }
            }

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 33 && str.charAt(i) <= 41) {
                    countSpecial++;
                }
            }

            return (countDigits > 0 && countLower > 0 && countUpper > 0 && countSpecial > 0);

        }
        return false;
    }
}

/*
Write a return method that can verify if a password is valid or not.
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit

 */
