package mentorSession.HW_3;

public class Task18_DivideWithoutOperator {

    public static void main(String[] args) {

        System.out.println(divideWithoutOperator(4,-2));
    }

    public static int divideWithoutOperator(int a, int b){

        int count = 0;

        if(a > 0 && b > 0){

            while (a >= b){
                a -= b;
                count++;
            }

            return count;
        } else if (a < 0 && b < 0){
            a = -a;
            b = -b;

            while (a >= b){
                a -= b;
                count++;
            }

            return count;
        } else if (a < 0 || b < 0){
            if(a < 0){
                a = -a;
            }
            if(b < 0){
                b = -b;
            }

            while (a >= b){
                a -= b;
                count++;
            }

            return -count;
        }

        return -1;
    }
}

/*
18) Numbers - Divide without / operator
Write a method that can divide two numbers without using division operator
 */