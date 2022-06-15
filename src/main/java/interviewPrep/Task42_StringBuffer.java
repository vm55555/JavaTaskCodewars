package interviewPrep;

public class Task42_StringBuffer {

    public static void main(String[] args) {
       int num = -123;
        System.out.println(reverseString(num));
    }

    public static int reverseString(int num){

        String temp = "" + num;
        StringBuffer stringBuffer = new StringBuffer();

        if(temp.charAt(0) == '-'){
            stringBuffer.append(temp.charAt(0));
            for(int i = temp.length() - 1; i > 0; i--){
                stringBuffer.append(temp.charAt(i));
            }
        } else {
            for(int i = temp.length() - 1; i >= 0; i--){
                stringBuffer.append(temp.charAt(i));
            }
        }

        return Integer.parseInt(String.valueOf(stringBuffer));
    }
}

/*//42  reverse   USE STRINGBUFFER
int num = -123;
           //-321*/
