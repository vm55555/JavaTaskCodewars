package interviewPrep.other_practice;

public class Task43_PerfectNumber {

    public static void main(String[] args) {

        System.out.println(perfectNumber(28));

    }

    public static boolean perfectNumber(int num){

        int res = 0;
        for (int i = 1; i < num; i++){
            if(num % i == 0){
                res += i;
            }
        }

        return num == res;
    }
}

/*
//43 Perfect number is the sum of numbers that perfectNum divided by sum
int perfectNum =28;
//eger regeme bolunen regemlerin cemi onun ozune beraberdirse perfect numberdi
 */
