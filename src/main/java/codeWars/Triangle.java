package codeWars;

public class Triangle {

    public static void main(String[] args) {
        triangle(15);
    }

     public static void triangle(int rows){

        String space = "";

        for(int i = 0; i <= rows; i++){
            space += " ";
        }

        for(int i = 0; i <= rows; i++){
            System.out.print(space);

            for(int j = 0; j < i * 2; j++){

                if (j == 0) {
                    System.out.print("/");
                } else if (j == (i * 2) - 1){
                    System.out.print("\\");
                } else if (i != rows){
                    System.out.print(" ");
                } else{
                    System.out.print("_");
                }
            }
            System.out.println();
            if (space.length() > 0){
                space = space.substring(0, space.length() - 1);
            }
        }
     }
}
