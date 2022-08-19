public class practice {

    public static void main(String[] args) {
        Integer arr[]={22,101,102,101,102,101,525,88};
        System.out.println(mostFrequency(arr));
    }

    public static Integer mostFrequency(Integer [] arr){

        int res = 0;
        int frequency = 0;

        for(int i = 0; i < arr.length; i++){//{22,101,102,101,102,101,525,88}
            int count = 0;
            for(int j = 0; j < arr.length; j++){

                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > frequency){
                frequency = count;//3
                res = arr[i];//101
            }
        }

        return res;
    }
}

/*
// Write a function that receives an array of positive integers with values
    //between and the length or the array. That function returns the number
    //that most frequency array
//    Integer arr[]={22,101,102,101,102,101,525,88};
//    output 101
 */
