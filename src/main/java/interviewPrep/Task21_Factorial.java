package interviewPrep;

public class Task21_Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    public static int factorial (int num){
        int n=1;
        for (int i = 1; i < num; i++) {
            n*=(i+1);
        }
        return n;
    }
}
