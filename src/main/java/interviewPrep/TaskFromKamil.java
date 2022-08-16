package interviewPrep;

public class TaskFromKamil {

    public static void main(String[] args) {
        System.out.println(findFactorial(7));
    }

    public static int findFactorial(int num){

        int res = 1;

        for(int i = 1; i <= num; i++){

            res *= i;
        }

        return res;
    }
}

/*factorial

 5 = 5 *4 * 3 * 2 * 1 = 120
 */
