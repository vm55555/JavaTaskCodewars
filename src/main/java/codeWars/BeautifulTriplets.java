package codeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BeautifulTriplets {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(2, 2, 3, 4, 5));
        int d = 1;
        System.out.println(beautifulTriplets(d, arr));
    }

    public static int beautifulTriplets(int d, List<Integer> arr) {

        List<String> output = new ArrayList<>();
        String temp = "";
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                for (int k = 0; k < arr.size(); k++) {

                    if (arr.get(k) - arr.get(j) == d && arr.get(j) - arr.get(i) == d) {
                        output.add(arr.get(i) + arr.get(j) + arr.get(k) + "");
                    }
                }
            }
        }

        return output.size();
    }
}

/*
Really hard task to explain: https://www.hackerrank.com/challenges/beautiful-triplets/problem
The execution is relatively easy.
 */
