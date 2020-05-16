package qinghua;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test5
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s="";
        while((s=br.readLine())!=null)
        {
            char[] res=s.toCharArray();
            for(int i=0;i<res.length/2;i++)
            {
                char tmp=res[i];
                res[i]=res[res.length-1-i];
                res[res.length-1-i]=tmp;
            }
            System.out.println(new String(res));
        }
    }
}
