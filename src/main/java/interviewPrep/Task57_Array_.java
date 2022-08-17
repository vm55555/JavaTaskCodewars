package interviewPrep;

public class Task57_Array_ {

    public static void main(String[] args) {

        int [] arr = {1, 1, 2, 3, 3, 4, 4};
        System.out.println(notRepeated(arr));

    }

    public static int notRepeated(int [] arr){


        for(int i = 0; i < arr.length; i++){
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }

            if(count == 1){
                return arr[i];
            }
        }

        return -1;
    }


}

/*
//57
 Given an array nums with 7 integers every element is repeated twice
 - except one. Find that element and print it to console.
Example:
nums -> [1, 1, 2, 3, 4, 3, 4]
         2
 */
