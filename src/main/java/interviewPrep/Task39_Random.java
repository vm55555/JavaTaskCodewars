package interviewPrep;

import java.util.Arrays;
import java.util.Random;

public class Task39_Random {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(random(10)));

    }

    public static int[] random (int n){

        int [] arr = new int[n];

        Random rnd = new Random();

        for(int i = 0; i < n; ){

           int num = rnd.nextInt(6);
           if(num > 0){
               arr[i] = num;
               i++;
           }
        }

        return arr;
    }
}

/*//39
Create 10 random number between 1 and 6
*/
