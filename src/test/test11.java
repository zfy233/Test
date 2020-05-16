package test;

import java.math.BigInteger;
import java.util.Scanner;

public class test11
{
//    public String NumPlus(String a,String b)
//    {
//        int i=a.length()-1;
//        int j=b.length()-1;
//        int flag=0;
//        StringBuilder res=new StringBuilder();
//
//        while(i>=0||j>=0)
//        {
//            int m=i>=0? a.charAt(i)-'0':0;
//            int n=j>=0? b.charAt(j)-'0':0;
//            int tmp=(m+n+flag)%10;
//            res.append(tmp);
//            flag=(n+m+flag)/10;
//            i--;
//            j--;
//        }
//        if(flag==1) res.append(1);
//        return res.reverse().toString();
//    }
//
//
//    public String NumMinus(String a,String b)
//    {
//        int i=a.length()-1;
//        int j=b.length()-1;
//        int flag=0;
//        StringBuilder res=new StringBuilder();
//
//        while(i>=0||j>=0)
//        {
//            int m=i>=0? a.charAt(i)-'0':0;
//            int n=j>=0? b.charAt(j)-'0':0;
//            int tmp=(m-n-flag)>=0? (m-n-flag)%10:(10+m-n-flag)%10;
//            res.append(tmp);
//            flag=m-n-flag>=0? 0:1;
//            i--;
//            j--;
//        }
//        if(flag==1) return "-"+NumMinus(b, a);
//        return res.reverse().toString();
//    }
//
//    public String NumMul(String a,String b)
//    {
//        String res=new String();
//        for(int i=a.length()-1;i>=0;i--)
//        {
//            StringBuilder tmp=new StringBuilder();
//            for(int j=0;j<a.length()-1-i;j++) tmp.append(0);
//            int m=a.charAt(i)-'0';
//            int flag=0;
//            for(int j=b.length()-1;j>=0;j--)
//            {
//                int n=b.charAt(j)-'0';
//                int num=(m*n+flag)%10;
//                flag=(m*n+flag)/10;
//                tmp.append(num);
//            }
//            if(flag>0) tmp.append(flag);
//            res=NumPlus(res, tmp.reverse().toString());
//        }
//        if((a.charAt(0)=='-'&&b.charAt(0)!='-')||(a.charAt(0)!='-'&&b.charAt(0)=='-'))
//            return "-"+res;
//        return res;
//    }
//
//
//    public static void main(String[] args)
//    {
//        test11 test11=new test11();
//        Scanner scanner=new Scanner(System.in);
//        String a=scanner.nextLine();
//        String b=scanner.nextLine();
//        System.out.println(test11.NumPlus(a, b));
//        System.out.println(test11.NumMinus(a, b));
//        System.out.println(test11.NumMul(a, b));
//    }

    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        BigInteger a=new BigInteger(scanner.nextLine());
        BigInteger b=new BigInteger(scanner.nextLine());
        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));
    }
}
