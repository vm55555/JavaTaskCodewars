package interviewPrep;

public class Task62_MultidimensionalArray {

    public static void main(String[] args) {

        int[][] numbers11 = {{9, 8, 7}, {6}, {5, 4, 3, 2, 1, 0}};
        System.out.println(reverse(numbers11));

    }

    public static String reverse(int [][] num){

        String res = "";

        for(int  i = 0; i < num.length; i++){
            for(int j = num[i].length - 1; j >= 0; j-- ){
                res += num[i][j] + " ";
            }
        }

        return res;
    }
}

/*
 //62    int[][] numbers11 = {{9, 8, 7}, {6}, {5, 4, 3, 2, 1, 0}};

  {  {9, 8, 7}, {6},  { { 5,4,3,2,1,0}   };  output should be this
7 8 9 6 0 1 2 3 4 5

 */
