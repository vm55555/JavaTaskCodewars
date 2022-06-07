package mentorSession.HW_4;

public class Task24_ReverseNegativeNumber {

    public static void main(String[] args) {

        System.out.println(reverseNumber(-1234005600));
    }

    public static int reverseNumber(int num){

        String str = num + "";
        String res = "";

        if(str.charAt(0) == '-'){
            res = "-";
            for(int i = str.length() - 1; i >= 1; i--){
                if((res.length() == 1) && (str.charAt(i) == '0')){
                    continue;
                } else {
                    res += str.charAt(i);
                }

            }
        } else {
            for(int i = str.length() - 1; i >= 0; i--){
                if((res.length() == 0) && (str.charAt(i) == '0')){
                    continue;
                } else {
                    res += str.charAt(i);
                }
            }
        }

        return Integer.parseInt(String.valueOf(res));
    }
}

/*24) Number - Reverse negative number
Write a return method that can reverse negative number and return it as int*/
