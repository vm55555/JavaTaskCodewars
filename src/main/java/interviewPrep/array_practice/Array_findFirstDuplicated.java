package interviewPrep.array_practice;

public class Array_findFirstDuplicated {

    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4, 3, 5, 2};
        System.out.println(returnFirstDuplicated(arr));
        System.out.println(firstDuplicatedElement(arr));

    }

    public static int returnFirstDuplicated(int [] arr){

        int index = Integer.MAX_VALUE;
        int res = 0;

        for(int i = 0; i < arr.length; i++){
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    if(count == 2){
                        if(j < index){
                            index = j;
                            res = arr[j];
                        }
                    }
                }
            }
        }

        return res;
    }

    public static int firstDuplicatedElement(int[] array) {
        int firstDuplicated = 0;

        for (int each : array) {
            int frequency = 0;
            for (int each2 : array) {
                if (each == each2)
                    frequency++;
            }

            if (frequency > 1) {
                firstDuplicated = each;
                break;
            }

        }

        return firstDuplicated;

    }
}


 /*
    write a program that can find the first duplicated element from the array
     */

