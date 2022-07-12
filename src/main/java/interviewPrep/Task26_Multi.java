package interviewPrep;

public class Task26_Multi {

    public static void main(String[] args) {
        int[][] numbers11 = {{9, 8, 7}, {6}, {5, 4, 3, 2, 1, 0}};
        reverseArr(numbers11);

    }

    public static void reverseArr(int[][] arr){

        for(int i = 0; i < arr.length; i++){
            for(int j = arr[i].length - 1; j >= 0; j--){
                System.out.print(arr[i][j] + " ");
            }
        }
    }

}

/*
//62    int[][] numbers11 = {{9, 8, 7}, {6}, {5, 4, 3, 2, 1, 0}};

  {  {9, 8, 7}, {6},  { { 5,4,3,2,1,0}   };  output should be this
7 8 9 6 0 1 2 3 4 5
 */