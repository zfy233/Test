package qinghua;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class test1
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s="";
        while ((s=br.readLine())!=null)
        {
            String res=new BigInteger(s,10).toString(2);
            System.out.println(res);
        }
        br.close();
    }
}
