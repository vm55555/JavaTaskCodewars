package codingBat;

public class Task04092022 {
    public static void main(String[] args) {

        String str = "Hexxo thxxe";
        int count = 0;
        if(str.contains("x")){

                for(int j = 0; j < str.length() - 1; j++ ){
                    if(str.charAt(j) == 'x' && str.charAt(j + 1) == 'x'){
                        count++;
                    } else {
                      continue;
                    }
            }
        }

        System.out.println(count);
    }
}
