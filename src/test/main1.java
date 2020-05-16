package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class main1
{
    private static boolean[] getPrim(int m)
    {
        boolean[] res=new boolean[m+1];
        for(int i=2;i<=m;i++)
        {
            if(m%i==0) res[i]=true;
        }
        return res;
    }

    private static boolean judge(int i,int j,int k)
    {
        boolean[] primI=getPrim(i);
        boolean[] primJ=getPrim(j);
        boolean[] primK=getPrim(k);
        for(int start=2;start<=i;start++)
        {
            int flag=0;
            if(primI[start]==true) flag++;
            if(primJ[start]==true) flag++;
            if(primK[start]==true) flag++;
            if(flag>=2) return false;
        }
        for(int start=i+1;start<=j;start++)
        {
            int flag=0;
            if(primJ[start]==true) flag++;
            if(primK[start]==true) flag++;
            if(flag>=2) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int m=Integer.parseInt(br.readLine());
        int n=Integer.parseInt(br.readLine());
        List<int[]> res=new ArrayList<>();
        for(int i=m;i<=n-2;i++)
        {
            for(int j=i+1;j<=n-1;j++)
            {
                for(int k=j+1;k<=n;k++)
                {
                    if(i*i+j*j==k*k&&judge(i,j,k)) res.add(new int[]{i,j,k});
                }
            }
        }
        for(int[] tmp:res)
        {
            StringBuilder out=new StringBuilder();
            for(int num:tmp) out.append(num+" ");
            System.out.println(out.toString().trim());
        }
    }
}
