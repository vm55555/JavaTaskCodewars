package interviewPrep;

import jdk.jfr.Frequency;

public class String_countElements {

    public static void main(String[] args) {
        String str = "AAABBCDDDDEEE";
        System.out.println(countElements(str));

    }

    public static String countElements(String str){

        String res = "";

        for(int i = 0; i < str.length(); i++){
            int count = 0;
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if(!res.contains(str.charAt(i) + "")){
                res += "" + str.charAt(i) + count;
            }
        }

        return res;
    }
}

/*
String str = "AAABBCDDDDEEE";
        String result = "";             // A3B2C1D4E3
 */
