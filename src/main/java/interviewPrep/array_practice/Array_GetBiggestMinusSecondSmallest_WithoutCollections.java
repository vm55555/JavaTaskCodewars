package interviewPrep.array_practice;

public class Array_GetBiggestMinusSecondSmallest_WithoutCollections {

    public static void main(String[] args) {

        int[] a = {2,5,7,15,1,6};
        System.out.println(minisNumAndCalc(a));
    }
    public static void sortWithoutCollections(int [] arr){

        int small = 0;
        for (int i = 0; i <arr.length; i++)
        {
            small = i;
            for (int j = i +1 ; j <= arr.length-1; j++)
            {
                if (arr[j] < arr[small])
                {
                    small = j;
                }
                //swap values
            }
            int temp = arr[i];//5
            arr[i] = arr[small];//3
            arr[small] = temp;
        }

    }
    public static int minisNumAndCalc(int[] num){
        sortWithoutCollections(num);
        return num[num.length-1] - num[1];
    }

    public static class Task26_Multi {

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
}

/*Use Collection int a [] = {2,5,7,15,1,6};
    int a [] = {2,5,7,15,1,6};
    output
    13   < Max number minus second min num and result is 13
    */
