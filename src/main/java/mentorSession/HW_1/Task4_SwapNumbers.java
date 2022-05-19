package mentorSession.HW_1;

public class Task4_SwapNumbers {

    public static void main(String[] args) {

        swapNumbers(10, 20);
    }

    public static void swapNumbers(int a, int b){

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a + "\nb = " + b);
    }
}

/*4) Numbers - Swap Numbers
Swap two variable' values without using a third variable
 */
