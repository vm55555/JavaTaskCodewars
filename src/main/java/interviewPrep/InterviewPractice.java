package interviewPrep;

import java.util.HashSet;

public class InterviewPractice {

    public static void main(String[] args) {

        String[] mail = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        System.out.println(mergeEmails(mail));

    }

    public static HashSet<String> mergeEmails(String [] mail){

        HashSet<String> res = new HashSet<>();

       for(int i = 0; i < mail.length; i++){

           String [] temp = mail[i].split("@");
           if(temp[0].contains("+")) {
               temp[0] = temp[0].substring(0, temp[0].indexOf("+")).replaceAll("\\.", "");
           } else{
               temp[0] = temp[0].replaceAll("\\.", "");
           }
           temp[0] = temp[0] + "@" + temp[1];
           res.add(temp[0]);
           }

        return res;
       }
}


/*
String[] mail = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        String str = "";

        [testemail@leetcode.com, testemail@lee.tcode.com]
 */
