package interviewPrep.array_practice;

public class Task58_ArrayAverage {

    public static void main(String[] args) {
        int [] arr = {10, 15, 5, 6};
        System.out.println(findAverage(arr));
    }

    public static double findAverage(int [] arr){

        double sum = 0;

        for(int each: arr){
            sum += each;
        }

        return sum/arr.length;
    }
}

/*
//58
 Write a program that can return the average number from an array of
 integers
  ex:
      [10, 15, 5, 6]
 average: 9.0
 */
