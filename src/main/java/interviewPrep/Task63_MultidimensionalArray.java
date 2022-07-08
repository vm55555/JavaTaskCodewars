package interviewPrep;

public class Task63_MultidimensionalArray {

    public static void main(String [] args){

        int [][] arr = {  {9, 8, 7}, {6},  {5,4,3,2,1,0}   };
        System.out.println(reverse(arr));

    }

    public static long reverse(int [][] arr){

        String res = "";

        for(int i = arr.length - 1; i >= 0; i--){
            for (int j = 0; j < arr[i].length; j++){
                res += arr[i][j];
            }
        }

        return Long.parseLong(res);
    }
}

/*
//63
{  {9, 8, 7}, {6},  {5,4,3,2,1,0}   };  output should be
5 4 3 2 1 0 6 9 8 7
 */
