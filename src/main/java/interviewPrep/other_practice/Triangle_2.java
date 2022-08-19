package interviewPrep.other_practice;

public class Triangle_2 {

    public static void main(String[] args) {

        triangle(10);

    }

    public static void triangle(int num){

        String space = "";

        for(int i = 0; i < num; i++){
            space += "   ";
        }

        for(int i = 0; i < num; i++){
            System.out.print(space);
            if(i == 0){
                System.out.print("*");
            } else {
                for(int j = 0; j < i * 2 + 1; j++){
                    System.out.print("* ");

                }
            }
            space = space.replaceFirst("  ", "");
            System.out.println();
        }
    }
}
