package qinghua;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test13
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int m=Integer.parseInt(br.readLine());
        int[] num=new int[m];
        String[] strings=br.readLine().split(" ");
        for(int i=0;i<m;i++)
        {
            num[i]=Integer.parseInt(strings[i]);
        }
        int min=num[0];
        int max=num[0];
        for(int i=0;i<m;i++)
        {
            if(num[i]>max) max=num[i];
            if(num[i]<min) min=num[i];
        }
        System.out.println(max+" "+min);
    }
}
