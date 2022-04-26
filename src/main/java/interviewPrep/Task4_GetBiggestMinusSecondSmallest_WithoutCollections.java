package interviewPrep;

public class Task4_GetBiggestMinusSecondSmallest_WithoutCollections {

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
}

/*Use Collection int a [] = {2,5,7,15,1,6};
    int a [] = {2,5,7,15,1,6};
    output
    13   < Max number minus second min num and result is 13
    */
