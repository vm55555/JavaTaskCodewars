package interviewPrep.other_practice;

public class Task72_withoutDivideOperator {

    public static void main(String[] args){

        int a = 11;
        int b = 2;
        divideWithoutOperator(a, b);

    }

    public static void divideWithoutOperator(int a, int b){

        int count = 0;

        if(a > b && b > 0){
            while (a >= b){
               a -= b;
               count++;
            }
        }

        System.out.println("result = " + count + " remainder = " + a);
    }
}

/*
//72
don't use divide operator
int a=11;
int b=2;
 divide a by b and result is =5
                     reminder =1
 */
