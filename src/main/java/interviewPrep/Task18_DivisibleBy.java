package interviewPrep;

public class Task18_DivisibleBy {

    public static void main(String[] args) {

        divisibleBy(50);

    }

    public static void divisibleBy(int num){

        String divisibleBy15 ="";
        String divisibleBy5 ="";
        String divisibleBy3="";

        for(int i = 1; i <= num; i++){
            if(i % 3 == 0 && i % 5 == 0){
                divisibleBy15 += i + " ";
            } else if(i % 5 == 0){
                divisibleBy5 += i + " ";
            } else if(i % 3 == 0){
                divisibleBy3 += i + " ";
            }
        }

        System.out.println("divisibleBy15 = " + divisibleBy15);
        System.out.println("divisibleBy5 = " + divisibleBy5);
        System.out.println("divisibleBy3 = " + divisibleBy3);
    }
}

/*

//18
        String divisibleBy15 ="";
        String divisibleBy5 ="";
        String divisibleBy3="";

        int[] arr = new int[100];
Divisible By 15: 15 30 45 60 75 90
Divisible By 5: 5 10 20 25 35 40 50 55 65 70 80 85 95 100
Divisible By 3: 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
 */
