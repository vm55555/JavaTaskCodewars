package interviewPrep;

public class Task41_Power {

    public static void main(String[] args) {

        System.out.println(calculatePower(3, 3));

    }

    public static int calculatePower(int num, int power){

        int result = 1;

        while (power >= 1){
            result *= num;
            power--;
        }

        return result;
    }

}


/*//41
Calculate the power of a number using a while loop

The power (or exponent) of a number says how many times to use the number in a multiplication.
 It is written as a small number to the right and above the base number.

 */