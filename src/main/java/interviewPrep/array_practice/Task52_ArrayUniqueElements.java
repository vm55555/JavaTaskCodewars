package interviewPrep.array_practice;

public class Task52_ArrayUniqueElements {

    public static void main(String[] args) {
        int [] arr  = {1,1,2,3,3};
        double [] arr2 = {1.2, 1.2, 6, 4.5, 4.5};
        uniqueElements(arr);
        uniqueElements(arr2);
    }

    public static void uniqueElements(int [] arr){

        for(int i = 0; i < arr.length; i++){
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }

            if(count == 1){
                System.out.println(arr[i]);
            }
        }
    }


    public static void uniqueElements(double [] arr){
        for(int i = 0; i < arr.length; i++){
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }

            if(count == 1){
                System.out.println(arr[i]);
            }
        }

    }


}

/*
//52
 write a method that can print out the unique elements from an int array

Ex: {1,1,2,3,3} ==> 2
		{6,6,7,7,8,9} ==> 8 9
  --write a method that can print out the unique elements from a double array
		Note: Apply method overloading
 */
