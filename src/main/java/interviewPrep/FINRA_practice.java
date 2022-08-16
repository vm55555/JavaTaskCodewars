package interviewPrep;

public class FINRA_practice {

    public static void main(String[] args) {
        finRa(30);
    }

    public static void finRa(int num){

        for(int i = 1; i <= num; i++){

            if(i % 5 == 0 && i % 3 == 0){
                System.out.print("FINRA ");
            } else if(i % 3 == 0){
                System.out.print("FIN ");
            } else if(i % 5 == 0){
                System.out.print("RA ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}



/*
//15
FINRA
total number is 30. if num divided by3 and 5 print FINRA,in num divided by 3
print FIN,if num divided by 5 print RA
 */
