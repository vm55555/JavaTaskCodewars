package interviewPrep;

public class TaskString {

    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(reverse(str));
    }

    public static String reverse(String str){

        for(int i = str.length() - 1;  i >=0; i--){
             str += str.charAt(i);
             str = str.replaceFirst(str.charAt(i) + "", "");
        }

        return str;
    }
}

/*
Создать метод который перевернет и вернет новый стринг при этом не создавая новой переменной в методе.
 */
