package qinghua;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test25
{
    private static int help(int[][] trees,int sum)
    {
        Arrays.sort(trees,(o1,o2)->(o1[0]-o2[0]));
        int count=0;
        int[] tmp=trees[0];
        for(int i=1;i<trees.length;i++)
        {
            if(tmp[1]<trees[i][0])
            {
                count+=(tmp[1]-tmp[0]+1);
                tmp=trees[i];
            }
            else{
                tmp[1]=Math.max(tmp[1],trees[i][1]);
            }
        }
        count+=(tmp[1]-tmp[0]+1);
        return sum+1-count;
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s="";
        while((s=br.readLine())!=null)
        {
            String[] strings=s.split(" ");
            int sum=Integer.parseInt(strings[0]);
            int n=Integer.parseInt(strings[1]);
            int[][] trees=new int[n][2];
            for(int i=0;i<n;i++)
            {
                String[] strs=br.readLine().split(" ");
                trees[i][0]=Integer.parseInt(strs[0]);
                trees[i][1]=Integer.parseInt(strs[1]);
            }
            int res=help(trees,sum);
            System.out.println(res);
        }
        br.close();
    }
}
