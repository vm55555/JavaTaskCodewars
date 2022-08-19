package interviewPrep.array_practice;

public class Task31_CompareArray {

    public static void main(String[] args) {

        int [] arr1 = {1, 2, 3, 4, 5};
        int [] arr2 = {2, 3, 5, 5};

        System.out.println(compareArrays(arr1, arr2));
    }

    public static boolean compareArrays(int [] arr1, int [] arr2){

        return arr1[0] == arr2[0] || arr1[arr1.length - 1] == arr2[arr2.length - 1];
    }
}

/*
31
//Given 2 arrays of ints, a and b, return true if
        //they have the same first element or they have the same last element.
        //Both arrays will be length 1 or more.
 */
