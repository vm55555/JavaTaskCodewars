package interviewPrep;

import java.util.Arrays;

public class JuliaTask {

    public static void main(String[] args) {

        System.out.println(Arrays.deepToString(createSquare(4)));
        int[][] result = createSquare(4);
        System.out.println(Arrays.deepToString(turnSquare90Degree(result)));

    }

    public static int[][] createSquare(int size){

        int[][] arr = new int[size][size];
        int count = 1;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = count++;
            }
        }

        return arr;
    }
    public static int[][] turnSquare90Degree(int[][] arr){

        int[][] result = new int[arr.length][arr.length];
        int count = arr.length - 1;
        int innerArr = 0;

        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j < arr[i].length; j++){
                result[i][j] = arr[innerArr][count];
                innerArr++;
            }
            count--;
            innerArr = 0;
        }

        return result;
    }
}
