package interviewPrep.string_practice;

public class Task32_String_Syllabus {

    public static void main(String[] args) {

        String q="buf-dt-rr";
        System.out.println(countSyllabus(q));

    }

    public static int countSyllabus(String str){

       String [] arr = str.split("-");

       return arr.length;
    }
}

/*
32
Create a function that counts the number of syllables a word has. Each syllable is
separated with a dash "-" Examples
numberSyllables("buf-fet") ➞ 2

        String q="buf-dt-rr"; >> 3
 */
