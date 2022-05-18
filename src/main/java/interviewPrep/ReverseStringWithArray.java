package interviewPrep;

public class ReverseStringWithArray {

    public static void main(String[] args) {

        String xyz = "I am from California";
        System.out.println(reverseStringWithSpaces(xyz));
    }

    public static String reverseStringWithSpaces(String str){

        String reverse = ""; // We're creating a String reverse
        int count = 0;
        String result = ""; // this String is our result, we will use it as a return statement

        for(int i = str.length() - 1; i >= 0; i--){  // go forward through every element of the str String
            reverse+= str.charAt(i); // concatenate reverse String
        }

        reverse = reverse.replaceAll(" ", ""); // remove all the spaces in the reversed String, we do not need them because we will hold empty spaces from str String (input)

        for(int i = 0; i < str.length(); i++){ // go through every element of str (input String)
            if(str.charAt(i) != ' '){ // if the element of str does not equal empty space
                result+= reverse.charAt(count++); // we concatenate element index (count) from reversed String  to the new Result String.
                // We go to the next element of reverse String after every iteration - count++.
            } else{
                result+= ' '; // if str.charAt(i) == ' ' - we hold this index as empty in the new result String
            }
        }

        return result;
    }
}

/*
java intput: String xyz = "I am from California";
output: String expectedOutput = "a in rofi laCmorfmaI"
 */
