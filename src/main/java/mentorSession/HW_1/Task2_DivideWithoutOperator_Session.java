package mentorSession.HW_1;

public class Task2_DivideWithoutOperator_Session {

    public static void main(String[] args) {
        System.out.println(divideTwoNumbers(5, 2));
    }

    public static int divideTwoNumbers(int a, int b){

        int res = 0;

        if(a > 0 && b > 0){
            while (a >= b){
                a -= b;
                res++;
            }
        }

        return res;
    }
}

/*
2) Numbers - Divide without / operator
Write a method that can divide two numbers without using division operator
 */
