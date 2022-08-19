package interviewPrep.string_practice;

public class Task32_count {

    public static void main(String[] args) {
        String q="buf-dt-rr";
        System.out.println(countSyllables(q));
    }

    public static int countSyllables(String str){
         int count = 1;

         for(int i = 0; i < str.length(); i++){
             if(str.charAt(i) == '-'){
                 count++;
             }
         }

         return count;
    }
}

/*

32
Create a function that counts the number of syllables a word has. Each syllable is
separated with a dash "-" Examples
numberSyllables("buf-fet") ➞ 2

        String q="buf-dt-rr"; >> 3
 */
