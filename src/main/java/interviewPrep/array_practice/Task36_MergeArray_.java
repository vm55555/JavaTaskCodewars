package interviewPrep.array_practice;

import java.util.Arrays;

public class Task36_MergeArray_ {

    public static void main(String[] args) {
        int a[]={1,3,5};
        int b[]={2,4,6};

        System.out.println(Arrays.toString(mergeArray(a, b)));
    }

    public static int[] mergeArray(int [] a, int [] b){

        int [] res = Arrays.copyOf(a, a.length + b.length);
        int count = 0;

        for (int i = a.length; i < res.length; i++){

            res[i] = b[count++];
        }

        Arrays.sort(res);

        return res;
    }
}

/*
//36
 int a[]={1,3,5};
        int b[]={2,4,6};

output Array
[1, 2, 3, 4, 5, 6]
 */