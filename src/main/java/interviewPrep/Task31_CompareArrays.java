package interviewPrep;

public class Task31_CompareArrays {

    public static void main(String[] args) {

        int [] a = {1, 2, 3};
        int [] b = {1, 5, 6};
        System.out.println(compareTwoArr(a, b));

    }

    public static boolean compareTwoArr( int [] arr1, int [] arr2){

        return arr1[0] == arr2[0] || arr1[arr1.length - 1] == arr2[arr2.length - 1];
    }
}

/*
31
//Given 2 arrays of ints, a and b, return true if
        //they have the same first element or they have the same last element.
        //Both arrays will be length 1 or more.
 */
