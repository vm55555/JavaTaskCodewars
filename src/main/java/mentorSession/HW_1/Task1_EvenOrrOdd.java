package mentorSession.HW_1;

public class Task1_EvenOrrOdd {

    public static void main(String[] args) {

        System.out.println(identify(5));
        System.out.println(identify(6));
    }

    public static String identify(int num){

        return num %2 == 0 ? "Eben" : "Odd";
    }
}

/*
1) Numbers - odd & even
Write  a method which can identifies given number is even or odd
EX:
identify(5) ->  "Odd"
identify(6) ->  "Even"
 */
