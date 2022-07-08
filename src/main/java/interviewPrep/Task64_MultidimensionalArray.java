package interviewPrep;

public class Task64_MultidimensionalArray {

    public static void main(String [] arg){

        int [][] arr =  {  {9, 8, 7}, {6},  {5,4,3,2,1,0}   };
        System.out.println(reverse(arr));

    }

    public static String reverse(int [][] arr){

        String res = "";

        for(int i = arr.length - 1; i >= 0; i--){
            for(int j = arr[i].length - 1; j >= 0; j--){
                res += arr[i][j];
            }
        }

        return res;
    }
}

/*
//64
 {  {9, 8, 7}, {6},  {5,4,3,2,1,0}   };    output should be
0 1 2 3 4 5 6 7 8 9
 */