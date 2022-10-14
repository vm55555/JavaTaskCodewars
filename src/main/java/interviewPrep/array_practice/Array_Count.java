package interviewPrep.array_practice;

public class Array_Count {

    public static void main(String[] args) {
        String [] testArray = {"Apple","Banana","Apple","Cherry"};
        System.out.println(countElements(testArray));
    }

    public static String countElements(String [] arr){

      String res = "";

        for(int i = 0; i < arr.length; i++){
            int count = 0;
            for(int j = 0; j < arr.length; j++){

                if(arr[i].equals(arr[j])){
                    count++;
                }
            }

            if(!res.contains(arr[i])){
                res += arr[i] + " = " + count + "\n";
            }
        }

        return res;
    }
}

/*
    Given the array return the output
                testArray = {"Apple","Banana","Apple","Cherry"}
                Output Example
                Apple = 2
                Banana = 1
                Cherry = 1
     */