package codingBat;

public class Task01032023 {
    public static void main(String[] args) {
        System.out.println(minCat("Hello", "hjjava"));
    }

    public static String minCat(String a, String b) {

        if (a.length() > b.length()) {
            int n = a.length() - b.length();
            a = a.substring(n);

            return a + b;
        } else if(a.length() < b.length()){
            int n = b.length() - a.length();
            b = b.substring(n);

            return a + b;
        }

        return a + b;
    }

}

//https://codingbat.com/prob/p105745
