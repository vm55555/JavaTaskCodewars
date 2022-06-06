package mentorSession.HW_4;

public class Task24_ReverseNegativeNumber {

    public static void main(String[] args) {

        System.out.println(reverseNumber(-123456));
    }

    public static int reverseNumber(int num){

        String str = num + "";
        StringBuilder res = new StringBuilder();

        if(str.charAt(0) == '-'){
            res.append("-");
            for(int i = str.length() - 1; i >= 1; i--){
               res.append(str.charAt(i));
            }
        } else {
            for(int i = str.length() - 1; i >= 0; i--){
                res.append(str.charAt(i));
            }
        }

        return Integer.parseInt(String.valueOf(res));
    }
}

/*24) Number - Reverse negative number
Write a return method that can reverse negative number and return it as int*/
