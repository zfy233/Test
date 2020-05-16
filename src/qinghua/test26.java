package qinghua;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class test26
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s="";
        while((s=br.readLine())!=null)
        {
            StringBuilder sb=new StringBuilder(new BigInteger(s,10).toString(2));
            BigInteger res=new BigInteger(sb.reverse().toString(),2);
            System.out.println(res);
        }
        br.close();
    }
}
