package interviewPrep;

public class Task40_Array_missingNumber {

    public static void main(String[] args) {
        int r[]={-1,3,5,6,7,9,13,18,70,80,1400,1401,1405};
        System.out.println(findMissingNumbers(r));

    }

    public static String findMissingNumbers(int [] arr){

        String res = "";

        for(int i = 0; i < arr.length - 1; i++){
            int temp = arr[i] + 1;
            while (temp < arr[i + 1]){
                res += temp + " ";
                temp++;
            }
        }

        return res;
    }
}

/*
//40  FIND missing number

 int r[]={-1,3,5,6,7,9,13,18,70,80,1400,1401,1405};

 */
