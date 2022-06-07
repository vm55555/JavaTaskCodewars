package mentorSession.HW_4;

import java.util.function.Predicate;

public class Task22_PrimeNumber {

    public static void main(String[] args) {

        System.out.println(isPrime(17));
    }
    public static boolean isPrime(Integer num){

        Predicate<Integer> isPrime = n -> {
            if(n == 0 || n == 1){
                return false;
            } else {
                for(int i = 2; i < num; i++){
                    if(n % i == 0){
                        return false;
                    }
                }
            }

            return true;

        };

        return isPrime.test(num);
    }
}

/*
22) Numbers - Prime Number
Write a method that can check if a number is prime or not
 */
