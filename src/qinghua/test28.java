package qinghua;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test28
{
    private static int count(int m)
    {
        int res=0;
        while(m>0)
        {
            int tmp=m%10;
            if(tmp==1||tmp==2) res++;
            m/=10;
        }
        return res;
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s="";
        while((s=br.readLine())!=null)
        {
            int n=Integer.parseInt(s);
            int res=0;
            for(int i=1;i<=n;i++)
            {
                res+=count(i);
            }
            System.out.println(res);
        }
        br.close();
    }
}
