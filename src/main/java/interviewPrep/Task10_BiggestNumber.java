package interviewPrep;

public class Task10_BiggestNumber {

    /*if ascend true
    int[]a={1,2,3,9,4,5,6,7};
    output: biggest number 9
    */
    public static void main(String[] args) {


        int[] a = {1, 2, 3, 9, 4, 5, 6, 7};

        int max = Integer.MIN_VALUE;
        for (int j : a) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println(max);
    }
}
