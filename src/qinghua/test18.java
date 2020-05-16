package qinghua;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test18
{
    private int[] help(int a)
    {
        int[] res=new int[10];
        int count=0;
        while(a>0)
        {
            res[count++]=a%10;
            a/=10;
        }
        return res;
    }


    private int sum(int a,int b)
    {
        int[] tmp1=help(a);
        int[] tmp2=help(b);
        int res=0;
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                res+=tmp1[i]*tmp2[j];
            }
        }
        return res;
    }

    public static void main(String[] args) throws IOException
    {
        test18 test18=new test18();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s="";
        while((s=br.readLine())!=null)
        {
            String[] strings=s.split(" ");
            int a=Integer.parseInt(strings[0]);
            int b=Integer.parseInt(strings[1]);
            System.out.println(test18.sum(a, b));
        }
    }
}
