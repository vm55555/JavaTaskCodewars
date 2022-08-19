package interviewPrep.other_practice;

public class Task15_Finra {

    public static void main(String[] args) {
        int num = 30;
        finra(num);

    }

    public static void finra(int num){

        if(num % 3 == 0 && num % 5 == 0){
            System.out.println("FINRA");
        } else if(num % 3 == 0){
            System.out.println("FIN");
        } else if(num % 5 == 0){
            System.out.println("RA");
        } else{
            System.out.println(num);
        }
    }
}

/*
//15
FINRA
total number is 30. if num divided by3 and 5 print FINRA,in num divided by 3
print FIN,if num divided by 5 print RA
 */
