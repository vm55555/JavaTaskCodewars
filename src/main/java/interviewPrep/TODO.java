package interviewPrep;

public class TODO {

/*

//81
 String first="abccba"; < palindrome
 String second="abccbx"; < if it is not palindrome change x to a and make it palindrome
 //====================================================================================
 //82
 I need the solution for an array of size N
Given an array {a1, a2, a3, … aN}
New array should be { a2*a3*…aN, a1*a3…aN, … a1*a2…a(N-1)}
For an example if N=4 and array we have is {2, 3 , 4, 5}
New array is (3*4*5, 2*4*5, 2*3*5, 2*3*4} = {60, 40, 30, 24}


83 // int y[]=new int[]{6,-6,5,1,2,8};
Remove all digits that less than 0 and also if that numbers match any number remove that number too
examp: -6 is less than 0 and also equals 6 . So output should be [5, 1, 2, 8]

     */


///////////////////////////////////////////////////////////////////////////////////////

/*
1
 public static void main(String[] args) {
        String w="AAABBCDD";
        String d=FrequencyOfChars(w);
        System.out.println(d);

    }

    public static String FrequencyOfChars(String s){
        String result="";
        int j=0;
        while(j<s.length()){
            int count=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            result+=s.charAt(j)+""+count+" ";
            s=s.replace(""+s.charAt(j),"");
        }
        return result;
    }
/---------------------------------------------------------------------------------------/
    public static String frequency(String str) {
        String nonDup="",
                result="";

        for(int i=0; i < str.length(); i++) {
            if (!nonDup.contains("" + str.charAt(i)))
                nonDup += "" + str.charAt(i);
        }
        for(int i=0; i < nonDup.length(); i++) {
            int num = Collections.frequency( Arrays.asList(str.split("") ) , ""+nonDup.charAt( i ) );
            result += ""+nonDup.charAt(i) + num;
        }
        return result;
    }
/--------------------------------------------------------------------------------------/
  public static String frequency(String s){
        String non="";
        String res="";
        for(int i=0;i<s.length();i++){
            if(!non.contains(""+s.charAt(i))){
                non+=s.charAt(i);
            }
        }
        for(int i=0;i<non.length();i++){
            int count=0;
            for(int j=0;j<s.length();j++){
                if(non.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
          res+=""+non.charAt(i)+count;
        }
        return res;
   }
   //-----------------------------------------------------------------------------------//
    String str = "AAABCCCDD";

        String nonDup="";

        for(int i=0; i < str.length(); i++) {
            int num = Collections.frequency( Arrays.asList(str.split("") ) , ""+str.charAt( i ) );
          if(!nonDup.contains(""+str.charAt(i))){
              nonDup+=str.charAt(i)+""+num;
          }
        }

        System.out.println(nonDup);
//=========================================================================//
//2
 public static void main(String[] args) {
      String g="abc";
                String h="cab";

boolean b=same(g,h);
        System.out.println(b);
    }
    public static boolean same(String a, String b) {

        char[] ch1 = a.toCharArray();
        char[]  ch2 = b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String a1=Arrays.toString(ch1);
                String a2=Arrays.toString(ch2;

        return  a1.equals(a2) ;
    }
 //---------------------------------------------------------------------//
   public static boolean same(String str1, String str2) {
  String [] s=str1.split("");
  String []ss=str2.split("");
  Arrays.sort(s);
  Arrays.sort(ss)
;

  boolean bb=Arrays.equals(s,ss);
  return bb;
    }

//--------------------------------------------------------------------//
   public static boolean same(String str1, String str2) {
    String a = new  TreeSet<>(Arrays.asList( str1.split(""))).toString( );
    String b = new TreeSet<>(Arrays.asList( str2.split(""))).toString( );

       boolean bb=a.equals(b);
return bb;
//==================================================================//
//3
        int a=5;
        int b=6;
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println(a);
        System.out.println(b);
//==============================================================================//
//4
 Integer a [] = {2,5,7,15,1,6};

        ArrayList<Integer>g=new ArrayList<>(Arrays.asList(a));

        Integer max=Collections.max(g);
        Integer min=Collections.min(g);
        g.remove(min);
        Integer min1=Collections.min(g);
        Integer result =max-min1;
        System.out.println(result);
//==============================================================================//
//5
 ArrayList<Integer> list =  new ArrayList<>(Arrays.asList(1,10, 50, 2, 4, 50, 10, 3, 2,5, 4));

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {

                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j,temp);
                }
            }
        }
        System.out.println(list);
//--------------------------------------------------------------------------//
 int[] arr = {1, 2, 3, 49, 6, 5};
        ArrayList<Integer> list = new ArrayList();

        for (int each : arr) {
            list.add(each);
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }


        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        System.out.println(Arrays.toString(arr));
//==================================================================================//
//6
String h="AAABBBCCC";
        String result = "";

        for (int i = 0; i < h.length(); i++) {
            if (!result.contains("" + h.charAt(i))) {
                result += "" + h.charAt(i);
            }
        }
        System.out.println(result);
//===============================================================================//
//7
String h="AAABBBCCCDEF";
        String result = "";

        for (int i = 0; i < h.length(); i++) {
           int count=Collections.frequency(Arrays.asList(h.split("")),""+h.charAt(i));
           result+=(count==1)?h.charAt(i):"";
        }
        System.out.println(result);
//==============================================================================//
//8
 String s="1a2b3c4f!@#";
        int sum=0;
        String letter="";
        String digit="";
        String sign="";
        for(int i=0;i<s.length();i++ ){
            if(Character.isDigit(s.charAt(i))) {
                digit+=s.charAt(i)+" ";
                sum+=Integer.parseInt(""+s.charAt(i));
            }
            if(Character.isAlphabetic(s.charAt(i))){
                letter+=s.charAt(i)+" ";
            }
            if(!Character.isDigit(s.charAt(i))&&!Character.isLetter(s.charAt(i))){
                sign+=s.charAt(i);
            }
        }
        System.out.println(sum);
        System.out.println(letter);
        System.out.println(digit);
        System.out.println(sign);
//============================================================================//
//9
  String str="DC501GCCCA098911";
        String result="";

        for(int i=0;i<str.length()-1;i++){
            if(Character.isDigit(str.charAt(i))){
                result+=str.charAt(i);
            }
            if(Character.isLetter(str.charAt(i))){
                result+=str.charAt(i);
            }
            if(Character.isLetter(str.charAt(i))&&Character.isDigit(str.charAt(i+1))){
               result+=" ";
            }
            if(Character.isDigit(str.charAt(i))&&Character.isLetter(str.charAt(i+1))){
                result+=" ";
            }
        }
        result+=str.charAt(str.length()-1);
        System.out.println(result);

        String u="";
        String[] f=result.split(" ");
        System.out.println(Arrays.toString(f));
        for(String e:f){
            char []c=e.toCharArray();
            Arrays.sort(c);
            for(char r:c){
                u+=""+r ;
            }
        }
        System.out.println(u);

//=============================================================================//

//10
int[]a={1,2,3,9,4,5,6,7};

int max=Integer.MIN_VALUE;
for(int i=0;i<a.length;i++){
    if(a[i]>max){
        max=a[i];
    }
}
        System.out.println(max);
//=============================================================================//
//11
int[]a={1,2,3,9,4,5,6,7};

int min=Integer.MAX_VALUE;
for(int i=0;i<a.length;i++){
    if(a[i]<min){
        min=a[i];
    }
}
        System.out.println(min);

//=============================================================================//
//12
 int[] arr = {1, 0,0,2,0, 3, 49, 6, 5};
        ArrayList<Integer> list = new ArrayList<>();

        int countZero = 0;

        for(int each: arr) {
            list.add(each);
            countZero+= (each==0)?1:0;
        }

        list.removeAll(Arrays.asList(0));
        arr = new int[arr.length];
        for(int i=0; i <arr.length-countZero; i++ ) {
            arr[i] = list.get(i);
        }

        System.out.println(Arrays.toString(arr));
------------------------------------------------------------------------------------
 int[] arr = {1, 0,0,2,0, 3, 49, 6, 5};
        int u[]=new int[arr.length];
        int a=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                u[a++]=arr[i];
            }
        }
        System.out.println(Arrays.toString(u));
-----------------------------------------------------------------------------
 int[] arr = {1, 0,0,2,0, 3, 49, 6, 5};
      ArrayList<Integer>h=new ArrayList<>();
      int count=0;
      for(int i=0;i<arr.length;i++){
          if(arr[i]>0){
              h.add(arr[i]);
          }
          if(arr[i]==0){
              count++;
          }
      }
        System.out.println(count);
      for(int i=0;i<count;i++){
          h.add(0);
      }

//=================================================================================//
//13
  int arr1[]={1,2,3};
        int arr2[]={4,5,6,7};

        int gg[]=new int[arr1.length+arr2.length];

        int w=0;
        for(int i=0;i<gg.length;i++){
            if(i<arr1.length){
                gg[i]=arr1[i];
            }else if(w<arr2.length){
                    gg[i]=arr2[w++];
                }
            }

        System.out.println(Arrays.toString(gg));
//===========================================================================//
//14
int a=5;

    String h=a%2==0 ? "Even" : "odd" ;
        System.out.println(h);

//=========================================================================//
//15
 String result = "";
        for(int i=1; i <= 30; i++) {
            result += (i % 5 ==0 && i %3 ==0)? "FINRA " : (i%5 == 0) ? "RA "
                    :(i%3 == 0) ? "FIN " : i+" ";
        }
        System.out.println(result);

//====================================================================//
//16
int num1=4;
int num2=2;
        if(num2==0) {
            System.out.println("Invalid Number");
        }
        System.out.print(num1 +" devid by "+num2 +" is: ");


        int count =0;
        while(num1 >= num2) {
            num1 -= num2;
            count++;
        }
        System.out.println(count+" and remainder is "+num1);
 //=============================================================================//
 //17
  int  a = 10;
        int  b  = 20;
        a = a +b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);
//===========================================================================//
//18

        String divisibleBy15 ="";
        String divisibleBy5 ="";
        String divisibleBy3="";
        int[] arr = new int[100];
        for(int i=0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for(int each: arr) {
            if(each %15==0 )
                divisibleBy15+= each+" ";
            if(each %5==0 && each % 15!=0)
                divisibleBy5 += each+" ";
            if(each%3==0 && each %15!=0)
                divisibleBy3 += each+" ";
        }
        System.out.println("Divisible By 15: "+divisibleBy15);
        System.out.println("Divisible By 5: "+divisibleBy5);
        System.out.println("Divisible By 3: "+divisibleBy3);




//------------------------------------------------------------------//

        List<Integer> list = new ArrayList<Integer>();

        for(int i=0; i < 100; i++)
            list.add(i + 1);


            System.out.print("Divisible By 15: ");

            list.forEach(p -> {
                if (p % 15 == 0 && p % 3 == 0) System.out.print(p + " ");
            });

            System.out.print("\nDivisible By 5: ");

            list.forEach(p -> {
                if (p % 5 == 0 && p % 15 != 0) System.out.print(p + " ");
            });

            System.out.print("\nDivisible By 3: ");

            list.forEach(p -> {
                if (p % 3 == 0 && p % 15 != 0) System.out.print(p + " ");
            });
//========================================================================//
//19
String password="Mr@34";
        String lowercase="(.*[a-z].*)";
        String uppercase="(.*[A-Z].*)";
        String numbers="(.*[0-9].*)";
        String specialchars="(.*[ -/, :-@].*)";
        boolean  HasLower = password.matches(lowercase)
,
                HasUppere = password.matches(uppercase)
,
                HasDigits = password.matches(numbers)
,
                HasSpecial = password.matches(specialchars),
                Valid = false;
        if(password.length() >= 6 && !password.contains(" ")) {
            if (HasLower && HasUppere && HasDigits && HasSpecial)
                Valid = true;
        }
        System.out.println(Valid);
//===========================================================================//
//20
 int N=24;
        String result = "";

        for (int i = 1; i <= N; i++) {

    result+=(i%2==0&&i%3==0&&i%5==0)?"CodilityTestCoders\n":(i%2==0&&i%3==0)?"CodilityTest\n":
  (i % 2==0 && i %5==0)?"CodilityCoders\n":(i % 3 == 0 && i % 5 ==0)?"TestCoders\n":
  (i % 2 ==0)?"Codility\n":(i % 5 == 0)?"Coders\n":(i % 3 == 0)?"Test\n": i + "\n";

        }
        System.out.println(result);
//============================================================================//

//21
int n=5;
        int result = 1;
        for(int i = 1; i <= n; i++){
            result = result * i;
        }
        System.out.println(result);
//======================================================================//
//22

        boolean primeNum=true;
        int num=5;
        if(num<=1) {
            System.out.println(primeNum==false);
        }
        for(int i=2; i<num; i++) {
            if(num%i==0) {
                primeNum=false;
            }
        }
        System.out.println(primeNum);
//==================================================================//
//23

int num=-1234556;

        String str = new StringBuilder(""+num).reverse().toString();

        if(num < 0) {

            str = "-"+str.substring(0, str.length()-1);

        }
        num=Integer.valueOf(str);
        System.out.println(num);
    }
//============================================================================//
//24
 List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
                Iterator<String> it = names.iterator();
        while(it.hasNext()) {
            if(it.next().equals("Ahmed"))
                it.remove();
        }
        System.out.println( names );
//-----------------------------------------------------------------//
  ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

                names.removeAll( Arrays.asList("Ahmed"));
        System.out.println(names);

//========================================================================//
//25
List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()) {
            if (it.next() > 100) {
                it.remove();
            }
        }
        System.out.println(list);
//-----------------------------------------------------------------------//
 ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));

        ArrayList<Integer> list2 = new ArrayList<>();
for(int i=0;i<list1.size();i++){
    if(list1.get(i)>100){
        list1.remove(list1.get(i));
        i--;
    }
}
        System.out.println(list1);

//---------------------------------------------------------------------------//
  ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));

        list.removeIf(p -> p>100);

        System.out.println(list);
 //----------------------------------------------------------------//
//26
 int a=153;
        String q=""+a;
        Integer y=0;

        for(int i=0;i<q.length();i++){

                y += Integer.valueOf(q.substring(i, i + 1))*Integer.valueOf(q.substring(i, i + 1))
                *Integer.valueOf(q.substring(i, i + 1));
        }
        boolean b=a==y;
        System.out.println(b);

//=================================================================//
//27

        String str="ABBDDDCA";
        Map<Character, Integer> map = new LinkedHashMap<>();


        for (Character each : str.toCharArray()) {
            if (map.containsKey(each)) {
                map.put(each, map.get(each) +2);
            } else {
                map.put(each, 1);
            }
        }

        System.out.println(map);
//--------------------------------------------------------------//
String str="AABBDDDC";
Map<Character, Integer> map = new LinkedHashMap<>();
for(int i=0;i<str.length();i++){
    int count=Collections.frequency(Arrays.asList(str.split("")),""+str.charAt(i));
    if(!map.containsKey(str.charAt(i))){
        map.put(str.charAt(i),count);
    }
}
System.out.println(map);
----------------------------------------------------------------------
 for(int i=0;i<str.length();i++){
            int count=Collections.frequency(Arrays.asList(str.split("")),""+str.charAt(i));
           ff.put(str.substring(i,i+1),count);
        }
        System.out.println(ff);

//========================================================//
28
        String str = "accabbcd";
        Map<Character, Integer> unique = new HashMap<>();

        for( int j = 0; j < str.length(); j++) {
            int count =0;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == str.charAt(j))
                    count++;
            }
            if( count == 1){
                unique.put(str.charAt(j), count);
            }
        }

        System.out.println(unique);
 ---------------------------------------------------------------------------------------

        String str="AABBSDDDC";
        Map<Character, Integer> map = new LinkedHashMap<>();

        for(int i=0;i<str.length();i++){
            int count=Collections.frequency(Arrays.asList(str.split("")),""+str.charAt(i));
            if(count==1){
                map.put(str.charAt(i),count);
            }
        }
        System.out.println(map);


//====================================================================//
//29

 Map<String,Integer>t=new HashMap<>();
t.put("a",2);
t.put("q",5);
t.put("w",1);

        SortedSet<Integer> sm = new TreeSet<>(t.values());
        System.out.println(sm.first());
System.out.println(sm.last());
--------------------------------------------------
        int t=Collections.max(t.values());
        System.out.println(t);

//========================================================================================//
//30
   int n=6;
        int []a=new int[n];
        int sum=0;
        for (int i=0;i<a.length;i++){
            if (i+1==a.length){
                a[i]=sum-(2*sum);
                break;
            }
            a[i]=i;
            sum+=i;
        }
        System.out.println(a.length);
        System.out.println(Arrays.toString(a));
//=====================================================================================//
31
//int a[]={1,2,3};
//int b[]={5,2,4};
//if(a[0]==b[0]){
//    System.out.println("true");
//}else if(a[a.length-1]==b[b.length-1]){
//    System.out.println("true");
//}else{
//    System.out.println("false");
//}

//        int [] arr1= {0};
//        int [] arr2= {0};
//        boolean result= false;
//        for(int i=0; i<arr1.length; i++) {
//            for(int j=0; j< arr2.length; j++) {
//
//                    if(arr1[0]== arr2[0] || arr1[arr1.length-1]== arr2[arr2.length-1]){
//                        result=true;
//
//                }
//            }
//        }
//        System.out.println(result);

//========================================================================================//
//32
   String q="buf-dt-rr";

//       String str="Mon-ey";
//        String[] arr= str.split("-");
//        System.out.println(arr.length);


//        int u=q.split("-").length;
//        System.out.println(u);
        int count=0;

        for(int i=0;i<q.length();i++){
            if(q.contains("-")){
                count++;
                q=q.replaceFirst("-","");
            }
        }
        System.out.println(count+1);

//-----------------------------------------------------------------------------------//
 String q="buf-dt-rr";
        String aa[]=q.split("");
        System.out.println(Arrays.toString(aa));
        int count=0;
        for(int i=0;i<aa.length;i++){
            if(aa[i].equals("-")){
                count++;
            }
        }
        System.out.println(count);

//===================================================================================//
//33

        int [] num= {1,2,1  };
        for(int i=0; i<num.length; i++) {
          if(num[i]==2&&num[i+1]==3){
              num[i+1]=0;
          }
        }
        System.out.println(Arrays.toString(num));

 //================================================================================================
 //34 String[] arr = {"1","2.5", "3", "3.5", "4.5"};
 //        double [] arr1= new double [arr.length];
 //        double max= Integer.MIN_VALUE; //-2147483648
 //        for(int i=0; i<arr.length; i++) {
 //            arr1 [i]+= Double.valueOf(arr[i]);
 //            if (max < arr1[i]) {
 //                max=arr1[i];
 //            }
 //        }
 //        System.out.println(max);

//=======================================================================================
//35
   String s = "Seda,20,Leyla,30";
        String y[]=s.split(",");
        Map<String,Integer>ff=new LinkedHashMap<>();

        for(int i=0;i<y.length;i++){

            ff.put(y[i],Integer.valueOf(y[i+1]));
            i++;
        }
        System.out.println(ff);


 ---------------------------------------------------------------------
   String str = "Seda, Nurik, Leyla, Seda";
        Map<String, String> map2 = new LinkedHashMap<>();
        String[] arr = str.split(",");
        for(int i=0; i<arr.length; i++){
            map2.put(arr[i], "");
        }
        System.out.println(map2);

//===================================================================================
//36
 int a[]={1,3,5};
        int b[]={2,4,6};
        int c[]=new int[a.length+b.length];
        int d=0;
        for (int i=0;i<a.length;i++){
            c[d]=a[i];
            c[d+=1]=b[i];
             d++;

        }
        System.out.println(Arrays.toString(c));

//=====================================================================//
//37
   int [] arr = {1,4,8,0,3,11,26,2};
        int y[] =new int[arr.length/2];
ArrayList<Integer>t=new ArrayList<>();
int a=0;
        for(int i=0;i<arr.length;i++){
            y[a++]=arr[i];
            t.add(arr[i]);
i++;

        }
        System.out.println(t);
        System.out.println(Arrays.toString(y));
//=============================================================================//
//38

        Map<String, Integer> map=new LinkedHashMap<>();
        map.put("Ilham",30);
        map.put("Kenan",20);
        map.put("Solmaz",10);
        map.put("Venera",40);
        map.put("Orxan",70);
        map.put("Sada",60);
        map.put("Esmira",50);
        map.put("Ramil",80);


        List<Map.Entry<String, Integer>> list = new ArrayList(map.entrySet());

        list.sort(Map.Entry.comparingByValue());
        map = new LinkedHashMap();
        for(Map.Entry<String, Integer> each : list) {
            map.put(each.getKey(), each.getValue());
        }

        System.out.println(map);

 //=================================================================================//
 //39
 Random random =new Random();
int num=0;
int count=1;
for(int i=1;i<=10;i++){
    num=1+random.nextInt(6);
    System.out.println(count+"= "+num);
    count++;
}
-------------------------------------------------------------------------
 int y[]=new int[10];
        for(int i=0;i<10;i++){
            y[i]=1+random.nextInt(6);
        }
        System.out.println(Arrays.toString(y));

//===============================================================================//
//40


        int r[]={-2,3,5,6,7,9,13,18,70,80,1400,1401,1405};
        ArrayList<Integer>y=new ArrayList<>();

               for(int e=0;e<r.length-1;e++){

                for (int i = r[e] + 1; i < r[e + 1]; i++) {
                    y.add(i);
                }
            }

        System.out.println(y);
//========================================================================//
//41

        int num =5;
        int power =4;  // 625
        int result =1;
        while(power>0){
            result*=num;
            power--;
        }
        System.out.println(result);
//===============================================================================//
//42
 int num = 123; //321
        String y=""+num;
        ArrayList<Integer>j=new ArrayList<>();
        for(int i=y.length()-1;i>=0;i--){
            j.add(Integer.valueOf(""+y.charAt(i)));
        }
        System.out.println(j);
   ----------------------------------   SECOND---------------
   //        String  str = new StringBuffer(Integer.toString(num)).reverse().toString();
//        num=Integer.parseInt(str);
//        System.out.println(num);
--------------------------------------------------------------------------------------
  int num = -123;
        String h=""+num;
        String k="";
       for(int i=h.length()-1;i>0;i--){
           k+=h.charAt(i);
       }
        k="-"+k;
       num=Integer.valueOf(k);

        System.out.println(num);

//=============================================================================//
//43
//eger regeme bolunen regemlerin cemi onun ozune beraberdirse perfect numberdi
        int perfectNum =28;
        int sum =0;
        for(int i=1; i<perfectNum; i++) {
            if (perfectNum%i==0) {
                sum+=i;
                System.out.println(i);
            }
        }
        System.out.println(perfectNum==sum);
==============================================================================
//44
 int[] a = {1,2};
        int[] b ={3,4};
        int[] c = new int[a.length+b.length];
        for(int i=0; i<a.length; i++){
            c[i]=a[i];
            c[a.length+i]=b[i];
        }
        System.out.println(Arrays.toString(c));

//=============================================================================================//
//45
  ArrayList<String >fruits=new ArrayList<>(Arrays.asList("alma","alma","alma","alma"
        ,"armud","armud","armud","pear","apple","pear","pear"));

       Map<String,Integer>rr=new LinkedHashMap<>();
        for (int i=0;i<fruits.size();i++) {
            int count=Collections.frequency(fruits,fruits.get(i));
            rr.put(fruits.get(i),count);
        }

int a=Collections.max(rr.values());

        ArrayList<String>m=new ArrayList<>();
        for(String e:rr.keySet()){
            if(rr.get(e)==a){
                m.add(e);
            }
        }
        System.out.println(m);
==========================================================================================
//46

        String a="10aaa10ss20bb30aww1";
            String num="";
        for(int i=0;i<a.length()-1;i++) {
            if (Character.isDigit(a.charAt(i))) {
                num += a.charAt(i);
            }
            if(Character.isDigit(a.charAt(i))&&Character.isAlphabetic(a.charAt(i+1))){
              num+=" ";
            }
        }

     if(Character.isDigit(a.charAt(a.length()-1))){
            num+=a.charAt(a.length()-1);
     }

        String[] numArray=num.split(" ");
        int sum=0;
        for(int i=0;i<numArray.length;i++){
            sum+=Integer.valueOf(numArray[i]);
        }
        System.out.println(sum);
//====================================================================================//
//47
String a="DC501GCCCA098911GA32";
String result="";
for(int i=0;i<a.length()-1;i++) {
    if (Character.isLetter(a.charAt(i))) {
       result+= a.charAt(i);
    }
    if (Character.isDigit(a.charAt(i))) {
        result += a.charAt(i);
    }
    if(Character.isDigit(a.charAt(i))&&Character.isAlphabetic(a.charAt(i+1))){
        result+=" ";
    }
    if(Character.isLetter(a.charAt(i))&&Character.isDigit(a.charAt(i+1))){
       result+=" ";
    }
}
result+=a.charAt(a.length()-1);
String[] aa = result.split(" ");
String ss="";
for(String each: aa) {
    char[] chars=each.toCharArray();
    Arrays.sort(chars);
    for(char eachChar: chars){
        ss +=""+eachChar;
    }
}
System.out.println(ss)
;
==================================================================================
//48

ArrayList<String>d=new ArrayList<>(Arrays.asList("A","A","A","A","D","C"));
        int count=0;
        boolean b=false;
      for(int i=0;i<d.size();i++){
           count=Collections.frequency(d,d.get(i));
           if(count>1){
               b=true;
               d.remove(d.get(i));
               i--;
           }
      }
        System.out.println(d);
        System.out.println(b);
============================================================================================
//49
  String result111="";

        for(int i=1; i<=30; i++){
   result111+= (i%3==0 && i%5==0)? " FINRA ":(i%3==0)? " FIN ": (i%5==0)? " RA ": i+" ";
        }
        System.out.println(result111);
==============================================================================================
//50
Scanner input =new Scanner(System.in);
        System.out.println("Enter the required String: ");
        String word = input.next();

    //    String word="apple";
//        for(int i=0;i<word.length();i++)
//        {
//            for(int j=i+1;j<word.length();j++)
//            {
//              if(word.charAt(i)==word.charAt(j)){
//                word=word.replace(""+word.charAt(i),"");
//
//              }
//            }
//        }
     //   System.out.println(word)
;
for(int i=0;i<word.length();i++) {
    int count = Collections.frequency(Arrays.asList(word.split("")), "" + word.charAt(i));
    if (count == 2) {
        word=word.replace(String.valueOf(word.charAt(i)), "");
    }
}
        System.out.println(word)
;
---------------------------------------------------------------------------------
   String h="AABCC";
for(int i=0;i<h.length();i++){
    int count=Collections.frequency(Arrays.asList(h.split("")),""+h.charAt(i));
    if(count>1){
        h=h.replace(""+h.charAt(i),"");
    }
}
        System.out.println(h);


========================================================================================

 51
int count=0;
        for(int i=0;i<str.length()-2;i++) {
            char c=  str.charAt(i);
            if (c== str.charAt(i + 1)&&c==str.charAt(i+2)) {
                count++;            }
        }
        System.out.println(count);
============================================================================================
52
Integer[] arr = {1, 1, 2, 5,5};

        for(int i=0;i<arr.length;i++){
            int count=Collections.frequency(Arrays.asList(arr),arr[i]);
            if(count==1){
                System.out.println(arr[i]);
            }
        }
==============================================================================================
53
Scanner scan = new Scanner(System.in);
        System.out.print("In");
        String s = scan.nextLine();
        //write your code below
        String res ="";
        for (int i=0; i < s.length(); i++){
            if (i %2 ==0)res += s.substring(i,i+1).toLowerCase();
            if(i%2!=0) res += s.substring(i,i+1).toUpperCase();
        }
        System.out.println(res);
  ---------------------------------------------------------------------------------------------
    for(int i=0;i<a.length();i++){

            y+=i%2==0?a.substring(i,i+1).toLowerCase():"";
            y+=i%2!=0?a.substring(i,i+1).toUpperCase():"";
        }
==========================================================================================
54
 String maxWord ="";
        for (int i2=1; i2<=5; i2++){
            System.out.println("Enter a Word "+i2);
            String word1 = scan.nextLine();
            if (maxWord.length() < word1.length());
            maxWord =word1;
        }
        System.out.println("Max word length is: "+ maxWord);
===========================================================================================
55
   int[] arr= {200, 155, 100, 4, 3, 1, -1, -100};
        int[] arrDesc = new int[arr.length];

        int k = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arrDesc[k++] = arr[i];

        }
        System.out.println(Arrays.toString(arrDesc));
==========================================================================================
56
 int nums55[] = {1, 2, 3, 5, 5};
        boolean B = false;
        for (int i = 0; i < nums55.length - 1; i++) {
            if (nums55[i] == nums55[i + 1] && nums55[i] == 5) {
                B = true;

            }
        }
            System.out.println(B);

============================================================================================
57
 Integer nums55[] = {1, 1, 2, 3, 4, 3, 4};

        for (int i = 0; i < nums55.length - 1; i++) {
           int count=Collections.frequency(Arrays.asList(nums55),nums55[i]);
           if(count==1){
               System.out.println(nums55[i]);
           }
        }
=============================================================================================
//58

 DecimalFormat DF = new DecimalFormat("0.00");
        double[] arr55 = {10, 15, 5, 6};
        double length = arr55.length;
        double sum = 0;
        for (int i = 0; i < length; i++) {
            sum += arr55[i];
        }
        double average = sum / length;
        System.out.println(DF.format(average));
========================================================================================
//59
  String sentence = "Today is great day";
        String[] words44 = sentence.split(" ");
        String result = "";
        for (int i = words44.length - 1; i >= 0; i--) {
            String eachWords = words44[i];

            result += eachWords + " ";
        }
        System.out.println(result);
==========================================================================================
//60
 String sentence = "Today is great day";
        String[] words44 = sentence.split(" ");
        String result = "";
        for (int i = words44.length - 1; i >= 0; i--) {
           for(int j=words44[i].length()-1; j>=0; j--){
               result+=words44[i].charAt(j);
           }
           result+=" ";
        }
        System.out.println(result);
-----------------------------------------------------------------------------------------
for(int i=h.length-1;i>=0;i--){
          b+=" "+new StringBuffer(h[i]).reverse().toString();
        }
 ------------------------------------------------------------------------------------
 //     String sentence = "Today is great day";
//        Array [Today, is, great, day]
//        reverse Array[Today, is, great, day] to >  day great is Today
//        String[] u=sentence.split("");
//        String b="";
//        for(int i=u.length-1;i>=0;i--){
//            b+=u[i];
//        }
//        System.out.println(b);

=========================================================================================
61
  String sa = "I Like java and javascript not python";
            String[] dd = sa.split(" ");
            int count444 = 0;
            int count1 = 0;
            String ss444 = "";
            String s1 = "";
            for (int i = 0; i < dd.length; i++) {
                if (dd[i].contains("java")) {
                    count444++;
                    ss444 += dd[i] + " ";
                }
                if (dd[i].contains("python")) {
                    count1++;
                    s1 += dd[i];
                }
            }
========================================================================================
//62
 int[][] numbers11 = {{9, 8, 7}, {6}, {5, 4, 3, 2, 1, 0}};
            for (int k11 = 0; k11 < numbers11.length; k11++) { //k: index num of 1D arrays
                for (int i111 = numbers11[k11].length - 1; i111 >= 0; i111--) { // i: index num of elements in 1D array
                    System.out.print(numbers11[k11][i111] + " ");
                }
            }
            System.out.println();
==============================================================================================
  //63
            int[][] numbers44 = {{9, 8, 7}, {6}, {5, 4, 3, 2, 1, 0}};
            for (int k44 = numbers44.length - 1; k44 >= 0; k44--) { //k: index num of 1D arrays (reversed)
                for (int i = numbers44[k].length - 1; i >= 0; i--) { // i: index num of elements in 1D array (reversed)
                    System.out.print(numbers44[k44][i] + " ");
                }
            }
=======================================================================================
//64
 int[][] numbers33 = {{9, 8, 7}, {6}, {5, 4, 3, 2, 1, 0}};
            for (int k22 = numbers33.length - 1; k22 >= 0; k22--) { //k: index num of 1D arrays (reversed)
                for (int i = 0; i < numbers33[k22].length; i++) { // i: index num of elements in 1D array
                    System.out.print(numbers33[k22][i] + " ");
                }
            }
===============================================================================
//65
 String[] arrr = { "2.5","1", "3","4", "3.5"};
        Arrays.sort(arrr);
        System.out.println(arrr[0]);
        System.out.println(arrr[arrr.length - 1]);
        -------------------------------------------------------------------
                String[] arrr = {"2.5","1.5", "3", "6.5","3.5", "4.5"};
        Arrays.sort(arrr);
        double min=Double.valueOf(arrr[0]);
        double max=Double.valueOf(arrr[arrr.length-1]);
        System.out.println(min);
        System.out.println(max);

========================================================================================
//66
    String [] k = {"bob","joe"};
        String  [] o = {"jones","smith"};
        String []a=new String[k.length];

        for(int i=0;i<k.length;i++) {
            a[i] = k[i]+" " + o[i];
        }
        System.out.println(Arrays.toString(a));
========================================================================================
//67

        int arr1[]={1,2,3};
        int arr2[]={4,5,6,7};

        int gg[]=new int[arr1.length+arr2.length];

        int w=0;
        for(int i=0;i<gg.length;i++){
            if(i<arr2.length){
                gg[i]=arr2[i];
            }else if(w<arr1.length){
                gg[i]=arr1[w++];
            }
        }
        System.out.println(Arrays.toString(gg));
=============================================================================================
//68
     int arr1[]={1,2,4,0,0,5,0};
        ArrayList<Integer> list=new ArrayList<>();

     int count=0;
        for(int i=0;i<arr1.length;i++){
        if(arr1[i]>0) {
            list.add(arr1[i]);
        }
        count+=(arr1[i]==0)?1:0;
        }

        for(int i=0;i<count;i++){
            list.add(0);
        }
        System.out.println(list);


 -----------------------------ARRRAY---------------------------------
  int arr1[]={1,2,4,0,0,5,0};

        int y[]=new int[arr1.length];
        ArrayList<Integer> list=new ArrayList<>();
     int u=0;
        for(int i=0;i<arr1.length;i++){
         if(arr1[i]!=0){
             y[u++]=arr1[i];
         }
        }
==============================================================================================
//69

            int g1[]={1,2,3};
            int gg[]={4,5,6,7};
            int hW []={8,9};
            int dd1[]={10,11};
            int a11[]=new int[g.length+gg.length+h.length+dd.length];

            for(int i=0,j1=0,d1=0,w=0;i<a11.length;i++){
                if(i<g.length){
                    a11[i]=g[i];
                }else if(j<gg.length){
                    a11[i]=gg[j++];
                }else if(d<dd.length){
                    a11[i]=hW[d++];
                }else{
                    a11[i]=dd1[w++];
                }


            }
            System.out.println(Arrays.toString(a11));
========================================================================================
//70
 int a[]={1,3,5};
        int b[]={2,4,6};
        int c[]=new int[a.length+b.length];
        int k=0;
        int r=1;
        for (int i=0;i<a.length;i++){
            c[k]=a[i];
            c[r]=b[i];
            k+=2;
            r+=2;
        }
        System.out.println(Arrays.toString(c));
 ----------------------------------------------------------------------------------
   int u[]=new int[a.length*2];
        int y=0;
        for(int i=0;i<a.length;i++){
            u[y]=a[i];
            u[y+=1]=b[i];
            y++;
        }
=========================================================================================
//71
 String a="a2b5c7a9f0dafa2s6a8d5a";
        String str="";
        for(int i=0; i<a.length(); i++){
            if(a.substring(i,i+1).contains("a")){
                str+="a";
                a= a.replaceFirst("a","");
            }
        }
        str=str.concat(a);
        System.out.println(str);
    }
============================================================================================
//72
  int a=11;
        int b=2;
        int count=0;
        if(a>b) {
            for (int i = a; i >= b; i -= b) {
                count++;
                a -= b;
            }
        }
        System.out.println(a);
        System.out.println(count);
=====================================================================================
//73

        int a[]={1,2,3};// length 3
        int b[]={4,5,6,7};// length 4

        int c[]=new int[a.length+1];// 5,7,9,7
        ArrayList<Integer> h=new ArrayList<>();//5 7 9

        for(int i=0;i<a.length||i< b.length;i++) { // loop repeat 3 times
            if(i<a.length) {
                c[i] = a[i] + b[i];  // loop stops after third iteration because "a" length==3 so +
                h.add(a[i] + b[i]); //+ we cant add last index of "b" to int[]c and ArrayList "h"
            }
            else if(i<b.length){
                c[i]=b[i];
                h.add(b[i]);
            }
        }

        System.out.println(Arrays.toString(c));
        System.out.println(h);
================================================================================================
//74
  Integer num[] = {5, 7, 3, 9, 1, 3};
        int a = 8;

        ArrayList<Integer>g=new ArrayList<>();

        for(int i=0;i<num.length/2;i++){
            g.add(num[i]);
        }
        g.add(a);
        for(int i=num.length/2;i<num.length;i++){
            g.add(num[i]);
        }
        System.out.println(g);
 -------------------------------------------------------------------------------------
 int[] arr = {5, 7, 3, 9, 1, 0};
        int pivot = 8;
        ArrayList<Integer>gg=new ArrayList<>();

        for(int i=0;i<arr.length;i++){

            if(i==arr.length/2){
                gg.add(8);
            }
            gg.add(arr[i]);
        }
        System.out.println(gg);
==============================================================================================
//75
  ArrayList<String> gg = new ArrayList<>(Arrays.asList("three,four", "five"));
       gg.set(0,"four");
        System.out.println(gg);
==========================================================================================


 //76
String result="";

ArrayList<String>gg=new ArrayList<>();
for(char c='A', ch='a';c<='Z';ch++,c++){
    result+=c+""+ch+" ";
    gg.add(c+""+ch+" ");
}

        System.out.println(result);
        System.out.println(gg);
========================================================================================
//77
        String str ="OsOdjjOOssh";
        ArrayList<String>g=new ArrayList<>(Arrays.asList(str.split("")));
        int count=0;
        for(int i=0;i<g.size();i++) {
          if(g.get(i).equals("O")){
              count++;
          }
        }
       if(count==3||count==4){
          str= str.replaceAll("O","a");
       }
        System.out.println(str);
        System.out.println(count);
 //-----------------------------------------------------------------------------
  String str ="OsOdjjOssh";

        for(int i=0;i<str.length();i++){
            int count=Collections.frequency(Arrays.asList(str.split("")),"O");
            if(count==3||count==4){
                str=str.replace("O","a");
            }
        }
        System.out.println(str);


=====================================================================================
//78
int a=25;
int b=10;
        Map<Integer,Integer> map= new HashMap<>();
        map.put(a,b);
       int sum=0;
        for(Map.Entry<Integer, Integer> i: map.entrySet()) {
            sum=Math.subtractExact(i.getKey(),i.getValue());
        }

        for(Map.Entry<Integer, Integer> i: map.entrySet()) {
            sum=Math.addExact(i.getKey(),i.getValue());
        }

        System.out.println(sum);
        ----------------------------------------------------------------
         for(Integer r :map.keySet()){
            sum+=Math.subtractExact(r,map.get(r));
        }
-----------------------------------------------------------------------------
ArrayList<Integer>val=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(val.stream().map(i->i*2).reduce(0,(c,e)->c+e));

//=======================================================================================
//79
 int a[]={ -2, -3, 4, -1, -2, 1, 5, -3};

        int maxFinal = Integer.MIN_VALUE;
                int maxTemp = 0;
        for (int i = 0; i <a.length; i++) {
            maxTemp= maxTemp + a[i];
            if (maxFinal < maxTemp) {
                maxFinal = maxTemp;
            }
            if (maxTemp < 0) {
                maxTemp = 0;
            }
        }

      System.out.println("Maximum contiguous sum is " +maxFinal);

//=====================================================================================
//80
 Integer arr[]={22,101,102,101,102,101,525,88};
Map<Integer,Integer>h=new LinkedHashMap<>();

        for(int i=0;i<arr.length;i++){
            int c=Collections.frequency(Arrays.asList(arr),arr[i]);
            if (!h.keySet().equals(arr[i])){
                h.put(arr[i],c);
            }
        }
        int max=Collections.max(h.values());

        ArrayList<Integer>g=new ArrayList<>();

        for(Integer q:h.keySet()){
            if(h.get(q)==max){
                g.add(q);
            }
        }
        System.out.println(g);

//===========================================================================================
//81
  String second="abccba";
        if(!second.substring(second.length()-1).equals(second.substring(0,1))){
            second=second.replace(second.substring(second.length()-1),second.substring(0,1));
        }

        String firstPlandrome=new StringBuilder(second).reverse().toString();
        boolean aa=second.equals(firstPlandrome);
        System.out.println("is palindrome > "+aa);

        String secondPalindrome="";
        for(int i=second.length()-1;i>=0;i--){
            secondPalindrome+=second.charAt(i);
        }

       boolean isPailndrome=second.equals(secondPalindrome);
        System.out.println(isPailndrome);
//============================================================================================================================
//82
public static int[] getArr(int[] arr) {
        int[] result = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            int tem = 1;
            for(int j=0; j<arr.length; j++) {
                if(i!=j) {
                    q *= arr[j];
                }
            }
            result[i] = q;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3 , 4, 5};
        int[] result = getArr(arr);
        System.out.println(Arrays.toString(result));
    }
    //======================================================================================
 //83
 public static void main(String[] args) {
        int y[]=new int[]{6,-6,5,1,2,8};

     ArrayList<Integer> g= new ArrayList<>();
int a=0;

        for(int i=0;i<y.length;i++){
            if(y[i]<0){
                a=y[i];
            }
        }
        String w = "";
        w= ""+a;

        int r=0;
        r= Integer.parseInt(""+w.charAt(1));

     for(int i=0;i<y.length;i++){
         if(y[i]<0){
             continue;
         }
         System.out.println(y[i]+"   "+r);
        if(y[i]==r){
continue;
         }
         g.add(y[i]);
     }
        System.out.println(g);
    }


 */


    }




