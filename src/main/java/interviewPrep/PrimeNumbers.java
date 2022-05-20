package interviewPrep;

public class PrimeNumbers {

    public static void main(String[] args) {

        isPrime(30);
    }

    public static void isPrime(int num){

        for (int i = 1; i <= num; i++) {

            int count = 0;

            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {

                System.out.print(i + " ");
            }
        }
    }
}
