package interviewPrep;

import java.util.ArrayList;
public class Task46_SumNumbers {

    public static void main(String[] args) {

        String a="aaa10ss20bb30a10";
        System.out.println(sumNumbers(a));
        System.out.println(sumOfDigits(a));
    }

    public static int sumOfDigits(String str){

        String temp = "0";
        int sum = 0;

        for(int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                temp += str.charAt(i);
            } else {
                sum += Integer.parseInt(temp);
                temp = "0";
            }
        }

        sum +=Integer.parseInt(temp);

        return sum;
    }
    public static int sumNumbers(String str){

        StringBuilder temp = new StringBuilder();
        int res = 0;

        for(int i = 0; i < str.length() - 1; i++){
            boolean nextChar =  Character.isDigit(str.charAt(i +  1));
            if(Character.isDigit(str.charAt(i)) && nextChar){
                temp.append(str.charAt(i));

            } else if(Character.isDigit(str.charAt(i)) && !nextChar){
                temp.append(str.charAt(i));
                res += Integer.parseInt(temp.toString());
                temp = new StringBuilder();
            }
        }
        boolean lastChar =  Character.isDigit(str.charAt(str.length() - 1));
        if(temp.length() > 0){

            if(lastChar){
                temp.append(str.charAt(str.length() - 1));
                res += Integer.parseInt(temp.toString());
            } else {
               res += Integer.parseInt(temp.toString());
            }
        } else {
            if(lastChar){
                temp = new StringBuilder(str.charAt(str.length() - 1) + "");
               res += Integer.parseInt(temp.toString());
            }
        }

        return res;
    }


}

/*
//46

 String a="aaa10ss20bb30a1";

 output > 60
 */
