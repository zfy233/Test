package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test2
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();

        int a=0,b=0,c=0;
        int flag=1,left=1,num=0;
        for(int i=0;i<s.length();i++)
        {
            char tmp=s.charAt(i);
            if(tmp=='x')
            {
                if(num==0) num=1;
                if(i+2<s.length()&&s.charAt(i+1)=='^')
                {
                    a+=num*flag*left;
//                    System.out.println(a);
                    i+=2;
                }
                else{
                    b+=num*flag*left;
                }
                num=0;
                flag=1;
            }
            else if(tmp=='+')
            {
                c+=num*flag*left;
                flag=1;
                num=0;
            }
            else if(tmp=='-')
            {
                c+=num*flag*left;
                flag=-1;
                num=0;
            }
            else if(tmp=='=')
            {
                c+=num*left*flag;
                flag=1;
                num=0;
                left=-1;
            }
            else num=num*10+tmp-'0';
        }

        c+=num*flag*left;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
        double m=b*b-4*a*c;
        if(m<0) System.out.println("No Solution");
        else{
            double res1=(-b+Math.sqrt(m))/(2*a);
            double res2=(-b-Math.sqrt(m))/(2*a);
            System.out.printf("%.2f %.2f",Math.min(res1,res2),Math.max(res1,res2));
        }
    }
}
