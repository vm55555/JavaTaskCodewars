package interviewPrep;

public class Task22_Prime_Number {

    public static void main(String[] args) {
        System.out.println(isPrime(11));
    }

    public static boolean isPrime(int num){

        int count = 0;

        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                count ++;
            }
        }

        return count == 2;
    }
}

/*
//22
Numbers -- Prime Number. Prime num is a number that divided by itself and 1
Write a method that can check if a number is prime or not
 */
