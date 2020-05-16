package test;

import javax.print.attribute.standard.PresentationDirection;
import java.util.Scanner;

public class test14
{
    static int res=1;
    static long[] num=new long[21];

    private static void setNum()
    {
        num[0]=1;
        for(int i=1;i<=20;i++)
        {
            num[i]=i*num[i-1];
        }
    }

    private static long getNum(int m,int n)
    {
        return num[m]/(num[n]*num[m-n]);
    }

    private static void help(String pre,String post,int m)
    {
        int len=pre.length();
        if(len==1) return;
        int count=0;
        pre=pre.substring(1);
        post=post.substring(0, len-1);

        while(!pre.equals(""))
        {
            int index=post.indexOf(pre.charAt(0));
            String newPre=pre.substring(0, index+1);
            String newPost=post.substring(0, index+1);
            count++;
            pre=pre.substring(index+1);
            post=post.substring(index+1);
            help(newPre, newPost,m);
        }
        res*=getNum(m, count);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s="";
        test14.setNum();
        while((s=scanner.nextLine())!=null)
        {
            res=1;
            String[] strings=s.split(" ");
            int m=Integer.parseInt(strings[0]);
            String pre=strings[1];
            String post=strings[2];
            help(pre, post, m);
            System.out.println(res);
        }
    }
}
