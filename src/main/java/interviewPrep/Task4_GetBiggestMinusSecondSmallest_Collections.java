package interviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task4_GetBiggestMinusSecondSmallest_Collections {

    public static void main(String[] args) {
        Integer [] a={2,5,7,15,1,6};
        ArrayList<Integer> g=new ArrayList<>(Arrays.asList(a));
        Integer max= Collections.max(g);
        Integer min=Collections.min(g);
        g.remove(min);
        Integer min1=Collections.min(g);
        Integer result=max-min1;
        System.out.println(result);
    }
}

/*Use Collection int a [] = {2,5,7,15,1,6};
    int a [] = {2,5,7,15,1,6};
    output
    13   < Max number minus second min num and result is 13
    */

