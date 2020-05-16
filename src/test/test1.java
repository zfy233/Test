package test;

import java.util.Scanner;

public class test1
{
    public static int findCommon(String a,String b)
    {
        int res=0;
        int m=a.length();
        int n=b.length();
        if(m<n) return 0;
        for(int i=0;i<=m-n;i++)
        {
            if(b.equals(a.substring(i, i+n)))
                res++;
        }
        return res;
    }

    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        String[] strings=scanner.nextLine().split(" ");
        int c=test1.findCommon(strings[0],strings[1]);
        System.out.println(c);
    }
}
