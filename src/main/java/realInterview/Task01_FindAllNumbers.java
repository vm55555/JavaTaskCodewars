package realInterview;

public class Task01_FindAllNumbers {

    public static void main(String[] args) {
        String str="thereare500mangoes on30 trees in 5 gardens ";
        System.out.println(sumNumbers(str));
    }

    public static int sumNumbers(String str){

        String temp = "0";
        int res = 0;

        for(int i = 0; i < str.length(); i++){

            if(Character.isDigit(str.charAt(i))){
                temp += str.charAt(i);
            } else {
                res += Integer.parseInt(temp);
                temp = "0";
            }
        }

        return res;
    }
}

/*
String str="thereare500mangoes on30 trees in 5 gardens ";
output: 535 (500 + 30 + 5)
 */
