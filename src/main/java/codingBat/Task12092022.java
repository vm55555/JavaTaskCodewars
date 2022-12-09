package codingBat;

public class Task12092022 {

    public static void main(String[] args) {

        String str = "Hello";
    }

    public String twoChar(String str, int index) {

        if (index > str.length() - 2 || index < 0){
            return str.substring(0, 2);
        } else {
           return str.substring(index, index + 2);
        }

    }

}

//https://codingbat.com/prob/p144623
