package interviewPrep;

public class TaskFromKamil2 {

    public static void main(String[] args) {
        int num1=2;
        int num2=5;
        divideWithoutOperator(num1, num2);
    }

    public static void divideWithoutOperator(int a, int b){

        int res = 0;
        int temp = a;

        while (a >= b){

            a -= b;
            res++;
        }

        if(temp < b){
            System.out.println(" int a has to be more than int b");
        }

        System.out.println(temp + " divisible by " + b + " = " + res + " and remainder " + a);
    }
}

/*   USE WHILE LOOP
    int num1=5;
    int num2=2;

    output
    5 divided by 2 is: 2 and remainder is 1
    */
