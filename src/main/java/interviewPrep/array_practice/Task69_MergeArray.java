package interviewPrep.array_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Task69_MergeArray {

    public static void main(String[] args) {

        int g[]={1,2,3};
        int gg[]={4,5,6,7};
        int h[]={8,9};
        int dd[]={10,11};

        System.out.println(Arrays.toString(mergeArray(g, gg, h, dd)));

    }

    public static int [] mergeArray(int[] arr1, int[] arr2, int[] arr3, int[] arr4){

       int [][] res = {arr1, arr2, arr3, arr4};
       int [] output = new int[arr1.length + arr2.length + arr3.length + arr4.length];
       int count = 0;

       for(int i = 0; i < res.length; i++){
           for(int j = 0; j < res[i].length; j++){
               output[count++] = res[i][j];
           }
       }
       return output;
    }

    public static int [] merge2(int[] g, int[] gg, int[] h, int[] dd){

        int f[] = Arrays.copyOf(g, g.length + gg.length + h.length + dd.length);

        for (int i = g.length, m = 0, n = 0, k = 0; i < f.length; i++) {
            if (m < gg.length) {
                f[i] = gg[m++];
            }
            else if (n <h.length) {
                f[i] = h[n++];
            }
            else if (k < dd.length) {
                f[i] = dd[k++];
            }

        }
        return f;
    }
}

/*
//69
input
   int g[]={1,2,3};
        int gg[]={4,5,6,7};
        int h[]={8,9};
        int dd[]={10,11};

 output
 [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
 */
