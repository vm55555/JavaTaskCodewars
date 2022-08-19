package interviewPrep.other_practice;

public class Triangle_1 {

    public static void main(String[] str){

        for(int i = 10; i >= 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        String result = "";
        for(int i = 10; i >= 0; i--){
            System.out.print(result);
            for(int j = 0; j < i; j++){
                System.out.print(j + " ");
            }
            result += "  ";
            System.out.println();
        }

        String result1 = "";
        for(int i = 10; i >= 0; i--){
            System.out.print(result1);
            for(int j = i - 1; j >= 0; j--){
                System.out.print(j + " ");
            }
            for(int j = 1; j < i; j++){
                System.out.print(j + " ");
            }
            result1 += "  ";
            System.out.println();
        }

        printTriangle(9);


    }


        public static void printTriangle(int bottom){
            for(int i = 1; i <=bottom; i++){
                for(int j = 1;j<=i;j++){
                    System.out.print("*");}
                System.out.println();}}

}
