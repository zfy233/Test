package qinghua;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test17
{
    public static void main(String[] args) throws IOException
    {
        long[] dp=new long[21];
        dp[0]=1;
        for(int i=1;i<=20;i++)
        {
            dp[i]=i*dp[i-1];
        }

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String s="";
        while((s=br.readLine())!=null)
        {
            int n=Integer.parseInt(s);
            System.out.println(dp[n]);
        }
        br.close();
    }
}
