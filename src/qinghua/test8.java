package qinghua;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class test8
{
    public static void main(String[] args) throws IOException
    {
        int mod=1000000000;
        int[] tmp=new int[20];
        int count=1;
        for(int i=0;i<20;i++)
        {
            tmp[i]=count;
            count*=2;
        }
        int[] dp=new int[1000001];
        dp[0]=1;
        for(int i=0;i<20;i++)
        {
            for(int j=tmp[i];j<=1000000;j++)
            {
                dp[j]+=dp[j-tmp[i]];
                dp[j]%=mod;
            }
        }


        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String s="";
        while((s=in.readLine())!=null)
        {
            int m=Integer.parseInt(s);
            System.out.println(dp[m]);
        }






//        int mod=1000000000;
//        int[] dp=new int[1000001];
//        dp[0]=1;
//        for(int i=1;i<=1000000;i++)
//        {
//            for(int j=0;j<100;j++)
//            {
//                if(i>=(int)Math.pow(2, j)) dp[i]=(dp[i-(int)Math.pow(2, j)]%mod+dp[i])%mod;
//                else break;
//            }
//        }
//
//        System.out.println(dp[7]);
//
////        Scanner scanner=new Scanner(System.in);
////        String s="";
////        while((scanner.nextLine())!=null)
////        {
////            int m=Integer.parseInt(s);
////            System.out.println(dp[m]);
////        }
    }
}
