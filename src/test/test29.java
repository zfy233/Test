package test;

import java.util.Scanner;

public class test29
{
    private static int getGcd(int a,int b)
    {
        return a==0? b : getGcd(b%a, a);
    }

    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        String[] strings=scanner.nextLine().split(" ");
        int a=Integer.parseInt(strings[0]);
        int b=Integer.parseInt(strings[1]);
        int c=Integer.parseInt(strings[2]);
        int gcd=getGcd(a,b);
        System.out.println(c/gcd+1);
    }
}
