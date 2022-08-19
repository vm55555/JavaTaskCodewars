package interviewPrep.string_practice;

public class Task61_String_countWords {

    public static void main(String[] args) {

        String str = "I Like java and javascript not python";
        countWords(str);

    }

    public static void countWords(String str){

        String [] arr = str.toLowerCase().split(" ");
        int countJava = 0;
        int countPython = 0;

        for(String each: arr){
            if(each.contains("java".toLowerCase())){
                countJava++;
            } else if(each.contains("python".toLowerCase())){
                countPython++;
            }
        }

        System.out.println("java " + countJava + "\npython " + countPython);
    }
}

/*
 //61
  write a program that can return the number of appearances of
"java" and "python" anywhere in the sentence---"I Like java and javascript not python";
You will do for each and regular for loop
for each result: java 2
                 python 1
 */
