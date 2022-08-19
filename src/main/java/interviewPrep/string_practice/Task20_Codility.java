package interviewPrep.string_practice;

public class Task20_Codility {

    public static void main(String[] args) {
        int N = 30;

        codility(N);
    }

    /*
    //20
Write a function:
that, given a positive integer N, prints the consecutive numbers from 1 to N,
 each on a separate line. However, any number divisible by 2, 3 or 5 should be
 replaced by the word Codility, Test or Coders respectively. If a number is
 divisible by more than one of the numbers: 2,3 or 5, it should be replaced by
  a concatenation of the respective words Codility, Test and Coders in this
   given order. For example, numbers divisible by both 2 and 3 should be
    replacée by CodilityTest and numbers divisible by all three numbers: 2,3
     and 5, should be replaced by CodilityTestCoders.
 1
Codility
Test
Codility
Coders
CodilityTest
7
Codility
Test
Codi1ityCoders
11
CodilityTest
13
Codility
TestCoders
Codility
     */

    public static void codility(int N) {

        for (int i = 1; i <= N; i++) {
            String var = "";
            if (i % 2 == 0) {
                var += "Codility";
            }
            if (i % 3 == 0) {
                var += "Test";

            }

            if (i % 5 == 0) {
                var += "Coders";
            }

            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                var += i + "";
            }

            System.out.println(var);


        }
    }
}

