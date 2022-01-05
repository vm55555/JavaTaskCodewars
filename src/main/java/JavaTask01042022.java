public class JavaTask01042022 {

    //https://www.codewars.com/kata/57e92e91b63b6cbac20001e5/train/java

    public static int dutyFree(int normPrice, int discount, int hol) {
        double resultD = (double)hol / (double)((normPrice) * (discount * 0.01));
        int result = (int)(resultD);

        return result;
    }

    public static void main (String[] args) {
        System.out.println(dutyFree(12,50,1000));
    }
}
