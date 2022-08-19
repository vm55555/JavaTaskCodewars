package interviewPrep.other_practice;

public class Task17_SwapTheNumbers {

    public static void main(String[] args) {
        int  a = 10;
        int  b  = 20;

        swapNumbers(a, b);
    }

    public static void swapNumbers(int a, int b){

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a " + a + "\nb " + b);
    }

    public static class Task23_ReverseNumbers {

        public static void main(String[] args) {

            System.out.println(convertToStr(-123456));
        }


        public static String convertToStr(int num) {

            String str = String.valueOf(num);
            String res = "";

            if (str.charAt(0) == '-') {
                res += str.charAt(0);
                for (int i = str.length() - 1; i >= 1; i--) {
                    res += str.charAt(i);
                }
            } else {
                res = "";

                for (int i = str.length() - 1; i >= 0; i--) {
                    res += str.charAt(i);
                }
            }
            return res;
        }
    }
}

/*
//17
int  a = 10;
        int  b  = 20;

        output
      a  20
      b  10

 */
