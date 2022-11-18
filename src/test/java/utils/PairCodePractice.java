package utils;

public class PairCodePractice {
    public static void main(String[] args) {
        String str = "Hello World I am back ";

        String revers = "";

        for (int i = str.length()-1; i >=0; i--) {
          revers=revers+str.charAt(i);
        }
       // System.out.println(revers);

        StringBuilder stringBuilder=new StringBuilder(str);
        stringBuilder=stringBuilder.reverse();
       // System.out.println(stringBuilder);

        int a=10;
        int b=20;
        a=a+b;
        b=a-b;
        a=a-b;
       // System.out.println(a);
      //  System.out.println(b);

        String str1="Hello";
        String str2="Welcome";
        str1=str1+str2;
        str2=str1.substring(0,str1.length()-str2.length());
        str1=str1.substring(str2.length());

        System.out.println(str1);
        System.out.println(str2);
    }

}

