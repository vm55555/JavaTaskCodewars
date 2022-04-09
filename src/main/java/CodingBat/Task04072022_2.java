package CodingBat;

public class Task04072022_2 {

    public static void main(String[] args) {
        String str = "hixxhi";


        String temp = str.substring(0, 2);
        String end = str.substring(str.length() - 2);
        System.out.println(end);
        int count = 0;

        if(str.length() > 2){
            for(int i = 2; i < str.length() - 1; i += 2){
                if(temp.equals(str.substring(i, i + 2))){
                    count ++;
                }
            }


        }
    }


    public static int last2(String str) {

        String temp = str.substring(0, 2);
        String end = str.substring(str.length() - 3, str.length() - 1);
        int count = 0;

        if(str.length() > 2){
            for(int i = 2; i < str.length() - 1; i += 2){
                if(temp.equals(str.substring(i, i + 2))){
                    count ++;
                }
            }

            return temp.equals(end) ? count : 0;
        }

        return count;
    }

}
