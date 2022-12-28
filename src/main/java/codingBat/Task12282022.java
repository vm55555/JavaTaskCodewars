package codingBat;

public class Task12282022 {

    public static void main(String[] args) {
        String str = "Hgggg";
        System.out.println(atFirst(str));

    }

    public static String atFirst(String str) {

        if(str.length() == 1){
            return str + "@";
        } else if(str.length() == 0){
            return "@@";
        } else {
            return str.substring(0, 2);
        }

    }
}

//https://codingbat.com/prob/p139076
