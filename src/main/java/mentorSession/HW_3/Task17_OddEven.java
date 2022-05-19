package mentorSession.HW_3;

public class Task17_OddEven {

    public static void main(String[] args) {

        System.out.println(evenOrrOdd(4));
    }

    public static String evenOrrOdd(int num){

        return num % 2 == 0 ? "Even" : "Odd";
    }
}

/*
7) Numbers - odd & even
Write  a method which can identifies given number is even or odd
EX:
identify(5) ->  "Odd"
identify(6) ->  "Even"
 */
