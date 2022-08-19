package interviewPrep.other_practice;

public class Task14_EvenOrOdd {

    public static void main(String[] args) {

        System.out.println(evenOrOdd(4));
    }

    public static String evenOrOdd(int a){

        return (a % 2 == 0) ? "even" : "odd";
    }

    public static class Task21_Factorial {

        public static void main(String[] args) {
            System.out.println(factorial(4));
        }

        public static int factorial (int num){
            int n=1;
            for (int i = 1; i <= num; i++) {
                n*=i;
            }
            return n;
        }
    }

    public static class Task26_ArmstrongNumber {

        public static void main(String[] args) {
            int num=1634;
            System.out.println(armstrongNumbers(num));
        }
        public static boolean armstrongNumbers(int num){
            String reserve=""+num;
            int multiply=1;//3*3*3 7*7*7 1*1*1
            int total=0;
            int[]arr=new int[reserve.length()];
            for (int i = 0; i < arr.length; i++) {
                arr[i]=Integer.parseInt(reserve.charAt(i)+"");
                for (int j = 0; j < arr.length; j++) {
                    multiply*=arr[i];
                }
                total+=multiply;
                multiply=1;
            }
            return num==total;

        }
    }
}

/*
//14 Use String
int a=5;

if number is odd output will be odd, if number is even output will be even
 */
