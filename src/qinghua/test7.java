package qinghua;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test7
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s="";
        while((s=br.readLine())!=null)
        {
            int n=Integer.parseInt(s);
            int res=0;
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                while(n%i==0)
                {
                    res++;
                    n/=i;
                }
            }
            if(n>1) res++;
            System.out.println(res);
        }
    }
}
