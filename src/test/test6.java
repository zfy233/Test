package test;

import java.util.Scanner;

public class test6
{
    public int reverse(int a)
    {
        int res=0;
        while(a>0)
        {
            int tmp=a%10;
            res=res*10+tmp;
            a/=10;
        }
        return res;
    }


    public  int calculate(int a,int b)
    {
        int m=reverse(a);
        int n=reverse(b);
        int k=reverse(a+b);
        return k==m+n? a+b:-1;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNextLine())
        {
            String s=scanner.nextLine();
            String[] strs=s.split(" ");
            int a=Integer.parseInt(strs[0]);
            int b=Integer.parseInt(strs[1]);
            test6 test=new test6();
            int n=test.calculate(a, b);
            System.out.println(n==-1? "NO":a+b);
        }
    }
}
