package interviewPrep;

import java.util.Arrays;

public class Task44_ArrayMerge {

    public static void main(String[] args) {

        int[] a = {1,2};
        int[] b ={3,4};
        System.out.println(Arrays.toString(mergeArr(a, b)));

    }

    public static int [] mergeArr(int [] a, int [] b){

        int [] res = Arrays.copyOf(a, a.length + b.length);
        int count = 0;

        for(int i = a.length; i < res.length; i++){
            res[i] = b[count++];
        }

        return res;
    }


}

/*

//44  COMBINE
int[] a = {1,2};
        int[] b ={3,4};

        output
     [1, 2, 3, 4]
=========================================================================
  ---WHAT IS OUTPUT----
 String S1 = "Nisum";
        String S2 = new String(S1);
        String S3 ="Nisum";
        System.out.println((S1.equals(S2)));
        System.out.println(S1==S2);
        System.out.println((S3==S1));
========================================================================
 */
