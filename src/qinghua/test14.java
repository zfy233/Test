package qinghua;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class test14
{
    static int res=Integer.MAX_VALUE;
    private void minNum(int[] a,int sum)
    {
        Arrays.sort(a);
        for(int i=0;i<a.length/2;i++)
        {
            int tmp=a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=tmp;
        }

        dfs(a,sum,0, 0,0);
    }

    private void dfs(int[] a,int sum,int start,int cur,int len)
    {
        if(sum==cur)
        {
            res=Math.min(res, len);
            return;
        }
        for(int i=start;i<a.length;i++)
        {
            if(cur+a[i]<=sum)
            {
                dfs(a, sum, i+1, cur+a[i],len+1);
            }
        }
    }

    public static void main(String[] args) throws IOException
    {
        test14 test14=new test14();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int sum=Integer.parseInt(br.readLine());
        int n=Integer.parseInt(br.readLine());
        int[] a=new int[n];
        String[] strings=br.readLine().split(" ");
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(strings[i]);
        }
        test14.minNum(a, sum);
        System.out.println(res==Integer.MAX_VALUE? 0:res);
        br.close();
    }
}
