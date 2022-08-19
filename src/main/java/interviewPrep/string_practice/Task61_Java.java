package interviewPrep.string_practice;

public class Task61_Java {

    public static void main(String[] args) {
        String str = "I Like java and javascript not python";
        countJavaAndPython(str);

    }

    public static void countJavaAndPython(String str){

        int java = 0;
        int python = 0;

        String [] arr = str.split(" ");
        for(int i =0; i < arr.length; i++){
            if(arr[i].toLowerCase().contains("java")){
                java++;
            }
            if(arr[i].toLowerCase().contains("python")){
                python++;
            }
        }

        System.out.println("java " + java + "\npython " + python);
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
