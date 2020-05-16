package test;

import java.util.Scanner;

public class test5
{
    public static int F(int n)
    {
        if(n==0) return 0;
        int[] dp=new int[n+1];
        dp[1]=1;
        for(int i=2;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        int n=Integer.parseInt(s);
        System.out.println(test5.F(n));
    }
}
