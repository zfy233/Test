package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        List<int[]> list=new ArrayList<>();
        int m=Integer.parseInt(br.readLine());
        String s="";
        while ((s=br.readLine())!=null&&(s!=""))
        {
            String[] strings=s.split(",");
            int[] tmp=new int[strings.length];
            for(int i=0;i<strings.length;i++)
            {
                tmp[i]=Integer.parseInt(strings[i]);
            }
            list.add(tmp);
        }
        br.close();
        int sum=0;
        int k=list.size();
        int flag=0;
        for(int i=0;i<k;i++)
        {
            int[] tmp=list.get(i);
            for(int j=0;j<tmp.length;j++)
            {
                sum++;
            }
        }

        int[] res=new int[sum];
        int sumNum=0;
        while(sumNum<sum)
        {
            for(int i=0;i<k;i++)
            {
                int[] tmp=list.get(i);
                for(int j=m*flag;j<tmp.length&&j<m*(flag+1);j++)
                {
                    res[sumNum++]=tmp[j];
                }
            }
            flag++;
        }
        StringBuilder out=new StringBuilder();
        for(int tmp:res) out.append(tmp+",");
        out.deleteCharAt(out.length()-1);
        System.out.println(out.toString());
    }
}
