package qinghua;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class test3
{
    private static int calculate(int m)
    {
        int res=0;
        for(int i=1;i<Math.sqrt(m);i++)
        {
            if(m%i==0) res+=2;
        }
        if(m%Math.sqrt(m)==0) res++;
        return res;
    }

    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        String[] s=scanner.nextLine().split(" ");
        for(int i=0;i<n;i++)
        {
            int tmp=Integer.parseInt(s[i]);
            System.out.println(calculate(tmp));
        }
    }
}
