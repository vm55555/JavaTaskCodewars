package codingBat;

public class Task1025222 {

    public int last2(String str) {

        int count = 0;

        if(str.length() > 2){
            String end = str.substring(str.length() - 2);
            for(int i = 0; i < str.length() - 1; i ++){
                if(end.equals(str.substring(i, i + 2))){
                    count ++;
                }
            }

            return count -1;
        }

        return count;
    }
}

//https://codingbat.com/prob/p178318
