package codeWars;

public class JavaTask01312022 {

    //https://www.codewars.com/kata/57ec8bd8f670e9a47a000f89/train/java

    public static String mouthSize(String animal){

        String result = "";


        if(animal.equals("alligator") || animal.equals("ALLIGATOR") ) {
            result = "small";
        } else {
            result = "wide";
        }

        return result;
    }
}
