package test;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class test4
{
    public static int[] sort(String s,int n)
    {
        int[] a=new int[n];
        String[] strs=s.split(" ");
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(strs[i]);
        }
        Arrays.sort(a);
        int count=1;
        for(int i=1;i<a.length;i++)
        {
            if(a[i]!=a[i-1])
            {
                a[count++]=a[i];
            }
        }
        int[] res=Arrays.copyOf(a, count);
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String a=scanner.nextLine();
        String b=scanner.nextLine();
        int n=Integer.parseInt(a);
        int[] res=test4.sort(b, n);
        for(int i=0;i<res.length;i++)
        {
            if(i==res.length-1) System.out.print(res[i]);
            else System.out.print(res[i]+" ");
        }
    }
}
