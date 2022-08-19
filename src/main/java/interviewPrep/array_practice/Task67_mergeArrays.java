package interviewPrep.array_practice;

import java.util.Arrays;

public class Task67_mergeArrays {

    public static void main(String[] args) {

        int arr1[]={1,2,3};
        int arr2[]={4,5,6,7};
        System.out.println(Arrays.toString(mergeArr(arr1, arr2)));


    }

    public static int [] mergeArr(int [] arr1, int[] arr2){

        int [] res = Arrays.copyOf(arr1, arr1.length + arr2.length);
        int count = 0;

        for(int i = arr1.length; i < res.length; i++){
            res[i] = arr2[count++];
        }

        return res;
    }
}
/*

//67
Combine arrays  int arr1[]={1,2,3};  int arr2[]={4,5,6,7};
int arr3[]={1,2,3,4,5,6,7};
 */