package test;

import java.util.Scanner;

public class test19
{
    public void Reverse(int[] a)
    {
        for(int i=0;i<a.length/2;i++)
        {
            int tmp=a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=tmp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int m=Integer.parseInt(scanner.nextLine());
        int[] a=new int[m];
        String[] strs=scanner.nextLine().split(" ");
        for(int i=0;i<m;i++)
        {
            a[i]=Integer.parseInt(strs[i]);
        }
        test19 test19=new test19();
        test19.Reverse(a);
        for(int num:a)
            System.out.print(num+" ");
    }
}
