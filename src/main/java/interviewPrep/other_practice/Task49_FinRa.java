package interviewPrep.other_practice;

public class Task49_FinRa {

    public static void main(String[] args) {

        finRa(1, 30);

    }

    public static void finRa(int a, int b){

        for(int i = a; i <= b; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FINRA");
            } else if(i % 5 == 0){
                System.out.println("RA");
            } else if(i % 3 == 0){
                System.out.println("FIN");
            } else {
                System.out.println(i);
            }
        }
    }
}

/*//49
14 write a program which prints out the numbers from 1 to 30:
 for numbers which are divisible by 3, print "FIN" instead of the number.
for numbers which are divisible by 5, print "RA" instead of the number
for numbers which are a divisible by both 3 and 5, print "FINRA" instead of the number
*/
