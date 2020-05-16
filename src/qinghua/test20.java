package qinghua;

import java.util.ArrayList;
import java.util.List;

public class test20
{
    private static int judge(int m)
    {
        int res=0;
        for(int i=1;i<m;i++)
        {
            if(m%i==0) res+=i;
        }
        if(res==m) return 1;
        else if(res>m) return 2;
        return 0;
    }

    public static void main(String[] args)
    {
        StringBuilder eNum=new StringBuilder();
        StringBuilder gNum=new StringBuilder();
        for(int i=2;i<=60;i++)
        {
            if(judge(i)==1) eNum.append(i+" ");
            else if(judge(i)==2) gNum.append(i+" ");
        }
        eNum.deleteCharAt(eNum.length()-1);
        gNum.deleteCharAt(gNum.length()-1);
        System.out.println("E: "+eNum);
        System.out.println("G: "+gNum);
    }
}
