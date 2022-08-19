package interviewPrep.array_practice;

import java.util.ArrayList;

public class Task30_ArrayUniqueElementsSumUpToZero {

    public static int randomInt(int Min, int Max) {
        return (int) (Math.random() * (Max + 1 - Min)) + Min;
    }
    public static ArrayList<Integer> unique(Integer num){
        if(num>1 && num<100){
            ArrayList<Integer> list=new ArrayList<>();
            Integer sum=0;
            // Random random=new Random();
            while (list.size()<num-1){
                Integer temp=randomInt(-num,num);//-10 10
                //   Integer temp=random.nextInt(num);
                if (!list.contains(temp)){
                    list.add(temp);
                    sum+=temp;
                }
            }
            list.add(-sum);
            return list;
        }
        return null;
    }
    public static ArrayList<Integer>unique1(Integer num){
        if(num>1 && num<100){
            ArrayList<Integer>list=new ArrayList<>();
            Integer sum=0;
            Integer temp=0;
            while (list.size()<num-1){

                if (!list.contains(temp)){
                    list.add(temp);
                    sum+=temp;
                }
                temp++;
            }
            list.add(-sum);
            return list;
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(unique(5));
    }
}

/*30
    Array -- N unique integers that sum up to 0
    Write a function:
    that, given an integer N (1 < N < 100), returns an array containing N unique integers that
    sum up to 0. The function can return any such array. For example, given N = 4, the function
    could return [0,1,2,-3] or [-2,1, -4,5]. The answer [1, -1,1,3] would be incorrect
            (because value 1 occurs twice). For N = 3 one of the possible answers is [-1,0,1]
            (but there are many more correct answers).
            */
