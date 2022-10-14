package interviewPrep.other_practice;

import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {
        int g[]={1,2,3};
        int gg[]={4,5,6,7};
        int h[]={8,9};
        int dd[]={10,11};
        System.out.println(Arrays.toString(mergeArrays(g, gg, h, dd)));
    }

    public static int [] mergeArrays( int [] arr1, int [] arr2, int [] arr3, int [] arr4){

        int [] temp1 = Arrays.copyOf(arr1, arr1.length + arr2.length);
        int count = 0;
        for(int i = arr1.length; i < temp1.length; i++){
            temp1[i] = arr2[count++];
        }

        int [] temp2 = Arrays.copyOf(arr3, arr3.length + arr4.length);
        count = 0;

        for(int i = arr3.length; i < temp2.length; i++){
            temp2[i] = arr4[count++];
        }

        int [] res = Arrays.copyOf(temp1, temp1.length + temp2.length);
        count = 0;

        for(int i = temp1.length; i < res.length; i++){
            res[i] = temp2[count++];
        }

        Arrays.sort(res);

        return res;
    }
}

/*
input
   int g[]={1,2,3};
        int gg[]={4,5,6,7};
        int h[]={8,9};
        int dd[]={10,11};

 output
 [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
 */
