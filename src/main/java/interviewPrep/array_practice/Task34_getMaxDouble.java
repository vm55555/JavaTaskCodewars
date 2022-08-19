package interviewPrep.array_practice;

public class Task34_getMaxDouble {

    public static void main(String[] args) {
        String[] arr = {"1","2.5", "3", "3.5", "4.5"};

        System.out.println(returnMax(arr));


    }

    public static double returnMax(String [] arr){

        double max = 0;
        for(int i = 0; i < arr.length; i++){
            if(Double.parseDouble(arr[i]) > max){
                max = Double.parseDouble(arr[i]);
            }
        }

        return max;
    }
}

/*
34  USE double
Dont use sort get max  4.5
   String[] arr = {"1","2.5", "3", "3.5", "4.5"};

   output
   4.5
 */
