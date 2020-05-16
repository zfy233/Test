package qinghua;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test22
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s="";
        while((s=br.readLine())!=null)
        {
            int n=Integer.parseInt(s);
            int[] nums=new int[n];
            String[] strings=br.readLine().split(" ");
            for(int i=0;i<n;i++)
            {
                nums[i]=Integer.parseInt(strings[i]);
            }

            int res=Integer.MIN_VALUE;
            int tmp=0;
            for(int i=0;i<n;i++)
            {
                if(tmp>=0)
                {
                    tmp+=nums[i];
                    res=Math.max(res, tmp);
                }
                else{
                    tmp=nums[i];
                    res=Math.max(res, tmp);
                }
            }
            System.out.println(res);
        }
        br.close();
    }
}
