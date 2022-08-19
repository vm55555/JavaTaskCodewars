package interviewPrep.array_practice;

import java.util.Arrays;

public class Task64MultidimensionalArray {

    public static void main(String[] args) {
        int[][] arr = {{9, 8, 7}, {6}, {5, 4, 3, 2, 1, 0}};

        sortMultidimensionalArr(arr);
    }
    /*
     {  {9, 8, 7}, {6},  {5,4,3,2,1,0}   };    output should be
0 1 2 3 4 5 6 7 8 9
     */
    //int[][] arr = {  {9, 8, 7}, {6},  {5,4,3,2,1,0}   };

    public static void sortMultidimensionalArr(int[][] arr) {

        for (int i = arr.length - 1; i >= 0; i--) { //how many elements in 2D
            for (int j = 0; j < arr[i].length; j++) { //going through each arr
                Arrays.sort(arr[i]);
                System.out.print(arr[i][j]);
            }
        }
    }
}
