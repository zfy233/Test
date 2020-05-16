package test;

import java.util.Scanner;

public class test16
{
    public int minArea(int[] nums,int k)
    {
        int res=Integer.MAX_VALUE;
        int window=0,i=0;
        for(int j=0;j<nums.length;j++)
        {
            window+=nums[j];
            while(window>=k)
            {
                res=Math.min(res, j-i+1);
                window-=nums[i++];
            }
        }
        return res==Integer.MAX_VALUE? -1:res;
    }

    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        test16 test16=new test16();
//        System.out.println(test16.minArea(new int[]{1,2,3}, 6));
        String[] strings=scanner.nextLine().split(" ");
        int m=Integer.parseInt(strings[0]);
        int n=Integer.parseInt(strings[1]);
        int K=Integer.parseInt(strings[2]);
        int[][] grid=new int[m][n];
        for(int i=0;i<m;i++)
        {
            String[] strs=scanner.nextLine().split(" ");
            for(int j=0;j<n;j++)
            {
                grid[i][j]=Integer.parseInt(strs[j]);
            }
        }

        int res=Integer.MAX_VALUE;
        for(int i=0;i<m;i++)
        {
            int[] tmp=new int[n];
            for(int j=i;j<m;j++)
            {
                for(int k=0;k<n;k++)
                {
                    tmp[k]+=grid[j][k];
                }
                if(test16.minArea(tmp, K)==-1) continue;
                res=Math.min(res,(j-i+1)*test16.minArea(tmp, K));
            }
        }
        if(res==Integer.MAX_VALUE) System.out.println(-1);
        else System.out.println(res);
    }
}
