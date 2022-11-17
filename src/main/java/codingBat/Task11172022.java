package codingBat;

public class Task11172022 {

    public static void main(String[] args) {

    }

    public String comboString(String a, String b) {

        if(a.length() > b.length()){
            return b + a + b;
        } else {
            return a + b + a;
        }

    }
}

//https://codingbat.com/prob/p168564
