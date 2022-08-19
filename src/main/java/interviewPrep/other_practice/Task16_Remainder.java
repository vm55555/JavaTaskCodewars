package interviewPrep.other_practice;

public class Task16_Remainder {

    public static void main(String[] args) {
        System.out.println(remainder(5,2));
    }
    public static String remainder(int a, int b) {

        int count = 0;

        if(a < b){
            return "error, a < b";
        } else {
            while (a > b){
                a -= b;
                count++;
            }
        }

        return ("a divided by b equals to " + count + " and the remainder is " + a);
    }

    public static class Task22_IsPrime {
        public static void main(String[] args) {
            System.out.println(isPrime(14));
        }
        public static boolean isPrime (int num){
            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0){
                    count++;
                }
            }

            return (count==2);
        }
    }

    public static class Task22_Prime_Number {

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
}

/*
//16  USE WHILE LOOP
int num1=5;
int num2=2;

output
5 devided by 2 is: 2 and remainder is 1
 */
