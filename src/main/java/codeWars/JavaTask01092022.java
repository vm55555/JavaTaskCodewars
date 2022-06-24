package codeWars;

public class JavaTask01092022 {

    //https:www.codewars.com/kata/55cbd4ba903825f7970000f5/train/java

    public static char getGrade(int s1, int s2, int s3) {

        int average = (s1 + s2 + s3) / 3;
        char result;

        if(average >= 90 && average <= 100) {
            result = 'A';
        } else if(average >= 80 && average < 90) {
            result = 'B';
        } else if(average >= 70 && average < 80) {
            result = 'C';
        } else if(average >= 60 && average < 70) {
            result = 'D';
        } else {
            result = 'F';
        }

        return result;
    }
}
