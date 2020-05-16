package qinghua;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class test12
{
    private static String swap(String s,int j)
    {
        char[] chars=s.toCharArray();
        char tmp=chars[j];
        chars[j]=chars[j+1];
        chars[j+1]=tmp;
        return new String(chars);
    }


    private static int cal(String s)
    {
        Set<String> set = new HashSet<>();
        LinkedList<String> queue=new LinkedList<>();
        queue.add(s);
        set.add(s);
        int res=0;

        while(!queue.isEmpty())
        {
            int len=queue.size();
            for(int i=0;i<len;i++)
            {
                String tmp=queue.poll();
                if(tmp.contains("2012")) return res;
                for(int j=0;j<tmp.length()-1;j++)
                {
                    String newStr=swap(tmp,j);
                    if(!set.contains(newStr))
                    {
                        set.add(newStr);
                        queue.add(newStr);
                    }
                }
            }
            res++;
        }
        return -1;
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s="";
        while((s=br.readLine())!=null)
        {
            int m=Integer.parseInt(s);
            int res=cal(br.readLine());
            System.out.println(res);
        }
    }
}
