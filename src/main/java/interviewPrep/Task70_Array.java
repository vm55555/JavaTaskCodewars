package interviewPrep;

import java.util.Arrays;

public class Task70_Array {

    public static void main(String[] args) {

        int a[]={1,3,5};
        int b[]={2,4,6};
        System.out.println(Arrays.toString(mergeAndSort(a, b)));

    }

    public static int[] mergeAndSort(int []a, int[]b){

        int [] c = Arrays.copyOf(a, a.length + b.length);
        int count = 0;
        for(int i = a.length; i < c.length; i++){
            c[i] = b[count++];
        }

        Arrays.sort(c);
        return c;
    }
}

/*
//70 Store into Array
int a[]={1,3,5};
            int b[]={2,4,6};
            output
            [1,2,3,4,5,6]
 */
