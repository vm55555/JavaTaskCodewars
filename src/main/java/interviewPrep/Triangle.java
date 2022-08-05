package interviewPrep;

public class Triangle {

    //***
    //**
    //*

    public static void main(String[] args) {
        triangle();
    }

    public static void triangle(){

        for(int i = 0; i <= 2; i++){
            System.out.print(" ");
            for(int k = 2; k >= i; k--){

                System.out.print(" ");
            }

            for(int j = i; j >= 0; j--){

                System.out.print(" ");

                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
