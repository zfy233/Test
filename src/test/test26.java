package test;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class test26
{
    static int res;
    private static boolean judge(String[] s)
    {
        for(String tmp:s)
        {
            for(int i=0;i<tmp.length();i++)
            {
                char c=tmp.charAt(i);
                if(c<'0'||c>'9') return false;
            }
        }
        return true;
    }

    private static void help(int[] num,int sum)
    {
        dfs(num, sum, 0, 0);
    }

    private static void dfs(int[] num,int sum,int cur,int start)
    {
        res=Math.max(res, cur);
        if(start==num.length) return;

        for(int i=start;i<num.length;i++)
        {
            if(cur+num[i]<=sum)
            {
                dfs(num, sum, cur+num[i],i+1);
            }
        }
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s="";
        while((s=br.readLine())!=null)
        {
            String[] strings=s.split(" ");
            if(judge(strings))
            {
                int[] num=new int[strings.length];
                int sum=0;
                res=0;
                for(int i=0;i<strings.length;i++)
                {
                    num[i]=Integer.parseInt(strings[i]);
                    sum+=num[i];
                }
                help(num, sum/2);
                System.out.println((sum-res)+" "+res);
            }
            else System.out.println("ERROR");
        }
    }
}
