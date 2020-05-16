package test;

import java.util.Scanner;

public class test28
{
    public int longestSub(int[] a,int[] b,int n)
    {
        int[][] dp=new int[n+1][n+1];
        for(int i=n-1;i>=0;i--)
        {
            for(int j=n-1;j>=0;j--)
            {
                if(a[i]==b[j]) dp[i][j]=dp[i+1][j+1]+1;
                else dp[i][j]=Math.max(dp[i][j+1],dp[i+1][j]);
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        String[] s1=scanner.nextLine().split(" ");
        String[] s2=scanner.nextLine().split(" ");
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(s1[i]);
        }
        for(int i=0;i<n;i++)
        {
            b[i]=Integer.parseInt(s2[i]);
        }

        test28 test28=new test28();
        System.out.println(test28.longestSub(a, b, n));
    }
}
