package qinghua;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class test24
{
    private String plus(String a,String b)
    {
        int flag=0;
        StringBuilder res=new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        while(i>=0||j>=0)
        {
            int m=i>=0? a.charAt(i)-'0':0;
            int n=j>=0? b.charAt(j)-'0':0;
            res.append((m+n+flag)%10);
            flag=(m+n+flag)/10;
            i--;
            j--;
        }
        if(flag==1) res.append(1);
        return res.reverse().toString();
    }

    private StringBuilder mul(String s,int m)
    {
        int flag=0;
        StringBuilder res=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            int tmp=s.charAt(i)-'0';
            res.append((tmp*m+flag)%10);
            flag=(tmp*m+flag)/10;
        }
        if(flag>0) res.append(flag);
        return res;
    }

    private String help(String s,int num)
    {
        String res="0";
        int count=0;
        while(num>0)
        {
            int tmp=num%10;
            StringBuilder newS=new StringBuilder();
            for(int i=0;i<count;i++) newS.append(0);
            newS.append(mul(s, tmp));
            res=plus(res, newS.reverse().toString());
            num/=10;
            count++;
        }
        return res;
    }

    public static void main(String[] args) throws IOException
    {
        test24 test24=new test24();
        String[] dp=new String[1001];
        dp[0]="1";
        for(int i=1;i<=1000;i++)
        {
            dp[i]=test24.help(dp[i-1],i);
        }

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s="";
        while((s=br.readLine())!=null)
        {
            int m=Integer.parseInt(s);
            System.out.println(dp[m]);
        }
        br.close();
    }
}
