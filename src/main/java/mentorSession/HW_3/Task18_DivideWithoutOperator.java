package mentorSession.HW_3;

public class Task18_DivideWithoutOperator {

    public static void main(String[] args) {

        System.out.println(divideWithoutOperator(5,2));
    }

    public static int divideWithoutOperator(int a, int b){

        int count = 0;

        while (a >= b){
            a -= b;
            count++;
        }

        return count;
    }
}

/*
18) Numbers - Divide without / operator
Write a method that can divide two numbers without using division operator
 */