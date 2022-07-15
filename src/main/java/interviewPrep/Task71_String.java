package interviewPrep;

public class Task71_String {

    public static void main(String[] args) {

        String a="a2b5c7a9f0dafa2s6a8d5a";
        System.out.println(sort(a));
    }

    public static String sort(String str){

        String res = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'a'){
                res += 'a';
                str = str.replaceFirst("a", "_");
            }
        }

        str = str.replaceAll("_", "");

        res += str;

        return res;
    }
}

/*
 //71
  String a="a2b5c7a9f0dafa2s6a8d5a";
                String str="";
                output
                aaaaaa2b5c79f0df2s68d5
 */
