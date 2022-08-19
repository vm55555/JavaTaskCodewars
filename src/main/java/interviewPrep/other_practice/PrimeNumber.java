package interviewPrep.other_practice;

public class PrimeNumber {

    public static void main(String[] args) {
        int num = 1;
        System.out.println(isPrime(num));
    }

    public static boolean isPrime(int n){

        int count = 0;

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count++;
            }
        }

        return count == 2;
    }
}
/*
//22


 */
