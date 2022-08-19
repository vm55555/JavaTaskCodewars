package interviewPrep.other_practice;

public class Task3_ChangeAndPrint {

    public static void main(String[] args) {

        int a = 5;
        int b = 6;

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a == " + a);
        System.out.println("b == " + b);
    }
}

/*
3.
int a=5;
int b=6;
change and print
a==6;
b==5;
 */
