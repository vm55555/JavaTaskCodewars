package interviewPrep.array_practice;

import java.util.Arrays;

public class Task69_MergeAndSortArr {

    public static void main(String[] args) {
        int g[]={1,2,3};
        int gg[]={4,5,6,7};
        int h[]={8,9};
        int dd[]={10,11};
        System.out.println(Arrays.toString(mergeArr(g, gg, h, dd)));
    }

    public static int [] mergeArr(int [] a, int [] b, int [] c, int [] d){

        int [] res = Arrays.copyOf(a, a.length + b.length + c.length + d.length);

        for(int i = a.length; i < res.length;){
            for(int j = 0; j < b.length; j++){
                res[i] = b[j];
                i++;
            }
            for(int k = 0; k < c.length; k++){
                res[i] = c[k];
                i++;
            }
            for(int m = 0; m < d.length; m++){
                res[i] = d[m];
                i++;
            }
        }

        return res;
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
 ---------------------------------------------
 */
