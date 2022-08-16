package interviewPrep;

public class Task77_StringManipulation {

    public static void main(String[] args) {
        String str ="OsOdjjOsshoo";
        System.out.println(replaceO(str));
    }

    public static String replaceO(String str){

        int count = 0;

        for(int i = 0; i < str.length(); i++){
            if((str.charAt(i) + "").toLowerCase().equals("o")){
                count++;
            }
        }

        if(count == 3 || count == 4){
            str = str.replaceAll("o", "a");
            str = str.replaceAll("O", "a");
        }

        return str;
    }


}

/*
//77
       String str ="OsOdjjOssh";
       replace "o" with "a" only the number of o is 3 or 4
       asadjjassh <  BECAUSE THERE IS 3 O
 */
