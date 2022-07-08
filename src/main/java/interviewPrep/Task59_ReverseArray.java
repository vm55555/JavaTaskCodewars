package interviewPrep;

public class Task59_ReverseArray {

    public static void main(String[] args) {
        String sentence = "Today is great day";
        System.out.println(reverseArr(sentence));
    }

    public static String reverseArr(String str){

        String [] arr = str.split(" ");
        String [] res = new String[arr.length];
        int count = 0;
        String result = "";

        for(int i = arr.length - 1; i >= 0; i--){
            res[count++] = arr[i];
        }

        for(int i = 0; i < res.length; i++){
            result += res[i] + " ";
        }

        return result;
    }
}

/*
 //59
 String sentence = "Today is great day";
  Array [Today, is, great, day]
 reverse Array[Today, is, great, day] to >  day great is Today
 */
