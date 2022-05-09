package interviewPrep;

public class Task17_SwapTheNumbers {

    public static void main(String[] args) {
        int  a = 10;
        int  b  = 20;

        swapNumbers(a, b);
    }

    public static void swapNumbers(int a, int b){

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a " + a + "\nb " + b);
    }
}

/*
//17
int  a = 10;
        int  b  = 20;

        output
      a  20
      b  10

 */
