package interviewPrep.string_practice;

public class String_ABbCcc {

    public static void main(String[] args) {
        System.out.println(Accumul.accum("AbCd"));
    }
    /*
    accum("abcd") -> "A-Bb-Ccc-Dddd"
    accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
    accum("cwAt") -> "C-Ww-Aaa-Tttt"
    */

    public static class Accumul {

        public static String accum(String s) {
            String result = "";
            s = s.toLowerCase();

            for (int i = 0; i < s.length(); i++) {
                result += s.substring(i,i+1).toUpperCase() + s.substring(i,i+1).repeat(i) + "-";
            }

            result = result.substring(0,result.length()-1);

//            for (int i = 0; i < result.length(); i++) {
//                if (result.charAt(i) == '-') {
//                    result = result.replace(result.charAt(i+1), Character.toUpperCase(result.charAt(i+1)));
//                }
//            }
            return result;
        }
    }

}
