package mentorSession.HW_3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Task14_PermutationHashSet {

    public static void main(String[] args) {
        ArrayList<Character> arrayList = new ArrayList<>();
        arrayList.add('A');
        arrayList.add('B');
        arrayList.add('C');
        arrayList.add('D');

        Set<String> strArray = new HashSet<>();

        String midRes;

        for (int i = 0; i < 223; i++) {
            midRes = String.format("%03d", i);
            String checkStr = "3456789";
            if (isCheckedTwo(midRes, checkStr)) {
                if (isThreeChecked(midRes)) {
                    // System.out.println(midRes);
                    strArray.add(midRes);
                }
            }
        }

        int midResArr;

        for (String str : strArray) {
            for (int i = 0; i < str.length(); i++) {
                midResArr = Integer.parseInt(str.substring(i, i + 1));

                System.out.print(arrayList.get(midResArr));
            }
            System.out.println();
        }
    }

    private static boolean isCheckedTwo(String midRes, String checkStr) {
        return !checkStr.contains(midRes.substring(0, 1))
                && !checkStr.contains(midRes.substring(1, 2))
                && !checkStr.contains(midRes.substring(2));
    }

    private static boolean isThreeChecked(String midRes) {
        int midSum = 0;
        int desiredRes = '0' + '1' + '2';
        for (int i = 0; i < midRes.length(); i++) {
            midSum += midRes.charAt(i);
        }
        return (desiredRes == midSum) && midRes.charAt(0) != midRes.charAt(1);
    }

}
