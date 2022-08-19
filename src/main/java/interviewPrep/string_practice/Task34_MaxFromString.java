package interviewPrep.string_practice;

public class Task34_MaxFromString {

    public static void main(String[] args) {

        String[] arr = {"1","2.5", "3", "-8.5", "4.5"};
        System.out.println(findMax(arr));

    }

    public static double findMax(String [] arr){

        double max = Double.MIN_VALUE;
        for(String each: arr){
            if(Double.parseDouble(each) > max){
                max = Double.parseDouble(each);
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
