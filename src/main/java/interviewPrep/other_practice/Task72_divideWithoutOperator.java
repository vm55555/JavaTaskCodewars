package interviewPrep.other_practice;

public class Task72_divideWithoutOperator {

    public static void main(String[] args) {

        int a=11;
        int b=2;
        System.out.println(divide(a, b));
    }

    public static int divide(int a, int b){

        int count = 0;

        while (a >= b){
            a -= b;
            count++;
        }

        return count;
    }
}

/*
//72
don't use divide operator
int a=11;
int b=2;
 divide a by b and result is =5
                     reminder =1
 ============================================================
 */
