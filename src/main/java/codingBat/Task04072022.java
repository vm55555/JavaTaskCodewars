package codingBat;

public class Task04072022 {

    public static void main(String[] args) {

        System.out.println(stringMatch("ababab", "bababa"));
    }



    public static int stringMatch(String a, String b) {

        int count = 0;

        if(a.length() < 2){
            if(a.equals(b)){
                return 1;
            }
        } else {

            for(int i = 0; i < a.length() - 1; i ++ ){
                for(int j = 0; j < b.length() - 1; j ++){

                    if(a.substring(i, i + 2).equals(b.substring(j, j + 2)) && i == j){
                        count++;
                        break;
                    }
                }
            }
        }

        return count;
    }

}
