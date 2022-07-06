package interviewPrep;

import java.util.Arrays;

public class Task76 {

    public static void main(String[] args) {

        String str = "Aa Bb Cc Dd Ee Ff Gg Hh Ii Jj Kk Ll Mm Nn Oo Pp Qq Rr Ss Tt Uu Vv Ww Xx Yy Zz";
        System.out.println(Arrays.toString(splitString(str)));
    }

    public static String[] splitString(String str){

        String [] res = str.split(" ");
        for(int i = 0; i < res.length; i++){
            res[i] = res[i] + " ";
        }
        return  res;
    }
}

/*
//76
 Output

Aa Bb Cc Dd Ee Ff Gg Hh Ii Jj Kk Ll Mm Nn Oo Pp Qq Rr Ss Tt Uu Vv Ww Xx Yy Zz
[Aa , Bb , Cc , Dd , Ee , Ff , Gg , Hh , Ii , Jj , Kk , Ll , Mm , Nn , Oo , Pp , Qq , Rr , Ss , Tt ,
 */
