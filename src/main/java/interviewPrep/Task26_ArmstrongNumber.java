package interviewPrep;

public class Task26_ArmstrongNumber {

    public static void main(String[] args) {
        int num=1634;
        System.out.println(armstrongNumbers(num));
    }
    public static boolean armstrongNumbers(int num){
        String reserve=""+num;
        int multiply=1;//3*3*3 7*7*7 1*1*1
        int total=0;
        int[]arr=new int[reserve.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=Integer.parseInt(reserve.charAt(i)+"");
            for (int j = 0; j < arr.length; j++) {
                multiply*=arr[i];
            }
            total+=multiply;
            multiply=1;
        }
        return num==total;

    }
}

/*
26
    Write a method that can check if a number is Armstrong  number
    Armstrong number is a number that is equal to the sum of cubes of its digits.
    For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers. Let's try to
    understand why 153 is an Armstrong number. Let's try to understand why 371 is an
    Armstrong number.

 */
