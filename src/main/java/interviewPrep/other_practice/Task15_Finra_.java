package interviewPrep.other_practice;

public class Task15_Finra_ {

    public static void main(String[] args) {
        finRA(30);

    }

    public static void finRA(int num){

        for(int i = 1; i <= num; i++){

            if(i % 3 == 0 && i % 5 == 0){
                System.out.print("FINRA ");
            }
            if(i % 5 == 0 && i % 3 != 0){
                System.out.print("RA ");
            }
            if(i % 3 == 0 && i % 5 != 0){
                System.out.print("FIN ");
            }
            if(i % 3 != 0 && i % 5 != 0){
                System.out.print(i + " ");
            }
        }
    }
}

/*
FINRA
total number is 30. if num divided by3 and 5 print FINRA,in num divided by 3
print FIN,if num divided by 5 print RA
 */
