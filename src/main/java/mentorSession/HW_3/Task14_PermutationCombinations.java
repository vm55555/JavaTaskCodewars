package mentorSession.HW_3;

public class Task14_PermutationCombinations {

    public static void main(String[] args) {
        int [] arr = {1, 2, 3};
        permutations(arr);
    }

    public static void permutations(int [] arr){

        int res = 1;

        for(int i = 0; i < arr.length; i++){
            res *= i + 1;
        }

        System.out.println("We have an array with " + arr.length + " elements. There are " + res + " permutations");

        int temp = 0;

        for(int i = 0; i < arr.length; i++){

            for(int j = 0; j < arr.length - 1; j++){

                for(int k = 0; k < arr.length; k++){
                    System.out.print(arr[k]);
                }
                System.out.println();

                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }


}

/*
14) Array - permutation combinations
Given an array of 3 characters print all permutation combinations from the given characters
 */
